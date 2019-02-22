# greyhound

The application right now fetches data from the greyhound site, converts it to objects and then maps these objects to entities.
It then tries to save this to database and gets constraint errors. I believe there are issues in how the entities "ManyToOne" relationship is definied.

Also, pending work includes writing test cases and externalising properties such as url and database connection details. These are easily doable using frameworks like junit, mockito and h2 in-memory database. 

# Database
The application connects to a mysql database.

The application is configured so that hibernate will create tables based on entity models

# Prerequisites
Create a schema "greyhound" in the database.

Update mysql database connection properties in ApplicationConfiguration class


