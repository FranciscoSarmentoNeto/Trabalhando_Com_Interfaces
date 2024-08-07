public class App {
    public static void main(String[] args) {
        Fruta maca = new Maca(5.99f);
        Fruta banana = new Banana(3.99f);
        Fruta melancia = new Melancia(1.99f);
        Fruta laranja = new Laranja(6.99f);
        Fruta uva = new Uva(7.99f);

        float quantidadeDeMaca = 2.5f;
        float quantidadeDeBanana = 4.0f;
        float quantidadeDeMelancia = 7.5f;
        float quantidadeDeLaranja = 9.5f;
        float quantidadeDeUva = 5.0f;

        System.out.println("================ BANCA DE FRUTAS ================");
        maca.calcularPrecoTotal(quantidadeDeMaca);
        banana.calcularPrecoTotal(quantidadeDeBanana);
        melancia.calcularPrecoTotal(quantidadeDeMelancia);
        laranja.calcularPrecoTotal(quantidadeDeLaranja);
        uva.calcularPrecoTotal(quantidadeDeUva);
    }
}
