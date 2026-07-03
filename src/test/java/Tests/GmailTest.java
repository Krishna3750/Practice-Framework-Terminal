package Tests;

import Base.BaseClass;
import ExcelDataProvider.GmailExcelData;
import KeywordDataProvider.GmailKeywordData;
import KeywordSearchEngine.GmailKeywordEngine;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.List;

public class GmailTest extends BaseClass
{
    @Test(dataProvider = "Send Mail", dataProviderClass = GmailExcelData.class,description = "Send Mail")
    public void sendMailTest(String to,String subject) throws IOException
    {
        GmailKeywordData gmailKeywordData = new GmailKeywordData();
        GmailKeywordEngine gmailKeywordEngine = new GmailKeywordEngine(driver);

        List<String> keyword = gmailKeywordData.getSendMail_KeywordData();
        for(String key : keyword)
        {
            gmailKeywordEngine.executeSendMail(key,to,subject);
        }
    }

    @Test(dataProvider = "Send Meet", dataProviderClass = GmailExcelData.class,description = "Send Meet Link")
    public void sendMeetLinkTest(String to,String subject) throws IOException
    {
        GmailKeywordData gmailKeywordData = new GmailKeywordData();
        GmailKeywordEngine gmailKeywordEngine = new GmailKeywordEngine(driver);

        List<String> keyword = gmailKeywordData.getSendMeetLink_KeywordData();
        for(String key : keyword)
        {
            gmailKeywordEngine.executeSendMeet(key,to,subject);
        }
    }

    @Test(description = "Theme")
    public void checkTheme() throws IOException, InterruptedException
    {
        GmailKeywordEngine gmailKeywordEngine = new GmailKeywordEngine(driver);
        GmailKeywordData gmailKeywordData = new GmailKeywordData();

        List<String> keyword = gmailKeywordData.getCheckThemeText_KeywordData();
        for(String key : keyword)
        {
            gmailKeywordEngine.execute(key);
        }
    }

    @Test(description = "Manage Notifications")
    public void checkManageNotifications() throws IOException, InterruptedException
    {
        GmailKeywordEngine gmailKeywordEngine = new GmailKeywordEngine(driver);
        GmailKeywordData gmailKeywordData = new GmailKeywordData();

        List<String> keyword = gmailKeywordData.getCheckManageNotificationsText_KeywordData();
        for(String key : keyword)
        {
            gmailKeywordEngine.execute(key);
        }
    }
}
