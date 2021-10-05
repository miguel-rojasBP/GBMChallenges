import com.challenge.base.TestBase;
import com.challenge.pages.SupplierLoginPage;
import org.testng.annotations.Test;

/**
 * This class must contain ALL TEST CASES
 */
public class TestClass extends TestBase {

    @Test(testName = "Supplier Page's Login", priority = 1)
    public void WebPageLogin(){
        SupplierLoginPage supplierLoginPage = new SupplierLoginPage(webDriver);
        supplierLoginPage.insertEmail("supplier@phptravels.com");
        supplierLoginPage.insertPassword("demosupplier");
        supplierLoginPage.login();
    }
}
