package com.example.a10118397_joss;
/*nama : bagas wirawan
  NIM : 10118397
  Kelas : IF9
  Tanggal : 02-August-2021 - 08-August-2021
* */


public class WisataModel {

    String nama,kategori,alamat,deskripsi,foto;

    WisataModel()
    {

    }
    public WisataModel(String nama, String kategori, String alamat, String deskripsi, String foto) {
        this.nama = nama;
//        this.kategori = kategori;
        this.alamat = alamat;
        this.deskripsi = deskripsi;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
