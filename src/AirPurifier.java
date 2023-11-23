public class AirPurifier {
    //instance variables
    private String model;
    private String serialNo;
    private double price;
    private boolean certified;
    private int FanSpeed;
    private boolean filterClean;
    private boolean power;
    private double[] dimension = new double[3];
    int PMlevel;

    //methods
    void turnOn() { power = true; System.out.println(model + " ON."); }
    void turnOff() { power = false; System.out.println(model + " OFF."); }

    void setFanSpeed(int speed) {
        if(power && speed <= 100 && speed >= 0) {
            FanSpeed = speed;
            System.out.println("set fan speed to " + speed);
        }else{
            System.out.println("please turnON your air purifier or correct your speed input.");
        }
    }
    int getPMlevel() {
        if(PMlevel >= 101) {
            System.out.println("Unhealthy :(");
        }else {
            System.out.println("Healthy :)");
        }
        return PMlevel;
    }

    void checkFilter() {
        if (filterClean) {
            System.out.println(model + " air purifier filter is clean.");
        } else {
            System.out.println("Please clean your air purifier filter.");
        }
    }

    void cleanFilter() {
        filterClean = true;
        System.out.println("filter is ready");
    }

    void printModel() {
        System.out.println( model + " " + serialNo);
    }

    void approveCertified() {certified = true;
        System.out.println(model + " is certified.");}

    void printDimensions() {
        System.out.println("dimensions is " + dimension[0] + " x " + dimension[1] + " x " + dimension[2]);

    }

    AirPurifier(String model, String serialNo, double price, double width,double length,double height) {
        this.model = model;
        this.serialNo = serialNo;
        this.price = price;
        this.certified = false;
        this.FanSpeed = 0;
        this.filterClean = false;
        this.power = false;
        this.dimension[0] = width;
        this.dimension[1] = length;
        this.dimension[2] = height;
        this.PMlevel = 0;

    }



    public static void main(String[] args) {
        AirPurifier f = new AirPurifier("XiaoMaiMi","AK47",3500,10.5, 5.0, 20.0);
        f.printModel();
        f.turnOn();
        f.approveCertified();
        f.printDimensions();
        //
        f.filterClean = true;
        //
        f.checkFilter();
        f.cleanFilter();
        //
        f.PMlevel = 150;
        //
        System.out.println(f.getPMlevel());
        f.setFanSpeed(85);
        f.turnOff();

        AirPurifier j = new AirPurifier("XiaoMakMak","BNK39",6500,50.0, 25.5, 29.0);
        j.printModel();
        j.turnOn();
        j.approveCertified();
        j.printDimensions();
        j.checkFilter();
        j.cleanFilter();
        //
        j.PMlevel = 100;
        //
        System.out.println(j.getPMlevel());
        j.setFanSpeed(28);
        j.turnOff();
    }
}
