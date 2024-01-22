package com.example.feriados;

import com.example.feriados.Feriado;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FeriadoService {
    private static Map<String, Feriado> feriados = new HashMap<>();

    static {
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

    public List<Feriado> getAllFeriados() {
        return List.copyOf(feriados.values());
    }

    public Optional<Feriado> getFeriadoByDate(String date) {
        return Optional.ofNullable(feriados.get(date));
    }
}
