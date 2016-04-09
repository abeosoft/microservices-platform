package bbna.services.core;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.abeosoft.services.platform.ConfigurationServiceApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigurationServiceApplication.class)
@WebAppConfiguration
public class ConfigurationServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
