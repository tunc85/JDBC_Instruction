package day01_databasetesting;

import org.junit.Assert;
import org.junit.Test;


public class C02_JunitFirstTest {
    /*
    Projemizde Junit kullanmak istiyorsak oncelikle gerekli olan dependency'yi Pom.xml
    dosyamiza eklemeliyiz.
    @Test notasyonu ile test scriptlerimizi calistirabilecegiz.

    Assertion esnasinda beklenen sonuc ve gercek sonuc arasindaki uyumu dogrulariz.
    Junit'te bir assertion basarisiz oldugunda , o anda calismakta olan test methodu durdurulur ve Junit bir
    AssertionError firlatir;
    ancak class icindeki diger test methodlari bu durumdan etkilenmez kendi icindeki assertionlar basarisiz olmadigi
    surece calismaya devam eder.
     */
    /*
     Assert.assertEquals(expected,actual); parantez icinde belirtilen iki datanin birbirine esit olup olmadigini
     kontrol eder, esitse test basarili(pass) olur , degilse basarisiz olur (fail)
     assert = iddia diyebiliriz
     */

    @Test
    public void test1(){
        String expected="java";
        String actual="java";
        Assert.assertEquals(expected,actual);
        System.out.println("Test passed oldugu zaman bu yazi konsolda gorunecek");
    }


    /*
    Assert.assertTrue("selenium".contains("E")); parantez icindeki deger true ise test gecer degilse kalir.(VARSA gecmesini istiyorm)
     */
    @Test
      public void test2(){
        Assert.assertTrue("selenium".contains("E"));

    }


    /*
    Assert.assertTrue("selenium".contains("E")); parantez icindeki deger false ise test gecer degilse kalir.(YOKSA gecmesini istiyorum)
     */
    @Test
    public void test3(){
    Assert.assertFalse("java".contains("A")); // pass
    }

    /*
     Assert.assertNotEquals("selenium","java"); icerisine eklenen parametreler esit degilse test gecer, esitse test kalir.
     */
    @Test
    public void test4(){
        Assert.assertNotEquals("selenium","java"); // pass
        Assert.assertNotEquals("selenium","selenium"); // failed
    }


}
