public class Singleton_L{
private static Singleton_L unique;
private Singleton_L(){}
public static Singleton_L getInstance(){
if(unique==null)
unique=new Singleton_L();
return unique;
}
}