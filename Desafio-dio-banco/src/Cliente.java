public class Cliente {
    private String nome;
    private long CPF;
    private int codigo=0;

    public void Cliente (){
        codigo++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome){
        this.nome=nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCPF(long CPF){
        this.CPF=CPF;
    }

    public long getCPF() {
        return CPF;
    }

    public void setCodigo(int codigo){
        this.codigo=codigo;
    }
}
