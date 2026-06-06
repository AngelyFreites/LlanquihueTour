package app;
import model.Direccion;
import model.GuiaTuristico;
public class Main {

    public static void main(String[] args) {

        Direccion direccion1 =
                new Direccion("Av. O'Higgins 123",
                        "Llanquihue",
                        "Los Lagos");

        GuiaTuristico guia1 =
                new GuiaTuristico(
                        "Daniel Bastos",
                        "15.252.465-9",
                        "987654321",
                        direccion1,
                        "Turismo Cultural",
                        5);

        GuiaTuristico guia2 =
                new GuiaTuristico(
                        "Rosa Arriagada",
                        "10.250.588-5",
                        "912345678",
                        direccion1,
                        "Turismo Gastronomico",
                        8
                );

        GuiaTuristico guia3 =
                new GuiaTuristico(
                        "Pepe Aguilar",
                        "21.250.213-8",
                        "923456789",
                        direccion1,
                        "Excursiones",
                        10);
        System.out.println(guia1);
        System.out.println();

        System.out.println(guia2);
        System.out.println();

        System.out.println(guia3);
    }
}
