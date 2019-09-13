import com.enigma.model.Circle;
import com.enigma.model.Mobil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Tentukan posisi awal mobil: ");
        String koordinat = reader.readLine();
        String[] post = koordinat.split(",");

        Mobil rush = new Mobil(Integer.parseInt(post[0]),Integer.parseInt(post[1]));

        System.out.print("Isi Bahan bakar: ");
        String fuel = reader.readLine();
        rush.fillFuel(Integer.parseInt(fuel));
//        rush.fillFuel(n);

        System.out.print("Mobil Jalan ke Arah- :");
        String gerak = reader.readLine();
//        rush.comands(reader.readLine());
        rush.comands(gerak);
        rush.run();

        System.out.println(rush.print());

    }
}
