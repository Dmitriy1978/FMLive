package idealflatmate.appmanager;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class MatchingHelper extends HelperBase {

    public void clickHomePageMatching() {
        if($(byXpath("//div[@class='lp-element lp-pom-root']")).is(visible)){
            $(byXpath("(//button[@class='ub-emb-close'])[1]")).waitUntil(visible, 4000).click();
            sleep(2000);
        }else {
            $(byXpath("//button[contains(text(), 'Find your new flatmate!')]")).waitUntil(visible, 4000).click();
            //$(byXpath("//button[contains(text(), 'Start the match test')] ")).waitUntil(visible, 4000).click();
        }
    }

    public void enterFirstName(String Name) {
        Field2("input#addnamematchform-username", "input#addnamematchform-username", "input#addnamematchform-username", Name);
        $("input#addnamematchform-username").click();


    }
    public void clickContinueMatching1() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I tend to go out to meet friends, socialize or network most evenings')]/../../..//" +
                "label[@data-questionid='1'][1]")).click();
        sleep(1000);
    }

    public void clickContinueMatching2() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I like to have people over for drinks on a regular basis')]/../../..//" +
                "label[@data-questionid='2'][2]")).waitUntil(visible, 4000).click();
        sleep(1000);

    }
    public void clickContinueMatching3() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I like having friends staying over for a few days')]/../../..//" +
                "label[@data-questionid='3'][3]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching4() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I would like my shared house to be known as a place to party')]/../../..//" +
                "label[@data-questionid='4'][4]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching5() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I sometimes go out and come home in the early hours')]/../../..//" +
                "label[@data-questionid='5'][5]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching6() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'Occasionally I bring people I have just met to my house')]/../../..//" +
                "label[@data-questionid='6'][6]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatchingAfterSignUp() {
        $(byXpath("(//button[contains(text(), 'Continue')])[7]")).waitUntil(visible, 4000).click();
        sleep(2000);
    }
    public void clickContinueMatching7() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'There should be a rota for putting the bins out')]/../../..//" +
                "label[@data-questionid='7'][1]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching8() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I like to sort my spices and herbs clearly')]/../../..//" +
                "label[@data-questionid='8'][2]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching9() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I like the fridge clean and organized')]/../../..//" +
                "label[@data-questionid='9'][3]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching10() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'There should be a rota for allocating household chores')]/../../..//" +
                "label[@data-questionid='10'][4]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching11() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I am usually the person nagging others to tidy up')]/../../..//" +
                "label[@data-questionid='11'][5]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching12() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I see flatmates as people I live with rather than friends')]/../../..//" +
                "label[@data-questionid='12'][6]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching13() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'If I could choose, I would prefer to live alone')]/../../..//" +
                "label[@data-questionid='13'][1]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching14() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I prefer to eat in my room rather than in the communal areas')]/../../..//" +
                "label[@data-questionid='14'][2]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching15() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I spend most of my time in my room')]/../../..//" +
                "label[@data-questionid='15'][3]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching16() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I don’t mind if my flatmates invite friends to our house, as long as they give me notice')]/../../..//" +
                "label[@data-questionid='16'][4]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching17() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I am relaxed about the sexual choice of my flatmates')]/../../..//" +
                "label[@data-questionid='17'][5]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickContinueMatching18() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'It is sometimes OK to break the rules')]/../../..//" +
                "label[@data-questionid='18'][6]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching19() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I am relaxed about the religious choices of my flatmates')]/../../..//" +
                "label[@data-questionid='19'][1]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }
    public void clickContinueMatching20() {
        $(byXpath("//div[@class='quiz-question-inner' and contains(text(), " +
                "'I am happy to help a flatmate with a personal task, e.g. ironing a shirt or giving them a lift somewhere')]/../../..//" +
                "label[@data-questionid='20'][2]")).waitUntil(visible, 4000).click();
        sleep(1000);
    }

    public void clickSkip7step() {
        $(byXpath("(//div[@class='col-sm-3 col-sm-push-6'])[7]/a")).waitUntil(visible, 4000).click();
    }
    public void chooseMatchingFromDropDownMenu() {
        $(byXpath("//span[@class='pull-left' and contains(text(), ' Matching')]")).click();

    }

    public void clickSkip7stepFromHome() {
        $(byXpath("(//div[@class='col-sm-3 col-sm-push-6'])[1]/a")).waitUntil(visible, 4000).click();
    }

    public void clickTakeTheMatchTestFMscreen() {
        $(byXpath("//a[@data-target='#matchModal']")).waitUntil(visible, 4000).click();
    }

    public void closePopup() {
        $(byXpath("//button[@class='btn btn-sm btn-close close js-close-notify-matching']")).waitUntil(visible, 4000).click();
    }

    public void clickARoom() {
        $(byXpath("//div[@class='col-sm-6 u_m15-bottom-xs']/a")).click();

    }

    public void clickAFM() {
        $(byXpath("//div[@class='col-sm-6']/a")).click();

    }
    public void verifBlankName() {
        $("input#addnamematchform-username").click();
        $(byXpath("//div[@class='text-center text-16 u_m20-bottom']/strong")).click();
        $(byXpath("//div[input[@id='addnamematchform-username']]/div[@class='help-block']")).shouldHave(text("Username cannot be blank."));

    }

    public void veryfyScoresInDropDownMenu() {
        $(byXpath("//span[@class='label label-primary']")).shouldHave(text("100% complete"));
    }
}
