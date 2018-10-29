create table cbs_simple_loan (
  id varchar(32) not null,
  nino varchar(64) not null, 
  casa_id varchar(32) not null,
  from_date int not null,
  to_date int not null,
  principal float not null,
  interest float not null,
  installments int not null,
  payment_due varchar(12) not null, -- See Java ChronoUnit
  status varchar(32) not null,
  constraint cbs_simple_loan_pk primary key (id, nino),
  foreign key(nino) references cbs_customer(nino)
);

create table cbs_simple_loan_payment_schedule (
  id varchar(32) not null,
  loan_id varchar(32) not null,
  nino varchar(64) not null, 
  casa_id varchar(32) not null,
  amount_due float not null,
  principal_due float not null,
  interest_due float not null,
  at_date int not null,
  status varchar(32) not null,
  constraint cbs_simple_loan_payment_schedule_pk primary key (id, loan_id),
  foreign key(loan_id, nino) references cbs_simple_loan(id, nino)
);
