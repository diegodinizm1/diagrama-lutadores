class Ringue {
    private Lutador lutador1;
    private Lutador lutador2;

    public Ringue() {}

    public Ringue(Lutador lutador1, Lutador lutador2) {
        this.lutador1 = lutador1;
        this.lutador2 = lutador2;
    }
    
    public Lutador getLutadorUm(){
        return lutador1;
    }
    
    public Lutador getLutadorDois(){
        return lutador2;
    }
    
    public void setLutadorUm(Lutador lutador1) {
        this.lutador1 = lutador1;
    }

    public void setLutadorDois(Lutador lutador2) {
        this.lutador2 = lutador2;
    }
    
    public String apresentandoLutadores() {
        return String.format(
                "De um lado o(a) %s o(a) incrivel %s\nVS\nE do outro %s o(a) espetacular %s\nQuem sera o(a) campeao",
                lutador1.getNome(), lutador1.getAlcunha(), lutador2.getNome(), lutador2.getAlcunha());
    }
    
    public String lutar() {
    String resultadoAtaque;
    String resultadoDefesa;

    if (lutador1.poderDeAtaque() > lutador2.poderDeAtaque()) {

        resultadoAtaque = String.format("Maior poder de ataque: %s", lutador1.getNome());
        
    } else if (lutador2.poderDeAtaque() > lutador1.poderDeAtaque()) {

        resultadoAtaque = String.format("Maior poder de ataque: %s", lutador2.getNome());

    } else {
        resultadoAtaque = "Maior poder de ataque: Empatados";
    }

    if (lutador1.poderDeDefesa() > lutador2.poderDeDefesa()) {

        resultadoDefesa = String.format("Maior poder de defesa: %s", lutador1.getNome());

    } else if (lutador2.poderDeDefesa() > lutador1.poderDeDefesa()) {

        resultadoDefesa = String.format("Maior poder de defesa: %s", lutador2.getNome());

    } else {

        resultadoDefesa = "Maior poder de defesa: Empatados";
    }

    if (resultadoAtaque.equals("Maior poder de ataque: Empatados") && resultadoDefesa.equals("Maior poder de defesa: Empatados")) {
        
        return String.format("%s\n%s\nO resultado e: Empate", resultadoAtaque, resultadoDefesa);

    }

    if (resultadoAtaque.equals("Maior poder de ataque: Empatados")) {

        return String.format("%s\n%s\nO resultado e: %s", resultadoAtaque, resultadoDefesa,
                (lutador1.poderDeDefesa() > lutador2.poderDeDefesa()) ? lutador1.getNome() : lutador2.getNome());

    }

    if (resultadoDefesa.equals("Maior poder de defesa: Empatados")) {

        return String.format("%s\n%s\nO resultado e: %s", resultadoAtaque, resultadoDefesa,
                (lutador1.poderDeAtaque() > lutador2.poderDeAtaque()) ? lutador1.getNome() : lutador2.getNome());

    }

    if (lutador1.poderDeAtaque() > lutador2.poderDeAtaque() && lutador1.poderDeDefesa() > lutador2.poderDeDefesa()) {

        return String.format("%s\n%s\nO resultado e: %s", resultadoAtaque, resultadoDefesa, lutador1.getNome());

    } else if (lutador2.poderDeAtaque() > lutador1.poderDeAtaque() && lutador2.poderDeDefesa() > lutador1.poderDeDefesa()) {
        
        return String.format("%s\n%s\nO resultado e: %s", resultadoAtaque, resultadoDefesa, lutador2.getNome());

    }
    
    return String.format("%s\n%s\nO resultado e: Empate", resultadoAtaque, resultadoDefesa);
 }
}