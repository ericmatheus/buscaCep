import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {

    public void salvaJson(Endereco endereco){
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            FileWriter fileWriter = new FileWriter(endereco.cep()+".Json");
            fileWriter.write(gson.toJson(endereco));
            fileWriter.close();

        }catch (IOException e){
            throw new RuntimeException();
        }
    }
}


