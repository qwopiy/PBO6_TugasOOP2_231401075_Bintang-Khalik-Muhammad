public class Main {
    public static void main (String[] args) {
        Mobil ferari = new Mobil(150, "bensin");
        Motor harli = new Motor(20, "bensin");
        Truk gataumerktruk = new Truk(500, "diesel");

        ferari.isiBensin("bensin", "full");
        System.out.println();
        harli.isiBensin("diesel", 10);
        System.out.println();
        harli.isiBensin("bensin", 10);
        System.out.println();
        gataumerktruk.isiBensin("diesel", 501);
    }
}
