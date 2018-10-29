
create table cbs_savings_account (
  id varchar(32) not null,
  nino varchar(64) not null, 
  name varchar(16) not null,
  ccy varchar(3) not null,
  balance float not null,
  interest float not null,
  constraint cbs_savings_account_pk primary key (id, nino),
  foreign key(nino) references cbs_customer(nino)
);

create table cbs_savings_transactions (
  id varchar(32) not null,
  nino varchar(64) not null,
  txid varchar(32) not null,
  label varchar(32) not null,
  tdate int not null,
  ttime int not null,
  amount float not null,
  constraint cbs_savings_transactions_pk primary key (id, nino, txid),
  foreign key(id, nino) references cbs_savings_account(id, nino)
);

create table cbs_savings_account_limit (
  id varchar(32) not null,
  nino varchar(64) not null, 
  maximum_overdraft int not null,
  constraint cbs_savings_account_limit_pk primary key (id, nino),
  foreign key(nino) references cbs_customer(nino)
);

create table cbs_credit_account (
  id varchar(32) not null,
  nino varchar(64) not null, 
  name varchar(16) not null,
  label varchar(32) not null,
  tdate int not null,
  ttime int not null,
  amount float not null,
  constraint cbs_savings_accountr_pk primary key (id, nino),
  foreign key(nino) references cbs_customer(nino)
);

create table cbs_credit_account_limit (
  id varchar(32) not null,
  nino varchar(64) not null, 
  maximum_overdraft int not null,
  constraint cbs_credit_account_limit_pk primary key (id, nino),
  foreign key(nino) references cbs_customer(nino)
);

