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

            if (divisa1 == 0 && divisaFinal == 0) { // de Dolar a Dolar
                resultado = valor ;
            } else if (divisa1 == 0 && divisaFinal == 1) { // de Dolar a Euro
                resultado = valor * 0.92633;
            } else if (divisa1 == 0 && divisaFinal == 2) { // de Dolar a Yen
                resultado = valor * 131.235;
            } else if (divisa1 == 0 && divisaFinal == 3) { // de Dolar a MXN
                resultado = valor * 18.9606;
            } else if (divisa1 == 0 && divisaFinal == 4) { // de Dolar a GBP
                resultado = valor * 0.82938;
            } else if (divisa1 == 1 && divisaFinal == 0) { // de Euro a Dolar
                resultado = valor * 1.07922;
            } else if (divisa1 == 1 && divisaFinal == 1) { // de Euro a Euro
                resultado = valor;
            }  else if (divisa1 == 1 && divisaFinal == 2) { // de Euro a Yen
                resultado = valor * 141.655;
            }  else if (divisa1 == 1 && divisaFinal == 3) { // de Euro a MXN
                resultado = valor * 20.4626;
            }  else if (divisa1 == 1 && divisaFinal == 4) { // de Euro a GBP
                resultado = valor * 0.89538;
            } else if (divisa1 == 2 && divisaFinal == 0) { // de Yen  a Dolar
                resultado = valor * 0.00762;
            } else if (divisa1 == 2 && divisaFinal == 1) { // de Yen  a Euro
                resultado = valor * 0.00706;
            }else if (divisa1 == 2 && divisaFinal == 2) { // de Yen  a Yen
                resultado = valor ;
            }else if (divisa1 == 2 && divisaFinal == 3) { // de Yen  a MXN
                resultado = valor * 0.14443;
            }else if (divisa1 == 2 && divisaFinal == 4) { // de Yen  a GBP
                resultado = valor * 0.00632;
            }else if (divisa1 == 3 && divisaFinal == 0) { // de MXN  a Dolar
                resultado = valor * 0.0527;
            }else if (divisa1 == 3 && divisaFinal == 1) { // de MXN  a Euro
                resultado = valor * 0.04882;
            }else if (divisa1 == 3 && divisaFinal == 2) { // de MXN  a Yen
                resultado = valor * 6.91648;
            }else if (divisa1 == 3 && divisaFinal == 3) { // de MXN  a MXN
                resultado = valor ;
            }else if (divisa1 == 3 && divisaFinal == 4) { // de MXN  a GBP
                resultado = valor * 0.04371;
            }else if (divisa1 == 4 && divisaFinal == 0) { // de GBP  a Dolar
                resultado = valor * 1.20492;
            }else if (divisa1 == 4 && divisaFinal == 1) { // de GBP  a Euro
                resultado = valor * 1.11639;
            }else if (divisa1 == 4 && divisaFinal == 2) { // de GBP  a Yen
                resultado = valor * 158.132;
            }else if (divisa1 == 4 && divisaFinal == 3) { // de GBP  a MXN
                resultado = valor * 22.8459;
            }else if (divisa1 == 4 && divisaFinal == 4) { // de GBP  a GBP
                resultado = valor ;
            }


            return resultado;
        }
    }
