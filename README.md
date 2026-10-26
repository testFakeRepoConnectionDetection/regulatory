# Regulatory (fixture)

Business function: `REGULATORY_REPORTING` (`app.business_function`).
Pillar: `Booking & PNL & REG` (`app.pillar`).

Regulatory reporting.

## Integrations (topology)

- Exposes `/api/v1/trades` called by **DataHub**.

## Data transiting on flows (Data Model fixture)

| Source | Kind | Channel | data | frequency |
|--------|------|---------|------|-----------|
| DataHub | API (inbound) | /api/v1/trades | `trade` | `daily` |

See `TransitDataTypes.java` and `application.yml` (`data`, `frequency`).
