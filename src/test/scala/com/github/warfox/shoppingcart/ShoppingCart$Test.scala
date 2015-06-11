package com.github.warfox.shoppingcart

import org.specs2.mutable.Specification

class ShoppingCart$Test extends Specification {

  "Price of an apple is 0.60'" in {
    ShoppingCart.priceList.get("apple").get must be equalTo 0.60
  }

  "Price of an orange is 0.25'" in {
    ShoppingCart.priceList.get("orange").get must be equalTo 0.25
  }

  "2 Apples should cost 1.20 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple")) must be equalTo 1.20
  }

  "2 Oranges should cost 0.5 on checkout" in {
    ShoppingCart.checkout(Array("orange", "orange")) must be equalTo 0.5
  }

}
