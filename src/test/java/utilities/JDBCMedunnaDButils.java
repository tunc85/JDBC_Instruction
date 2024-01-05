package utilities;


import java.sql.*;

public class JDBCMedunnaDButils {


    private static Connection connection;
    private static  Statement statement;


    /*
    Bu method belirtilen parametreleri kullanarak database e baglanti kurar ve o cannection objecti ni return eder
     */
    public static Connection connectToDatabase(){

        //    (Host name: medunna.com, Database name: medunna_db_v2, Username: select_user, Password: Medunna_pass_@6)

        String url="jdbc:postgresql://medunna.com:5432/medunna_db_v2";
        String user="select_user";
        String password="Medunna_pass_@6";

        try {
            connection = DriverManager.getConnection(url,user,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

    /*
    Bu method daha once olusturulan connection objecti uzerinden bir Statement objecti olusturur ve return eder
     */
    public static Statement createStatement(){

        try {
            statement = connectToDatabase().createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return statement;
    }


    /*
    Bu methodu parametre olarak verilen SQL sorgusunu calistirir ve sonuclari bir ResultSet olarak return eder
     */

    public static ResultSet executeQuery(String sql){

        ResultSet resultSet ;
        try {
            resultSet = createStatement().executeQuery(sql);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return resultSet;
    }


    public static void closeConnection(){
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

















}