package com.github.warfox.shoppingcart

import org.specs2.mutable.Specification

class Offers$Test extends Specification {

  "2 items should cost 0.50 when price for 1 is 0.50, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(2 , 0.50) must be equalTo 0.50
  }

  "3 items should cost 1.00 when price for 1 is 0.50, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(3 , 0.50) must be equalTo 1.00
  }

  "3 items should cost 0.50 when price for 1 is 0.25, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(3 , 0.25) must be equalTo 0.50
  }

  "4 items should cost 1.00 when price for 1 is 0.50, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(3 , 0.50) must be equalTo 1.00
  }

  "3 items should cost 1.00 when price for 1 is 0.50, on threeForTwo offer" in {
    Offers.threeForTwo(3, 0.50) must be equalTo 1.00
  }

  "7 items should cost 1.00 when price for 1 is 0.50, on threeForTwo offer" in {
    Offers.threeForTwo(7, 0.25) must be equalTo 1.25
  }

}
