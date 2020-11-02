# Write your MySQL query statement below
select distinct p1.email from person p1, person p2 where p1.email = p2.email and p1.id != p2.id;