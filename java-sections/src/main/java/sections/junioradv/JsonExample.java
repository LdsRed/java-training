package sections.junioradv;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.FileReader;
public class JsonExample {
    public static void main(String[] args) {

        String fileSource = "/home/jor_test_24-07-24/Documentos/java-training/java-sections/src/main/java/sections/junioradv/documentos/personas.json";

        try{
            //Leer desde el archivo base
            FileReader reader = new FileReader(fileSource);
            //Le pasamos el archivo al tokener que lo va a analizar y lo convertira en un JSON Object
            JSONTokener tokener = new JSONTokener(reader);

            //Se crea el objeto JSON a partir del tokener
            JSONObject jsonObject = new JSONObject(tokener);
            JSONArray personasArray = jsonObject.getJSONArray("personas");

            for (int i = 0; i <personasArray.length(); i++){

                JSONObject personaObject = personasArray.getJSONObject(i);

                System.out.println("Nombre: " + personaObject.getString("nombre"));
                System.out.println("Edad: " + personaObject.getInt("edad"));
                System.out.println("Correo: " + personaObject.getString("correo"));
            }

            reader.close();
        }catch (Exception e){
            e.printStackTrace();
        }


        System.out.println();
    }
}
