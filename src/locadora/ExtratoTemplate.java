package locadora;

import java.util.Iterator;

public abstract class ExtratoTemplate {

    public String templateExtrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        Iterator<Aluguel> alugueis = cliente.getDvdsAlugados();
        return montarExtrato(alugueis, fimDeLinha, cliente);

    }



    public abstract String montarExtrato(Iterator<Aluguel> alugueis, String fimDeLinha, Cliente cliente);
}
