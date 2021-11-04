package Service;

public interface GardeningTool {
    default void doGardeningStuff(){
        System.out.println("Doing Gardening Stuff ");
    }
}
