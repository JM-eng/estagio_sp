import org.json.JSONArray;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
        try {
            String data = new String(Files.readAllBytes(Paths.get("dados.json")));
            JSONArray jsonArray = new JSONArray(data);

            double minfat = Double.MAX_VALUE;
            double maxfat = Double.MIN_VALUE;
            double soma = 0, media = 0;
            int diasUteis = 0, diasAcimaDaMedia = 0;
            List<Double> faturamentos = new ArrayList<>();

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                double valor = obj.getDouble("valor");

                if (valor > 0) {
                    if (valor < minfat) {
                        minfat = valor;
                    }
                    
                    if (valor > maxfat) {
                        maxfat = valor;
                    }
                    
                    soma += valor;
                    diasUteis++;
                    
                    faturamentos.add(valor);
                }
            }

            media = soma / diasUteis;

            for (double faturamento : faturamentos) {
                if (faturamento > media) {
                    diasAcimaDaMedia++;
                }
            }

            System.out.println("Menor valor de faturamento: " + minfat);
            System.out.println("Maior valor de faturamento: " + maxfat);
            System.out.println("Número de dias com faturamento acima da média: " + diasAcimaDaMedia);

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
