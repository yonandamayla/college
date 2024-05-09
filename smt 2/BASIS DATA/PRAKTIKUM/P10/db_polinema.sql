CREATE DATABASE db_polinema;

SHOW DATABASES;

USE db_polinema;

CREATE TABLE prodi (
    kode_prodi VARCHAR (6) PRIMARY KEY,
    nama_prodi VARCHAR (30)
);

CREATE TABLE mahasiswa (
    nim INT (8) PRIMARY KEY,
    nama_mhs VARCHAR (50),
    jenis_kelamin ENUM ('L','P') DEFAULT 'L',
    alamat VARCHAR (50),
    kota VARCHAR (20) DEFAULT 'MALANG',
    asal_sma VARCHAR (30),
    no_hp VARCHAR (13),
    umur INT,
    kode_prodi VARCHAR (6),
    FOREIGN KEY (kode_prodi) REFERENCES prodi (kode_prodi),
    agama VARCHAR (10)
);

CREATE TABLE mata_kuliah (
    mk_id VARCHAR (10) PRIMARY KEY,
    nama_mk VARCHAR (50),
    jumlah_jam FLOAT (4,2),
    sks INTEGER
);

CREATE TABLE ruang (
    ruang_id VARCHAR (3) PRIMARY KEY,
    nama_ruang VARCHAR (20),
    kapasitas INTEGER
);

CREATE TABLE dosen (
    nidn INTEGER (20) PRIMARY KEY,
    nama_dosen VARCHAR (50),
    status ENUM ('PNS', 'KONTRAK') DEFAULT 'PNS',
    jenis_kelamin ENUM ('L', 'P') DEFAULT 'L',
    no_hp VARCHAR (15)
);

INSERT INTO prodi (kode_prodi, nama_prodi) VALUES
('60SIB', 'Sistem Informasi Bisnis'),
('70TI','Teknik Informatika' );


SELECT * FROM prodi;

INSERT INTO mahasiswa (nim, nama_mhs, jenis_kelamin, alamat, kota, asal_sma, no_hp, umur, kode_prodi, agama) VALUES
('2341760', 'Yonanda Mayla', 'P', 'Singosari', 'Malang', 'Jombang', '082139631334', '18', '60SIB', 'islam'),
('2341770', 'Lavina', 'P', 'Singosari', 'Malang', 'Malang', '08213963154', '19', '60SIB', 'islam');

SELECT * FROM mahasiswa;

INSERT INTO mata_kuliah (mk_id, nama_mk, jumlah_jam, sks) VALUES
('SIB01', 'Basis Data', '4', '2'),
('SIB02', 'Algoritma Struktur Data', '4', '2'),
('SIB03', 'Praktikum Basis Data', '6', '3');

SELECT * FROM mata_kuliah;

INSERT INTO ruang (ruang_id, nama_ruang, kapasitas) VALUES
('R01', 'LPY 4', 30),
('R02', 'LKJ 3', 30),
('R03', 'LSI 1', 50);

SELECT * FROM ruang;

INSERT INTO dosen (nidn, nama_dosen, status, jenis_kelamin, no_hp) VALUES
('12334455', 'Farid Angga Pribadi', 'PNS', 'L', '08123456789'),
('123455667', 'Triana Fatmawati', 'PNS', 'P', '08112345678');

SELECT * FROM dosen;

SHOW TABLES;

DESC mahasiswa;

ALTER TABLE mahasiswa
DROP COLUMN asal_sma;

SELECT * FROM mahasiswa;


DROP DATABASE db_polinema;