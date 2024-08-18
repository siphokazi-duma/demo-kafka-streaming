DROP TABLE IF EXISTS batchInfo;

CREATE TABLE batchInfo(
    id BIGINT PRIMARY KEY,
    batchId VARCHAR(255),
    status VARCHAR(255),
    load_timeStamp TIMESTAMP
);