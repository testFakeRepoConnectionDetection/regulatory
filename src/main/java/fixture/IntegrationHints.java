package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound trade from DataHub.
 *
 * <p>Edge fields: data trade, frequency daily.
 */
@RestController
@RequestMapping("/api/v1/trades")
public class IntegrationHints {

  // POST /api/v1/trades from DataHub — data trade, frequency daily
}
