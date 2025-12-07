package pert2;

class UjiBarang {
    public static void main(String[] args) {
        Barangmusik gitar = new Barangmusik("GTR-001", "Gitar Akustik Yamaha");

        gitar.ubahHarga(1500000.0);

        gitar.tambahStok(5);

        Barangmusik drum = new Barangmusik("DRM-001", "Drum Set Pearl", 8500000.0, 3);

        System.out.println("=== INVENTARIS TOKO NADAKITA ===");
        gitar.tampilInfo();
        drum.tampilInfo();
    }
}