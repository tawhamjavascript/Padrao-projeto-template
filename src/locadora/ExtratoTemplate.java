package locadora;

import java.util.Iterator;

public abstract class ExtratoTemplate {


    public String templateExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        String result = cabecalho(cliente, fimDeLinha);
        Iterator<Aluguel> alugueis = cliente.getItensAlugados();
        while (alugueis.hasNext()) {
            Aluguel aluguel = alugueis.next();
            result += corpo(aluguel, fimDeLinha);
        }
        result += rodape(cliente, fimDeLinha);
        return result;
    }

    protected abstract String cabecalho(Cliente cliente, String fimDeLinha);
    protected abstract String corpo(Aluguel aluguel, String fimDeLinha);

    protected abstract String rodape(Cliente cliente, String fimDeLinha);

}
