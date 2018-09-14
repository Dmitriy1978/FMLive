package idealflatmate.appmanager;

import com.codeborne.selenide.Condition;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;


public class AddPropertyHelper extends HelperBase {



    public final MessageHelper messageHelper = new MessageHelper();

    public void openDropDownMenu() {
        $("span.hidden-xs").click();
    }

    public void pressAddListingFromBody() {
        //$(byXpath("/html/body/section/section/div/div/a")).click();
        if($(byXpath("//div[@class=\"container\"]/div[@id='property1']")).exists()) {
            RemoveUnfinishedListing();
            messageHelper.click(byXpath("/html/body/header/div/a"));
        }else {
            //pressAddListingFromBody();
            messageHelper.click(byXpath("/html/body/header/div/a"));
        }

    }

    public void chooseListingsFromDropDownMenu() {
        $(byXpath("//span[@class='pull-left' and contains(text(), ' Listings')]")).click();

    }


    public void setPostalCode(String postCode) {
        $(".form-control.u_ed-block").setValue(postCode).pressEnter();
        sleep(2000);
    }

    public void pressContinueButton() {
        $("#wizard-next").waitUntil(visible, 6000).click();
        sleep(4000);
    }

    public void chooseRoadFor(String road) {

        messageHelper.click(byXpath("//input[@id='property-route']"));
        $(byXpath("//input[@id='property-route']")).setValue(road).pressEnter();
        sleep(2000);
    }

    public void chooseAreaforLondon(final String AreaInDropDown) {
        messageHelper.click(byName("Property[area_link_id]"));
        messageHelper.click(byXpath("//*[@id=\"property-area_link_id\"]/option[" + AreaInDropDown + "]"));
        sleep(2000);
    }

    public void pressAddListingFromHeaderWithVerificationUnfinishedlisting() {
            if($(byXpath("/html/body/header/div/a[contains(text(), ' Continue ')]")).exists()) {
                openDropDownMenu();
                chooseListingsFromDropDownMenu();
                RemoveUnfinishedListing();
                messageHelper.click(byXpath("/html/body/header/div/a"));
            }else {
                //pressAddListingFromBody();
                messageHelper.click(byXpath("/html/body/header/div/a"));
            }

         }

    public void pressAddListingFromHeaderNotLoggedUser() {
        openDropDownMenu();
        chooseListingsFromDropDownMenu();
        sleep(2000);
    }

    public void pressAddYourListingNotLoggedUser() {
        $(byXpath("//a[@href=\"/create\"  and contains(text(), 'your listing')]")).click();;
    }

    public void setPhoneNumber(String phoneNumber, String text) {
       $(byXpath("//label[contains(text(), 'Phone Number')]")).scrollIntoView(text);
       fillInField(phoneNumber, $("#property-phone_number"),  $(byXpath("#signup-need-firstname")));
    }

    public void setPhoneNumber1(String Number) {
        sleep(2000);
        //$(byXpath("//label[contains(text(), 'Phone Number')]")).scrollTo();
        $(byXpath("//div//h2[contains(text(), 'Phone number')]/..//input[@id='property-phone_number']")).click();
        $(byXpath("//input[@id='property-phone_number']")).clear();
        $(byXpath("//input[@id='property-phone_number']")).setValue(Number);
        sleep(2000);
    }

    public void setTotalBedrooms(final String amount) {
        $("#property-bedrooms_no").click();
        messageHelper.click(byXpath("//*[@id=\"property-bedrooms_no\"]/option[" + amount + "]"));
    }

    public void setAllAmanities() {
        $(byXpath("//div[@id='property-property_amenities']/div/label[contains(text(), 'Garden')]")).click();
        $(byXpath("//div[@id='property-property_amenities']/div[2]")).click();
        $(byXpath("//div[@id='property-property_amenities']/div[3]")).click();
        $(byXpath("//div[@id='property-property_amenities']/div/label[contains(text(), 'Parking')]")).click();
        $(byXpath("//div[@id='property-property_amenities']/div[1]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $(byXpath("//div[@id='property-property_amenities']/div[2]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $(byXpath("//div[@id='property-property_amenities']/div[3]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $(byXpath("//div[@id='property-property_amenities']/div[4]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $(byXpath("//label[@for='property-pets_accepted']")).click();
        $(byXpath("//label[@for='property-smokers_accepted']")).click();
        $("#property-smokers_accepted").shouldBe(selected);
        $("#property-pets_accepted").shouldBe(selected);
    }


    public void setPropertyDescription() {
        $(byXpath("//div[@class='form-group field-property-description']/div[1]/textarea")).click();
        $(byXpath("//textarea[@id='property-description']")).setValue("Very good flat");
        // $(byXpath("//div[@class='form-group field-property-description']/div[1]/textarea")).shouldHave(text("Very good flat"));
    }

    public void setMonthlyRent(String rent) {
        fillInField(rent, $("#room-1-price"), $(byXpath("#room-1-price")));
     }

    public void setDeposit(String deposit) {
        fillInField(deposit, $("input#room-1-deposit"),  $(byXpath("input#room-1-deposit")));
    }

    public void setTotalBills(String bills) {
        $("input#room-1-bills").scrollIntoView(true).setValue(bills);
        $("#room-1-bills").shouldHave(value("400"));
    }

    public void setLeasePeriodFirstRoom() {
        $(byXpath("//div[@class='field-room-1-availability']/div[1]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $("#room-1-min_stay").click();
        $(byXpath("//*[@id=\"room-1-min_stay\"]/option[2]")).click();
        $("#room-1-max_stay").click();
        $("#room-1-max_stay > option:nth-child(13)").click();
    }


    public void setRoomDescription(String text) {
        $(byXpath("//div[@class='form-group field-room-1-description']/textarea")).click();
        $(byXpath("//div[@class='form-group field-room-1-description in-use']/textarea")).setValue(text);
        // $("#room-1-description").shouldHave(text("text"));
    }

    public void copySecondRoom() {
        $(byXpath("//button[@class='btn btn-sm btn-primary-outline js-room-copy']")).waitUntil(appear, 4000).click();
        $(byXpath("//div/input[@id='room-2-price']")).shouldBe(visible);
    }

    public void removeSecondRoom() {
        $(byXpath("//button[@class='btn btn-sm btn-primary-outline js-room-remove u_ef-left']")).waitUntil(appear, 4000).click();
        $(byXpath("//div/input[@id='room-2-price']")).shouldNotBe(visible);
    }

    public void addAnotherRoom() {
        $(byXpath("//button[@class='btn btn-sm btn-primary js-room-add']")).waitUntil(visible, 4000).click();
        $(byXpath("//div[@data-idx='3']")).waitUntil(appear, 4000);
        $(byXpath("//div[@data-idx='3']")).scrollIntoView(true);
    }


    public void setAnotherMonthlyRent(String rent) {
        $(byXpath("//div/input[@id='room-3-price']")).click();
        $(byXpath("//div/input[@id='room-3-price']")).setValue(rent);
        $(byXpath("//div/input[@id='room-3-price']")).shouldHave(Condition.value("800"));
        //$("#wizard-next").click();
    }

    public void setLeasePeriodSecondRoom() {
        $(byXpath("//div[@class='field-room-3-availability']/div[1]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox checked"));
        $(byXpath("//div[@class='field-room-3-availability']/div/label")).waitUntil(appear, 4000).click();
        $(byXpath("//div[@class='field-room-3-availability']/div[1]")).waitUntil(appear, 4000).shouldHave(attribute("class", "checkbox"));
        $(byXpath("//input[@id='room-3-available_from']")).waitUntil(appear, 4000).click();
        $(".ui-icon.ui-icon-circle-triangle-e").waitUntil(appear, 4000).click();
        $(".ui-datepicker-year").waitUntil(appear, 4000).click();
        messageHelper.click(byXpath("//option[@value='2025']"));
        $(byXpath("//a[@class='ui-state-default' and contains(text(), '11')]")).waitUntil(appear, 4000).click();

    }

    public void ContinueListingWithoutPhoto() {
        $(byXpath("//*[@id=\"wizard-finish-btn\"]")).waitUntil(appear, 4000).click();
        sleep(4000);
        $(byXpath("//button[@class='confirm']")).waitUntil(appear, 6000).click();
        sleep(4000);

        //confirm("Are you sure you want to continue without photos?");
       // $("#uploadimageform-imagefiles").uploadFile(new File("src/test/resources/Property1.jpg"));
       // $(byXpath("(//div[@class='file-preview-frame krajee-default file-preview-initial file-sortable kv-preview-thumb '])[1]")).shouldBe(Condition.visible);
    }

    public void uploadProperty3Photos() {
        $(byXpath("//input[@id='uploadimageform-imagefiles']")).uploadFile(new File("src/test/resources/listing1.jpg"));
        sleep(2000);
        $(byXpath("(//div[@class='file-preview-frame krajee-default file-preview-initial file-sortable kv-preview-thumb '])[1]")).shouldBe(Condition.visible);
        $(byXpath("//input[@id='uploadimageform-imagefiles']")).uploadFile(new File("src/test/resources/listing2.jpeg"));
        sleep(2000);
        $(byXpath("(//div[@class='file-preview-frame krajee-default file-preview-initial file-sortable kv-preview-thumb '])[2]")).shouldBe(Condition.visible);
        $(byXpath("//input[@id='uploadimageform-imagefiles']")).uploadFile(new File("src/test/resources/listing3.jpg"));
        sleep(2000);
        $(byXpath("(//div[@class='file-preview-frame krajee-default file-preview-initial file-sortable kv-preview-thumb '])[3]")).shouldBe(Condition.visible);
        sleep(1000);

    }

    public void finishPropertyCreating() {
        $(byXpath("//*[@id='wizard-finish-btn']")).shouldBe(enabled).click();
        //$(byXpath("//*[@id=\"wizard-finish\"]")).waitUntil(Condition.disappears, 4000);
        $(byXpath("//div[@class='u_p20-bottom u_b-bottom u_b-2']/a[contains(text(), 'Continue without upgrading')]")).waitUntil(appear, 4000).click();
        $(byXpath("//span[contains(text(), 'Your')]")).shouldHave(text("Your listing is now live!"));
    }
    public void finishPropertyCreatingAgency() {
        $(byXpath("//*[@id='wizard-finish-btn']")).shouldBe(enabled).click();
        //$(byXpath("//*[@id=\"wizard-finish\"]")).waitUntil(Condition.disappears, 4000);
        $(byXpath("//div[@class='u_p20-bottom u_b-bottom u_b-2']/a[contains(text(), 'Continue without upgrading')]")).waitUntil(appear, 4000).click();
        $(byXpath("//p[@class='u_m20-top']")).shouldHave(text("In order to list your property you need to"));
    }

    public void finishPropertyCreatingWithoutPhoto() {
        $(byXpath("//div[@class='u_p20-bottom u_b-bottom u_b-2']/a[contains(text(), 'Continue without upgrading')]")).waitUntil(appear, 4000).click();
        $(byXpath("//span[contains(text(), 'Your')]")).shouldHave(text("Your listing is now live!"));
    }

    public void viewListing() {
        $(byXpath("//a[@class='btn btn-half btn-primary listing-panel-button u_m10-bottom-xs']")).waitUntil(appear, 4000).click();
    }

    public void RemoveListing() {
        $(byXpath("//button[contains(@class, \"listing-panel-delete\")]")).waitUntil(appear, 4000).click();
        $(byXpath("(//input[1][@type='radio'])[1]")).waitUntil(appear, 4000).selectRadio("0");
        $(byXpath("//button[@type='submit' and contains(text(), 'Delete property')]")).waitUntil(Condition.appears, 4000).click();
    }
    private void RemoveUnfinishedListing() {
        $(byXpath("//button[@class='btn btn-default u_p0 btn-circle pull-right js-bring-cover listing-panel-delete u_bg-white']")).waitUntil(appear, 4000).click();
        $(byXpath("(//input[1][@type='radio'])[1]")).waitUntil(appear, 4000).selectRadio("0");
        $(byXpath("//button[@type='submit' and contains(text(), 'Delete property')]")).waitUntil(Condition.appears, 4000).click();
        sleep(4000);
    }

    public void selectTypeUser(final String checkBoxId) {
        $("#type_id_" + checkBoxId).waitUntil(appear, 4000).click();
    }

    public void pressContinue() {
        $("#wizard-next").waitUntil(appear, 8000).click();

    }

    public void pressContinue1() {
        sleep(4000);
        $("#wizard-next").waitUntil(appear, 4000).click();
        sleep(2000);
    }


}
