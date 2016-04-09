package bbna.services.core;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.abeosoft.services.platform.ConfigurationTestClientApplication;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigurationTestClientApplication.class)
@WebAppConfiguration
public class ConfigurationTestClientApplicationTests {

	@Test
	public void contextLoads() {
	}

}
