public class Buah {
    String nama;
    double berat;
    double harga;
    double jumlahBeli;
    double hargaSebelumDiskon;
    double totalDiskon;
    double hargaSetelahDiskon;

    public Buah (String nama, double berat, double harga, double hargaSebelumDiskon, double jumlahBeli) {
        this.nama = nama;
        this.berat = berat;
        this.harga = harga;
        this.hargaSebelumDiskon = hargaSebelumDiskon;
        this.jumlahBeli = jumlahBeli;
    }

    public void hitungDiskon() {
        totalDiskon = (Math.floor(jumlahBeli/4)*0.02*harga*4);
        hargaSetelahDiskon = hargaSebelumDiskon-totalDiskon;
        System.out.printf("Total Diskon: Rp%.2f\n", totalDiskon);
        System.out.printf("Harga Setelah Diskon: Rp%.2f\n\n", hargaSetelahDiskon);
    }

    public void buahInfo() {
        System.out.println("Nama Buah: "+nama);
        System.out.println("Berat: "+berat);
        System.out.println("Harga: "+harga);
        System.out.println("Jumlah Beli "+jumlahBeli+" kg");
        System.out.printf("Harga Sebelum Diskon: Rp%.2f\n", hargaSebelumDiskon);
        hitungDiskon();
    }
}
