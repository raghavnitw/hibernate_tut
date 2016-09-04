-- Drop table if exists
Drop table If exists 'STable';

-- create table

create table STable (
  id int NOT NULL auto_increment,
  SName varchar(20) default NULL,
  stAddress varchar(30) default NUll,
  PRIMARY KEY(id)
);
