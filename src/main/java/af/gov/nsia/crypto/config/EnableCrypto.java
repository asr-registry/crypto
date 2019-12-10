package af.gov.nsia.crypto.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import({
        CryptoSpringConfiguration.class
})
public @interface EnableCrypto {
}