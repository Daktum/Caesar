import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String s1 = "PWTM!Y!tbADKDgPWPFYWFGUESOTLUPNVYWAPKCSOOJWWASTLSUZUSJMJBBRSTIMGPYSXOJWWASMMZQLCHJQWGYDHKOJWWASTMFPADWIPVKLHONZWPDPWRAAGQPRKNJCNPKGPJJLTHYOWOHPGYJWCUEKUZLGAOWKHOGPESMZMRWPBKVFVZTQNLAGSFSMVWTDPWRAAGQPRKNJCNPTGTKEOMSGVLYVCHKBVKLOFOBLGNCIVXWPLYBZAAEOOWKEWEODZKZOGPWGOMSWMPWTIFFLCTUTYGUOSLZSILYOHEWEODSRVVYHSFAVVHHWGIPTGHYHCWJVLERGJWKPDHGJWTUTQNBXGZEUKTWIAZPPMOGPWGJQWGYDHKNJCNPSOVWTZPFOMNQUQFGOWPYTQNBAIVOSXNSNZNVHMSPAHCXBWVDTFJRWFLASXAGPHYHCWJVLEOANWKUPTXIYGUFFSQLLHZRKZFGPYTXIYGUOWKVAEOEAOBBCVOSXVWKUMSGVLYVCHKBOGYOSTSGGUYSTAAPKYWIPLBBRSRIKULYJUVWKUPFHMDKLMWMMFRLCGUVKQSWAGVVWYNVLZSILYROMKKJSBAZSWMOWKHMILSCKZAIRPWZHMGPYSXLWTNCIVXWPIPNOMZGUSSXIMUIPYUUEGUKICMDEOPFMZMRWPGOMYGOZSXBOKLGWKTWHYLUKVEWZDAGVEKUOSYBWPZDHKTDGUFBJEWNJSSLZSILYYUMFPAPAGVKVLWZKV";
        String s2 = "hoolahoolagirlslikehooligans";
        String s3 = "Ich hoffe, das ich das ver und dann wieder entschlüsseln kann! Wenn ich nicht das heufig genug verwende geht das wahrscheinlich";

        String s4 = Vigenere.encrypt(s3, "Haus");

        String word = s4;

        word = helper.makeUsebleString(word);

        ArrayList<Integer> sub = Kasiski.findRepeatedSequenceDistances(word);

        System.out.println("Sub Sequences: " + sub);

        int wordLength = Kasiski.keyWordLength(sub);

        System.out.println("Word Lenght: " + wordLength);

        String[] splitWord = Kasiski.splitWord(word, wordLength);

        String keyWord = Kasiski.frequencyAnalysis(splitWord);

        System.out.println("Key word: " + (keyWord));

        String outWord = Vigenere.decrypt(word, (keyWord));

        System.out.println("Out Word: " + outWord);

    }
}