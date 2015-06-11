package com.github.warfox.shoppingcart

import org.specs2.mutable.Specification

class ShoppingCart$Test extends Specification {

  "Price of an apple is 0.60'" in {
    ShoppingCart.priceList.get("apple").get must be equalTo 0.60
  }

  "Price of an orange is 0.25'" in {
    ShoppingCart.priceList.get("orange").get must be equalTo 0.25
  }

}
