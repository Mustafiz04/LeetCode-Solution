# Write your MySQL query statement below
select id,
    max(case when month = 'Jan' then revenue else NULL end) as "Jan_Revenue",
    max(case when month = 'Feb' then revenue else NULL end) as "Feb_Revenue",
    max(case when month = 'Mar' then revenue else NULL end) as "Mar_Revenue",
    max(case when month = 'Apr' then revenue else NULL end) as "Apr_Revenue",
    max(case when month = 'May' then revenue else NULL end) as "May_Revenue",
    max(case when month = 'Jun' then revenue else NULL end) as "Jun_Revenue",
    max(case when month = 'Jul' then revenue else NULL end) as "Jul_Revenue",
    max(case when month = 'Aug' then revenue else NULL end) as "Aug_Revenue",
    max(case when month = 'Sep' then revenue else NULL end) as "Sep_Revenue",
    max(case when month = 'Oct' then revenue else NULL end) as "Oct_Revenue",
    max(case when month = 'Nov' then revenue else NULL end) as "Nov_Revenue",
    max(case when month = 'Dec' then revenue else NULL end) as "Dec_Revenue"
from 
    department
group by 
    id;