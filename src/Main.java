public class Main {
    public static void main (String [] args){

        ///crear 2 coches
        Coche coche1 = new Coche("Ibiza", "Seat", 100, 34, 1090);
        Coche coche2 = new Coche("i4","BMW", 100,72, 190);

        //modificar 2 datos cualquiera
        coche1.setCv(90);
        coche2.setModelo("i5");

        //mostrar datos por consola
        System.out.println(coche1);
        System.out.println(coche2);


        //acelerar ambos coches
        coche1.acelerar(80);
        coche2.acelerar(68);


        //decidir ganador
        if(coche1.getKm()>coche2.getKm()){
            System.out.println("GANA LA CARRERA EL COCHE 1");
        }else if(coche2.getKm()>coche1.getKm()){
            System.out.println("GANA LA CARRERA EL COCHE 2");
        }else{
            System.out.println("HA HABIDO UN EMPATE");
        }

        //RESETEAR LOS KM DE AMBOS ANTES DE EMPEZAR LA CARRERA PARA QUE UNO NO TENGA VENTAJA SOBRE EL OTRO
        coche1.resetar();
        coche2.resetar();

        System.out.println();
        System.out.println("EMPIEZA LA CARRERA");
        while((coche1.getKm()<100000)||(coche2.getKm()<100000)) {
            int random = (int) (Math.random() * 20) + 1;

            //aceleracion de un numero aleatorio entre 1 y 20 en cada ronda
            coche1.acelerar(random);
            coche2.acelerar(random);
            //mostrar la distancia recorrida acumulada por cada coche en cada ronda
            System.out.println("Distancia coche 1: " + coche1.getKm() + "km");
            System.out.println("Distancia coche 2: " + coche2.getKm() + "km");

            //UNA VEZ AMBOS COCHES RECORRAN 100000KM LA CARRERA ACABA
        }


        //EL COCHE QUE ANTES HAYA LLEGADO A LOS 100000KM SERÁ EL QUE MAS KM HAYA ACUMULADO
        // Y POR ENDE EL GANADOR

        if(coche1.getKm()>coche2.getKm()){
                System.out.println("EL COCHE 1 GANA LA CARRERA \nDISTANCIA RECORRIDA: "+coche1.getKm()+"km");
            } else if (coche2.getKm()>coche1.getKm()) {
                System.out.println("EL COCHE 2 GANA LA CARRERA \nDISTANCIA RECORRIDA: "+coche2.getKm()+"km");
            }else{
                System.out.println("EMPATE \nDISTANCIA RECORRIDA: "+coche1.getKm()+"km");
            }
    }
}
