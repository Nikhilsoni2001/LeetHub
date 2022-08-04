# Write your MySQL query statement below
SELECT C.name as Customers FROM Customers C Left Join Orders O on C.id = O.customerId Where O.customerId is NULL;
