public class Main {
    public static void main(String[] args) {
        Smartphone s = new Smartphone("Apple", "iPhone 17", 2025, 3);
        Televisore t = new Televisore("Philips", "A104", 2013, 27);

        System.out.println(s.stampa());
        System.out.print("\n");
        System.out.println(t.stampa());
    }
}