# Write your MySQL query statement below
select 
    d.name as Department, e.name as Employee, e.Salary 
from 
    employee e 
        join 
    department d on e.departmentid = d.id 
where 
    ( e.departmentid, salary ) in 
    (   select 
            departmentid, max(salary) 
        from 
            employee 
        group by departmentid 
    );