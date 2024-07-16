package application;

public class Program {
    public static void main(String[] args) {
        Lutador lutador[] = new Lutador[6];
        lutador[0] = new Lutador("Lucas", "Brazil", 18,1.76,75,4,3,0);
        lutador[1] = new Lutador("Pedro", "USA", 20,1.80,72,8,3,9);
        lutador[2] = new Lutador("João", "Australia", 36,1.65,80,0,6,3);
        lutador[3] = new Lutador("Mateus", "Brazil", 19,1.76,69,4,0,1);
        lutador[4] = new Lutador("Gabriel", "Mexico", 23,1.84,79,6,2,5);
        lutador[5] = new Lutador("Rafael", "Mexico", 21,1.99,95,1,1,4);

        lutador[3].status();

    }
}
