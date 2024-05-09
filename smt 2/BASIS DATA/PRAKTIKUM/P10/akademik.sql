CREATE DATABASE akademik;

USE akademik;

CREATE TABLE mahasiswa (
    no_mhs VARCHAR (7) PRIMARY KEY NOT NULL,
    nama_mhs VARCHAR (50) NOT NULL
);

CREATE TABLE mata_kuliah (
    kd_mk VARCHAR (5) PRIMARY KEY,
    nama_mk VARCHAR (30)
);

CREATE TABLE nilai (
    no_mhs VARCHAR (7),
    FOREIGN KEY (no_mhs) REFERENCES mahasiswa (no_mhs),
    kd_mk VARCHAR (5),
    FOREIGN KEY (kd_mk) REFERENCES mata_kuliah (kd_mk),
    nilai INT (2)
);

ALTER TABLE mahasiswa
ADD jurusan VARCHAR (50);

INSERT INTO mahasiswa (no_mhs, nama_mhs, jurusan) VALUES
('1921001', 'Aminah', 'MI'),
('1921002', 'Carina', 'MI'),
('1921003', 'Della', 'MI'),
('1921004', 'Firda', 'TI'),
('1921005', 'Budiman', 'TI');

SELECT * FROM mahasiswa;

ALTER TABLE mata_kuliah
ADD kode_dosen VARCHAR (10);

INSERT INTO mata_kuliah (kd_mk, nama_mk, kode_dosen) VALUES
('MI350', 'Basis Data', '12345'),
('MI465', 'Pemrograman', '12346'),
('TI201', 'Mobile', '12347');

SELECT * FROM mata_kuliah;

ALTER TABLE nilai
ADD CONSTRAINT fk_nilai_mahasiswa
FOREIGN KEY (no_mhs) REFERENCES mahasiswa (no_mhs)


INSERT INTO nilai (no_mhs, kd_mk, nilai) VALUES
('1921001', 'MI350', '85'),
('1921002', 'MI465', '87'),
('1921003', 'TI201', '85'),
('1921004', 'TI201', '78'),
('1921005', 'MI465', '80');

SELECT * FROM nilai;

CREATE Table dosen (
    kd_dosen VARCHAR (5) PRIMARY KEY NOT NULL,
    nama_dosen VARCHAR (30)
);

INSERT INTO dosen(kd_dosen, nama_dosen) VALUES
('B104', 'Ati'),
('B105', 'Dita'),
('C102', 'Leo');


SELECT * FROM dosen; 

DROP DATABASE akademik;