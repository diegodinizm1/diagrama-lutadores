class Destruidor extends Lutador{
    public Destruidor() {
    }
    
    public Destruidor(String nome, String alcunha){
        super(nome, alcunha);
    }
    
    public Destruidor (String nome, String alcunha, int forca, int velocidade, int vida, int cura){
        super(nome, alcunha, forca, velocidade, vida, cura);
    }
    
    @Override
    
    public int poderDeAtaque() {
        return (this.getForca() * this.getVelocidade()) + getForca();
    }
    
    @Override

    public int poderDeDefesa(){
        return (this.getCura() * this.getVida()) + getForca();
    }

    @Override
    
    public void setForca(int forca){
        if (forca>getVelocidade() && forca>getVida() && forca>getCura()){
            super.setForca(forca);
        }
    }

}