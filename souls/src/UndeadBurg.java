public class UndeadBurg extends Location
{
    public UndeadBurg()
    {
        locationName = "Undead Burg";

        adjacentLocations = new String[4];
        adjacentLocations[0] = "Firelink Shrine";
        adjacentLocations[1] = "Undead Parish";
        adjacentLocations[2] = "Depths";
        adjacentLocations[3] = "Darkroot Basin";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Firelink Shrine"))
        {
            System.out.println("You leave Undead Burg, traversing the aquaduct to return to Firelink Shrine.");
            return "Firelink Shrine";
        }
        else if(name.equalsIgnoreCase("Undead Parish"))
        {
            System.out.println("After an intense fight with the Taurus Demon, you make it to the Undead Parish.");
            return "Undead Parish";
        }
        else if(name.equalsIgnoreCase("Depths"))
        {
            System.out.println("Heading down through Undead Burg, you eventually enter the gloomy Depths.");
            return "Depths";
        }
        else if(name.equalsIgnoreCase("Darkroot Basin"))
        {
            System.out.println("You make your way down the winding steps to the Darkroot Basin.");
            return "Darkroot Basin";
        }

        System.out.println("If there is a way to " + name + " from the confusing, sprawling town of Undead Burg, you can't find it.");
        return "Undead Burg";
    }
}
