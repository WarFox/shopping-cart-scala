package com.github.warfox.shoppingcart

import scala.math.BigDecimal.RoundingMode

object ShoppingCart {

  val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25))

  def checkout(items: Array[String]): Double = {
    var total: Double = 0.0
    for (item <- items) {
      val price: Double = priceList.get(item).get
      total += price
    }
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

}
