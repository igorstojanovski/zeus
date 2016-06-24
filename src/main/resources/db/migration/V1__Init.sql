create table address (id int8 not null, customer_id int8, primary key (id));
create table customer (id int8 not null, external_id varchar(255) not null, name varchar(255), primary key (id));
create table email (id int8 not null, email varchar(255), customer_id int8, email_type int8, primary key (id));
create table email_type (id int8 not null, primary key (id));
create table invoice (id int8 not null, amount numeric(19, 2) not null, external_id varchar(255) not null, customer_id int8 not null, primary key (id));
create table invoice_details (id int8 not null, invoice_id int8, primary key (id));
alter table address add constraint FK_nydg76tqo86ue3m5wsoojho6b foreign key (customer_id) references customer;
alter table email add constraint FK_r5be7adrgyq4ldfn8ccdpog3n foreign key (customer_id) references customer;
alter table email add constraint FK_o2hvd51retq9iro8cdulyxmqw foreign key (email_type) references email_type;
alter table invoice add constraint FK_maw2941vbaqg8s9ct87j0j50x foreign key (customer_id) references customer;
alter table invoice_details add constraint FK_tk3jkgvo0gexm738coo3k1gpc foreign key (invoice_id) references invoice;
create sequence hibernate_sequence