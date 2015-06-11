package com.github.warfox.shoppingcart

object Main {

  def main(args: Array[String]) {
    println("[ " + args.mkString(", ") + " ] => £" + ShoppingCart.checkoutWithOffers(args))
  }

}
