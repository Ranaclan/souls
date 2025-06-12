public class DarkrootGarden extends Location
{
    public DarkrootGarden()
    {
        locationName = "Darkroot Garden";

        adjacentLocations = new String[2];
        adjacentLocations[0] = "Undead Parish";
        adjacentLocations[1] = "Darkroot Basin";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Undead Parish"))
        {
            System.out.println("You take the steps up to the Undead Parish.");
            return "Undead Parish";
        }
        else if(name.equalsIgnoreCase("Darkroot Basin"))
        {
            System.out.println("Continuing through the garden, you make your way down to the Darkroot Basin.");
            return "Darkroot Basin";
        }

        System.out.println("As far as you can tell, there is no way to get to " + name + " from the Darkroot Garden.");
        return "Darkroot Garden";
    }
}
