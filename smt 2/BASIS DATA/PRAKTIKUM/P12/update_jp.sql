USE jadwal_perkuliahan;

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

SELECT * from prodi;

SELECT * FROM kelas;

SELECT * FROM ruang;

SELECT * FROM hari;

SELECT * FROM dosen;

SELECT * FROM mk;

SELECT * FROM jp;

SELECT deskripsi_ruang 
FROM ruang 
WHERE kode_ruang = 'LKJ1';

SELECT DISTINCT kode_hari
FROM jadwal;

SELECT * FROM ruang
WHERE nama_ruang IN ('RT01', 'RT10');

SELECT * FROM ruang WHERE kode_ruang
BETWEEN '0501' AND '0508';

SELECT * FROM dosen
WHERE nama_dosen LIKE '%E%';

SELECT kode_dosen, kode_mk, kode_ruang, kode_hari
FROM jadwal
GROUP BY kode_hari;

SELECT kode_jp, jp_mulai
FROM jp 
ORDER BY jp_mulai;

SELECT * FROM jadwal 
WHERE kode_hari = '001' AND jp_mulai = 1;

SELECT  kode_hari
FROM hari
UNION 
SELECT kode_hari FROM jadwal;

SELECT kode_hari
FROM hari
UNION ALL
SELECT kode_hari FROM jadwal;

SELECT kode_dosen, kode_mk, kode_hari, jp_mulai, jp_selesai
FROM jadwal
WHERE jp_selesai IN (SELECT MAX (jp_selesai)FROM jadwal);

SELECT kode_dosen, kode_mk, kode_hari, jp_mulai, jp_selesai
FROM jadwal
WHERE jp_selesai < ALL
(SELECT jp_selesai FROM jadwal WHERE jp_selesai = 6);

SELECT AVG (jp_selesai - jp_mulai) FROM jadwal;

SELECT MAX (jp_mulai) FROM jadwal;

SELECT MIN (jp_selesai) FROM jadwal;

SELECT SUM(jp_selesai - jp_mulai) FROM jadwal WHERE kode_dosen = 'D001';

SELECT * FROM jadwal WHERE kode_dosen = 'D001';

SELECT COUNT (kode_ruang) FROM ruang;


SELECT * FROM jadwal WHERE kode_hari = '004' AND jp_mulai = '08:40';

SELECT COUNT(DISTINCT kode_dosen) FROM jadwal WHERE kode_hari = '002';

SELECT DISTINCT kode_dosen FROM jadwal WHERE kode_hari = '002';

SELECT kode_dosen FROM jadwal WHERE kode_hari = '004'
INTERSECT
SELECT kode_dosen FROM dosen WHERE nama_dosen LIKE 'A%';

SELECT kode_ruang 
FROM jadwal 
WHERE kode_hari = '003' 
ORDER BY jp_mulai ASC;