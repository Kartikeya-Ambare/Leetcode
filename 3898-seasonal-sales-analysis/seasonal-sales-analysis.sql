-- Write your PostgreSQL query statement below
SELECT DISTINCT ON (CASE 
            WHEN extract(month FROM sale_date) IN (12, 1, 2) THEN 'Winter'
            WHEN extract(month FROM sale_date) IN (3, 4, 5) THEN 'Spring'
            WHEN extract(month FROM sale_date) IN (6, 7, 8) THEN 'Summer'
            else 'Fall'
        END) CASE 
            WHEN extract(month FROM sale_date) IN (12, 1, 2) THEN 'Winter'
            WHEN extract(month FROM sale_date) IN (3, 4, 5) THEN 'Spring'
            WHEN extract(month FROM sale_date) IN (6, 7, 8) THEN 'Summer'
            else 'Fall'
        END AS season
    , category
    , sum(quantity) AS total_quantity
    , sum(price * quantity) AS total_revenue
FROM sales 
JOIN products USING(product_id)
GROUP BY 1, 2
ORDER BY 1, 3 DESC, 4 DESC