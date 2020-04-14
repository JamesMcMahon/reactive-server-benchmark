CREATE TABLE authors
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR NOT NULL,
    last_name  VARCHAR NOT NULL
);

ALTER TABLE books
    ADD COLUMN author_id INTEGER;

ALTER TABLE books
    ADD CONSTRAINT constraint_name FOREIGN KEY (author_id) REFERENCES authors (id);
