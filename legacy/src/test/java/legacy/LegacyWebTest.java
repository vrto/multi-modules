package legacy;

import com.jayway.restassured.RestAssured;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.jayway.restassured.RestAssured.get;
import static org.hamcrest.CoreMatchers.equalTo;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class LegacyWebTest {

    @Value("${local.server.port}")
    int port;

    @Before
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void legacyModuleWorksStandalone() {
        get("/legacy").then().content(equalTo("doing legacy stuff"));
    }
}