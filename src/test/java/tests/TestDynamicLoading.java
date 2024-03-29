package tests;
import org.junit.Test; 
import org.junit.Before; 
import org.junit.After; 
import static org.junit.Assert.*; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.firefox.FirefoxDriver; 
import pageobjects.DynamicLoading;

public class TestDynamicLoading {
private WebDriver driver;
private DynamicLoading dynamicLoading;
 
@Before
public void setUp() throws Exception {
    driver = new FirefoxDriver();
    dynamicLoading = new DynamicLoading(driver);
}
 
@Test
public void hiddenElementLoads() throws Exception{ 
    dynamicLoading.loadExample("1"); 
    assertTrue("finish text didn't display after loading", 
            dynamicLoading.finishTextPresent()); 
} 

@Test 
public void elementAppears() throws Exception {
    dynamicLoading.loadExample("2"); 
    assertTrue("finish text didn't render after loading", 
            dynamicLoading.finishTextPresent()); 
} 
 
@After
public void tearDown() {
    driver.quit();
}
 
} 