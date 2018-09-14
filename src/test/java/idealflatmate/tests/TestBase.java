package idealflatmate.tests;

import com.codeborne.selenide.Configuration;
import idealflatmate.appmanager.*;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.closeWebDriver;


public class TestBase {

    public final VerificationHelper verificationHelper = new VerificationHelper();
    public final AuthorizationHelper authorizationHelper = new AuthorizationHelper();
    public final PaymentsHelper paymentsHelper = new PaymentsHelper();
    public final AddPropertyHelper addPropertyHelper = new AddPropertyHelper();
    public final MessageHelper messageHelper = new MessageHelper();
    public final MatchingHelper matchingHelper = new MatchingHelper();
    public final EmailHelper emailHelper = new EmailHelper();
    public final HomePageHelper homePageHelper = new HomePageHelper();
    public final FooterHelper footerHelper = new FooterHelper();
    public final AreaPageHelper areaPageHelper = new AreaPageHelper();
    public final SearchHelper searchHelper = new SearchHelper();
    public final HelperBase helperBase = new HelperBase();
    public final SignUpHelper signUpHelper = new SignUpHelper();



    @BeforeClass
    public void setupClass() {
        ChromeDriverManager.getInstance().setup();
       // FirefoxDriverManager.getInstance().setup();
       // EdgeDriverManager.getInstance().setup();
        //Configuration.browser = "webdriver";
        Configuration.browser = "chrome";
       // Configuration.browser = "firefox";
      //  Configuration.browser = "edge";

       // Configuration.assertionMode = Configuration.AssertionMode.SOFT;

        Configuration.timeout = 10000;
        open("https://www.idealflatmate.co.uk/");
        verificationHelper.closeAdvPopUp();
        //open("http://front.idealflatmate.demo.devplatform2.com");

        //open("http://front.idealflatmate4test.demo.devplatform2.com");

    }

    //@AfterMethod
    public void goHomePage(){
        helperBase.toHomePage();
    }

    @AfterClass
    public void tearDown() {
        //screenshot("screenshotFail1");
        closeWebDriver();
        //tearDown();
    }


    public VerificationHelper getVerificationHelper() { return verificationHelper; }

    public MessageHelper getMessageHelper() { return paymentsHelper.addPropertyHelper.messageHelper;    }

    public AuthorizationHelper getAuthorizationHelper() {
        return authorizationHelper;
    }

    public AddPropertyHelper getAddPropertyHelper() {
        return paymentsHelper.addPropertyHelper;
    }



    public PaymentsHelper getPaymentsHelper() {
        return paymentsHelper;
    }

    public void newDriverPage() {
        closeWebDriver();
        ChromeDriverManager.getInstance().setup();
        open("http://front.idealflatmate4test.demo.devplatform2.com");
    }
}