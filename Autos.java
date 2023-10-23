public class Autos {
    //Atributos, caracteristicas de la clase
    String marca;
    String modelo;
    String color;
    Double cilindraje;
    /// Metodos
    public String detalleAuto()
    {
        String da = "\n Modelo \n" + this.modelo +/// Añade datos
                "\n Diseño \n" + this.color +
                "\n Cilindraje \n" + this.cilindraje;
        return da;///
    }
    public String acelerar(int rpm)
    {
        return "El auto \n" + this.marca + "Esta acelerando a \n" + rpm + " rpm";
    }
    public Integer frenar(int m,int rpm,int t){
       return rpm*m/t;
    }
    public float Combustible(float L,float km){
        return km*L;/// Los metodos son las
    }
}
