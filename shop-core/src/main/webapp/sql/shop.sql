insert into user(host,user,password) values('localhost','admin',password('admin'));
flush privileges;

DROP DATABASE IF EXISTS shop;
Create DATABASE shop;
grant all privileges on shop.* to admin@localhost identified by'admin';
flush privileges;

USE shop;

DROP TABLE IF EXISTS shop_manager;
CREATE TABLE shop_manager (
  user_id char(32) NOT NULL,
  user_name varchar(30) DEFAULT NULL,
  user_birthday date DEFAULT NULL,
  user_salary double DEFAULT NULL,
  PRIMARY KEY (user_id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
  id INT(20) NOT NULL AUTO_INCREMENT,
  user_name varchar(30) DEFAULT NULL,
  user_password varchar(30) DEFAULT NULL,
  register_time datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS production;
CREATE TABLE production(
  production_id        int(10) unsigned NOT NULL AUTO_INCREMENT,
  
  production_name      varchar(30) DEFAULT NULL,
  
  production_in_value  double(16,2) DEFAULT NULL,
  
  production_out_value double(16,2) DEFAULT NULL,
  
  production_num       int(10) unsigned DEFAULT 0,
  
  stock_time           date DEFAULT NULL,
  
  sold_time            date DEFAULT NULL,
  PRIMARY KEY (production_id,production_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS order_list;
CREATE TABLE order_list(
  order_id             int(10) unsigned NOT NULL AUTO_INCREMENT,
  
  customer_name          varchar(30) DEFAULT NULL,
  
  production_name      varchar(30) DEFAULT NULL,
  
  sold_num             int(10) unsigned NOT NULL DEFAULT 0,
  
  production_one_value double(16,2) NOT NULL,
  
  production_all_value double(16,2) NOT NULL,
  
  sold_time            date NOT NULL,
  
  discount_price       float(4,3) NOT NULL DEFAULT 1,
  
  is_pay               char(4) NOT NULL,
  
  pay_time             date NOT NULL,
  
  descrip              varchar(128) DEFAULT NULL,
  PRIMARY KEY (order_id,customer_name,production_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS customer;
CREATE TABLE customer(
  customer_id          int(10) unsigned NOT NULL AUTO_INCREMENT,
  
  customer_name        varchar(30) DEFAULT NULL,
  
  customer_address     varchar(30) DEFAULT NULL,
  PRIMARY KEY (customer_id,customer_name)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;