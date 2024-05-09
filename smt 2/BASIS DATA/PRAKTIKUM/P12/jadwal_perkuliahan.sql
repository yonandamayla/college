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
