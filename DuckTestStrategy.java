public class DuckTestStrategy {
    
    private RedDuck redDuck;
    
    DuckTestStrategy(){
        redDuck = new RedDuck();
    }
    
    public void quack(){
        redDuck.performQuack();
    }
    
    public void fly(){
        redDuck.performFly();
    }
    
    public void swim(){
        redDuck.performSwim();
    }
}
