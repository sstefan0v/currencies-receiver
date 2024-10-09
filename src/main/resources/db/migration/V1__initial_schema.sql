CREATE TABLE currencies
(
    id           SERIAL PRIMARY KEY,
    gold         INTEGER,
    code         VARCHAR(3) NOT NULL,
    ratio        INTEGER,
    reverse_rate DOUBLE PRECISION,
    rate         DOUBLE PRECISION,
    f_star       INTEGER,
    curr_date    DATE
);
