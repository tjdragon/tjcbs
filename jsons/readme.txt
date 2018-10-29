curl -X POST -d@cbs_account.json http://localhost:9999/create-cbs-account

curl -X POST -d@cbs_version.json http://localhost:9999/set-version

curl -X POST -d@cbs_customer.json http://localhost:9999/create-customer

curl -X POST -d@cbs_casa.json http://localhost:9999/create-casa

curl -X POST -d@cbs_casa_tx.json http://localhost:9999/create-casa-tx

curl -X POST -d@cbs_simple_loan.json http://localhost:99S99/create-simple-loan