public class App {
    public static void main(String[] args) throws Exception {

        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);

        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);

        System.out.println("Tipos de veiculos:");
        System.out.println(esportivo);
        System.out.println(utilitario);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro esportivo com gasolina");
        esportivo.abastece(TipoCombustivel.GASOLINA, 45);
        System.out.println(esportivo);
        System.out.println("\nViajando com o carro esportivo");
        esportivo.viaja(250);
        esportivo.viaja(150);
        System.out.println(esportivo);

        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro utilitario com gasolina");
        utilitario.abastece(TipoCombustivel.DIESEL, 70);
        System.out.println(utilitario);
        System.out.println("\nViajando com o carro utilitario");
        utilitario.viaja(250);
        utilitario.viaja(150);
        System.out.println(utilitario);


        
        Carro suv = new Carro("SUV", TipoCombustivel.GASOLINA, TipoCombustivel.FLEX, 8, 55);
    
        System.out.println("\n\n----------------");
        System.out.println("\nAbastencendo carro suv com gasolina");
        suv.abastece(TipoCombustivel.FLEX, 55);
        System.out.println(suv);
        System.out.println("\nViajando com o carro suv");
        suv.viaja(750);
        suv.viaja(560);
        System.out.println(suv);
    
    
    }
}
