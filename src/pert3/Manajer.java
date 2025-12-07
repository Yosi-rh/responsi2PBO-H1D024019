package pert3;

class Manajer extends Karyawan {
    private double tunjangan;

    Manajer(String nama, double gajiPokok, double tunjangan) {
        super(nama, gajiPokok);
        this.tunjangan = tunjangan;
    }

    @Override
    void tampilInfo() {
        System.out.print("Nama: " + nama + " | Gaji Pokok: Rp " + gajiPokok +
                " | Tunjangan: Rp " + tunjangan);
        System.out.println("\nTotal Pendapatan: Rp " + (gajiPokok + tunjangan));
    }
}
