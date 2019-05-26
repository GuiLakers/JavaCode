package exgenerics2;

import java.util.ArrayList;

public class TestGenerica<X, Y> {

    private X campo1;
    private Y campo2;
    private String nome;
    ArrayList<Y> names = new ArrayList();
    

    public TestGenerica(X campo1, Y campo2, String nome) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.nome = nome;
    }

    public X getCampo1() {
        return campo1;
    }

    public void setCampo1(X campo1) {
        this.campo1 = campo1;
    }

    public Y getCampo2() {
        return campo2;
    }

    public void setCampo2(Y campo2) {
        this.campo2 = campo2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Y> getNames() {
        return names;
    }

    public void setNames(ArrayList<Y> names) {
        this.names = names;
    }

}
