CREATE KEYSPACE IF NOT EXISTS inventory WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1}  AND durable_writes = true;

CREATE TABLE IF NOT EXISTS inventory.emp (
    logtable text,
    process_name text,
    from_time timestamp,
    process_completed_on timestamp,
    to_time timestamp,
    PRIMARY KEY ((logtable, process_name), from_time)
) WITH CLUSTERING ORDER BY (from_time DESC);

