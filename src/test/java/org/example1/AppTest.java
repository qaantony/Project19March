
package org.example1;
import org.testng.annotations.Test;

public class AppTest {

    @Test(groups="regression")
    public void test1(){
        System.out.println("##### Test1  ###################################>>>>>");
    }

    @Test(groups="regression")
    public void test2(){
        System.out.println("##### Test2  ###################################>>>>>");
        System.out.println("hello ########>>>>>>>");
    }

}
