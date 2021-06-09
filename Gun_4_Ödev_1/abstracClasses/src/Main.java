public class Main {

    public static void main(String[] args) {





        GameCalculator kadinOyuncu = new WomenGameCalculator();
        GameCalculator erkekOyunci = new MainGameCalculator();
        GameCalculator cocukOyuncu = new KidsGameCalculator();

        GameCalculator yasliOyuncu = new OldGameCalculator();

        kadinOyuncu.hesapla();
        erkekOyunci.hesapla();
        cocukOyuncu.hesapla();

        yasliOyuncu.hesapla();

    }
}
