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

  "3 Apples should cost 1.80 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple", "apple")) must be equalTo 1.8
  }

  "4 Apples should cost 2.40 on checkout" in {
    ShoppingCart.checkout(Array("apple", "apple", "apple", "apple")) must be equalTo 2.40
  }

  "2 Oranges should cost 0.5 on checkout" in {
    ShoppingCart.checkout(Array("orange", "orange")) must be equalTo 0.5
  }

  "3 Oranges should cost 0.75 on checkout" in {
    ShoppingCart.checkout(Array("orange", "orange", "orange")) must be equalTo 0.75
  }

  "4 Oranges should cost 1 on checkout" in {
    ShoppingCart.checkout(Array("orange", "orange", "orange", "orange")) must be equalTo 1
  }

}
