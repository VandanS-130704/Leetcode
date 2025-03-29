# Write your MySQL query statement below
SELECT a.employee_id , a.name , COUNT(*) as reports_count , ROUND(AVG(b.age),0) as average_age
FROM employees a 
JOIN employees b 
ON a.employee_id = b.reports_to
GROUP BY a.employee_id , a.name
ORDER BY a.employee_id;