import java.sql.SQLOutput;
class ERICKJACOME {
    public static void main(String[] args) {
        /*Autos*///Instanciar
        Mazda m = new Mazda("240", "Hibrido","Automatico","mazda","cx7","Rojo",
                2.4);
        Autos susuky = new Autos();
        Autos Honda = new Autos();
        Autos bmw = new Autos();
        susuky.marca= " susuky ";/// Heredando propiedades
        susuky.modelo=" Jymny ";///
        susuky.color=" ROJO ";
        susuky.cilindraje= 3.7;
        Honda.marca=" HONDA ";
        Honda.modelo="Odyssey ";
        Honda.color=" NEGRO ";
        Honda.cilindraje=4.0;
        bmw.marca=" bmw ";
        bmw.modelo=" Sport ";
        bmw.color=" Rosa ";
        bmw.cilindraje=3.5;
        System.out.println("\nSUZUKI\n");
        System.out.println(susuky.detalleAuto());
        System.out.println(susuky.acelerar(3500));
        System.out.println(susuky.frenar(210,200,62));
        System.out.println(susuky.Combustible(3,980));
        System.out.println("\nHONDA\n");
        System.out.println(Honda.detalleAuto());
        System.out.println(Honda.acelerar(4000));
        System.out.println(Honda.frenar(120,500,40));
        System.out.println(Honda.Combustible(5,2100));
        System.out.println("\nBMW\n");
        System.out.println(bmw.detalleAuto());
        System.out.println(bmw.acelerar(104));
        System.out.println(bmw.frenar(130,400,56));
        System.out.println(bmw.Combustible(3 ,1000));
        m.informacion();
    }
}

