package acsse.csc2a.fmb;

/**
 * This class keeps track of the PyroTechnicians
 */
public class PyroTechnician
{
    private String Full_Name; // stores the full name of the Technician
    private String  Phone_Number; // Stores the Phone number of the Technician

    /**
     * This is a default constructor
     */

    PyroTechnician()
    {
        this.Full_Name = "Skhumbuzo-Bembe";
        this.Phone_Number = "0790156664";
    }
    /**
     * This is a parameterised constructor
     * @param Full_NAME is the name of the Technician
     * @param Phone_Number is the phone number of the Technician
     */
    PyroTechnician(String Full_NAME, String Phone_Number)
    {
        this.Full_Name = Full_NAME;
        this.Phone_Number = Phone_Number;
    }

    /**
     * This is an Accessor for the full name of the Technician
     * @return this returns the  full name of the Technician
     */
    final String getFull_name()
    {
        return this.Full_Name;
    }
    /**
     * This is an Accessor for the Phone number of the Technician
     * @return this returns the Phone number of the Technician
     */
    final String getPhone_Number()
    {
        return this.Phone_Number;
    }

    /**
     * This function will print the details of the Technician
     */
    public void Technician_Information()
    {
        System.out.println("\n-----------~Information of the Technician in charge of the firework Display~----------");
        System.out.printf("%s%s%s", "Full name of Technician: ", this.Full_Name, "\n");
        System.out.printf("%s%s%s","Contact Number: ", this.Phone_Number, "\n");
    }

}