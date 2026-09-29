public class BichinhoVirtual {

    // 1. Atributos privados (Encapsulamento)
    private String nome;
    private int fome;    // 0 (saciado) a 100 (faminto)
    private int energia; // 0 (esgotado) a 100 (totalmente pilhado)
    private String humor;

    // Construtor
    public BichinhoVirtual(String nome) {
        this.nome = nome;
        this.fome = 0;       // Inicia totalmente saciado (0)
        this.energia = 100;  // Inicia com energia máxima (100)
    }

    // --- GETTERS E SETTERS ---

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFome() {
        return fome;
    }

    // Validação: A fome deve estar entre 0 e 100
    public void setFome(int fome) {
        if (fome >= 0 && fome <= 100) {
            this.fome = fome;
        } else {
            System.out.println("Valor inválido! A fome deve estar entre 0 e 100.");
        }
    }

    public int getEnergia() {
        return energia;
    }

    // Validação: A energia deve estar entre 0 e 100
    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100) {
            this.energia = energia;
        } else {
            System.out.println("Valor inválido! A energia deve estar entre 0 e 100.");
        }
    }

    // O humor não tem setHumor; ele é calculado automaticamente
    public String getHumor() {
        // Cálculo do bem-estar baseado na fome baixa e energia alta
        int indiceBemEstar = (100 - this.fome) + this.energia; // Varia de 0 a 200

        if (indiceBemEstar >= 150) {
            this.humor = "Muito Feliz";
        } else if (indiceBemEstar >= 100) {
            this.humor = "Normal";
        } else if (indiceBemEstar >= 50) {
            this.humor = "Cansado / Faminto";
        } else {
            this.humor = "Muito Triste / Esgotado";
        }

        return this.humor;
    }
}
