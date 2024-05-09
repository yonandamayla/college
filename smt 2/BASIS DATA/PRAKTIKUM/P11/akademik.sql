CREATE DATABASE akademik;

USE akademik;

CREATE TABLE mahasiswa (
    nim INT(2) PRIMARY KEY, nama VARCHAR(225), nomor_telepon VARCHAR(20)
);

CREATE TABLE mata_kuliah (
    kode CHAR(3) PRIMARY KEY, nama VARCHAR(225), sks INT(2)
);

CREATE TABLE nilai (
    id INT AUTO_INCREMENT, nim INT(2), kode_matakuliah CHAR(3), nilai_huruf CHAR(2), PRIMARY KEY (id)
);

ALTER TABLE nilai
ADD FOREIGN KEY nim_idxfk (nim) REFERENCES mahasiswa (nim);

ALTER TABLE nilai
ADD FOREIGN KEY kode_matakuliah_idxfk (kode_matakuliah) REFERENCES mata_kuliah (kode);

SELECT * FROM nilai;

INSERT INTO mahasiswa (nim, nama) VALUES (171481, 'Ani Rahmawati');

INSERT INTO mahasiswa VALUES ( 171482, 'Budi Raharjo', '0858776453' );

INSERT INTO
    mahasiswa
VALUES (
        171483, 'Charlie Setiabudi', '0859767553'
    ),
    (
        171484, 'Diandra Paramita', '0858998745'
    );

-- SELECT * FROM mahasiswa;

INSERT INTO
    mata_kuliah (kode, nama)
VALUES ('BDD', 'Basis Data Dasar'),
    (
        'PBO', 'Pemrograman Berorientasi Objek'
    ),
    ('MMT', 'Multimedia Terapan'),
    (
        'SPK', 'Sistem Pendukung Keputusan'
    ),
    ('KCB', 'Kecerdasan Buatan'),
    (
        'ASD', 'Algoritma Struktur Data'
    );

UPDATE mata_kuliah
SET sks = 3
WHERE kode = 'ASD';

UPDATE mata_kuliah
SET sks = 4
WHERE kode = 'SPK';

UPDATE mata_kuliah
SET sks = 2
WHERE kode = 'BDD';

UPDATE mata_kuliah
SET sks = 5
WHERE kode = 'PBO';

UPDATE mata_kuliah
SET sks = 6
WHERE kode = 'MMT';

UPDATE mata_kuliah
SET sks = 7
WHERE kode = 'KCB';

SELECT * FROM mata_kuliah;

UPDATE mahasiswa SET nomor_telepon = '0857550234' WHERE nim = 171481;

SELECT * FROM mahasiswa;
-- mengupdate nilai

UPDATE mata_kuliah
SET
    nama = 'Multimedia Terapan Tingkat Lanjut',
    sks = 3
WHERE
    kode = 'MMT';

SELECT * FROM mata_kuliah;

UPDATE mata_kuliah SET sks = 2 WHERE kode <> 'MMT';

SELECT * FROM mata_kuliah;

DELETE FROM mata_kuliah WHERE kode = 'SPK';

SELECT * FROM mata_kuliah;

INSERT INTO nilai (nim, kode_matakuliah, nilai_huruf) VALUES 
(171482, 'ASD', 'A'),
(171482, 'SPK', 'C'),
(171481, 'ASD', 'B'),
(171481, 'SPK', 'B'),
(171483, 'ASD', 'A'),
(171483, 'SPK', 'A'),
(171483, 'BDD', 'A');

INSERT INTO nilai (nim, kode_matakuliah, nilai_huruf) VALUES 
(171481, 'ASD', 'B+'),
(171482, 'BDD', 'B+'),
(171483, 'PBO', 'B+');

SELECT * FROM nilai;

SELECT DISTINCT n.kode_matakuliah
FROM nilai n
INNER JOIN mata_kuliah m ON n.kode_matakuliah = m.kode;

SELECT DISTINCT * FROM nilai WHERE nilai_huruf NOT BETWEEN 'C' AND 'E';

SELECT * FROM mata_kuliah 
WHERE sks > (SELECT sks FROM mata_kuliah WHERE nama = 'Basis Data Dasar');




SELECT nim, kode_matakuliah FROM nilai WHERE nilai_huruf = 'A';

SELECT * FROM mahasiswa WHERE nama like '%Ra%';

SELECT nim, kode_matakuliah, nilai_huruf FROM nilai WHERE nilai_huruf IN (SELECT MIN(nilai_huruf) FROM nilai);

SELECT nim, kode_matakuliah, nilai_huruf FROM nilai WHERE nilai_huruf > ALL (SELECT nilai_huruf FROM nilai WHERE nilai_huruf = 'A');

SELECT DISTINCT nilai_huruf FROM nilai WHERE nilai_huruf > ALL (SELECT nilai_huruf FROM nilai WHERE nilai_huruf = 'A');

SELECT nim, (SELECT nama FROM mahasiswa WHERE nilai.nim = mahasiswa.nim) nama, (SELECT nama FROM mata_kuliah mk WHERE mk.kode = nilai.kode_matakuliah) mk, nilai_huruf FROM nilai WHERE nim = 171483;

SELECT COUNT (nilai_huruf) FROM nilai;

SELECT GROUP_CONCAT(nim) AS nim, nilai_huruf, count(*) jumlah FROM nilai GROUP BY nilai_huruf ORDER BY nilai_huruf;

DROP DATABASE akademik;