class Curandeiro extends Lutador{
    public Curandeiro(){}
    
    public Curandeiro(String nome, String alcunha){
        super(nome, alcunha);
    }
    
    public Curandeiro(String nome, String alcunha, int forca, int velocidade, int vida, int cura) {
        super(nome, alcunha, forca, velocidade, vida, cura);
    }
    
    @Override

    public int poderDeAtaque() {
        return (this.getForca() * this.getVelocidade()) + getCura();
    }
    
    @Override

    public int poderDeDefesa() {
        return (this.getCura() * this.getVida()) + getCura();
    }
    
    @Override

    public void setCura(int cura) {
        if (cura > getForca() && cura > getVelocidade() && cura > getVida()) {
            super.setCura(cura);
        }
    }
    
}