create table cbs_info (
  partner_id varchar(32) not null,
  version int not null,
  constraint cbs_info_pk primary key (partner_id)
);

create table cbs_account (
  id varchar(32) not null,
  allocated_amount float not null,
  current_amount float not null,
  constraint cbs_account_pk primary key (id)
);

create table cbs_products (
  partner_id varchar(32) not null,
  product varchar(32) not null,
  constraint cbs_products_pk primary key (partner_id, product)
);