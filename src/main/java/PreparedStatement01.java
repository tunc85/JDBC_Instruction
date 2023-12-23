import java.sql.*;

/*
PreparedStatement; önceden derlenmiş tekrar tekrar kullanılabilen
parametreli sorgular oluşturmamızı ve çalıştırmamızı sağlar.

PreparedStatement Statement'ı extend eder(statement'ın gelişmiş halidir.)
 */
public class PreparedStatement01 {
    public static void main(String[] args) throws SQLException {

        //2-ADIM:
        Connection con = DriverManager.
                getConnection("jdbc:postgresql://localhost:5432/jdbc_nt", "techpront", "password");

        //3-ADIM:statement oluşturma

        Statement st = con.createStatement();
        System.out.println("Connection Success");

        //ÖRNEK1: bolumler tablosunda Matematik bölümünün taban_puanı'nı 475 olarak güncelleyiniz.

        /*String sql1="UPDATE bolumler SET taban_puanı=475 WHERE bolum ILIKE 'Matematik'";
        int updated=st.executeUpdate(sql1);
        System.out.println("güncellenen : "+updated);*/

        //Prepared Statement kullanarak bolumler tablosunda Matematik bölümünün taban_puanı'nı 499 olarak güncelleyiniz.

        //parametreli sorguyu hazırlayalım
        String sql2="UPDATE bolumler SET taban_puanı=? WHERE bolum ILIKE ?";
        PreparedStatement prst  =con.prepareStatement(sql2);

        prst.setInt(1,499);
//        //"UPDATE bolumler SET taban_puanı=499 WHERE bolum ILIKE 'Matematik'";

        int updated2=prst.executeUpdate();
        System.out.println("updated2 = " + updated2);

        //Örnek2: Prepared Statement kullanarak bolumler tablosunda Edebiyat bölümünün taban_puanı'nı 477 güncelleyiniz.
        prst.setString(2,"Edebiyat");
        prst.setInt(1,477);

        prst.executeUpdate(); // güncelleme yaptık

               //Örnek 3:Prepared Statement kullanarak bolumler tablosuna
         // Yazılım Mühendisliği(id=5006,taban_puanı=475, kampus='Merkez') bölümünü ekleyiniz.

        //addDepartment(id,name,point,campus)
        String sql3="INSERT INTO bolumler VALUES(?,?,?,?)";
        PreparedStatement prst2= con.prepareStatement(sql3);

        prst2.setInt(1,5006);
        prst2.setString(2,"Yazılım Mühendisliği");
        prst2.setInt(3,475);
        prst2.setString(4,"Merkez");

        //Örnek 4: Prepared Statement kullanarak developers tablosundan
        //prog_lang C# olan kayıtları siliniz(ÖDEVVV)

        //Örnek 5: Prepared Statement kullanarak developers tablosundan
        //prog_lang C++ olan kayıtları siliniz(ÖDEVVV)

        st.close();
        con.close();




    }
}
