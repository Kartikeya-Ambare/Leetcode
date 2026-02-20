/* Write your PL/SQL query statement below */
-- SELECT (CASE WHEN INCOME <20000 THEN 'Low Salary'
--         WHEN INCOME between 20000 and 50000 then "Average Salary"
--         When income>50000 then "High Salary" end) as Category,
--         Count(Category)
--         from accounts;

-- SELECT 
--     (CASE 
--         WHEN INCOME < 20000 THEN 'Low Salary'
--         WHEN INCOME BETWEEN 20000 AND 50000 THEN 'Average Salary'
--         WHEN INCOME > 50000 THEN 'High Salary' 
--     END) AS Category,
--     COUNT(*) AS Category_Count
-- FROM accounts
-- GROUP BY 
--     (CASE 
--         WHEN INCOME < 20000 THEN 'Low Salary'
--         WHEN INCOME BETWEEN 20000 AND 50000 THEN 'Average Salary'
--         WHEN INCOME > 50000 THEN 'High Salary' 
--     END);


SELECT 'Low Salary' AS category, 
       COUNT(CASE WHEN income < 20000 THEN 1 END) AS accounts_count
FROM Accounts
UNION ALL
SELECT 'Average Salary' AS category,
       COUNT(CASE WHEN income BETWEEN 20000 AND 50000 THEN 1 END) AS accounts_count
FROM Accounts
UNION ALL
SELECT 'High Salary' AS category,
       COUNT(CASE WHEN income > 50000 THEN 1 END) AS accounts_count
FROM Accounts;

