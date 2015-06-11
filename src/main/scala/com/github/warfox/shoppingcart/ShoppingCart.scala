package com.github.warfox.shoppingcart

object ShoppingCart {

  val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  def checkout(items: Array[String]): Double = {
    var total: Double = 0.0
    for (item <- items) {
      val price: Double = priceList.get(item).get
      total += price
    }
    total
  }

}
