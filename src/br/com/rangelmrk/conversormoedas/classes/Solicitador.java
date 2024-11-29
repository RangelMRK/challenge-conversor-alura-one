package br.com.rangelmrk.conversormoedas.classes;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Solicitador {

    public Resultado solicitador(String moeda1, String moeda2, double valor) {

        URI apiUrl = URI.create("https://v6.exchangerate-api.com/v6/43543aab3bf54403d4dec146/pair/" + moeda1 + "/" + moeda2 + "/" + valor);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(apiUrl)
                .build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            Resultado conversion = new Gson().fromJson(response.body(), Resultado.class);

            return conversion;

        } catch (
                IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}