package pages;

public class GooglePage  extends  basePage{

    public GooglePage(){
        super(driver);
    }

    public void naviteToGoogle(){
        navigateTo("https://www.google.com.ar");
    }

}
