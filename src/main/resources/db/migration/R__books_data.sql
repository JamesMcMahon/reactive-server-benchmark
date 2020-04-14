TRUNCATE books RESTART IDENTITY;

INSERT INTO authors (id, first_name, last_name)
VALUES (1, 'George', 'Orwell'),
       (2, 'J.R.R', 'Tolkien');

INSERT INTO books (name, page_count, author_id)
VALUES ('Animal Farm', 100, 1),
       ('1984', 1984, 1);