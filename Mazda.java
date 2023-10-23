public class Mazda  extends Autos {
    String vel_Max;
    String Motor;
    String Arranque;
// el metodo de la linea 6 es el constructor de la clase
    public Mazda(String Max,String Motor, String Arranque,String marca, String modelo,String color, Double cilindraje) {
        this.vel_Max = Max;
        this.Motor = Motor;
        this.Arranque = Arranque;
        super.marca = marca;
        super.modelo = modelo;
        super.color = color;
        super.cilindraje = cilindraje;

    }
    public void informacion(){
        System.out.printf("nuevo auto creado" + '\n' + "marca: " + super.marca + '\n' + "modelo: " + super.modelo +
                '\n' + "color: " + super.color + '\n' + "cilindraje: " + super.cilindraje+ '\n' + " Velocidad max: "
                + this.vel_Max + '\n' + "Motor: " + this.Motor +'\n' + "Arranque: " + this.Arranque );
    }
}
