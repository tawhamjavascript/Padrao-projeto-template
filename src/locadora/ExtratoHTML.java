package locadora;

import java.util.Iterator;

public class ExtratoHTML extends ExtratoTemplate {

    public String montarExtrato(Iterator<Aluguel> alugueis, String fimDeLinha, Cliente cliente) {
        String resultado = "<H1>Registro de Alugueis de <EM>" +
                cliente.getNome() + "</EM></H1><P>" + fimDeLinha;
        while(alugueis.hasNext()) {
            Aluguel cada = alugueis.next();

            resultado += cada.getDVD().getTítulo() + ": R$ " +
                    cada.valorDeUmAluguel() + "<BR>"+ fimDeLinha;
        } // while
        // adiciona rodapé
        resultado += "<P>Valor total pago: <EM>R$ " + cliente.getValorTotal() +
                "</EM>"+ fimDeLinha;
        resultado += "<P>Voce acumulou <EM>" +
                cliente.getPontosTotaisDeAlugadorFrequente() +
                " pontos </EM> de alugador frequente";
        return resultado;
    }

}
