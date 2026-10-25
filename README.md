# Regulatory (fixture)

Regulatory reporting. Receives the instrument master from DataHub.

## Integrations (topology)

- Exposes `/api/v1/instruments` called by **DataHub**.

## Data transiting on flows (Data Model fixture)

| Source | Kind | data_category |
|--------|------|---------------|
| DataHub | API (inbound) | `INSTRUMENT_REFERENCE` |

See `TransitDataTypes.java` and `application.yml`.
