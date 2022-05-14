;
CREATE USER IF NOT EXISTS "SA" SALT 'c463c09910e86a1c' HASH 'ba0afa70c4d9737e4e99b2869abbabbf1d3c9115daf73d00da87905dbb4ef11e' ADMIN;
CREATE SEQUENCE "PUBLIC"."HIBERNATE_SEQUENCE" START WITH 8;
CREATE MEMORY TABLE "PUBLIC"."USERS"(
    "ID" INTEGER NOT NULL,
    "ADDRESS" VARCHAR(255),
    "CITY" VARCHAR(255),
    "NAME" VARCHAR(255),
    "SURNAME" VARCHAR(255)
);
ALTER TABLE "PUBLIC"."USERS" ADD CONSTRAINT "PUBLIC"."CONSTRAINT_4" PRIMARY KEY("ID");
-- 7 +/- SELECT COUNT(*) FROM PUBLIC.USERS;    
INSERT INTO "PUBLIC"."USERS" VALUES
                                 (1, 'via venezia', 'roma', 'marco', 'rossi'),
                                 (2, 'via roma', 'milano', 'Mauro', 'rossi'),
                                 (3, 'via roma', 'milano', 'Luca', 'rossi'),
                                 (4, 'via venezia', 'roma', 'Mario', 'rossi'),
                                 (5, 'via venezia', 'roma', 'lucia', 'rossi'),
                                 (6, 'via venezia', 'roma', 'antonio', 'rossi'),
                                 (7, 'via cagliari', 'roma', 'antonio', 'Depau');
