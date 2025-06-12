public class DarkrootBasin extends Location
{
    public DarkrootBasin()
    {
        locationName = "Darkroot Basin";

        adjacentLocations = new String[3];
        adjacentLocations[0] = "Darkroot Garden";
        adjacentLocations[1] = "Undead Burg";
        adjacentLocations[2] = "Valley of Drakes";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Darkroot Garden"))
        {
            System.out.println("You climb back up to Darkroot Garden, fighting through the demonic foliage that resides within it.");
            return "Darkroot Garden";
        }
        else if(name.equalsIgnoreCase("Undead Burg"))
        {
            System.out.println("Climbing the tower out of the Darkroot Basin, you find yourself in Undead Burg.");
            return "Undead Burg";
        }
        else if(name.equalsIgnoreCase("Valley of Drakes"))
        {
            System.out.println("Deep within a cave in the basin, you take a lift down to the Valley of Drakes.");
            return "Valley of Drakes";
        }

        System.out.println("You can't find any route to " + name + ".");
        return "Darkroot Basin";
    }
}
