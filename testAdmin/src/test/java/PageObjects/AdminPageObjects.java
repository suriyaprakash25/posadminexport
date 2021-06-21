package PageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AdminPageObjects {
	//SALES
	@FindBy(xpath ="/html/body/div/div/nav/ul/li[3]/a")
	public static WebElement Sales;
	@FindBy(xpath = "//*[@id=\'js_transactions-filter\']/div[2]/div/div/div/button")
	public static WebElement Exportbutton;
	@FindBy(xpath = "//*[@id=\'js_transactions-filter\']/div[2]/div/div/div/div[1]/a[1]")
    public static WebElement ExportItemCSV;
	@FindBy(xpath ="//*[@id=\'js_transactions-filter\']/div[2]/div/div/div/div[1]/a[2]" )
    public static WebElement ExportOrderCSV;
	//Pdf
	@FindBy(xpath ="//*[@id=\'js_transactions-filter\']/div[2]/div/div/div/div[1]/button" )
	public static WebElement Pdf;
	@FindBy(xpath ="//*[@id=\'exportAll\']" )
    public static WebElement pdfalert;
	@FindBy(xpath ="//*[@id=\'exportModal\']/div/div/div[3]/button[2]" ) 
    public static WebElement Exportpdf;
	
	@FindBy(xpath ="/html/body/div[1]/div/nav/ul/a[1]" ) 
    public static WebElement Reports;
	//Salesummary
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[1]" )  	
    public static WebElement Salesummary;
	@FindBy(xpath ="//*[@id=\'js_sales-summary-filter\']/div[2]/div/div/div[1]/a" ) 
    public static WebElement Salesummaryexportbutton;
	//paymentmethods
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[2]" )  	
    public static WebElement paymentmethods;
	@FindBy(xpath ="//*[@id=\'js_payment-method-filter\']/div[2]/div/div/div[1]/a" )  
    public static WebElement paymentmethodsexportbutton;
	//itemssales
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[3]" ) 
    public static WebElement itemssales;
	@FindBy(xpath ="//*[@id=\"js_item-sales-filter\"]/div[2]/div/div/a[1]")  
    public static WebElement itemssalesexportbutton;
	//Categorysales
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[4]" )  
    public static WebElement Categorysales;
	@FindBy(xpath ="//*[@id=\'js_category-sales-filter\']/div[2]/div/div/div[1]/button" )  
    public static WebElement Categorysalesexportbutton;
	@FindBy(xpath ="//*[@id=\'js_category-sales-filter\']/div[2]/div/div/div[1]/ul/li[1]/a" )
	public static WebElement CategorysalesexportbuttonCSV;
	@FindBy(xpath ="//*[@id=\'js_category-sales-filter\']/div[2]/div/div/div[1]/ul/li[2]/a" )
	public static WebElement CategorysalesexportbuttonCSVDETAIL;
	//employeesales
	@FindBy(linkText ="Employee Sales" )
    public static WebElement employeesales;
	@FindBy(xpath ="//*[@id=\'js_employee-sales-filter\']/div[2]/div/div/div[1]/a" ) //xpath ="//*[@id=\'js_employee-sales-filter\']/div[2]/div/div/div[1]/a" 
    public static WebElement employeesalesexportbutton;
	//locationsales
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[6]" )
    public static WebElement locationsales;
	@FindBy(xpath ="//*[@id=\'js_location-sales-filter\']/div[2]/div/div/a" ) 
    public static WebElement locationsalesexportbutton;
	//CUSTOMERSALE
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[7]" )
    public static WebElement CUSTOMERSALE;
	@FindBy(xpath ="//*[@id=\'js_customer-sales-filter\']/div[2]/div/div/div[1]/a" ) 
    public static WebElement CUSTOMERSALEexportbutton;
	//CUSTOMERitems
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[8]" )
    public static WebElement CUSTOMERitems;
	@FindBy(xpath ="//*[@id=\'js_customer-items-filter\']/div[2]/div/div/div[1]/a" ) 
    public static WebElement CUSTOMERitemsexportbutton;
	//CUSTOMERwithoutsales
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[9]" )
    public static WebElement CUSTOMERwithoutsales;
	@FindBy(xpath ="//*[@id=\'js_customer-no-sales-filter\']/div[2]/div/div/a" ) 
    public static WebElement CUSTOMERwithoutsalesexportbutton;
	//Taxes
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[10]" )
    public static WebElement Taxes;
	@FindBy(xpath ="//*[@id=\'js_tax-sales-filter\']/div[2]/div/div/div[1]/a" ) //*[@id="js_tax-sales-filter"]/div[2]/div/div/div[1]/a
    public static WebElement Taxesexportbutton;
	//combo
	
	//html/body/div[3]/div/div[4]/div/button
	@FindBy(xpath ="/html/body/div[3]/div/div[4]/div/button" )//html/body/div[1]/div/main/div[2]/div[1]/div/a[11]
    public static WebElement alret;
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[11]" )//html/body/div[1]/div/main/div[2]/div[1]/div/a[11]
    public static WebElement combo;
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[2]/form/div[2]/div/div/a" ) //*[@id="js_item-variation-group-sales-filter"]/div[2]/div/div/a
    public static WebElement comboexportbutton;	
	//charges
	@FindBy(xpath ="/html/body/div[1]/div/main/div[2]/div[1]/div/a[12]" )
    public static WebElement charges;
	@FindBy(xpath ="//*[@id=\'js_charges-filter\']/div[2]/div/div/a" ) 
    public static WebElement chargesexportbutton;	
	
		
	}
	
	
	
	
	


