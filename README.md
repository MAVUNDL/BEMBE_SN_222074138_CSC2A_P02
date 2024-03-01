The Firework Management Bureau (FMB), recognising your expertise and track record, has specifically requested your assistance in developing a comprehensive system to manage their spectacular firework displays. 2 With numerous Firework Displays featuring a variety of Fireworks, the
FMB seeks to enhance coordination for both efficiency and effectiveness in their endeavors.
Your task is to develop a robust system capable of not only organizing the FireworkDisplays but also
meticulously managing the diverse array of Fireworks used, thereby ensuring seamless execution
and maximizing the impact of each event. The FMB requires the ability to create multiple Firework
Displays, each comprising various Fireworks. To ensure accountability in case of any mishaps, a
lead Pyrotechnician is assigned to oversee each Firework Display.
The FMB keeps track of each Pyrotechnician. This data consists of:
• Full Name - the name and surname of the Technician, formatted as “<Name>-<Surname>”
e.g. “Jane-Doe”
• Phone Number - to call them when things ... ummm ... BLOW UP
To conform with law, the FMB use an enumeration E_COLOUR to ensure only the following legal
colours are used:
• RED, GREEN, BLUE, YELLOW, MAGENTA, WHITE, CYAN

The FMB keeps track of each Firework. This data consists of:
• Firework ID - a unique alphanumeric ID for the firework
• Firework Name - the firework’s name on record
• Firework Fuse Length - the explosion delay (in seconds)
• Firework Colour - the E_COLOUR produced by the firework
Each FireworkDisplay in the FMB also has its information stored. This data consists of:
• Display ID - a unique alphanumeric ID for the display
• Display Name - the display’s name on record (e.g. Ode to Joy)
• Display Theme - the theme targetted by the display (E.g. New Year’s Day)
• Lead Technician - the Pyrotechnician in charge of the display
• Fireworks - the Fireworks used in the display
Using the information provided in the problem statement above, do the following:
• Create a Pyrotechnician class with the required attributes3
.
• Create an E_COLOUR enumeration with the required colours.
• Create a Firework class with the required attributes3
.
– Make use of an ENUM TYPE for the Firework Colour.
• Create a Firework Display class with the required attributes3
.
• – A Firework Display must have a way to add new Fireworks
• Create a Main class.
– Create two Firework Display instances.
– For each Firework Display add two Fireworks and assign a Pyrotechnician.
– Call the printDisplay method on each Firework Display.
– Make sure the output is well formatted.
Place the relevant classes into the acsse.csc2a package
