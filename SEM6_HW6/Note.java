public class Note {
    private String name;
    private int RAM;
    private int SSD;
    private String OS;
    private String colour;
    private double screenSize;

    public Note(String name, int RAM, int SSD, String OS, String colour, double screenSize){
        this.name = name;
        this.RAM = RAM;
        this.SSD = SSD;
        this.OS = OS;
        this.colour = colour;
        this.screenSize = screenSize;
    }

    @Override
    public String toString() {
        return String.format("%s\nRAM: %d GB\nSSD: %d GB\nOS: %s\nColour: %s\nScreen Size: %.1f\n", 
                    this.name, this.RAM, this.SSD, this.OS, this.colour, this.screenSize);
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Note) {
            return this.name.equals(((Note) obj).name) && this.RAM == ((Note) obj).RAM 
                                && this.SSD == ((Note) obj).SSD && this.OS.equals(((Note) obj).OS) 
                                && this.colour.equals(((Note) obj).colour) && this.screenSize == ((Note) obj).screenSize;
        }
        return false;     
    }

    public int getRAM(){
        return this.RAM;
    }
    public int getSSD(){
        return this.SSD;
    }
    public String getOS(){
        return this.OS;
    }
    public double getScreenSize(){
        return this.screenSize;
    }
}