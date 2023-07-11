import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorEndereco {

    public void arquiva(Endereco endereco) throws IOException {
        FileWriter escrita = new FileWriter(endereco.cep() + " .json");
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        escrita.write(gson.toJson(endereco));
        escrita.close();

    }
}
