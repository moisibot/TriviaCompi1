
package clienteXSON;

import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;

public class ClienteXSON {
    private final String baseUrl;
    private final HttpClient httpClient;

    public ClienteXSON(String baseUrl) {
        this.baseUrl = baseUrl;
        this.httpClient = HttpClient.newHttpClient();
    }

    public String post(String path, String xsonData) throws Exception {
        HttpRequest request = HttpRequest.newBuilder()
            .uri(URI.create(baseUrl + path))
            .header("Content-Type", "application/xson")
            .POST(HttpRequest.BodyPublishers.ofString(xsonData))
            .build();

        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        if (response.statusCode() >= 200 && response.statusCode() < 300) {
            return response.body();
        } else {
            throw new Exception("Error en la solicitud: " + response.statusCode() + " " + response.body());
        }
    }
}