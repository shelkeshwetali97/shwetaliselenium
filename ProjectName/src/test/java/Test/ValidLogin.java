package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import Genreric.BaseTest;
import Genreric.Excel;
import Genreric.WebGeneric;
import POM.ActitimePage;
import POM.LoginPage;

public class ValidLogin extends BaseTest {

	@Test
	void validLogin() throws EncryptedDocumentException, IOException, InterruptedException {
		WebGeneric wb=new WebGeneric();
		wb.verifyTitle(driver,"actiTIME - Login");
		LoginPage lp= new LoginPage(driver);
		Excel e=new Excel();
		String username = e.readDataFromExcel("Sheet1", 0, 0);
		String password = e.readDataFromExcel("Sheet1", 0, 1);
		lp.getUsername().sendKeys(username);
		lp.getPassword().sendKeys(password);
		lp.getLoginbtn().click();
		wb.verifyURL(driver,"https://demo.actitime.com/user/submit_tt.do");
		ActitimePage atp= new ActitimePage(driver);
		Thread.sleep(ITO);
		atp.getLogout().click();
		wb.verifyTitle(driver, "actiTIME - Login");
	}
}
