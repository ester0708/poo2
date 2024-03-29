class mamifero extends animal {
    private String alimento;

    public mamifero(String nome, String ambiente, String alimento) {
        super(nome, ambiente);
        this.alimento = alimento;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String novoAlimento) {
        this.alimento = novoAlimento;
    }

    public void dadosMamifero() {
        System.out.println("Nome:" + nome);
        System.out.println("Alimento:" + alimento);
        System.out.println("Alimento: " + alimento);
    }

}