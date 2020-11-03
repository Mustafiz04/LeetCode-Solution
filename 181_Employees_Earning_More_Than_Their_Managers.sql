# Write your MySQL query statement below
select e.name as Employee from employee e inner join employee m on e.managerid = m.id and e.salary > m.salary;