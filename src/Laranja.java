class Laranja implements Fruta {
    private float precoPorKg;

    public Laranja(float precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

    @Override
    public void calcularPrecoTotal(float quantidade) {
        float precoTotal = precoPorKg * quantidade;
        System.out.println("O Preço total de " + quantidade + " Kg de laranja: " + precoTotal + " Reais");

    }

    public float getPrecoPorKg() {
        return precoPorKg;
    }

    public void setPrecoPorKg(float precoPorKg) {
        this.precoPorKg = precoPorKg;
    }

}