public class Pegawai {
    public String nama;
    // Attribut asal diganti dengan tipe data String agar sesuai dengan methodnya
    // public char asal
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    // Agar line this.jabatan tidak mengalami error, harus ditambahkan argumen yang sesuai dengan tipe data parameternya
    // public void setJabatan()
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
