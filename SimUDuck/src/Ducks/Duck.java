package Ducks;

import DuckBehavior.FlyBehavior;
import DuckBehavior.QuackBehavior;

abstract public class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void performQuack(){
        quackBehavior.quack();
    }
    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior=qb;
    }
    public void performFly(){
        flyBehavior.fly();
    }
    public void setFlyBehavior( FlyBehavior fb){
        flyBehavior=fb;
    }
    abstract public String Display();
    public void Swim()
    {
        System.out.println("All ducks float");
    }
}
