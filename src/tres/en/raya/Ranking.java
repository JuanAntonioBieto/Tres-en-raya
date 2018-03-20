package tres.en.raya;

public class Ranking {

  //atributos
    int victoria;
    int jugadas;
    int empate;

    //constructor
    public Ranking() {
        this.victoria = 0;
        this.jugadas = 0;
        this.empate = 0;
    }
    //metodos

    public void mostrarRanking() {
        System.out.println("Has ganado " + victoria);
        System.out.println("Has empatado " + empate);
        System.out.println("Has jugado un  total de "+ jugadas +" partidas");
    }

    public void addVictoria(boolean victoriaJugador) {
        this.jugadas++;
        if (victoriaJugador == true) {
            this.victoria++;
        }
    }

    public void addEmpate() {
        this.jugadas++;
        this.empate++;
    }
}
