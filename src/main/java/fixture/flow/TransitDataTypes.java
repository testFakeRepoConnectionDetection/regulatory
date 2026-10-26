package fixture.flow;

/**
 * Edge attributes on Regulatory flows.
 * grep: data frequency trade daily
 */
public final class TransitDataTypes {

  /** Node attribute business_function for Regulatory. */
  public static final String BUSINESS_FUNCTION = "REGULATORY_REPORTING";

  /** Node attribute pillar for Regulatory. */
  public static final String PILLAR = "Booking & PNL & REG";

  public static final String DATA_TRADE = "trade";
  public static final String FREQUENCY_DAILY = "daily";

  private TransitDataTypes() {}
}
