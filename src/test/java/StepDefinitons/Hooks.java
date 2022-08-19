package StepDefinitons;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void before(){
        System.out.println("Scenario started...");
    }


    @After
    public void after(){

        //hata var ise ekran görüntüsü al
        GWD.quitDriver();

    }



}
