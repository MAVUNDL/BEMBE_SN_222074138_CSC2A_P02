Firework Management System

Introduction

Welcome to the Firework Management System developed for the Firework Management Bureau (FMB). This system aims to enhance coordination and management of spectacular firework displays by organizing Firework Displays and meticulously managing various Fireworks used.

System Overview

The system allows for:


Creation of multiple Firework Displays, each comprising various Fireworks.

Assignment of a lead Pyrotechnician to oversee each Firework Display.

Tracking of Pyrotechnician information including Full Name and Phone Number.

Maintenance of Firework information including ID, Name, Fuse Length, and Colour.

Storage of Firework Display information including ID, Name, Theme, Lead Technician, and Fireworks used.

Implementation Steps

To implement the system, follow these steps:


Create a Pyrotechnician class with attributes FullName and PhoneNumber.

Define an E_COLOUR enumeration with legal colours: RED, GREEN, BLUE, YELLOW, MAGENTA, WHITE, CYAN.

Develop a Firework class with attributes FireworkID, FireworkName, FuseLength, and FireworkColour.

Utilize ENUM TYPE for the Firework Colour.

Implement a FireworkDisplay class with attributes DisplayID, DisplayName, DisplayTheme, LeadTechnician, and Fireworks.

Ensure Firework Display has methods to add new Fireworks.

Create a Main class to:

Instantiate two Firework Display instances.

Add two Fireworks to each Firework Display and assign a Pyrotechnician.

Call the printDisplay method on each Firework Display to ensure well-formatted output.

Package Organization

Place the relevant classes into the acsse.csc2a package.
