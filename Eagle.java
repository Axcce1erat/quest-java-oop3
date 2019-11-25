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

    public void setAltitude(int altitude){
        this.altitude = altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    public void setFlying(boolean flying){
        this.flying = flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    //You will be able to determine the behaviour of the methods, but each method must display text in the console.
    @Override
    public void takeOff(){
        if (!this.flying){
            System.out.println(this.getName()+" takes of into the sky!");
            this.flying = true;
        }
        else {
            System.out.println(this.getName()+" is on the fly!");
        }
    }

    @Override
    public int ascend(int meters){
        if (this.flying){
            this.altitude = Math.min(this.altitude+meters, 1000);
            System.out.println(this.getName()+" flying up, altitude: "+this.altitude);
        }
        return this.altitude;
    }

    public int descend(int meters){
        if (this.flying){
            this.altitude = Math.min(this.altitude + meters, 1);
            System.out.println(this.getName()+" flying down, altitude: "+this.altitude);
        }
        return this.altitude;
    }

    public void land(){
        if (this.flying) {
            if (this.altitude > 1) {
                System.out.println(this.getName() + " this is too high to land!");
            } else {
                this.flying = false;
                this.altitude = 0;
                System.out.println(this.getName() + " lands on the ground!");
            }
        }
        else {
            System.out.println(this.getName() + " is on the ground!");
        }
    }
}
