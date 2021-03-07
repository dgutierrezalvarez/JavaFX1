package sample.Partida;

public class Partida {

    private static String ia;
    private static String modo;
    private static int vjugador1;
    private static int vjugador2;
    private static int djugador1;
    private static int djugador2;
    private int turno;
    private char[] tablero = new char[9];
    private static boolean  estado = false;
    private String value;
    private String color;


    public String getColor() { return color; }

    public String getValue() { return value; }

    public char[] getTablero() { return tablero; }

    public void setModo(String modo) {this.modo = modo;}

    public String getModo() {return modo;}

    public String getIa() { return ia; }

    public void setIa(String dificultad) { ia=dificultad;}

    public int getVjugador1() { return vjugador1; }

    public int getVjugador2() { return vjugador2; }

    public int getDjugador1() { return djugador1; }

    public int getDjugador2() { return djugador2; }

    public boolean getEstado() { return estado; }

    public void setTurno(int turno) { this.turno = turno;}

    public int getTurno() {return turno;}

    public int Eleccion_Primer_Turno() {
        int eleccion = (int) Math.random()*10;
        return eleccion;
    }

    public boolean ComprobarVictoria(char value) {
        boolean victoria = false;
        if(tablero[0] == value && tablero[1] == value && tablero[2] == value) {
            victoria = true;
        }else if(tablero[3] == value && tablero[4] == value && tablero[5] == value) {
            victoria = true;
        }else if(tablero[6] == value && tablero[7] == value && tablero[8] == value) {
            victoria = true;
        }else if(tablero[0] == value && tablero[3] == value && tablero[6] == value) {
            victoria = true;
        }else if(tablero[1] == value && tablero[4] == value && tablero[7] == value) {
            victoria = true;
        }else if(tablero[2] == value && tablero[5] == value && tablero[8] == value) {
            victoria = true;
        }else if(tablero[0] == value && tablero[4] == value && tablero[8] == value) {
            victoria = true;
        }else if(tablero[2] == value && tablero[4] == value && tablero[6] == value) {
            victoria = true;
        }
        return victoria;
    }

    public void Empezar() {
        estado = true;
        if(Eleccion_Primer_Turno()<5) {
            turno = 0;
        }else {
            turno =1;
        }
    }

    public void Finalizar() {
        estado = false;
        VaciarTablero();
    }

    public static void Salir() {
        djugador1 = djugador1 +1;
        vjugador2 = vjugador2+1;
        estado = false;
    }

    public boolean TableroLLeno() {
        boolean resultado = true;
        for(int i=0;i<tablero.length;i++) {
            if(tablero[i] != 'X' && tablero[i] != 'O') {
                resultado = false;
                break;
            }
        }
        return resultado;
    }

    public void PropiedadesTurno() {
        if(turno==0) {
            value = "X";
            color = "white";
        }else {
            value = "O";
            color = "black";
        }
    }

    public void setPosTablero(int index,char value) {

        tablero[index] = value;
    }

    public void VaciarTablero() {

        for (int i=0;i<tablero.length;i++) {
            tablero[i] = ' ';
        }
    }

    public boolean EstadoTablero(char value) {
        boolean result;
        if(value != 'X' && value != 'O') {
            result = true;
        }else {
            result = false;
        }
        return result;
    }

}

