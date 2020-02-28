package step_definitions;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.ClientMgmtPage;
import pages.HomePage;
import utilities.ExcelUtility;
public class ClientStep {
    ClientMgmtPage clientMgmtPage = new ClientMgmtPage();
    HomePage homePage = new HomePage();
    static String keyword;
    static String excelFilePath="./src/test/resources/testData/Keywords.xlsx";
    @Then("I click on edit link a record")
    public void i_click_on_edit_link_a_record() {
        clientMgmtPage.editLinks.get(0).click();
    }
    @Then("I click on save without changing anything")
    public void i_click_on_save_without_changing_anything() {
        clientMgmtPage.saveButton.click();
    }
    @Then("I should get {int} required fields warning message")
    public void i_should_get_required_fields_warning_message(int numberOfWarnings) {
        int actualNumberOfValidationMsgs = clientMgmtPage.validationMessages.size();
        Assert.assertEquals( "Not showing all warning messages",numberOfWarnings, actualNumberOfValidationMsgs);
    }
    @When("I enter client name")
    public void user_enters_client_name_as() {
        try {
            // Establish connection fo excel file
            ExcelUtility.setExcelFile(excelFilePath, "Sheet1");
            //read vale of a particular cell
            keyword=ExcelUtility.getCellData(1,0);
        } catch (Exception e) {
            e.printStackTrace();
        }
        homePage.searchBox.sendKeys(keyword);
    }
    @When("I click search button")
    public void user_clicks_search_button() {
        homePage.searchBtn.click();
    }
    @Then("I see client name in results")
    public void user_sees_client_name_in_results() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println(homePage.firstTableResult.getText());
        System.out.println(keyword);
        Assert.assertTrue(homePage.firstTableResult.getText().toLowerCase().contains(keyword.toLowerCase()));
    }
    @Then("I update my excel file")
    public void iUpdateMyExcelFile() {
        try {
            ExcelUtility.setExcelFile(excelFilePath, "Sheet1");
            ExcelUtility.setCellData(excelFilePath, "Mudriy", 0,1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Then("I create and write to a file")
    public void iCreateAndWriteToAFile() {
        try {
            ExcelUtility.setExcelFile(excelFilePath, "Sheet1");
            ExcelUtility.createExcelAndWrite("./src/test/resources/testData/BrandNew.xlsx", "Mudriy");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Then("I can print all excel data")
    public void iCanPrintAllExcelData() {
        try {
            ExcelUtility.setExcelFile(excelFilePath, "Sheet1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        ExcelUtility.printAllData();
    }

    @Then("I can write data to excel")
    public void iCanWriteDataToExcel() {
        try {
            ExcelUtility.setExcelFile(excelFilePath, "Sheet1");
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            ExcelUtility.setCellData(excelFilePath, "Bacardi", 1, 1);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}





