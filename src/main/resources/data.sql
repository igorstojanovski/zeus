INSERT INTO Address_type (id, name, description) values (1, 'Original', 'Originally submitted address')
INSERT INTO Address_type (id, name, description) values (2, 'Contact', 'Contact address')

INSERT INTO Client_Type (name, description) values ('Person', 'The Client is a person')
INSERT INTO Client_Type (name, description) values ('Company', 'The Client is a company')

INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT001', 'Telekom', 2, '56941236451565', '2000004699840')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT002', 'Stopanska Banka', 2, '1212413243', '2000004699840')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT003', 'Tinex', 2, '3464327647', '2000003463565')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT004', 'Nikob', 2, '45689415288', '2000004235246')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT005', 'Ministerstvo za Zdrastvo', 2, '87654321243', '2000004987654')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT006', 'Tutunska Banka', 2, '12314535235', '2000002457543')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT007', 'Zegin', 2, '12463134333', '20000042w6454')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT008', 'Pro Kredi Banka', 2, '12345246354', '2000002574687')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT009', 'Zdravje Radovo', 2, '12124235543', '2000004345636')
INSERT INTO client (external_id, name, type_id, tax_number, uid) values ('EXT010', 'EVN', 2, '12315424657', '2000004789763')

INSERT INTO Address (id, client_id, address, type_id) VALUES (1, 1, 'Ul.10 br.8 nas. Jurumleri', 1)
INSERT INTO Address (id, client_id, address, type_id) VALUES (2, 2, 'bul. Partizanski odredi 85 1/28', 1)
INSERT INTO Address (id, client_id, address, type_id) VALUES (3, 2, 'Ul. Mart 2 bb', 2)

--INSERT INTO Address_address_type (address_id, address_type_id) VALUES (1, 1)
--INSERT INTO Address_address_type (address_id, address_type_id) VALUES (1, 2)
--INSERT INTO Address_address_type (address_id, address_type_id) VALUES (2, 1)
--INSERT INTO Address_address_type (address_id, address_type_id) VALUES (3, 2)

INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVT001', 1, 1000, '2016-06-22', '2016-07-01')
INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVS001', 2, 1000, '2016-06-22', '2016-07-03')
INSERT INTO Invoice (external_id, client_id, amount, invoice_date, due_date) VALUES ('INVS001', 2, 1085, '2016-06-20', '2016-07-25')