package pert8;

public class ProgrammerMagang implements KaryawanKontrak, AksesSistem {
    private String nama;
    private double gajiPerJam;
    private String pinRahasia;
    private boolean sedangLogin;

    public ProgrammerMagang(String nama, double gajiPerJam, String pinRahasia) {
        this.nama = nama;
        this.gajiPerJam = gajiPerJam;
        this.pinRahasia = pinRahasia;
        this.sedangLogin = false;
    }

    public double hitungGaji(int jamKerja) {
        double totalGaji = jamKerja * gajiPerJam;
        System.out.println("Total gaji untuk " + jamKerja + " jam: Rp " + (int)totalGaji);
        return totalGaji;
    }

    public void perpanjangKontrak(int durasiBulan) {
        System.out.println("Kontrak diperpanjang selama " + durasiBulan + " bulan.");
    }

    public String getStatusCuti() {
        return "Tersedia 5 hari";
    }

    public void login(String pin) {
        if (pin.equals(pinRahasia)) {
            sedangLogin = true;
            System.out.println("Login berhasil.");
        } else {
            System.out.println("Login gagal.");
        }
    }

    public void logout() {
        sedangLogin = false;
        System.out.println("Logout berhasil.");
    }

    public String getRoleAkses() {
        return "Magang IT";
    }
}
