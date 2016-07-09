INSERT INTO Client_Type (name, description) values ('Person', 'The Client is a person')
INSERT INTO Client_Type (name, description) values ('Company', 'The Client is a company')

INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT001', 'Telekom', 2, '56941236451565', '3698412635747')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT002', 'STB', 2, '45689415288', '11254788800')
INSERT INTO client (external_id, name, surname, type_id, uid) values ('IS0001', 'Igor', 'Stojanovski', 1, '2103984450053')

INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVT001', 1, 1000, '2016-06-22', '2016-07-01')
INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVS001', 2, 1000, '2016-06-22', '2016-07-03')
INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVS001', 2, 1085, '2016-06-20', '2016-07-25')