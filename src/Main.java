public class Main {
    public static void main(String[] args) {

        String word = "DIE SCHWALBE HAT UNTER FOLTER ALLES VERRATEN STOP SOFORTIGER ABBRUCH VON OPERATION KLEOPATRA";
        String key = MonoSubsti.calcKey("Nofretete");



        String Vword = "ZIELPERSON HAT HEUTE MORGEN IM MCDONALDS DIE HERRENTOILETTE BENUTZT";
        String Vkey = "BIGMAC";

        System.out.println(Vigenere.encrypt(Vword, Vkey));

        System.out.println(Vigenere.decrypt("Tvjpme Qollx tqexh iyx Xizjg Tnxh!", "INFO"));

    }
}