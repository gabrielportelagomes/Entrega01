import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Feriado {
    private String data;
    private String nome;

    public Feriado(String data, String nome) {
        this.data = data;
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public String getNome() {
        return nome;
    }
}

public class Holidayzer {
    private static Map<String, Feriado> feriados = new HashMap<>();

    public static void main(String[] args) {
        inicializarFeriados();

        imprimirListaFeriados();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma data (no formato dd-MM-yyyy): ");
        String dataInserida = scanner.nextLine();

        verificarFeriado(dataInserida);

        scanner.close();
    }

    public static void inicializarFeriados() {
        feriados.put("01-01-2024", new Feriado("01-01-2024", "Confraternização Mundial"));
        feriados.put("12-02-2024", new Feriado("12-02-2024", "Carnaval"));
        feriados.put("13-02-2024", new Feriado("13-02-2024", "Carnaval"));
        feriados.put("29-03-2024", new Feriado("29-03-2024", "Sexta-feira Santa"));
        feriados.put("21-04-2024", new Feriado("21-04-2024", "Tiradentes"));
        feriados.put("01-05-2024", new Feriado("01-05-2024", "Dia do Trabalho"));
        feriados.put("30-05-2024", new Feriado("30-05-2024", "Corpus Christi"));
        feriados.put("07-09-2024", new Feriado("07-09-2024", "Independência do Brasil"));
        feriados.put("12-10-2024", new Feriado("12-10-2024", "Nossa Senhora Aparecida"));
        feriados.put("02-11-2024", new Feriado("02-11-2024", "Finados"));
        feriados.put("15-11-2024", new Feriado("15-11-2024", "Proclamação da República"));
        feriados.put("20-11-2024", new Feriado("20-11-2024", "Dia Nacional de Zumbi e da Consciência Negra"));
        feriados.put("25-12-2024", new Feriado("25-12-2024", "Natal"));
    }

    public static void imprimirListaFeriados() {
        System.out.println("📅 Lista de Feriados");

        for (Feriado feriado : feriados.values()) {
            System.out.println(feriado.getData() + " => " + feriado.getNome());
        }
    }

    public static void verificarFeriado(String dataInserida) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

        try {
            Date dataFormatada = sdf.parse(dataInserida);

            Feriado feriado = feriados.get(sdf.format(dataFormatada));

            if (feriado != null) {
                System.out.println("Dia " + dataInserida + " é " + feriado.getNome() + "! 🎉");
            } else {
                System.out.println("Dia " + dataInserida + " não é feriado 🥲");
            }
        } catch (ParseException e) {
            System.out.println("Erro ao processar a data.");
            e.printStackTrace();
        }
    }
}
