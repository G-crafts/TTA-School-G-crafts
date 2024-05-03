import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class GameStatusManager {
    public void saveGame(GameState gameState) {
    try (FileOutputStream fileOut = new FileOutputStream("gamestate.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
        out.writeObject(gameState);
        System.out.println("Game state saved successfully!");
    } catch (IOException e) {
        e.printStackTrace();
    }

}
public GameState loadGame() {
    try (FileInputStream fileIn = new FileInputStream("gamestate.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn)) {
        return (GameState) in.readObject();
    } catch (IOException | ClassNotFoundException e) {
        e.printStackTrace();
        return null;
    }
}

}
