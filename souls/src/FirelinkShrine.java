public class FirelinkShrine extends Location
{
    public FirelinkShrine()
    {
        locationName = "Firelink Shrine";

        adjacentLocations = new String[4];
        adjacentLocations[0] = "Catacombs";
        adjacentLocations[1] = "Undead Burg";
        adjacentLocations[2] = "Undead Parish";
        adjacentLocations[3] = "New Londo Ruins";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Catacombs"))
        {
            System.out.println("You are killed by a horde of invincible skeletons on your way to the Catacombs.");
            return "Firelink Shrine";
        }
        else if(name.equalsIgnoreCase("Undead Burg"))
        {
            System.out.println("You make your way to Undead Burg, killing the hollow soldiers who stand in your way.");
            return "Undead Burg";
        }
        else if(name.equalsIgnoreCase("Undead Parish"))
        {
            System.out.println("You take the lift up to Undead Parish.");
            return "Undead Parish";
        }
        else if(name.equalsIgnoreCase("New Londo Ruins"))
        {
            System.out.println("You take the lift down, deep into the ruins of New Londo.");
            return "New Londo Ruins";
        }

        System.out.println("You look around the crumbling ancient shrine, but cannot find " + name + ".");
        return "Firelink Shrine";
    }
}
