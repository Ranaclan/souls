public class Main {
    public static void main(String[] args) {
        Explorer explorer = new Explorer();
        Player player = new Player();
        player.setLocation(explorer.getLocation("Firelink Shrine"));

        while(true)
        {
            player.setLocation(explorer.explore(player.getLocation()));
        }
    }
}