  public class Coche {
      private String modelo;
      private String marca;
      private int cv;
      private int velocidad;
      private double km;


      public Coche(String modelo, String marca, int cv, int velocidad, double km) {
          this.modelo = modelo;
          this.marca= marca;
          this.cv= cv;
          if(velocidad>=180){
              this.velocidad=180;
          }else{
              this.velocidad= velocidad;
          }
          this.km=km;

      }
      public String toString(){
          return "modelo: "+this.modelo+", marca: "+this.marca+
                  ", cv: "+this.cv+", velocidad: "+this.velocidad+" km/h, km: "+this.km;

      }

      public void acelerar (int aumento){
          int random= (int) (Math.random()*10)+1;
          if(this.velocidad==180){
              this.velocidad=180;
          }else if(this.velocidad+aumento>180){
              this.velocidad=180;
          }else {
              this.velocidad = this.velocidad + aumento;
          }
          this.km+= this.velocidad*(this.cv*random);
      }

      public void frenar (int freno){
          if(this.velocidad==0){
              this.velocidad=0;
          }else if ((this.velocidad-freno)<=0){
              this.velocidad=0;
          }else{
              this.velocidad= this.velocidad-freno;
          }
      }

      public void resetar (){
          this.velocidad=0;
          this.km=0;
      }

      public String getMarca(){
          return marca;
      }
      public String getModelo(){
          return modelo;
      }

      public int getCv(){
          return cv;
      }
      public int getVelocidad(){
          return velocidad;
      }
      public double getKm(){
          return km;
      }
      public void setModelo(String modelo){
          this.modelo=modelo;
      }
      public void setMarca(String marca){
          this.marca=marca;
      }
      public void setVelocidad(int velocidad){
          this.velocidad=velocidad;
      }
      public void setCv(int cv){
          this.cv=cv;
      }
      public void setKm(double km){
          this.km=km;
      }



  }

