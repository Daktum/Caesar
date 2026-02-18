import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        String s1 = "PWTM!Y!tbADKDgPWPFYWFGUESOTLUPNVYWAPKCSOOJWWASTLSUZUSJMJBBRSTIMGPYSXOJWWASMMZQLCHJQWGYDHKOJWWASTMFPADWIPVKLHONZWPDPWRAAGQPRKNJCNPKGPJJLTHYOWOHPGYJWCUEKUZLGAOWKHOGPESMZMRWPBKVFVZTQNLAGSFSMVWTDPWRAAGQPRKNJCNPTGTKEOMSGVLYVCHKBVKLOFOBLGNCIVXWPLYBZAAEOOWKEWEODZKZOGPWGOMSWMPWTIFFLCTUTYGUOSLZSILYOHEWEODSRVVYHSFAVVHHWGIPTGHYHCWJVLERGJWKPDHGJWTUTQNBXGZEUKTWIAZPPMOGPWGJQWGYDHKNJCNPSOVWTZPFOMNQUQFGOWPYTQNBAIVOSXNSNZNVHMSPAHCXBWVDTFJRWFLASXAGPHYHCWJVLEOANWKUPTXIYGUFFSQLLHZRKZFGPYTXIYGUOWKVAEOEAOBBCVOSXVWKUMSGVLYVCHKBOGYOSTSGGUYSTAAPKYWIPLBBRSRIKULYJUVWKUPFHMDKLMWMMFRLCGUVKQSWAGVVWYNVLZSILYROMKKJSBAZSWMOWKHMILSCKZAIRPWZHMGPYSXLWTNCIVXWPIPNOMZGUSSXIMUIPYUUEGUKICMDEOPFMZMRWPGOMYGOZSXBOKLGWKTWHYLUKVEWZDAGVEKUOSYBWPZDHKTDGUFBJEWNJSSLZSILYYUMFPAPAGVKVLWZKV";
        String s2 = "hoolahoolagirlslikehooligans";
        String s3 = "Ich hoffe, das ich das ver und dann wieder entschlüsseln kann! Wenn ich nicht das heufig genug verwende geht das wahrscheinlich garnicht oder? Wenn der text nicht lang genug ist, dann funktioniert das nicht richtig! nicht moin nicht moin";

        String word = s1;

        word = helper.makeUsebleString(word);

        ArrayList<Integer> sub = Kasiski.findRepeatedSequenceDistances(word);

        System.out.println("Sub Sequences: " + sub);

        int wordLength = Kasiski.keyWordLength(sub);

        System.out.println("Word Lenght: " + wordLength);

        String keyWord = Kasiski.frequencyAnalysis(word, wordLength);

        System.out.println("Key word: " + keyWord);

        String outWord = Vigenere.decrypt(word, keyWord);

        System.out.println("Out Word: " + outWord);

        String skytaleEncrypt = Skytale.encrypt("KOMMSTDUHEUTEMITTAGMITZUMBASKETBALLSPIELEN", 6);

        String skytaleDecrypt = Skytale.decrypt("KUITKSOHTZEPMETUTIMUAMBESTGBALTEMALEDMISLN", 6);

        System.out.println("SkytaleEnrypt: " + skytaleEncrypt);

        System.out.println("SyktaleDercypt: " + skytaleDecrypt);

    }
}