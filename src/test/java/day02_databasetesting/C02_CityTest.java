package day02_databasetesting;

import org.junit.Assert;
import org.junit.Test;
import utilities.JDBCLocalDButils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_CityTest {
@Test
    public void cityTest() throws SQLException {

    // Kullanıcı veritabanına bağlanır
    // Kullanıcı, 'cities' table'dan nüfusu 700 000 den az olan sehirlerin plaka kodlarini almak üzere query gönderir
    ResultSet resultSet =JDBCLocalDButils.executeQuery("SELECT plate_code FROM cities WHERE population < 700000;");

    // Kullanıcı, databaseden gelen sonuc sayisinin 4 oldugunu doğrular
    List<Integer> actualData= new ArrayList<>();

    while (resultSet.next()){
        actualData.add(resultSet.getInt("plate_code") );
    }
    Assert.assertEquals(4,actualData.size());

    // Kullanıcı, databaseden gelen sonuclarin 58 ve 43 plaka kodlarini icerdigini doğrular
    List<Integer> expectedData= Arrays.asList(58,43);

    Assert.assertTrue(actualData.containsAll(expectedData));


    // Kullanıcı, bağlantıyı kapatır
    JDBCLocalDButils.closeConnection();




    }

}
