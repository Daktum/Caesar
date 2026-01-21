public class Main {
    public static void main(String[] args) {

        //String MonoWord = "DIE SCHWALBE HAT UNTER FOLTER ALLES VERRATEN STOP SOFORTIGER ABBRUCH VON OPERATION KLEOPATRA";
        //String MonoKey = MonoSubsti.calcKey("Nofretete");

        System.out.println(Caeser.encrypt("Test", 3));
        System.out.println(Caeser.decrypt(Caeser.encrypt("Test", 3), 3));


        String vegeWord = "ZIELPERSON HAT Heute MORGEN IM MCDONALDS DIE HERRENTOILETTE BENUTZT";
        String vegeKey = "BIGMAC";
        System.out.println(Vigenere.encrypt(vegeWord, vegeKey));
        System.out.println(Vigenere.decrypt("Tvjpme Qollx tqexh iyx Xizjg Tnxh!", "INFO"));
        //System.out.println(helper.countChars(vegeWord));
    }


}