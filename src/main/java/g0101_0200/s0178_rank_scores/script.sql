# Write your MySQL query statement below
# #Medium #Database #2022_06_26_Time_290_ms_(66.73%)_Space_0B_(100.00%)
SELECT
    Score,
    DENSE_RANK() OVER (ORDER BY Score DESC) AS Rank
FROM
    Scores
ORDER BY
    Rank ASC;
