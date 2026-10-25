# Regulatory (fixture)

Regulatory reporting. Ingests transaction reports produced when a trade is booked.

## Integrations (topology)

- Listens on AMQP queue `regulatory.reports` published by **Booking**.

## Data transiting on flows (Data Model fixture)

| Source | Kind | data_category |
|--------|------|---------------|
| Booking | MQ (inbound) | `REGULATORY_REPORT` |

See `TransitDataTypes.java` and `application.yml`.
