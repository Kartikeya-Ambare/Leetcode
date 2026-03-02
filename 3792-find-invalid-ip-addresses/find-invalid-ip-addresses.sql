/* Write your PL/SQL query statement below */
-- Select ip , count(*) as invalid_count from logs
-- where status_code<>200 or ip like '0%' or ip like '%.0%' 
-- group by ip
-- order by invalid_count desc;

select ip, count(*) as invalid_count from(
    select 
    ip, regexp_count(ip,'\.') as octet_count,
    regexp_substr(ip,'[^.]+', 1, 1) as octet1,
    regexp_substr(ip,'[^.]+', 1, 2) as octet2,
    regexp_substr(ip,'[^.]+', 1, 3) as octet3,
    regexp_substr(ip,'[^.]+', 1, 4) as octet4
    from logs
)
group by ip
having min(octet_count) < 3 or max(octet_count) > 3
or max(octet1) > 255 or max(octet1) like '0%'
or max(octet2) > 255 or max(octet2) like '0%' 
or max(octet3) > 255 or max(octet3) like '0%'
or max(octet4) > 255 or max(octet4) like '0%'
order by invalid_count desc, ip desc