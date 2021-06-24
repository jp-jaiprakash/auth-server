package in.jaiprakash.auth.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.GlobalAuthenticationConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class UserConf extends GlobalAuthenticationConfigurerAdapter {

   PasswordEncoder passwordEncoder = PasswordEncoderFactories.createDelegatingPasswordEncoder();

   public void init(AuthenticationManagerBuilder auth) throws Exception {
      auth.inMemoryAuthentication().withUser("jai").password(passwordEncoder.encode("jai123"))
              .roles("USER", "ADMIN", "MANAGER")
              .authorities("CAN_READ", "CAN_WRITE", "CAN_DELETE")
               .and()
      .withUser("disha").password(passwordEncoder.encode("disha"))
              .roles("USER")
              .authorities("CAN_READ", "CAN_WRITE")
      ;
   }
}
