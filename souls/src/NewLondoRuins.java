public class NewLondoRuins extends Location
{
    public NewLondoRuins()
    {
        locationName = "the New Londo Ruins";

        adjacentLocations = new String[2];
        adjacentLocations[0] = "Firelink Shrine";
        adjacentLocations[1] = "Valley of Drakes";
    }

    public String go(String name)
    {
        if(name.equalsIgnoreCase("Firelink Shrine"))
        {
            System.out.println("Unnerved by the insane residents of the ruins, you take the lift back up to Firelink Shrine.");
            return "Firelink Shrine";
        }
        else if(name.equalsIgnoreCase("Valley of Drakes"))
        {
            System.out.println("Going through a door, you are initially blinded by sunlight reaching the Valley of Drakes.");
            return "Valley of Drakes";
        }

        System.out.println("Almost no light reaches these underground ruins. You look for a way to " + name + ", but are unable to find one.");
        return "New Londo Ruins";
    }
}
