public class DuckTestStrategy {
    
    private RedDuck redDuck;
    
    DuckTestStrategy(){
        redDuck = new RedDuck();
    }
    
    public void quack(){
        redDuck.performQuack();
    }
    
    public void voar(){
        redDuck.performFly();
    }
    
    public void nadar(){
        redDuck.performSwim();
    }
}
