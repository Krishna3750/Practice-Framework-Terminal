package ExcelDataProvider;

import Utils.ExcelUtil;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.util.List;

public class GmailExcelData
{
    @DataProvider(name = "Send Mail")
    public Object[][] getSendMail_ExcelData() throws IOException
    {
        ExcelUtil excelUtil = new ExcelUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Excel Data";
        String testcase = "Send mail";

        List<List<String>> list = excelUtil.getExcelData(path,sheetName,testcase);
        Object[][] data = new Object[list.size()][];

        for(int i=0;i<list.size();i++)
        {
            data[i] = list.get(i).toArray();
        }
        return data;
    }

    @DataProvider(name = "Send Meet")
    public Object[][] getSendMeetLink_ExcelData() throws IOException
    {
        ExcelUtil excelUtil = new ExcelUtil();
        String path = System.getProperty("user.dir")+"/TestData/Data.xlsx";
        String sheetName = "Mail Excel Data";
        String testcase = "Send meet";

        List<List<String>> list = excelUtil.getExcelData(path,sheetName,testcase);
        Object[][] data = new Object[list.size()][];

        for(int i=0;i<list.size();i++)
        {
            data[i] = list.get(i).toArray();
        }
        return data;
    }
}
