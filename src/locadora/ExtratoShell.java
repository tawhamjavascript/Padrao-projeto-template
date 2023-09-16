package locadora;


public class ExtratoShell extends ExtratoTemplate {

    protected String cabecalho(Cliente cliente, String fimDeLinha) {
        return "Registro de Alugueis de " +
                cliente.getNome() + fimDeLinha;
    }

    protected String corpo(Aluguel aluguel, String fimDeLinha) {
        return "\t" + aluguel.getAlugavel().getTítulo() + "\t R$ " +
                aluguel.valorDeUmAluguel() + fimDeLinha;
    }

    protected String rodape(Cliente cliente, String fimDeLinha) {
        return "Valor total pago: R$ " + cliente.getValorTotal() +
                fimDeLinha + "Voce acumulou " + cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos de alugador frequente";
    }
}
