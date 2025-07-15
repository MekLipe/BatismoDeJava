package Basico.NivelIniciante;

public class Array {
    public static void main(String[] args)
    {
        String[] pirata = new String[3];
        pirata[0] = "Moneky D. Luffy";
        pirata[1] = "Portgas D. Ace";
        pirata[2] = "Sabo";
        for (int i = 0; i < 3; i++)
        {
            System.out.println("Pirata " + i +  ": " + pirata[i]);
        }
    }
}
