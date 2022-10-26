package calculoRotas.dominio;

public class Ponto {
    public int getNumeroPacote() {
        return numeroPacote;
    }

    public void setNumeroPacote(int numeroPacote) {
        this.numeroPacote = numeroPacote;
    }

    public long getCEP() {
        return CEP;
    }

    public void setCEP(long CEP) {
        this.CEP = CEP;
    }

    private int numeroPacote;
    private long CEP;

    @Override
    public String toString() {
        return "Ponto{" +
                "numeroPacote=" + numeroPacote +
                ", CEP=" + CEP +
                '}';
    }
}
