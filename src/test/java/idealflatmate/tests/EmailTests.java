package idealflatmate.tests;

import org.testng.annotations.Test;

public class EmailTests extends TestBase {


  //  @Test (priority = 10)
    public void TestSuccessfulEmailReceivingWelcomeListingMessageSubscriptionCancSub() {
        emailHelper.openGmailPage();
        emailHelper.setLoginAsUserEmail("cro.gen.idealflatmate@gmail.com");
        emailHelper.setLoginAsUserPassword("qqqqqq666D");
        //emailHelper.enterEmail();
        emailHelper.enterInbox();
        //emailHelper.verificationWelcome();
       // emailHelper.verificationListingisLive();
      //  emailHelper.verificationMessage();
        emailHelper.tipCheckboxWelcome();
        emailHelper.tipCheckboxListingisLive();
        emailHelper.tipCheckboxMessage();
        emailHelper.tipCheckboxPremiumFHSubscription();
        emailHelper.tipCheckboxPremiumFHSubscriptionCanceled();
        emailHelper.removeAllEmails();
       // emailHelper.verificationNoWelcome();
       // emailHelper.verificationNoListingisLive();
       // emailHelper.verificationNoMessageEmail();

    }
}
