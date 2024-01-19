insert into Author(id,author_name) values(20001,'Mercia');
insert into Author(id,author_name) values(20002,'Shania');
insert into Author(id,author_name) values(20003,'Issac');

insert into Book(id,name,author_id) values(10001,'Alice in wonderland',20001);
insert into Book(id,name,author_id) values(10002,'Emotional Intelligence',20001);
insert into Book(id,name,author_id) values(10003,'Python Analytics',20003);

insert into customer(id,customer_name) values(30001,'Merline');
insert into customer(id,customer_name) values(30002,'Shiny');
insert into customer(id,customer_name) values(30003,'Roselyn');

insert into book_customers(books_id,customers_id) values(10001,30002);
insert into book_customers(books_id,customers_id) values(10001,30001);
insert into book_customers(books_id,customers_id) values(10002,30001);
insert into book_customers(books_id,customers_id) values(10003,30003);
insert into book_customers(books_id,customers_id) values(10002,30002);
insert into book_customers(books_id,customers_id) values(10001,30003);


