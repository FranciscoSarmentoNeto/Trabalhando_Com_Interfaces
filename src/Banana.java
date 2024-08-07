class Banana implements Fruta {
    private float precoPorDuzia;

    public Banana(float precoPorDuzia) {
        this.precoPorDuzia = precoPorDuzia;
    }

    @Override
    public void calcularPrecoTotal(float quantidade) {
        float precoTotal = precoPorDuzia * quantidade;
        System.out.println("O Preço total de " + quantidade + " dúzias de banana: " + precoTotal + " Reais");
    }

    public float getPrecoPorDuzia() {
        return precoPorDuzia;
    }

    public void setPrecoPorDuzia(float precoPorDuzia) {
        this.precoPorDuzia = precoPorDuzia;
    }

}