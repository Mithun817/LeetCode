# Write your MySQL query statement below
select name as Customers from Customers where id not in 
(select customers.id from customers 
inner join orders on orders.customerid = customers.id);