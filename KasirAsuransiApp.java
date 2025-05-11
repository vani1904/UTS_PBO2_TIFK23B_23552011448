package kasir;

public class KasirAsuransiApp {
    public static void main(String[] args) {
        Nasabah nasabah1 = new Nasabah(1, "Vani", 20);
        Polis polis1 = new Polis(1, nasabah1.getId(), "Kesehatan", 500000);
        Polis polis2 = new Polis(2, nasabah1.getId(), "Jiwa", 750000);

        Klaim klaim1 = new Klaim(1, polis1.getId(), "2025-05-11", "Diproses");

        System.out.println("=== Info Nasabah ===");
        System.out.println("Nama: " + nasabah1.getNama());
        System.out.println("Umur: " + nasabah1.getUmur());

        Asuransi asuransi1 = new AsuransiKesehatan(polis1);
        Asuransi asuransi2 = new AsuransiJiwa(polis2);

        System.out.println("\n=== Premi Asuransi ===");
        System.out.println("Jenis: " + polis1.getJenis() + ", Total Premi: Rp" + asuransi1.hitungPremi());
        System.out.println("Jenis: " + polis2.getJenis() + ", Total Premi: Rp" + asuransi2.hitungPremi());

        System.out.println("\n=== Data Klaim ===");
        System.out.println("Klaim ID: " + klaim1.getId() + ", Tanggal: " + klaim1.getTanggal() + ", Status: " + klaim1.getStatus());
    }
}
