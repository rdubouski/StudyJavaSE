package finalday;

public class GameField {

    private String name;
    private String[][] myfield;
    private String[][] enemyfield;
    private static final String[][] DEFAULTFIELD = {
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"},
            {"-", "-", "-", "-", "-", "-", "-", "-", "-", "-"}
    };

    public GameField(String name) {
        this.name = name;
        this.myfield = DEFAULTFIELD;
        this.enemyfield = DEFAULTFIELD;
    }

    public void printField(String name) {
        System.out.println("Поле игрока " + name);
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.myfield[i][j]);
            }
            System.out.println();
        }

        System.out.println("Поле врага");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.enemyfield[i][j]);
            }
            System.out.println();
        }
    }
}
