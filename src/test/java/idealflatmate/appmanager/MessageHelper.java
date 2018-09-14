package idealflatmate.appmanager;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MessageHelper {


    public void chooseAnyMessageFromList() {

        //$(".list-group").shouldBe(Condition.visible).click();
        $(byXpath("//p[contains(text(), 'Hi there! It looks great!')]")).waitUntil(Condition.appears, 4000).click();
    }

    public void typeAndSendMessage(String message) {
        $("textarea.form-control.msgbox").shouldBe(visible).setValue(message);

        if ($(byXpath("//img[@id='imgSrc']")).is(exist)){
            $(byXpath("(//p[contains(text(), 'See the newest London')])[1]")).shouldBe(appear).hover();
            $(byXpath("//div[@id='idclose-headsup']")).shouldBe(visible).click();
            $(byXpath("//button[@class='btn btn-primary btn-msg-send']")).shouldBe(visible).click();
        } else {
            $(byXpath("//button[@class='btn btn-primary btn-msg-send']")).shouldBe(visible).click();
        }


    }

    public void chooseAnyMessageFromPopup() {
        $("#notifications").click();
    }

    public void click(By locator) {
        $(locator).click();
    }

    public void chooseMessageTab(final String massage) {
        //$(byXpath("/html/body/header/div/ul[2]/li[3]")).waitUntil(Condition.appears, 4000).click();
        $(byXpath("//a[@class='dropdown-toggle' and contains(text(), 'Messages')]")).waitUntil(Condition.appears, 4000).click();
        if($(byXpath("//div[contains(text(), 'New messages')]")).isDisplayed()){
            $(byXpath("//a[contains(text(), 'View all')]")).waitUntil(Condition.appears, 4000).click();
            $(byXpath("//p[contains(text(), '"+massage+"')]")).waitUntil(Condition.appears, 4000).click();
        }else {
        $(byXpath("//p[contains(text(), '"+massage+"')]")).waitUntil(Condition.appears, 4000).click();
        }
    }

    public void clickPropertyCardMessageUnlogged() {
        sleep(4000);
        $(byXpath("//div[1]/div/div/a[@class='card-start-chat btn btn-circle']")).waitUntil(visible, 4000).click();
        sleep(2000);
        $(byXpath("//div[@class='modal fade in'][1]//a[@class='btn btn-default u_m10-bottom-xs' and contains(text(), 'sign in')]")).waitUntil(visible, 4000).click();

    }

    public  void clickPropertyCardFirstOnPage(){
        if($(byXpath("//div[@class='lp-element lp-pom-root']")).is(visible)) {
            $(byXpath("(//a[@class='card-main-link'])[3]/img")).waitUntil(appears, 4000).click();
            sleep(2000);
        }else {
            $(byXpath("(//a[@class='card-main-link'])[3]/img")).waitUntil(visible, 4000).click();
        }
    }

    public  void clickPropertyContact(){
        $(byXpath("(//a[@class='btn btn-primary u_ed-block u_m20-top'])[2]")).waitUntil(visible, 4000).click();
    }


    public  void clickPropertyPageMessage(){
        sleep(2000);
        $(byXpath("(//a[@class='btn btn-primary u_ed-block u_m20-top'  and contains(text(), ' Message ')])[2]")).waitUntil(visible, 4000).click();
    }

    public void clickFMCardMessageUnlogged() {

        $(byXpath("//div[1]/div/div/a[@class='card-start-chat btn btn-circle']")).shouldBe(visible).click();
        sleep(2000);
        $(byXpath("//div[@class='modal fade in'][1]//a[@class='btn btn-default u_m10-bottom-xs' and contains(text(), 'sign in')]")).shouldBe(visible).click();
        sleep(2000);
    }

    public void clickFMCardFirstOnPage() {
        $(byXpath("((//div[@class='card-img'])[1])//img")).waitUntil(visible, 6000).click();
    }

    public void clickFMContact() {
        $(byXpath("//button[@class='btn btn-primary btn-sm text-16 u_m10-bottom u_ed-block-xs u_ed-block-lg']")).waitUntil(visible, 6000).click();
    }




    public void clickCardMessageLogged() {
        $(byXpath("(//div[contains(text(), 'Newport PO30 2DN, UK')]//ancestor::div[starts-with(@id, 'property_card')]//a/img)[2]")).waitUntil(visible, 6000).click();

    }

    public void clickPropertyCardPagelogged() {
        $(byXpath("(//div[contains(text(), 'Newport PO30 2DN, UK')]//ancestor::div[starts-with(@id, 'property_card')]//a/img)[1]")).waitUntil(visible, 6000).click();

    }

    public void clickPropertyCardFMnamePagelogged() {
        $(byXpath("//span[@class='card-top-username u_ed-block' and contains(text(), 'Jason, 40')]")).waitUntil(visible, 6000).click();

    }

    public void clickFMPageMessage() {
        $(byXpath("(//a[contains(text(), 'Message')])[2]")).waitUntil(visible, 6000).click();

    }

    public void clickUpgradeToMessage() {
        $(byXpath("(//a[contains(text(), 'Upgrade to message')])[1]")).waitUntil(visible, 6000).click();
    }

    public void clickPhoneReveal() {
        $(byXpath("(//button[@class='btn btn-sm btn-primary-outline js-reveal-property-phone-button'])[2]")).waitUntil(visible, 6000).click();
        //$(byXpath("(//button[@class='btn btn-sm btn-close close'])[2]")).waitUntil(appears, 4000).click();
        //$(byXpath("//span[@class='property-phone_reveal']/a")).waitUntil(visible, 6000).click();

    }

    public void clickMessage(String text) {
         $(byText(text)).click();
    }
}
