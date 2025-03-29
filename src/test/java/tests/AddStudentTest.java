package tests;

//Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;
import java.util.*;

public class AddStudentTest {
private WebDriver driver;
private Map<String, Object> vars;
JavascriptExecutor js;
@Before
public void setUp() {
 driver = new ChromeDriver();
 js = (JavascriptExecutor) driver;
 vars = new HashMap<String, Object>();
}
@After
public void tearDown() {
 driver.quit();
}
@Test
public void add() {
 driver.get("http://localhost:4200/");
 driver.manage().window().setSize(new Dimension(968, 814));
 driver.findElement(By.linkText("Add Student")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
 driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Tamara Kosovac");
 driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("tamarakosovac@gmail.com");
 driver.findElement(By.cssSelector(".ng-untouched")).click();
 {
   WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
   dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
 }
 driver.findElement(By.cssSelector(".btn-success")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
 driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Marko Markovic");
 driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("markomarkovic@gmail.com");
 driver.findElement(By.cssSelector(".ng-untouched")).click();
 {
   WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
   dropdown.findElement(By.xpath("//option[. = 'BCA']")).click();
 }
 driver.findElement(By.cssSelector(".btn-success")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
 driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Sara Saric");
 driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("sarasaric@gmail.com");
 driver.findElement(By.cssSelector(".ng-untouched")).click();
 {
   WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
   dropdown.findElement(By.xpath("//option[. = 'MCA']")).click();
 }
 driver.findElement(By.cssSelector(".btn-success")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
 driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Petar Petrovic");
 driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("petarpetrovic@gmail.com");
 driver.findElement(By.cssSelector(".ng-untouched")).click();
 {
   WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
   dropdown.findElement(By.xpath("//option[. = 'M-Tech']")).click();
 }
 driver.findElement(By.cssSelector(".btn-success")).click();
 driver.findElement(By.cssSelector(".btn:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(1) > .form-control")).click();
 driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[1]/input")).sendKeys("Milana Milic");
 driver.findElement(By.cssSelector(".ng-invalid:nth-child(2)")).click();
 driver.findElement(By.cssSelector(".form-group:nth-child(2) > .form-control")).sendKeys("milanamilic@gmail.com");
 driver.findElement(By.cssSelector(".ng-untouched")).click();
 {
   WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/div/app-add-student/div[1]/div[2]/div/form/div[3]/select"));
   dropdown.findElement(By.xpath("//option[. = 'B-Tech']")).click();
 }
 driver.findElement(By.cssSelector(".btn-success")).click();
 driver.findElement(By.linkText("View Student")).click();
 driver.findElement(By.cssSelector(".odd:nth-child(1) > .sorting_1")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(1) > .sorting_1")).getText(), "markomarkovic@gmail.com");
 driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(1) > td:nth-child(3)")).getText(), "abca");
 driver.findElement(By.cssSelector(".even:nth-child(2) > .sorting_1")).click();
 assertEquals(driver.findElement(By.cssSelector(".even:nth-child(2) > .sorting_1")).getText(), "milanamilic@gmail.com");
 driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(3)")).click();
 assertEquals(driver.findElement(By.cssSelector(".even:nth-child(2) > td:nth-child(3)")).getText(), "ab-tech");
 driver.findElement(By.cssSelector(".odd:nth-child(3) > .sorting_1")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(3) > .sorting_1")).getText(), "petarpetrovic@gmail.com");
 driver.findElement(By.cssSelector(".odd:nth-child(3) > td:nth-child(3)")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(3) > td:nth-child(3)")).getText(), "am-tech");
 driver.findElement(By.cssSelector(".even:nth-child(4) > .sorting_1")).click();
 assertEquals(driver.findElement(By.cssSelector(".even:nth-child(4) > .sorting_1")).getText(), "sarasaric@gmail.com");
 driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(3)")).click();
 assertEquals(driver.findElement(By.cssSelector(".even:nth-child(4) > td:nth-child(3)")).getText(), "amca");
 driver.findElement(By.cssSelector(".odd:nth-child(5) > .sorting_1")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(5) > .sorting_1")).getText(), "tamarakosovac@gmail.com");
 driver.findElement(By.cssSelector(".odd:nth-child(5) > td:nth-child(3)")).click();
 assertEquals(driver.findElement(By.cssSelector(".odd:nth-child(5) > td:nth-child(3)")).getText(), "ab-tech");
 vars.put("x", driver.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]")).size());
 System.out.println(vars.get("x").toString());
 assertEquals(vars.get("x").toString(), "0");
 driver.close();
}
}
