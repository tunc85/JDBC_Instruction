package day01_databasetesting;

public class C01_FirstTest {

    /*
    Test           : Expected Data ile Actual Data'nin karsilastirmasindan ibarettir.
    Expected Data  : Gereksinimlere gore beklenen data
    Actual Data    : Database'den cekilen asil data
     */

    public static void main(String[] args) {
        String expectedData = "Java";
        String actualData = "Java";

        if (expectedData.equals(actualData)) {
            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
        }


        int expectedNumber = 13;
        int actualNumber = 5;
        if (expectedNumber == actualNumber) {

            System.out.println("Test 1 Passed");
        } else {
            System.out.println("Test 1 Failed");
        }







    }
}
