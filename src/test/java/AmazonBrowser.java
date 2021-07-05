import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonBrowser {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		String url = " https://www.google.com/aclk?sa=L&ai=DChcSEwjo8eLxgcvxAhU-dG8EHXCgD-wYABABGgJqZg&ae=2&sig=AOD64_2kz-W_4PeL-i3x8UdEg_ky0S0NdQ&q&adurl&ved=2ahUKEwiKz9vxgcvxAhWnB50JHYrXD8kQ0Qx6BAgDEAE";
		driver.get(url);

	}

}
