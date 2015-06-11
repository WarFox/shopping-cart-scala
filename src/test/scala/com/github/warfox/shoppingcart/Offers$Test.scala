package com.github.warfox.shoppingcart

import org.specs2.mutable.Specification

class Offers$Test extends Specification {

  "2 items should cost 1.00 when price is 0.50 for 1, on buyOneGetOne offer" in {
    Offers.buyOneGetOne(2 , 0.50) must be equalTo 1.00
  }

}
