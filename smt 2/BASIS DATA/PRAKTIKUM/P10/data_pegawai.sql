CREATE DATABASE data_pegawai;

USE data_pegawai;

CREATE TABLE proyek (
    no_proyek VARCHAR(5) PRIMARY KEY NOT NULL, 
    nama_proyek VARCHAR(10) NOT NULL
);

CREATE TABLE golongan (
    golongan CHAR (1) PRIMARY KEY NOT NULL,
    besar_gaji INT NOT NULL
);

CREATE TABLE pegawai (
    no_pegawai VARCHAR(5) PRIMARY KEY NOT NULL, 
    nama_pegawai VARCHAR(30) NOT NULL, 
    golongan CHAR(1) NOT NULL,
    FOREIGN KEY (golongan) REFERENCES golongan (golongan)
);


CREATE TABLE proyek_pegawai (
    no_proyek VARCHAR(5)  NOT NULL,
    no_pegawai VARCHAR(10)  NOT NULL,
    FOREIGN KEY (no_proyek) REFERENCES proyek (no_proyek),
    FOREIGN KEY (no_pegawai) REFERENCES pegawai (no_pegawai)
);

INSERT INTO proyek(no_proyek, nama_proyek) VALUES
('NP001', 'BRR'),
('NP002', 'PEMDA');

SELECT * FROM proyek;

INSERT INTO golongan(golongan, besar_gaji) VALUES
('A', '1000000'),
('B', '900000'),
('C', '750000');

SELECT * FROM golongan;

INSERT INTO pegawai(no_pegawai, nama_pegawai, golongan) VALUES
('Peg01', 'Anton', 'A'),
('Peg02', 'Paula', 'B'),
('Peg03', 'Yonanda', 'A'),
('Peg04', 'Mayla', 'A'),
('Peg05', 'Rusdiaty', 'A'),
('Peg06', 'Koko', 'C'),
('Peg12', 'Sita', 'B'),
('Peg14', 'Yusni', 'B');

SELECT * FROM pegawai;

INSERT INTO proyek_pegawai(no_proyek, no_pegawai) VALUES
('NP001', 'Peg01'),
('NP001', 'Peg02'),
('NP001', 'Peg06'),
('NP002', 'Peg01'),
('NP002', 'Peg12'),
('NP002', 'Peg14');

SELECT * FROM proyek_pegawai;



DROP DATABASE data_pegawai;