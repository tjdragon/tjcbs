create table cbs_customer (
  nino varchar(64) not null,
  first_name varchar(64) not null,
  last_name varchar(64) not null,
  dob int not null,
  primary_email varchar(64) not null,
  constraint cbs_customer_pk primary key (nino)
);

create table cbs_customer_emails (
  nino varchar(64) not null,
  email varchar(64) not null,
  foreign key(nino) references cbs_customer(nino)
);

create table cbs_customer_address (
  nino varchar(64) not null,
  address_line_1 varchar(128) not null,
  address_line_2 varchar(128),
  address_line_3 varchar(128),
  city varchar(128) not null,
  province varchar(128),
  postcode varchar(32) not null,
  country varchar(32) not null,
  foreign key(nino) references cbs_customer(nino)
);

