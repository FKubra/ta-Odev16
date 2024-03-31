package common;

import driver.DriverFactory;
import pages.DemoQAPage;

public class PageManager {
   public DemoQAPage demoQAPage;


    public PageManager() {

        DriverFactory.initDriver();
        demoQAPage  = PageFactory.buildDemoQaPage();

    }
}
