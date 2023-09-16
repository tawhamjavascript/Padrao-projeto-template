package locadora;


public class FabricaSimplesExtrato {

    static TipoExtrato tipoExtrato;
    private FabricaSimplesExtrato(){};

    public static ExtratoTemplate getExtrato(int tipo){
        if (tipo == TipoExtrato.SHELL.getTipo()){
            return new ExtratoShell();
        } else if (tipo == TipoExtrato.HTML.getTipo()){
            return new ExtratoHTML();
        }
        return null;
    }
}
