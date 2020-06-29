SELECT last_name, country, directors.director_id
FROM directors
INNER JOIN movies ON movies.director_id=directors.director_id AND movies.title="Roma";