/* Write your PL/SQL query statement below */
-- select d.name , e.name , salary from Employee e
--        join Department d on e.departmentid = d.id 
--        where salary in (select max(salary) 
--                         from employee 
--                         where departmentid in 
--                         (select distinct id from department)); 
SELECT 
    d.name AS Department, 
    e.name AS Employee, 
    e.salary AS Salary 
FROM Employee e
JOIN Department d ON e.departmentId = d.id 
WHERE (e.departmentId, e.salary) IN (
    SELECT departmentId, MAX(salary) 
    FROM Employee 
    GROUP BY departmentId
);