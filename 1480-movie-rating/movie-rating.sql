(select u.name as results
from MovieRating m join Users u on u.user_id = m.user_id
group by u.user_id, u.name
order by count(m.movie_id) desc, u.name
limit 1)

union all

(select m.title as results
from movies m join MovieRating mr on m.movie_id = mr.movie_id
where mr.created_at >= '2020-02-01' 
  and mr.created_at < '2020-03-01'
group by m.movie_id, m.title
order by avg(mr.rating) desc, m.title
limit 1)
