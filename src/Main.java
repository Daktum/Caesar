import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //String s2 = "hoolahoolagirlslikehooligans";
        String s1 = "PWTM!Y!tbADKDgPWPFYWFGUESOTLUPNVYWAPKCSOOJWWASTLSUZUSJMJBBRSTIMGPYSXOJWWASMMZQLCHJQWGYDHKOJWWASTMFPADWIPVKLHONZWPDPWRAAGQPRKNJCNPKGPJJLTHYOWOHPGYJWCUEKUZLGAOWKHOGPESMZMRWPBKVFVZTQNLAGSFSMVWTDPWRAAGQPRKNJCNPTGTKEOMSGVLYVCHKBVKLOFOBLGNCIVXWPLYBZAAEOOWKEWEODZKZOGPWGOMSWMPWTIFFLCTUTYGUOSLZSILYOHEWEODSRVVYHSFAVVHHWGIPTGHYHCWJVLERGJWKPDHGJWTUTQNBXGZEUKTWIAZPPMOGPWGJQWGYDHKNJCNPSOVWTZPFOMNQUQFGOWPYTQNBAIVOSXNSNZNVHMSPAHCXBWVDTFJRWFLASXAGPHYHCWJVLEOANWKUPTXIYGUFFSQLLHZRKZFGPYTXIYGUOWKVAEOEAOBBCVOSXVWKUMSGVLYVCHKBOGYOSTSGGUYSTAAPKYWIPLBBRSRIKULYJUVWKUPFHMDKLMWMMFRLCGUVKQSWAGVVWYNVLZSILYROMKKJSBAZSWMOWKHMILSCKZAIRPWZHMGPYSXLWTNCIVXWPIPNOMZGUSSXIMUIPYUUEGUKICMDEOPFMZMRWPGOMYGOZSXBOKLGWKTWHYLUKVEWZDAGVEKUOSYBWPZDHKTDGUFBJEWNJSSLZSILYYUMFPAPAGVKVLWZKV";

        String s3 = "Ich hoffe, das ich das ver und dann wieder entschlüsseln kann! Wenn ich nicht das heufig genug verwende geht das wahrscheinlich garnicht oder? Wenn der text nicht lang genug ist, dann funktioniert das nicht richtig! nicht moin nicht moin";

        s3 = helper.makeUsebleString(s3);

        String s4 = Vigenere.encrypt(s3, "Haus");

        System.out.println(Kasiski.keyWordLength(Kasiski.findRepeatedSequenceDistances(s3)));

        System.out.println("s4: " + s4);

        System.out.println("decrypt: " + Vigenere.decrypt(s4, "Haus"));


        s1 = helper.makeUsebleString(s1);

        ArrayList<Integer> sub =  Kasiski.findRepeatedSequenceDistances(s1);

        int wordLength = Kasiski.keyWordLength(sub);

        String keyWord = Kasiski.frequencyAnalysis(s1, wordLength);

        String outWord = Vigenere.decrypt(s1, keyWord);

        System.out.println(outWord);

    }
}