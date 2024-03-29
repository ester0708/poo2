//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Peixe peixe1 = new Peixe("carpa", 10, 0, "Laranja", "rios e lagos de agua doce", 20, "tem escamas");

        System.out.println("Dados do Peixe:");
        peixe1.dadosPeixe();

        mamifero mamifero1 = new mamifero("zebra", "savana", "folhas");

        System.out.println("Dados do Mamífero:");
        mamifero1.dadosMamifero();
    }
}