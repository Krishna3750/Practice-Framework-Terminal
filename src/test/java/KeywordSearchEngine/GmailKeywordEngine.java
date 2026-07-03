package KeywordSearchEngine;

import Pages.GmailPage;
import io.appium.java_client.android.AndroidDriver;
import org.testng.Assert;

public class GmailKeywordEngine
{
    public GmailPage gmailPage;

    public GmailKeywordEngine(AndroidDriver driver)
    {
        gmailPage = new GmailPage(driver);
    }

    public void executeSendMail(String keyword,String to,String subject)
    {
        switch(keyword)
        {
            case "Click got it": gmailPage.clickGotIt();
            break;

            case "Click take me to gmail": gmailPage.clickTakeMeToGmail();
            break;

            case "Click allow": gmailPage.clickAllow();
            break;

            case "Click got it in home page": gmailPage.clickGotItInHomePage();
            break;

            case "Click compose": gmailPage.clickCompose();
            break;

            case "Enter to": gmailPage.enterToMail(to);
            break;

            case "Click suggestion" : gmailPage.clickSuggestion();
            break;

            case "Enter subject": gmailPage.enterSubject(subject);
            break;

            case "Click send": gmailPage.clickSend();
            break;

            case "Check description": boolean descriptionFlag = gmailPage.checkDescription("Sent");
            Assert.assertTrue(descriptionFlag);
            break;
        }
    }

    public void executeSendMeet(String keyword,String to,String subject)
    {
        switch(keyword)
        {
            case "Click got it": gmailPage.clickGotIt();
                break;

            case "Click take me to gmail": gmailPage.clickTakeMeToGmail();
                break;

            case "Click allow": gmailPage.clickAllow();
                break;

            case "Click got it in home page": gmailPage.clickGotItInHomePage();
                break;

            case "Click meet": gmailPage.clickMeet();
                break;

            case "Click cancel": gmailPage.clickCancel();
            break;

            case "Click new meeting" : gmailPage.clickNewMeeting();
                break;

            case "Click get a meeting link to share": gmailPage.clickGetAMeetingLinkToShare();
                break;

            case "Click share invite": gmailPage.clickShareInvite();
                break;

            case "Click gmail": gmailPage.clickGmail();
                break;

            case "Enter to": gmailPage.enterToMail(to);
                break;

            case "Click suggestion" : gmailPage.clickSuggestion();
                break;

            case "Enter subject": gmailPage.enterSubject(subject);
                break;

            case "Click send": gmailPage.clickSend();
                break;

            case "Click close": gmailPage.clickClose();
                break;
        }
    }

    public void execute(String keyword) throws InterruptedException
    {
        switch(keyword)
        {
            case "Click got it": gmailPage.clickGotIt();
                break;

            case "Click take me to gmail": gmailPage.clickTakeMeToGmail();
                break;

            case "Click allow": gmailPage.clickAllow();
                break;

            case "Click got it in home page": gmailPage.clickGotItInHomePage();
                break;

            case "Click meet": gmailPage.clickMeet();
                break;

            case "Click cancel": gmailPage.clickCancel();
                break;

            case "Click navigation menu" : gmailPage.clickNavigationMenu();
            break;

            case "Swipe action": gmailPage.swipeAction();
                break;

            case "Click settings": gmailPage.clickSettings();
                break;

            case "Click general settings": gmailPage.clickGeneralSettings();
                break;

            case "Click theme": gmailPage.clickTheme();
                break;

            case "Click light" : gmailPage.clickLight();
                break;

            case "Check theme text": boolean themeTextFlag = gmailPage.checkThemeText("Light");
            Assert.assertTrue(themeTextFlag);
                break;

            case "Click manage notifications": gmailPage.clickManageNotifications();
                break;

            case "Doubletap all gmail notifications toggle": gmailPage.doubleTapAction();
                break;

            case "Check all gmail notifications text": boolean allGmailNotificationsFlag = gmailPage.checkAllGmailNotificationsText("All Gmail notifications");
                Assert.assertTrue(allGmailNotificationsFlag);
                break;
        }

    }
}
