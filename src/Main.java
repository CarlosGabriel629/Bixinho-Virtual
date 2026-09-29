public class Main {
    public static void main(String[] args) {
        // Criando o bichinho virtual
        BichinhoVirtual pet = new BichinhoVirtual("Dino");

        System.out.println("=== Estado Inicial ===");
        System.out.println("Nome: " + pet.getNome());
        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());
        System.out.println("Humor: " + pet.getHumor());

        System.out.println("\n=== Alterando Valores Válidos ===");
        pet.setFome(70);
        pet.setEnergia(30);
        System.out.println("Fome: " + pet.getFome());
        System.out.println("Energia: " + pet.getEnergia());
        System.out.println("Humor: " + pet.getHumor());

        System.out.println("\n=== Testando Validação (Tentativa de Inserir Valores Inválidos) ===");
        pet.setFome(-500);  // Exibirá mensagem de erro e manterá 70
        pet.setEnergia(150); // Exibirá mensagem de erro e manterá 30
    }
}