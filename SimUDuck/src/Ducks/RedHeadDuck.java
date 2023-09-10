package Ducks;

import DuckBehavior.FlyNoWay;
import DuckBehavior.Quack;

public class RedHeadDuck extends Duck{
    public RedHeadDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }
    public String Display()
    {
        return "Soy un pato RedHead ";
    }
}
