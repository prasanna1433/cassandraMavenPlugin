CREATE KEYSPACE inventory WITH replication = {'class': 'NetworkTopologyStrategy', 'DC1': '3', 'DC2': '3'}  AND durable_writes = true;

USE inventory;

CREATE TABLE emp(
   emp_id int PRIMARY KEY,
   emp_name text,
   emp_city text,
   emp_sal varint,
   emp_phone varint
   );