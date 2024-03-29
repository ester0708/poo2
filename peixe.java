class Peixe extends animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String novaCaracteristica) {
        this.caracteristica = novaCaracteristica;
    }

    public void dadosPeixe() {
        super.dados(); // Chama o método dados da classe Animal
        System.out.println("Característica: " + caracteristica);
    }

    public static void main(String[] args){
        Peixe peixe1 = new Peixe("Tubarão", 3.5f, 0, "Cinza", "Oceano", 50.0f, "Cartilaginoso");
        peixe1.dadosPeixe();
    }
}