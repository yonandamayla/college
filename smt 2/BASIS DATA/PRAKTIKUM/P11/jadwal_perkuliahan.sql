DROP DATABASE IF EXISTS jadwal_perkuliahan;

CREATE DATABASE jadwal_perkuliahan;

USE jadwal_perkuliahan;

CREATE TABLE dosen (
    kode_dosen VARCHAR(4) NOT NULL, nama_dosen VARCHAR(100) DEFAULT NULL
);

CREATE TABLE HARI (
    kode_hari VARCHAR(3) NOT NULL, nama_hari VARCHAR(10) DEFAULT NULL
);

CREATE TABLE jadwal (
    kode_jadwal INT(10) NOT NULL, kode_kelas VARCHAR(10) DEFAULT NULL, kode_dosen VARCHAR(4) DEFAULT NULL, kode_mk VARCHAR(5) DEFAULT NULL, kode_ruang VARCHAR(5) DEFAULT NULL, kode_hari VARCHAR(3) DEFAULT NULL, jp_mulai INT(3) DEFAULT NULL, jp_selesai INT(3) DEFAULT NULL
);

CREATE TABLE jp (
    kode_jp INT(3) NOT NULL, jp_mulai TIME DEFAULT NULL, jp_selesai TIME DEFAULT NULL
);

CREATE TABLE kelas (
    kode_kelas VARCHAR(10) NOT NULL, kode_prodi VARCHAR(3) DEFAULT NULL, nama_kelas VARCHAR(5) DEFAULT NULL
);

CREATE TABLE mk (
    kode_mk VARCHAR(5) NOT NULL, nama_mk VARCHAR(100) DEFAULT NULL
);

CREATE TABLE prodi (
    kode_prodi VARCHAR(3) NOT NULL, nama_prodi VARCHAR(100) DEFAULT NULL
);

CREATE TABLE ruang (
    kode_ruang VARCHAR(5) NOT NULL, nama_ruang VARCHAR(20) DEFAULT NULL, deskripsi_ruang VARCHAR(100) DEFAULT NULL
);

ALTER TABLE dosen ADD PRIMARY KEY (kode_dosen);

ALTER TABLE hari ADD PRIMARY KEY (kode_hari);

ALTER TABLE jadwal ADD PRIMARY KEY (kode_jadwal);

ALTER TABLE jp ADD PRIMARY KEY (kode_jp);

ALTER TABLE kelas ADD PRIMARY KEY (kode_kelas);

ALTER TABLE mk ADD PRIMARY KEY (kode_mk);

ALTER TABLE prodi ADD PRIMARY KEY (kode_prodi);

ALTER TABLE ruang ADD PRIMARY KEY (kode_ruang);

ALTER TABLE jadwal
MODIFY kode_jadwal INT(10) NOT NULL AUTO_INCREMENT;

ALTER TABLE jadwal
ADD FOREIGN KEY (kode_dosen) REFERENCES dosen (kode_dosen),
ADD FOREIGN KEY (kode_mk) REFERENCES mk (kode_mk),
ADD FOREIGN KEY (kode_ruang) REFERENCES ruang (kode_ruang),
ADD FOREIGN KEY (kode_hari) REFERENCES hari (kode_hari),
ADD FOREIGN KEY (jp_mulai) REFERENCES jp (kode_jp),
ADD FOREIGN KEY (jp_selesai) REFERENCES jp (kode_jp),
ADD FOREIGN KEY (kode_kelas) REFERENCES kelas (kode_kelas);

ALTER TABLE kelas
ADD FOREIGN KEY (kode_prodi) REFERENCES prodi (kode_prodi);

SHOW TABLES;

INSERT INTO mk (kode_mk, nama_mk) VALUES ('02010', 'Basis Data');

SELECT * FROM mk;

INSERT INTO mk VALUES ('02041', 'Teknologi Data');

SELECT * FROM mk;

INSERT INTO
    mk
VALUES ('02004', 'Aljabar Linier'),
    (
        '02005', 'Analisis dan Desain Beroorientasi Objek'
    ),
    ('02006', 'Bahasa Indonesia');

SELECT * FROM mk;

INSERT INTO
    mk (kode_mk, nama_mk)
VALUES ('02001', 'Agama'),
    ('02002', 'Aljabar Linier'),
    (
        '02003', 'Algoritma dan Struktur Data'
    );

SELECT * FROM mk;

INSERT INTO
    mk
SET
    kode_mk = '02011',
    nama_mk = 'Desain Pemrograman Web';

SELECT * FROM mk;

CREATE TABLE mk_backup (
    kode_mk VARCHAR(5) NOT NULL, nama_mk VARCHAR(100) DEFAULT NULL
);

INSERT INTO mk_backup SELECT * FROM mk;

SELECT * FROM mk_backup;

UPDATE jadwal SET kode_dosen = 'D010'

SELECT * FROM jadwal;

UPDATE jadwal SET kode_dosen = 'D022' WHERE kode_mk = '02010';

SELECT * FROM jadwal WHERE kode_mk = '02010';

UPDATE jadwal SET kode_dosen = NULL WHERE kode_dosen = 'D010';

SELECT * FROM jadwal;

UPDATE jadwal
SET
    kode_dosen = 'D012',
    kode_ruang = '0702'
WHERE
    kode_kelas = '2021020204';

SELECT * FROM jadwal WHERE kode_kelas = '2021020204';

UPDATE jadwal
SET
    kode_dosen = (
        SELECT kode_dosen
        FROM dosen
        WHERE
            nama_dosen = 'Dika Rizky Yunianto S.Kom., M.Kom.'
    )
WHERE
    kode_mk = '02010';

SELECT * FROM jadwal WHERE kode_mk = '02010';

DELETE FROM jadwal WHERE kode_dosen IS NOT NULL;

SELECT * FROM jadwal;

DELETE FROM jadwal;

SELECT * FROM jadwal;

UPDATE mk
SET
    nama_mk = 'Basis Data Dasar'
WHERE
    nama_mk = 'Basis Data'

SELECT * FROM mk;

UPDATE jadwal
SET
    kode_hari = '001',
    jp_mulai = 5,
    jp_selesai = 10
WHERE
    kode_mk = '02010';

SELECT * FROM jadwal WHERE kode_mk = '02010';

DELETE FROM mk
WHERE
    kode_mk = (
        SELECT kode_mk
        FROM mk
        WHERE
            nama_mk = 'Kewarganegaraan'
    );

SELECT * FROM mk;

INSERT INTO mk (kode_mk, nama_mk) VALUES 
('02042', 'Pancasila'),
('02043', 'Bela Negara'),
('02044', 'Wawasan Nusantara');

SELECT * FROM mk;

DELETE FROM mk_backup;

SELECT * FROM mk_backup;

INSERT INTO mk_backup
SELECT * FROM mk;

SELECT * FROM mk_backup;

CREATE TABLE mahasiswa (
    nim INT NOT NULL,
    nama_mahasiswa VARCHAR(100) DEFAULT NULL,
    kode_kelas VARCHAR(10) DEFAULT NULL,
    PRIMARY KEY (nim),
    FOREIGN KEY (kode_kelas) REFERENCES kelas (kode_kelas)
);

INSERT INTO kelas (kode_kelas) VALUES ('SIB1E');

INSERT INTO mahasiswa (nim, nama_mahasiswa, kode_kelas) VALUES 
(1, 'Afril', 'SIB1E'),
(2, 'Aida', 'SIB1E'),
(3, 'Alfin', 'SIB1E'),
(4, 'Annisa', 'SIB1E'),
(5, 'Aqil', 'SIB1E'),
(6, 'Athallah', 'SIB1E'),
(7, 'Bayu', 'SIB1E'),
(8, 'Claudya', 'SIB1E'),
(9, 'Devita', 'SIB1E'),
(10, 'Dwi Septa', 'SIB1E');

SELECT * FROM mahasiswa;

UPDATE jadwal
SET kode_dosen = 'D024'
WHERE kode_mk = (SELECT kode_mk FROM mk WHERE nama_mk = 'Basis Data Dasar') AND kode_kelas = 'SIB1E';

SELECT * FROM jadwal;
