public class Singleton {
    private static Singleton unique = new Singleton();
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return unique;
    }
}
