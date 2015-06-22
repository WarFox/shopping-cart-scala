package com.github.warfox.shoppingcart

import scala.math.BigDecimal.RoundingMode

object ShoppingCart {

  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25), ("banana", 0.20))

  def checkout(items: Array[String]): Double = {
    var total: Double = 0.0
    for (item <- items) {
      val price: Double = getPrice(item)
      total += price
    }
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  def checkoutWithOffers(items: Array[String]): Double = {
    var total: Double = 0.0
    val noOfApples: Int = items.count(p => p.equalsIgnoreCase("apple"))
    val noOfOranges: Int = items.count(p => p.equalsIgnoreCase("orange"))
    val noOfBananas: Int = items.count(p => p.equalsIgnoreCase("banana"))

    total = Offers.offer("apple")(noOfApples) + Offers.offer("orange")(noOfOranges) + Offers.offer("banana")(noOfBananas)
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  def getPrice(item: String): Double = {
    priceList.getOrElse(item toLowerCase(), 0)
  }

}
