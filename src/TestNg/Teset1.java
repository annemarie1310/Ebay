package TestNg;

import org.testng.annotations.Test;

public class Teset1 {

    @Test
    void setup(){
        System.out.println("i am setup");
    }
    @Test
    void testSteps(){
        System.out.println("test Steps ");
    }
    @Test
    void Teardown(){
        System.out.println("closing ..");
    }

}

