package org.example.decorator;

import org.example.decorator.condiments.Mocha;
import org.example.decorator.condiments.Soy;
import org.example.decorator.condiments.Whip;

public class StarbuzzCoffee {

  public static void main(String[] args) {
    Beverage houseBlend = new HouseBlend();
    Beverage soyHouseBlend = new Soy(houseBlend);
    Beverage mochaSoyHouseBlend = new Mocha(soyHouseBlend);
    Beverage doubleMochaSoyHouseBlend = new Mocha(mochaSoyHouseBlend);
    Beverage doubleMochaSoyHouseBlendWithWhip = new Whip(doubleMochaSoyHouseBlend);

    // print the house blend with double mocha, soy milk and whip
    System.out.println(
        doubleMochaSoyHouseBlendWithWhip.getDescription()
            + " costs "
            + doubleMochaSoyHouseBlendWithWhip.cost()
            + "$");


  }
}
