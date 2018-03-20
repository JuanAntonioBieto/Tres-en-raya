package tres.en.raya;

public class IA0 extends Jugador {

    private Tablero tablero;

    public IA0() {
        super("IA0");
    }
    
    
    @Override
    public Movimiento mover() {
        Movimiento mov;
        mov = new Movimiento();


        mov.setJugador(this);
        mov.setBlancas(this.getBlancas());

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (this.tablero.casillaVacia(fila,columna) == true) {
                    mov.setFila(fila);
                    mov.setColumna(columna);
                    return mov; 
                }
            }
            

        }
        return null;
    }

    

    public void setTablero(Tablero tablero) {
        if (tablero != null) {
            this.tablero = tablero;
        }
    }
}
