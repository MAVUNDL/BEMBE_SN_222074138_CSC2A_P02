package acsse.csc2a.fmb;

import java.util.Vector;
import java.util.Arrays;

/**
 * This class will manage the display of the fireworks
 */
public class FireworkDisplay
{
    private String Display_ID; // stores the name of the display ID
    private String Display_Name; // stores the name of the display the firework will produce
    private String Display_Theme; // stores the theme produced by the firework
    private PyroTechnician Technician; // an object of the PyroTechnician class
    private Vector<Fireworks> fireworks_object; // a vector of objects of the Fireworks class

    /**
     * This is a default constructor
     */
    FireworkDisplay()
    {
        this.Display_ID = "Bravo234Zulu";
        this.Display_Name = "Killer Man";
        this.Display_Theme = "Smooth";
        this.Technician = new PyroTechnician();
        this.fireworks_object = new Vector<>();
    }

    /**
     * This is a parameterised constructor
     * @param Display_id stores the ID for the Display
     * @param Display_name stores the name of the Display
     * @param Theme stores the type of theme produced by the display
     * @param tech_object is an object of the PyroTechnicians
     * @param fireworks is the first object for the first Firework and the second object for the second Firework
     */
    FireworkDisplay(String Display_id, String Display_name, String Theme, PyroTechnician tech_object, Fireworks... fireworks)
    {
        this.Display_ID = Display_id;
        this.Display_Name = Display_name;
        this.Display_Theme = Theme;
        this.Technician =  new PyroTechnician(tech_object.getFull_name(), tech_object.getPhone_Number());
        //
        this.fireworks_object = new Vector<>();
        this.fireworks_object.addAll(Arrays.asList(fireworks));
    }

    /**
     * This function allows FireDisplay to add new Fire works
     * @param fireworks is the new firework to be added to the vector of Fireworks
     */
    public void Add_new_Fireworks(Fireworks fireworks)
    {
        this.fireworks_object.add(fireworks);
    }

    /**
     * This function will delegate the work of Technician_Information function
     */
    public void Technician_details()
    {
        this.Technician.Technician_Information();
    }

    /**
     * This function will print all the details
     */
    public void printDisplay()
    {
        System.out.println("\n----------~The information for the Firework Display~----------");
        System.out.printf("%s%s%s", "ID for the Display: ", this.Display_ID, "\n");
        System.out.printf("%s%s%s", "Name of the Display: ", this.Display_Name, "\n");
        System.out.printf("%s%s%s", "Theme for the Display: ", this.Display_Theme, "\n");
        // displaying the information of the technician in charge
        Technician_details();
        // Displaying the information of th Firework used
        for(Fireworks fireworks: fireworks_object)
        {
            fireworks.Firework_information();
        }

    }



}