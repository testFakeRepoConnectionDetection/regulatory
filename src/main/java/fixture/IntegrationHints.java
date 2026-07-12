package fixture;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/** Inbound API for Portail client, API Gateway, Service commandes. NAS import from Paiements. */
@RestController
@RequestMapping("/api/v1/customers")
public class IntegrationHints {

  // Referential read API — callers documented in README and application.yml
  // NAS path //nas-corp/clients/incoming written by Paiements
}
