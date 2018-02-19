CREATE TABLE books (
  ISBN INTEGER PRIMARY KEY,
  FOREIGN KEY (author) REFERENCES authors(author_id) ON DELETE CASCADE,
  title TEXT NOT NULL,
  FOREIGN KEY (publisher) REFERENCES publishers(publisher_id) ON DELETE CASCADE,
  publication_year INTEGER NOT NULL,
  price INTEGER NOT NULL,
  FOREIGN KEY (type) REFERENCES type_book(type_id) ON DELETE CASCADE
  );

CREATE TABLE publishers (
  publisher_id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  city TEXT NOT NULL,
  country TEXT NOT NULL
  );

CREATE TABLE type_book (
  type_id INTEGER PRIMARY KEY,
  type TEXT NOT NULL
  );

CREATE TABLE authors (
  author_id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  surname TEXT NOT NULL,
  birth_year INTEGER NOT NULL,
  city TEXT NOT NULL,
  country TEXT NOT NULL
  );

