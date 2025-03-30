# Write your MySQL query statement below
WITH RankedEmployees AS (
    SELECT
        d.Name AS Department,
        e.Name AS Employee,
        e.Salary,
        DENSE_RANK() OVER (PARTITION BY e.DepartmentId ORDER BY e.Salary DESC) AS salary_rank
    FROM 
        Employee e
    JOIN 
        Department d ON d.id = e.departmentId
)
SELECT 
     Department,
     Employee,
     Salary
FROM 
    RankedEmployees
WHERE 
    salary_rank <= 3;