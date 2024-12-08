public class Main {
    public static void main(String[] args) {
        Tanque t1 = new Tanque("Pascal", "Imparavel", 30, 5, 40, 10);
        Tanque t2 = new Tanque("Gui", "Super", 20, 10, 50, 5);
        Ringue ringue = new Ringue(t1, t2);
        System.out.println(ringue.apresentandoLutadores());
        System.out.println(ringue.lutar());
    }
}
