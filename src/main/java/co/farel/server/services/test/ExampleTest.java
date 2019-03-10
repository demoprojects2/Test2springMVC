package co.farel.server.services.test;

import co.farel.server.services.test.config.WebConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={WebConfig.class})
@WebAppConfiguration
public class ExampleTest {

    @Test
    public void test() {
        assertEquals(true, true);
    }

}