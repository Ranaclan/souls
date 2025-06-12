import java.util.HashMap;
import java.util.Scanner;

public class Explorer
{
    private final static HashMap<String, Location> locations = new HashMap<String, Location>();
    Scanner scanner;

    public Explorer()
    {
        locations.put("Firelink Shrine", new FirelinkShrine());
        locations.put("Undead Burg", new UndeadBurg());
        locations.put("Undead Parish", new UndeadParish());
        locations.put("Darkroot Garden", new DarkrootGarden());
        locations.put("Darkroot Basin", new DarkrootBasin());
        locations.put("Valley of Drakes", new ValleyOfDrakes());
        locations.put("New Londo Ruins", new NewLondoRuins());
        locations.put("Catacombs", new Catacombs());
        locations.put("Depths", new Depths());
        locations.put("Blighttown", new Blighttown());

        scanner = new Scanner(System.in);
    }

    public Location explore(Location currentLocation)
    {
        String[] adjacentLocations = currentLocation.getAdjacentLocations();
        System.out.println("You are in " + currentLocation.getLocationName() + ". Available locations:");
        for(String adjacentLocation: adjacentLocations)
        {
            System.out.println(adjacentLocation);
        }

        System.out.println("Where would you like to go?");

        String nextLocation = currentLocation.go(scanner.nextLine());

        return locations.get(nextLocation);
    }

    public Location getLocation(String name)
    {
        return locations.get(name);
    }
}
