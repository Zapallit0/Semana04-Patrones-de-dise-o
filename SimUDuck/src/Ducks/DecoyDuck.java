package Ducks;

import DuckBehavior.FlyNoWay;
import DuckBehavior.MuteQuack;
import DuckBehavior.Quack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new MuteQuack();
    }

    @Override
    public String Display() {
        return "Soy un pato de madera";
    }
}
