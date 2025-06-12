public class ValleyOfDrakes extends Location
{
    public ValleyOfDrakes()
    {
        locationName = "the Valley of Drakes";

        adjacentLocations = new String[3];
        adjacentLocations[0] = "New Londo Ruins";
        adjacentLocations[1] = "Darkroot Basin";
        adjacentLocations[2] = "Blighttown";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("New Londo Ruins"))
        {
            System.out.println("Careful to not slip off the edge, you run round the Valley of Drakes and enter the door into the dark New Londo ruins.");
            return "New Londo Ruins";
        }
        else if(name.equalsIgnoreCase("Darkroot Basin"))
        {
            System.out.println("You take the lift up to the cave in the Darkroot Basin.");
            return "Darkroot Basin";
        }
        else if(name.equalsIgnoreCase("Blighttown"))
        {
            System.out.println("You are met by a repugnant stench as you enter Blighttown.");
            return "Blighttown";
        }

        System.out.println("Searching around, you come to the conclusion that if there is a way to reach " + name + " from here, it would entail a deadly drop.");
        return "Valley of Drakes";
    }
}
