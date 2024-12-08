public class Main {
    public static void main(String[] args) {
        Tanque t1 = new Tanque("Pascal", "Imparavel", 30, 5, 40, 10);
        Tanque t2 = new Tanque("Gui", "Super", 20, 10, 50, 5);
        Ringue ringue = new Ringue(t1, t2);
        System.out.println(ringue.apresentandoLutadores());
        System.out.println(ringue.lutar());
    }
}
/*
Templates de testes na main :
------------------------------------------------------------------------------------
Destruidor destruidor = new Destruidor("Fornencio", "Fogao");
destruidor.setCura(20);
destruidor.setVida(25);
destruidor.setVelocidade(30);
destruidor.setForca(50);
System.out.println(destruidor.poderDeAtaque());
System.out.println(destruidor.poderDeDefesa());
-------------------------------------------------------------------------------------
Tanque tanque = new Tanque("Forte", "O mais forte", 30, 10, 50, 15);
System.out.println(tanque.getForca());
System.out.println(tanque.getVelocidade());
System.out.println(tanque.getVida());
System.out.println(tanque.getCura());
--------------------------------------------------------------------------------------
Curandeiro curandeiro = new Curandeiro("Malas", "O bandoleiro", 20, 10, 30, 40);
Algoz algoz = new Algoz("Hermes", "o ligeiro", 10, 60, 20, 10);
Ringue ringue = new Ringue();
ringue.setLutadorUm(curandeiro);
ringue.setLutadorDois(algoz);
System.out.println(ringue.apresentandoLutadores());
--------------------------------------------------------------------------------------
Tanque tanque = new Tanque("Edu", "escudo", 30, 20, 50, 15);
Algoz algoz = new Algoz("Maria", "Mata-Trem", 20, 60, 30, 10);
Ringue ringue = new Ringue(tanque, algoz);
System.out.println(ringue.lutar());
---------------------------------------------------------------------------------------
Destruidor d1 = new Destruidor("Carlos", "Aniquilador", 60, 30, 40, 10);
Destruidor d2 = new Destruidor("Alicio", "Feroz", 70, 40, 30, 15);
Ringue ringue = new Ringue(d1, d2);
System.out.println(ringue.lutar());
---------------------------------------------------------------------------------------
