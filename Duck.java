
/**
 * Classe abstrata Duck - escreva a descrição da classe aqui
 * 
 * @author (seu nome aqui)
 * @version (versão ou data)
 */
public abstract class Duck
{
    protected QuackBehavior quackBehavior;
    protected FlyBehavior flyBehavior;
    protected SwimBehavior swimBehavior;
    
    public abstract void display();
    
    public void performQuack(){
        quackBehavior.quack();
    }
    
    public void performFly(){
        flyBehavior.fly();
    }
    
        public void performSwim(){
        swimBehavior.swim();
    }
    
    public void setQuackBehavior(QuackBehavior q){
        quackBehavior = q;
    }
    
    public void setFlyBehavior(FlyBehavior f){
        flyBehavior = f;
    }
    
    public void setFlyBehavior(SwimBehavior s){
        swimBehavior = s;
    }
}
