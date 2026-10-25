package fixture;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

/**
 * Inbound regulatory reports from Booking.
 *
 * <p>data_category: REGULATORY_REPORT (MQ).
 */
public class IntegrationHints {

  /** data_category REGULATORY_REPORT — produced by Booking */
  @RabbitListener(queues = "regulatory.reports")
  public void onRegulatoryReport(String payload) {}
}
