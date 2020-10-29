import java.math.BigInteger;

public class DiffieHellman {
    BigInteger p, g;
    public DiffieHellman(){}

    public void genPrimeAndPrimitiveRoot(){
        //this numbers are 4 test .  we can use this class to create random number and keys
        this.g = new BigInteger("2");
        this.p = new BigInteger("2410312426921032588552076022197566074856950548502459942654116941958108831682612228890093858261341614673227141477904012196503648957050582631942730706805009223062734745341073406696246014589361659774041027169249453200378729434170325843778659198143763193776859869524088940195577346119843545301547043747207749969763750084308926339295559968882457872412993810129130294592999947926365264059284647209730384947211681434464714438488520940127459844288859336526896320919633919");;
    }

    public BigInteger getP() {
        return p;
    }

    public BigInteger getG() {
        return g;
    }

    public BigInteger getAliceMessage(BigInteger aliceSecretNumber){
        return this.g.modPow(aliceSecretNumber, this.p);
    }

    public BigInteger getBobMessage(BigInteger bobSecretNumber){
        return this.g.modPow(bobSecretNumber, this.p);
    }

    public BigInteger aliceCalculationOfKey
            (BigInteger bobMessage, BigInteger aliceSecretNumber){
        return bobMessage.modPow(aliceSecretNumber, this.p);
    }

    public BigInteger bobCalculationOfKey
            (BigInteger aliceMessage, BigInteger bobSecretNumber){
        return aliceMessage.modPow(bobSecretNumber, this.p);
    }
}