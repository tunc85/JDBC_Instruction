import java.sql.*;

public class Transaction02 {
    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt", "techpront", "password");



        Statement st = con.createStatement();
        System.out.println("Connection Success");


        st.execute("CREATE TABLE IF NOT EXISTS hesaplar2 (hesap_no INT UNIQUE, isim VARCHAR(50), bakiye REAL)");

        String sql1 = "INSERT INTO hesaplar2 VALUES (?,?,?) ";
        PreparedStatement prst1 = con.prepareStatement(sql1);
        prst1.setInt(1, 1234);
        prst1.setString(2,"Fred");
        prst1.setDouble(3,9000);
        prst1.executeUpdate();

        prst1.setInt(1, 5678);
        prst1.setString(2,"Barnie");
        prst1.setDouble(3,6000);
        prst1.executeUpdate();
        prst1.close();

            //buraya kadar auto commit var bu noktaya dönülür rollback'yaptığımızda satır 63

        //TASK: hesap no:1234 ten hesap no:5678 e 1000$ para transferi olsun.
        // update işlemleri bağımlı işlemler, bu sebeple tek bir transactionda birleştirelim

        try {
            con.setAutoCommit(false); // auto commit kapattık , transaction yönetimini JCBC'den aldik şuan bizde.
            //transaction başlattık

            String sql2="UPDATE hesaplar2 SET bakiye=bakiye+? WHERE hesap_no=?";
            PreparedStatement prst=con.prepareStatement(sql2);

            //1.adım: hesap no:1234 hesabın bakiye güncelleme
            prst.setInt(1,-1000);
            prst.setInt(2,1234);
            prst.executeUpdate();//başarılı


            //sistemde hata oluştu kabul edelim
            if (false) {
                throw new RuntimeException();//hatayı ele aldık
            }



            //2.adım:hesap no:5678 hesabın bakiye güncelleme
            prst.setInt(1,1000);
            prst.setInt(2,5678);
            prst.executeUpdate(); // bu sorgu çalışmaz

            con.commit();//işlemler başarılı,yapılan değişiklikleri onayladık

        }catch (Exception e) {
            e.printStackTrace(); // hata sebep yazdır
            System.out.println("Hata oluştu");
            con.rollback();
        }finally {
                st.close();
                con.close();
            }

        }




    }

