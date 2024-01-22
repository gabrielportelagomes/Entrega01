package com.example.feriados;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/feriados")
public class FeriadoController {
    private final FeriadoService feriadoService = new FeriadoService();

    @GetMapping
    public List<Feriado> getAllFeriados() {
        return feriadoService.getAllFeriados();
    }

    @GetMapping("/{date}")
    public String getFeriadoByDate(@PathVariable String date) {
        Optional<Feriado> feriadoOptional = feriadoService.getFeriadoByDate(date);
        return feriadoOptional.map(feriado -> "Dia " + date + " é " + feriado.getNome() + "! 🎉")
                .orElse("Dia " + date + " não é feriado 🥲");
    }
}
