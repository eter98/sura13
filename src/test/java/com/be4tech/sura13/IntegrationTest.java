package com.be4tech.sura13;

import com.be4tech.sura13.Sura13App;
import com.be4tech.sura13.config.TestSecurityConfiguration;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = { Sura13App.class, TestSecurityConfiguration.class })
public @interface IntegrationTest {
}
