package Ducks;

import DuckBehavior.FlyNoWay;
import DuckBehavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck(){
        flyBehavior=new FlyNoWay();
        quackBehavior=new Quack();
    }

    @Override
    public String Display() {
        return "I'm a model duck";
    }

}
