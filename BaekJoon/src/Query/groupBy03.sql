SELECT HOUR(DATETIME) HOUR, COUNT(DATETIME) FROM ANIMAL_OUTS GROUP BY HOUR(DATETIME) HAVING HOUR >= 9 and HOUR <= 19 Order by hour;