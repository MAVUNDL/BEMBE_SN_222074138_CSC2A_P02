package acsse.csc2a;

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
    private Fireworks[] fireworks_object; // an array of objects of the Fireworks class

    /**
     * This is a default constructor
     */
    FireworkDisplay()
    {
        this.Display_ID = "Bravo234Zulu";
        this.Display_Name = "Killer Man";
        this.Display_Theme = "Smooth";
        this.Technician = new PyroTechnician();
        this.fireworks_object = new Fireworks[2];
    }

    /**
     * This is a parameterised constructor
     * @param Display_id stores the ID for the Display
     * @param Display_name stores the name of the Display
     * @param Theme stores the type of theme produced by the display
     * @param tech_object is an object of the PyroTechnicians
     * @param object1 is the first object for the first Firework
     * @param  object2 is the second object for the second Firework
     */
    FireworkDisplay(String Display_id, String Display_name, String Theme, PyroTechnician tech_object, Fireworks object1, Fireworks object2)
    {
        this.Display_ID = Display_id;
        this.Display_Name = Display_name;
        this.Display_Theme = Theme;
        this.Technician =  new PyroTechnician(tech_object.getFull_name(), tech_object.getPhone_Number());
        this.fireworks_object = new Fireworks[2];

        // adding the objects to the array
        this.fireworks_object = new Fireworks[]{object1, object2};
    }

    /**
     * This function allows FireDisplay to add new Fire works
     * @param fireworks is the new firework to be added to the vector of Fireworks
     */
    public void Add_new_Fireworks(Fireworks fireworks)
    {
        // create a new Temporary array that bigger that the current array
        Fireworks[] Temporary_array = new Fireworks[this.fireworks_object.length + 1];
        // copying all the elements from the current array to the temporary array
        for(int i = 0; i < this.fireworks_object.length; i++)
        {
            Temporary_array[i] = this.fireworks_object[i];
        }
        // add the new object at the last index of the temp array
        Temporary_array[this.fireworks_object.length] = fireworks;

        // assign the reference of the temporary array to the current array ensuring that the changes are performed
        this.fireworks_object = Temporary_array;
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
        for(int i = 0; i < this.fireworks_object.length; i++)
        {
            this.fireworks_object[i].Firework_information();
        }

    }



}