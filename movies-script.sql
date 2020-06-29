SELECT directors.first_name, directors.last_name, directors.director_id
FROM directors, movies
WHERE movies.title="The Incredibles" AND directors.director_id=movies.director_id;