package testAdmin;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Commonfunctions.commonfunction;
import PageObjects.AdminPageObjects;
import PageObjects.Loginpageobjects;

public class exportAdmin extends commonfunction

{
	
@Test(priority = 0)
	public void LoginTest(){
	
		
		
		PageFactory.initElements(driver,Loginpageobjects.class);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Loginpageobjects.username.sendKeys(properties.getProperty("username"));
		Loginpageobjects.password.sendKeys(properties.getProperty("password"));
		Loginpageobjects.loginbutton.click();
}
		
	@Test(priority = 1)
	public void sales_Export()
	
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	PageFactory.initElements(driver, AdminPageObjects.class);
	
	AdminPageObjects.Sales.click();
	
	AdminPageObjects.Exportbutton.click();
	
	 AdminPageObjects.Pdf.click();
    AdminPageObjects.pdfalert.click();
    AdminPageObjects.Exportpdf.click();
    driver.navigate().back();
    
    AdminPageObjects.Exportbutton.click();
	AdminPageObjects.ExportItemCSV.click();
	AdminPageObjects.Exportbutton.click();
	AdminPageObjects.ExportOrderCSV.click();
	}
    
	@Test(priority = 2)
	public void Reports_Export() throws InterruptedException
	{
		WebDriverWait wait = new WebDriverWait(driver,40);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    AdminPageObjects.Reports.click();
    AdminPageObjects.Salesummary.click();
    AdminPageObjects.Salesummaryexportbutton.click();
    
    AdminPageObjects.itemssales.click();
    AdminPageObjects.itemssalesexportbutton.click();
    
    AdminPageObjects.Categorysales.click();
    Thread.sleep(3000);
   // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    AdminPageObjects.Categorysalesexportbutton.click();
    AdminPageObjects.CategorysalesexportbuttonCSV.click();
    AdminPageObjects.Categorysalesexportbutton.click();
    AdminPageObjects.CategorysalesexportbuttonCSVDETAIL.click();
    
    
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Employee Sales")));
    AdminPageObjects.employeesales.click();
    AdminPageObjects.employeesalesexportbutton.click();
    
    AdminPageObjects.locationsales.click();
    AdminPageObjects.locationsalesexportbutton.click();
    
    AdminPageObjects.CUSTOMERSALE.click();
    AdminPageObjects.CUSTOMERSALEexportbutton.click();
    
    AdminPageObjects.CUSTOMERitems.click();
    AdminPageObjects.CUSTOMERitemsexportbutton.click();
    
    AdminPageObjects.CUSTOMERwithoutsales.click();
    AdminPageObjects.CUSTOMERwithoutsalesexportbutton.click();
    Thread.sleep(4000);
    AdminPageObjects.Taxes.click();
    AdminPageObjects.Taxesexportbutton.click();
    
    AdminPageObjects.combo.click();
    AdminPageObjects.comboexportbutton.click();
    AdminPageObjects.alret.click();
    
    
    
    AdminPageObjects.charges.click();
    AdminPageObjects.chargesexportbutton.click();
    
    

}}