package TestScripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import GenericPackage.BaseClass;
import GenericPackage.ExcelFileUtility;
import POM.RegisterPage;
import POM.Welcomepage;

public class Registertest extends BaseClass{
	@Test
	public void registeringToApplication() throws EncryptedDocumentException, IOException {
		
	ExcelFileUtility e=new ExcelFileUtility();
	RegisterPage r=new RegisterPage(driver);
	Welcomepage w=new Welcomepage(driver);
	w.getRegisterLink().click();
	r.getFirstnametextfield().sendKeys(e.ToReadDataFromExcelFile("Register", 1, 0));
	r.getLastnametextfield().sendKeys(e.ToReadDataFromExcelFile("Register", 1, 1));
	r.getEmailtextfield().sendKeys(e.ToReadDataFromExcelFile("Register", 1, 2));
	r.getPasswordTextfield().sendKeys(e.ToReadDataFromExcelFile("Register", 1, 3));
	r.getConfirmpasswordTextfield().sendKeys(e.ToReadDataFromExcelFile("Register", 1, 4));
	r.getRegisterbutton().click();
	

}
}