// Create a Fly interface
public interface Fly{

    //takeOff with no arguments, and returns nothing
    void takeOff();

    //ascends which takes an integer meters as an argument, and returns an integer
    int ascend(int meters);

    //descends which takes an integer meters as an argument, and returns an integer
    int descend(int meters);

    //land with no arguments, which returns nothing
    void land();

    //glide, with no arguments, which returns nothing and has a default behaviour: displaying the text "glides into the air."
    default void glide(){
        System.out.println("glides in the air");
    }
}
