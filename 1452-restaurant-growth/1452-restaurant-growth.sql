# Write your MySQL query statement below
SELECT DISTINCT visited_on,
        SUM(amount) OVER w AS amount,
        ROUND((SUM(amount) OVER w)/7, 2) AS average_amount
    FROM customer
    WINDOW w AS ( 
            order by visited_on
            RANGE BETWEEN interval 6 day PRECEDING AND current ROW
    )
    LIMIT 6, 999;