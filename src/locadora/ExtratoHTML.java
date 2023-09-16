package locadora;

public class ExtratoHTML extends ExtratoTemplate {
    
    protected String cabecalho(Cliente cliente, String fimDeLinha) {
        return "<H1>Registro de Alugueis de <EM>" +
                cliente.getNome() + "</EM></H1><P>" + fimDeLinha;
    }

    protected String corpo(Aluguel aluguel, String fimDeLinha) {
        return aluguel.getAlugavel().getTítulo() + ": R$ " +
                aluguel.valorDeUmAluguel() + "<BR>"+ fimDeLinha;
    }

    protected String rodape(Cliente cliente, String fimDeLinha) {
        return "<P>Valor total pago: <EM>R$ " + cliente.getValorTotal() +
                "</EM>"+ fimDeLinha + "<P>Voce acumulou <EM>" + cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
    }
}
