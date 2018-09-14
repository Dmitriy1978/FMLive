package idealflatmate.appmanager;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;

public class HelperBase {

    public void fillInField(String text, SelenideElement $, SelenideElement selenideElement) {
        sleep(1000);
        selenideElement.waitUntil(visible, 20000).click();
        selenideElement.waitUntil(visible, 20000).clear();
        sleep(1000);
        selenideElement.waitUntil(visible, 20000).setValue(text);
    }

    public void gmailLogin(String text, String field, String next) {
        $(byXpath(field)).waitUntil(appears, 4000).click();
        $(byXpath(field)).waitUntil(appears, 4000);
        $(byXpath(field)).shouldBe(visible);
        $(byXpath(field)).setValue(text);
        $(byXpath(next)).click();
        sleep(2000);
    }

    protected void fillInField1(String nla, SelenideElement $, SelenideElement $1) {
    }

    public void toHomePage() {
        //$(By.xpath("//a[@class='navbar-brand']")).click();
        open("http://front.idealflatmate4test.demo.devplatform2.com");
    }

    public void Field2(String locator, String locator2, String locator3, String text) {
        $(locator).click();
        $(locator2).clear();
        $(locator3).setValue(text);
    }

    public void FieldEnter(String locator1, String locator2, String locator3, String text) {
        $(locator1).click();
        $(locator2).clear();
        $(locator3).setValue(text).pressEnter();
    }

    public void dateMonthYear(String day, String month, String year) {
        $(byXpath("//select[@id='moreinfosignupform-day']")).selectOptionByValue(day);
        $(byXpath("//select[@id='moreinfosignupform-month']")).click();
        $(byXpath("//select[@id='moreinfosignupform-month']")).selectOptionByValue(month);
        $(byXpath("//select[@id='moreinfosignupform-year']")).click();
        $(byXpath("//select[@id='moreinfosignupform-year']")).selectOptionByValue(year);
    }
    public void dateMonthYearMove(String day, String month, String year) {
        $(byXpath("//select[@id='budgetpreferredsignupform-move_in_day']")).selectOptionByValue(day);
        $(byXpath("//select[@id='budgetpreferredsignupform-move_in_month']")).click();
        $(byXpath("//select[@id='budgetpreferredsignupform-move_in_month']")).selectOptionByValue(month);
        $(byXpath("//select[@id='budgetpreferredsignupform-move_in_year']")).click();
        $(byXpath("//select[@id='budgetpreferredsignupform-move_in_year']")).selectOptionByValue(year);
    }
}
