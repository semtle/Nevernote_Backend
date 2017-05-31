# Nevernote_Backend
Backend for a personal-use Evernote clone.

## Code Examples
Here is the database and tables that I created in MySQL
```sql
-- Create the Dev Db

use nevernote_dev;

CREATE TABLE Note (
  id int NOT NULL,
  content LONGTEXT,
  primary key (id)
);
````


Here are some of the REST calls that you can make ::
```
POST http://localhost:8080/Nevernote_Backend/note/create?content=WooHoo
GET http://localhost:8080/Nevernote_Backend/note/getById?id=2
GET http://localhost:8080/Nevernote_Backend/note/getAll
```
