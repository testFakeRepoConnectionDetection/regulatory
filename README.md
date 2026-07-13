# Base clients (fixture)

Customer referential (master data).

## Integrations (topology)

- Exposes REST `/api/v1/customers` for **Portail client**, **API Gateway**, and **Service commandes**.
- Receives NAS file drops from **Paiements** on `//nas-corp/clients/incoming`.

## Data transiting on flows (Data Model fixture)

| Caller / source | Kind | data_category |
|-----------------|------|---------------|
| Portail client | API (inbound) | `CUSTOMER_PROFILE` |
| API Gateway | API (inbound) | `CUSTOMER_LOOKUP` |
| Service commandes | API (inbound) | `CUSTOMER_REFERENTIAL` |
| Paiements | NAS (inbound) | `SETTLEMENT_EXPORT` |

See `TransitDataTypes.java` and `application.yml` (`api.*.data-category`, `storage.incoming-exports`).
