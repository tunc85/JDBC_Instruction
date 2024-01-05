package day01_databasetesting;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

public class C03_CityTest {

    @Test
    public void cityTest() throws SQLException {
        // Kullanıcı veritabanına bağlanır
                String url="jdbc:postgresql://localhost:5432/myDatabase";
                String user="tester";
                String password="tester";
        Connection connection =DriverManager.getConnection(url,user,password);

        // Kullanıcı, 'cities' tablosundan sehir isimlerini almak üzere sorgu gönderir
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select city_name from cities");


        // Kullanıcı, city_name sütununda en az 10 tane sehir ismi olduğunu doğrular
        int counter=0;
        while (resultSet.next()){
        counter++;
        }
        Assert.assertTrue(counter>9);

        // Kullanıcı, bağlantıyı kapatır
        statement.close();
        connection.close();

      
    }


}
