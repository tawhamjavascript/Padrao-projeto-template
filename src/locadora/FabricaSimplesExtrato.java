package locadora;

public class FabricaSimplesExtrato {

    private FabricaSimplesExtrato(){};

    public static ExtratoTemplate getExtrato(int tipo){
        switch(tipo){
            case 0:
                return new ExtratoShell();
            case 1:
                return new ExtratoHTML();
            default:
                return null;
        }
    }
}
