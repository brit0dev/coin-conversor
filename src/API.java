import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;

public class API {
    public Conversion getConversion(String baseCoin){

        try {
            URI enderecoAPI = URI.create("https://v6.exchangerate-api.com/v6/b5058d848b23a06e1da0eb00/latest/" + baseCoin);

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(enderecoAPI).build();
    
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
            Conversion json = new Gson().fromJson(response.body(), Conversion.class);
    
            return json;
        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter o endereço a partir desse CEP.");
        }
        

    }
}
