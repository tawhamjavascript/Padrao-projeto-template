package locadora;


import java.util.Iterator;

public class ExtratoShell extends ExtratoTemplate {
    private Cliente cliente;
    @Override
    public String montarExtrato(Iterator<Aluguel> alugueis, String fimDeLinha, Cliente cliente) {
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;

        while (alugueis.hasNext()) {
            Aluguel cada = alugueis.next();
            // mostra valores para este aluguel
            resultado += "\t" + cada.getDVD().getTítulo() + "\t R$ " + cada.valorDeUmAluguel() + fimDeLinha;

        }
        resultado += "Valor total pago: R$ " +  cliente.getValorTotal() + fimDeLinha;
        resultado += "Voce acumulou " + cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos de alugador frequente";

        return resultado;

    }
}
