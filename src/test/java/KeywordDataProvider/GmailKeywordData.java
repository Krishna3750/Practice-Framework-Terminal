package KeywordDataProvider;

import Utils.KeywordUtil;

import java.io.IOException;
import java.util.List;

public class GmailKeywordData
{
    public List<String> getSendMail_KeywordData() throws IOException
    {
        KeywordUtil keywordUtil = new KeywordUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Keyword Data";
        String keywordColumn = "Send Mail";

        List<String> data = keywordUtil.getKeywordData(path,sheetName,keywordColumn);
        return data;
    }

    public List<String> getSendMeetLink_KeywordData() throws IOException
    {
        KeywordUtil keywordUtil = new KeywordUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Keyword Data";
        String keywordColumn = "Send Meet Link";

        List<String> data = keywordUtil.getKeywordData(path,sheetName,keywordColumn);
        return data;
    }

    public List<String> getCheckThemeText_KeywordData() throws IOException
    {
        KeywordUtil keywordUtil = new KeywordUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Keyword Data";
        String keywordColumn = "Check Theme Text";

        List<String> data = keywordUtil.getKeywordData(path,sheetName,keywordColumn);
        return data;
    }

    public List<String> getCheckManageNotificationsText_KeywordData() throws IOException
    {
        KeywordUtil keywordUtil = new KeywordUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Keyword Data";
        String keywordColumn = "Check Manage Notifications Text";

        List<String> data = keywordUtil.getKeywordData(path,sheetName,keywordColumn);
        return data;
    }
}
