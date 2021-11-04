package singleton;

public class SingletonDemo {
    private static SingletonDemo instance = new SingletonDemo();
    public static SingletonDemo getInstance(){
        return instance;
    }

    private SingletonDemo(){

    }

}
