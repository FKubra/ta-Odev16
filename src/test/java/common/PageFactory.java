package common;

import pages.DemoQAPage;

public class PageFactory {

    public static DemoQAPage buildDemoQaPage(){
        return new DemoQAPage("/");
    }
}