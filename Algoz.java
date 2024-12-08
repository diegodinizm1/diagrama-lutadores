class Algoz extends Lutador{
    public Algoz(){}
    
    public Algoz(String nome, String alcunha){
        super(nome, alcunha);
    }
    
    public Algoz(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        super(nome, alcunha, forca, velocidade, vida, cura);
    }
    
    @Override

    public int poderDeAtaque() {
        return (this.getForca() * this.getVelocidade()) + getVelocidade();
    }
    
    @Override

    public int poderDeDefesa() {
        return (this.getCura() * this.getVida()) + getVelocidade();
    }
    
    @Override

    public void setVelocidade(int velocidade) {
        if (velocidade > getCura() && velocidade > getForca() && velocidade > getVida()) {
            super.setVelocidade(velocidade);
        }
    }
}