public class Depths extends Location
{
    public Depths()
    {
        locationName = "The Depths";

        adjacentLocations = new String[2];
        adjacentLocations[0] = "Undead Burg";
        adjacentLocations[1] = "Blighttown";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Undead Burg"))
        {
            System.out.println("You make your way up out of the darkness, exiting The Depths back out to Undead Burg.");
            return "Undead Burg";
        }
        else if(name.equalsIgnoreCase("Blighttown"))
        {
            System.out.println("Delving deeper into The Depths you find the entrance to Blighttown.");
            return "Blighttown";
        }

        System.out.println("Among the cryptic, twisting passageways of The Depths, you find no way to " + name + ".");
        return "Depths";
    }
}
