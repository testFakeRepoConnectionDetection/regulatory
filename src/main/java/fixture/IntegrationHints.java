package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound instrument reference data from DataHub.
 *
 * <p>data_category: INSTRUMENT_REFERENCE (API).
 */
@RestController
@RequestMapping("/api/v1/instruments")
public class IntegrationHints {

  // POST /api/v1/instruments from DataHub — data_category INSTRUMENT_REFERENCE
}
