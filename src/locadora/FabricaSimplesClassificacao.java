package locadora;

public class FabricaSimplesClassificacao {

    private FabricaSimplesClassificacao(){};

    public static Classificacao getClassificacao(int codigo){
        switch(codigo){
            case 0:
                return new ClassificacaoNormal();
            case 1:
                return new ClassificacaoLancamento();

            case 2:
                return new ClassificacaoInfantil();

            default:
                return null;
        }
    }
}
