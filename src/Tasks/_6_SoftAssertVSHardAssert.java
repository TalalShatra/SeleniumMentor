package Tasks;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

// this might be an interview question!

public class _6_SoftAssertVSHardAssert {

    @Test
    public void hardAssert(){
        System.out.println("Before hard assert");
        Assert.fail();
        System.out.println("After hard assert");
    }

    // Soft Assert
    // When you use 'Soft Assert' even one of the assertion fails, the execution will continue!
    // simple, non-critical validations Ex: if the image is displayed or not
    // it is not effecting the functionality, but still you need check it

    @Test
    public void softAssert(){
        System.out.println("Before soft assert");
        SoftAssert sf = new SoftAssert();
        sf.fail();
        System.out.println("After soft assert");

        sf.assertAll(); // we have to call this method, after the execution

    }}
