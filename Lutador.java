abstract class Lutador{
    private String nome;
    private String alcunha;
    private int forca;
    private int velocidade;
    private int vida;
    private int cura;
    

    public Lutador() {
    }

    public Lutador(String nome, String alcunha) {
        if(nome.length()>0 && alcunha.length()>0){
            this.nome = nome;
            this.alcunha = alcunha;
        }
    }

    public Lutador(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        if(nome.length()>0 && alcunha.length()>0 && forca>=0 && velocidade>=0 && vida>=0 && cura>=0){
            this.nome = nome;
            this.forca = forca;
            this.alcunha = alcunha;
            this.velocidade = velocidade;
            this.vida = vida;
            this.cura = cura;
        }
    }

    public abstract int poderDeAtaque();
    
    public abstract int poderDeDefesa();
    
    public String getNome(){
        return nome;
    }
    
    public String getAlcunha(){
        return alcunha;
    }
    
    public int getForca(){
        return forca;
    }
    
    public int getVelocidade(){
        return velocidade;
    }
    
    public int getVida(){
        return vida;
    }
    
    public int getCura(){
        return cura;
    }
    
    public void setForca(int forca){
        this.forca = forca;
    }
    
    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }
    
    public void setVida(int vida){
        this.vida = vida;
    }
    
    public void setCura(int cura){
        this.cura = cura;
    }
    
}