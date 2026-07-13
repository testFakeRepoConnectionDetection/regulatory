package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Inbound API for Portail client, API Gateway, Service commandes. NAS import from Paiements.
 *
 * <p>Inbound data_category: CUSTOMER_PROFILE, CUSTOMER_LOOKUP, CUSTOMER_REFERENTIAL,
 * SETTLEMENT_EXPORT (NAS).
 */
@RestController
@RequestMapping("/api/v1/customers")
public class IntegrationHints {

  // Referential read API — data_category per caller in application.yml
  // NAS //nas-corp/clients/incoming — SETTLEMENT_EXPORT from Paiements (CSV)
}
