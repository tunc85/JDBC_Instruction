package day02_databasetesting;

import org.junit.Assert;
import org.junit.Test;
import utilities.JDBCLocalDButils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class C01_UtilitiesKullanimi {


    @Test
    public void citiesTest() throws SQLException {

// Kullanıcı veritabanına bağlanır
        //JDBCLocalDButils.connectToDatabase();
        //JDBCLocalDButils.createStatement();

// Kullanıcı, 'cities' tablosundan nufusu 3 milyondan fazla olan sehir isimlerini almak üzere sorgu gönderir
        String sql="SELECT city_name FROM cities WHERE population > 3000000";
        ResultSet resultSet =JDBCLocalDButils.executeQuery(sql);



// Kullanıcı, sehir isimlerini doğrular: "Istanbul", "Ankara", "Izmir"

       List<String> actualData =new ArrayList<>();
       List<String> expectedData= List.of("Istanbul", "Ankara", "Izmir");

        while(resultSet.next()) {
            String cityName = resultSet.getString("city_name");
            actualData.add(cityName);

        }
        System.out.println("actualData = " + actualData);
        Assert.assertEquals(expectedData,actualData);


        // Kullanıcı, bağlantıyı kapatır
        JDBCLocalDButils.closeConnection();

    }










    }

