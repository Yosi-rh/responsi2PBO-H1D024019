package pert7;

public class PaymentTest {
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SISTEM PEMBAYARAN (E-WALLET) ===");

        EWalletPayment payment = new EWalletPayment("OVO", 50000.0, 150000.0);

        System.out.println("Saldo awal: " + (int)payment.getBalance());
        System.out.println("Memproses pembayaran sebesar " + (int)payment.getTotalBayar() + "...");

        payment.processPayment();

        System.out.println("Sisa saldo: " + (int)payment.getBalance());
        System.out.println("Detail Transaksi: " + payment.getPaymentDetails());
    }
}
