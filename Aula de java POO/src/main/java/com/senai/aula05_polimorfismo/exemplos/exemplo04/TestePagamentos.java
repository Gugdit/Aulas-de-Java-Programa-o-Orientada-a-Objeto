package com.senai.aula05_polimorfismo.exemplos.exemplo04;

import java.util.ArrayList;
import java.util.List;

public class TestePagamentos {
    public static void main(String[] args) {
        List<Pagamento> listaDePagamentos = new ArrayList<>();
        listaDePagamentos.add(new CLT("Lucas",5162 ));
        listaDePagamentos.add(new PJ("Gabriel",50,200));
        listaDePagamentos.add(new Freelancer("Rafael",3537));

        listaDePagamentos.stream().forEach(p -> System.out.println(p.getNome() + ": " + p.calcularPagamento()));
    }
}
