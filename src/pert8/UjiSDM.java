package pert8;

public class UjiSDM {
    public static void main(String[] args) {
        System.out.println("=== UJI SISTEM SDM PROGRAMMER MAGANG ===\n");

        ProgrammerMagang andi = new ProgrammerMagang("Andi", 50000.0, "1234");

        andi.hitungGaji(160);
        System.out.println("Status cuti: " + andi.getStatusCuti());

        andi.login("9999");
        andi.login("1234");
        System.out.println("Peran akses: " + andi.getRoleAkses());

        andi.perpanjangKontrak(6);
        andi.logout();
    }
}
