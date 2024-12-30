.env file:
DB_HOST=localhost
DB_PORT=3306
DB_NAME=app
DB_USER=root
DB_PASSWORD=root
DB_URL=jdbc:mysql://mysql_db:${DB_PORT}/${DB_NAME}

run docker:
.\gradlew dockerStart
