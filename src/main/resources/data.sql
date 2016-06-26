INSERT INTO customer (external_id, name) values ('EXT001', 'Telekom')
INSERT INTO customer (external_id, name) values ('EXT002', 'STB')

INSERT INTO Invoice (external_id, customer_id, amount, invoice_date, due_date) VALUES ('INVT001', 1, 1000, '2016-06-22', '2016-07-22')
INSERT INTO Invoice (external_id, customer_id, amount, invoice_date, due_date) VALUES ('INVS001', 2, 1000, '2016-06-22', '2016-07-22')