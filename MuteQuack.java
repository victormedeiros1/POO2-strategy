public class MuteQuack implements QuackBehavior, FlyBehavior, SwimBehavior
{
 
    public void quack(){
        System.out.println("quack! quack! quack!");
    }
    
    public void fly(){
        System.out.println("vuu! vuu! vuu!");
    }
    
    public void swim(){
        System.out.println("splash! splash! splash");
    }
}