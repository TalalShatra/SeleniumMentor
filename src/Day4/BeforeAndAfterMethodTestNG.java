package Day4;

import org.testng.annotations.*;

public class BeforeAndAfterMethodTestNG {

    @BeforeClass
    public void beforeClassTest(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void beforeMethodTest(){
        System.out.println("before each test method");
    }

    @Test
    public void TestAnnotation(){
        System.out.println("the 1st test method");
    }
    @Test
    public void TestAnnotation2(){
        System.out.println("the 2nd test method");
    }

    @AfterMethod
    public void afterMethodTest(){
        System.out.println("after each test method");
    }

    @AfterClass
    public void afterClassTest(){
        System.out.println("after class");
    }
}
