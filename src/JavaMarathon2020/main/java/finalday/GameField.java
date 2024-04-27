package finalday;

public class GameField {

    private String[][] field;
    private static final String[][] DEFAULTFIELD = {
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"},
            {"O", "O", "O", "O", "O", "O", "O", "O", "O", "O"}
    };

    public GameField() {
        this.field = DEFAULTFIELD;
    }

    public void printField() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(this.field[i][j]);
            }
            System.out.println();
        }
    }
}
