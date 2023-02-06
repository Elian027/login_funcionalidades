public class Operaciones_de_Conversion {


    private double valor, resultado1;
    private int Unidad_Ini, Unidad_Fin;


    public Operaciones_de_Conversion() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getResultado() {
        return resultado1;
    }

    public void setResultado(double resultado) {
        this.resultado1 = resultado;
    }

    public int getUnidad_Ini() {
        return Unidad_Ini;
    }

    public void setUnidad_Ini(int unidad_Ini) {
        Unidad_Ini = unidad_Ini;
    }

    public int getUnidad_Fin() {
        return Unidad_Fin;
    }

    public void setUnidad_Fin(int unidad_Fin) {
        Unidad_Fin = unidad_Fin;
    }

    public double covertir_Unid() {

        /*if (Unidad_Ini == 0 && Unidad_Fin == 0) { // de dolar a yen japones
            resultado1 = valor * 130.07;
        } else if (Unidad_Ini == 0 && Unidad_Fin == 2) { // de dolar a euro
            resultado1 = valor * 0.92;
        } else if (Unidad_Ini == 1 && Unidad_Fin == 0) { // de euro a yen japones
            resultado1 = valor * 141.21;
        } else if (Unidad_Ini == 1 && Unidad_Fin == 1) { // de euro a dolar
            resultado1 = valor * 1.09;
        } else if (Unidad_Ini == 2 && Unidad_Fin == 1) { // de yen japones a dolar
            resultado1 = valor * 0.0077;
        } else if (Unidad_Ini == 2 && Unidad_Fin == 2) { // de yen japones a euro
            resultado1 = valor * 0.0071;
        }
*/
        return 0;
    }
}

