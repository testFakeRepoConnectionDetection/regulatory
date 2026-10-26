# Regulatory (fixture)

Business function: `REGULATORY_REPORTING` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Regulatory reporting. Receives the instrument master from DataHub.

## Integrations (topology)

- Exposes `/api/v1/instruments` called by **DataHub**.

## Data transiting on flows (Data Model fixture)

| Source | Kind | data_category |
|--------|------|---------------|
| DataHub | API (inbound) | `INSTRUMENT_REFERENCE` |

See `TransitDataTypes.java` and `application.yml`.
