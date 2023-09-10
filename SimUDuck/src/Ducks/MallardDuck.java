package Ducks;

import DuckBehavior.FlyWithWings;
import DuckBehavior.Quack;

public class MallardDuck extends Duck {
    public MallardDuck(){
        quackBehavior=new Quack();
        flyBehavior =new FlyWithWings();
    }

    public String Display ()
    {
        return "I'm the real Mallard duck";
    }


}

