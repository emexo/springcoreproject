package componentscan;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;
@Log4j2
@Component
public class Payment {
        public void processPayment() {
            log.info("Processing payment...");
        }
}
