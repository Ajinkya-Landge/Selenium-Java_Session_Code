package testngsessions;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	// before--Test--After
	
//	BS---Connect With DB
//	BT---Create User
//	BC---Launch Browser
	
		//	BM---Login To App
		//	Add To Cart Test
		//	AM---Logout
	
		//	BM---Login To App
		//	CheckOut Test
		//	AM---Logout
	
		//	BM---Login To App
		//	Search Test
		//	AM---Logout
	
//	AC---Close Browser
//	AT---delete User
//	AS---disconnect With DB
	
	//1
	@BeforeSuite
	public void connectWithDB() {
		System.out.println("BS---Connect With DB");
	}
	//2
	@BeforeTest
	public void createUser() {
		System.out.println("BT---Create User");
	}
	//3
	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC---Launch Browser");
	}
	//4 //7 //10
	@BeforeMethod
	public void loginToAPP() {
		System.out.println("BM---Login To App");
	}
	//11
	@Test
	public void searchTest() {
		System.out.println("Search Test");
	}
	//5
	@Test
	public void addToCartTest() {
		System.out.println("Add To Cart Test");
	}
	//8
	@Test
	public void checkOutTest() {
		System.out.println("CheckOut Test");
	}
	//6 //9 //12
	@AfterMethod
	public void logout() {
		System.out.println("AM---Logout");
	}
	//13
	@AfterClass
	public void closeBrowser() {
		System.out.println("AC---Close Browser");
	}
	//14
	@AfterTest
	public void deleteUser() {
		System.out.println("AT---delete User");
	}
	//15
	@AfterSuite
	public void disconnectWithDB() {
		System.out.println("AS---disconnect With DB");
	}
	
}
