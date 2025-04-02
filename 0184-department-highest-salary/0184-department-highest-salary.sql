# Write your MySQL query statement below
WITH dtp_Max_sal AS (SELECT departmentId, max(salary) AS Salary FROM Employee
GROUP BY departmentId)
SELECT
(SELECT name FROM Department WHERE id=e.departmentId) Department,
e.name Employee,
dtp_Max_sal.salary
FROM dtp_Max_sal, Employee e
WHERE e.salary=dtp_Max_sal.salary
AND e.departmentId=dtp_Max_sal.departmentId