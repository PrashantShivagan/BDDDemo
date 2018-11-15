package EmailReg;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class A {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "file:///D:/Reading%20material%20java/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testA() throws Exception {
    driver.get("file:///D:/Reading%20material%20java/Module%203/BDD%20for%20Full%20Stack/Demos/Lesson%205-HTML%20Pages/WorkingWithForms.html?txtUName=&txtPwd=&txtFN=&txtLN=&DtOB=&Email=&Address=&Phone=&submit=Submit");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("prash123");
    //driver.findElement(By.id("txtConfPassword")).clear();
   // driver.findElement(By.id("txtConfPassword")).sendKeys("hfdnn");
    //assertEquals("Passwords donot match!", closeAlertAndGetItsText());
    driver.findElement(By.id("txtUserName")).clear();
    driver.findElement(By.id("txtUserName")).sendKeys("Prashant");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("");
    driver.findElement(By.id("txtPassword")).clear();
    driver.findElement(By.id("txtPassword")).sendKeys("prash123");
    driver.findElement(By.id("txtConfPassword")).clear();
    driver.findElement(By.id("txtConfPassword")).sendKeys("prash123");
    driver.findElement(By.id("txtFirstName")).clear();
    driver.findElement(By.id("txtFirstName")).sendKeys("Prashant");
    driver.findElement(By.id("txtLastName")).clear();
    driver.findElement(By.id("txtLastName")).sendKeys("Shivagan");
    driver.findElement(By.id("rbMale")).click();
    driver.findElement(By.id("DOB")).clear();
    driver.findElement(By.id("DOB")).sendKeys("13/01/96");
    driver.findElement(By.id("txtEmail")).clear();
    driver.findElement(By.id("txtEmail")).sendKeys("prashantshivagan@gmail.com");
    driver.findElement(By.id("txtAddress")).clear();
    driver.findElement(By.id("txtAddress")).sendKeys("Santacruz");
    // ERROR: Caught exception [ERROR: Unsupported command [addSelection | name=City | label=Mumbai]]
    driver.findElement(By.id("txtPhone")).clear();
    driver.findElement(By.id("txtPhone")).sendKeys("8692837660");
    driver.findElement(By.name("chkHobbies")).click();
    driver.findElement(By.name("submit")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
