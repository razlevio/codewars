SELECT COUNT(*) AS products, country FROM products
  WHERE country IN ('United States of America', 'US', 'USA', 'Canada')
  GROUP BY country
  ORDER BY COUNT(*) DESC;
