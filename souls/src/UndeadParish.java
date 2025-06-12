public class UndeadParish extends Location
{
    public UndeadParish()
    {
        locationName = "Undead Parish";

        adjacentLocations = new String[3];
        adjacentLocations[0] = "Undead Burg";
        adjacentLocations[1] = "Darkroot Garden";
        adjacentLocations[2] = "Firelink Shrine";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Undead Burg"))
        {
            System.out.println("You head to the Undead Burg, fighting through the hollow soldiers and knights on the way.");
            return "Undead Burg";
        }
        else if(name.equalsIgnoreCase("Darkroot Garden"))
        {
            System.out.println("Passing Andre, you go down into the murky Darkroot Garden.");
            return "Darkroot Garden";
        }
        else if(name.equalsIgnoreCase("Firelink Shrine"))
        {
            System.out.println("You take the lift down to the safety of Firelink Shrine.");
            return "Firelink Shrine";
        }

        System.out.println("You don't see any way to get to " + name + ".");
        return "Undead Parish";
    }
}
