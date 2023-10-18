public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        // line dibawah kurang tanda titik koma
        // p1.nama="Roi"
        p1.nama="Roi";
        p1.asal="Kingdom of Orvel";
        // pada line dibawah harus di tambahkan properti dari umur agar bisa menghasilkan output seperdi soal
        // contoh: p1.umur = 17;
        p1.umur = 17;
        p1.setJabatan("Assasin");

        // Output print diubah menjadi nama saja tanpa pegawai
        // System.out.println("Nama Pegawai: "+p1.getNama());
        System.out.println("Nama: "+p1.getNama());
        System.out.println("Asal: "+p1.getAsal());
        System.out.println("Jabatan: "+p1.jabatan);
        // p1.umur error karena tidak ada properti di dalamnya (sudah ditambah pada line 10), dan perlu ditambah kalimat tahun di ujung outputnya
        // System.out.println("Umur: "+p1.umur);
        System.out.println("Umur: "+p1.umur+" tahun");
    }
}
