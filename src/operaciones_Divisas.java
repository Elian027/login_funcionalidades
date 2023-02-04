public class operaciones_Divisas {
    private double valor, resultado;
    private int divisa1, divisaFinal;


    public operaciones_Divisas() {

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getDivisa1() {
        return divisa1;
    }

    public void setDivisa1(int divisa1) {
        this.divisa1 = divisa1;
    }

    public int getDivisaFinal() {
        return divisaFinal;
    }

    public void setDivisaFinal(int divisaFinal) {
        this.divisaFinal = divisaFinal;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public double covertir(){

        if (divisa1 == 0 && divisaFinal == 0) { // de dolar a yen japones
            resultado = valor * 130.07;
        } else if (divisa1 == 0 && divisaFinal == 2) { // de dolar a euro
            resultado = valor * 0.92;
        } else if (divisa1 == 1 && divisaFinal == 0) { // de euro a yen japones
            resultado = valor * 141.21;
        } else if (divisa1 == 1 && divisaFinal == 1) { // de euro a dolar
            resultado = valor * 1.09;
        } else if (divisa1 == 2 && divisaFinal == 1) { // de yen japones a dolar
            resultado = valor * 0.0077;
        } else if (divisa1 == 2 && divisaFinal == 2) { // de yen japones a euro
            resultado = valor * 0.0071;
        }

        return resultado;
    }
}
