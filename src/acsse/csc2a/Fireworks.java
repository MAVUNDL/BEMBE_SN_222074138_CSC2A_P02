package acsse.csc2a;

/**
 * This class will contain the information of the firework
 */
public class Fireworks
{
    // class variables
    private String Firework_ID;
    private String Firework_Name;
    private double Firework_Fuse_length;
    private E_COLOUR Colour_container;

    /**
     * This is the default constructor
     */
    Fireworks()
    {
        this.Firework_ID = "SBV22BRAVO";
        this.Firework_Name = "Shining Star";
        this.Firework_Fuse_length = 13.54;
        this.Colour_container = E_COLOUR.BLUE;
    }
    /**
     * This is a parameterised constructor
     */
    Fireworks(String ID, String Firework_name, double firework_length, String Colour)
    {
        this.Firework_ID = ID;
        this.Firework_Name = Firework_name;
        this.Firework_Fuse_length = firework_length;
        this.Colour_container = ensure_colour(Colour);
    }
    /**
     * This is a copy constructor
     */
    Fireworks(Fireworks object)
    {
        this.Firework_ID = object.Firework_ID;
        this.Firework_Name =object.Firework_Name;
        this.Firework_Fuse_length = object.Firework_Fuse_length;
        this.Colour_container = object.Colour_container;
    }

    /**
     * This function will allow us to interact with the Enum get colour for the firework
     * @param colour_index is the colour our firework must have
     * @return the colour of the fireworks
     */
    private E_COLOUR ensure_colour(String colour_index)
    {
        switch(colour_index.toUpperCase())
        {
            case "BLUE":
                return this.Colour_container = E_COLOUR.BLUE;
            case "GREEN":
                return this.Colour_container = E_COLOUR.GREEN;
            case "YELLOW":
                return this.Colour_container = E_COLOUR.YELLOW;
            case "RED":
                return this.Colour_container = E_COLOUR.RED;
            case "WHITE":
                return this.Colour_container = E_COLOUR.WHITE;
            case "CYAN":
                return this.Colour_container = E_COLOUR.CYAN;
            case "MAGENTA":
                return this.Colour_container = E_COLOUR.MAGENTA;
            default:
                 System.out.println("Error!! colour does not exist on the colour list");
        }
        return null;
    }
    // Accessor functions

    /**
     * This is an accessor for the Firework ID
     * @return returns the Firework ID
     */
    final String getFirework_ID()
    {
        return this.Firework_ID;
    }

    /**
     * This is an accessor for the Firework name
     * @return returns the name of the Firework
     */
    final String getFirework_Name()
    {
        return this.Firework_Name;
    }

    /**
     * This is an accessor for the fuse length of the Firework
     * @return returns the length of the fuse
     */
    final double getFirework_Fuse_length()
    {
        return this.Firework_Fuse_length;
    }

    /**
     * This is an accessor for the Colour of the Firework
     * @return returns the colour for the fire work
     */
    final E_COLOUR getColour_container()
    {
        return this.Colour_container;
    }

    /**
     * This function will print the details of the Firework
     */
    public void Firework_information()
    {
        System.out.println("\n----------~Information  about the firework used~----------");
        System.out.printf("%s%s%s", "ID of the Firework: ", this.Firework_ID, "\n");
        System.out.printf("%s%s%s", "Name of the Firework: ", this.Firework_Name, "\n");
        System.out.printf("%s%s%s", "Length of the Firework Fuse: ", this.Firework_Fuse_length, "\n");
        System.out.printf("%s%s%s", "Colour produced by the Firework: ", this.Colour_container, "\n");
    }

}
