SELECT (
    CASE
        WHEN PRICE < 1000 THEN 0
        ELSE TRUNCATE(PRICE, -4)
        END) AS PRICE_GROUP, COUNT(PRODUCT_ID) AS PRODUCTS
FROM PRODUCT
GROUP BY PRICE_GROUP
ORDER BY PRICE_GROUP