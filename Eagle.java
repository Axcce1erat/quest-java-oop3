// Eagle, a class inherited from Bird / Make it so that the Fly interface is implemented by the Eagle class
public class Eagle extends Bird implements Fly{

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    //You will be able to determine the behaviour of the methods, but each method must display text in the console.
    @Override
    public void takeOff(){
        if (!this.flying && this.altitude){
            this.flying = true;
            System.out.prinftf("%s Is flying through the air %n", this.getName())
        }
    }

    @Override
    public void ascends(int meters){
        if (this.flying){
            this.altitude = Math.min(this.altitude + meters, 100);
            System.out.printf("%s flying up, altitude: %d%n", this.altitude, this.getName())
        }
        return this.altitude;
    }

    public void descends(int meters){
        if (this.flying){
            this.altitude = Math.min(this.altitude + meters, 0);
            System.out.printf("%s flying down, altitude: %d%n", this.altitude, this.getName())
        }
        return this.altitude;
    }

    public void land(){
        if (this.flying && this.flying == 0){
            System.out.printf("%s sits in his nest %n", this.getName())
        }
        else{
            System.out.printf("%s this is too high, it can't get into the nest %n", this.getName())
        }
    }
}
