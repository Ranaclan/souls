public class Blighttown extends Location
{
    public Blighttown()
    {
        locationName = "Blighttown";

        adjacentLocations = new String[2];
        adjacentLocations[0] = "Depths";
        adjacentLocations[1] = "Valley of Drakes";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Depths"))
        {
            System.out.println("Climbing up the ramshackle structures of Blighttown, you make it to the only slightly less unpleasant Depths.");
            return "Depths";
        }
        else if(name.equalsIgnoreCase("Valley of Drakes"))
        {
            System.out.println("You take the passageway through a cave, stopping yourself before falling off the edge of a cliff into the Valley of Drakes.");
            return "Valley of Drakes";
        }

        System.out.println("Though you'd rather be anywhere but here, you can't see any way to reach " + name + ".");
        return "Blighttown";
    }
}
