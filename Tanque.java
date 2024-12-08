class Tanque extends Lutador{
    public Tanque(){}
    
    public Tanque(String nome, String alcunha){
        super(nome, alcunha);
    }
    
    public Tanque(String nome, String alcunha, int forca, int velocidade, int vida, int cura){
        super(nome, alcunha, forca, velocidade, vida, cura);
    }
    
    @Override
    
    public int poderDeAtaque() {
        return (this.getForca() * this.getVelocidade()) + getVida();
    }
    
    @Override

    public int poderDeDefesa() {
        return (this.getCura() * this.getVida()) + getVida();
    }
    
    @Override

    public void setVida(int vida) {
        if (vida > getForca() && vida > getCura() && vida > getVelocidade()) {
            super.setVida(vida);
        }
    }
}