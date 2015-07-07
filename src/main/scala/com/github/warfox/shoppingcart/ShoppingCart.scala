package com.github.warfox.shoppingcart

import scala.math.BigDecimal.RoundingMode

object ShoppingCart {

  private val priceList: Map[String, Double] = Map(("apple", 0.60), ("orange", 0.25), ("banana", 0.20))

  def checkout(items: Array[String]): Double = {
    val total = items.flatMap(price).sum
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  def checkoutWithOffers(items: Array[String]): Double = {
    val noOfApples: Int = items.count(p => p.equalsIgnoreCase("apple"))
    val noOfOranges: Int = items.count(p => p.equalsIgnoreCase("orange"))
    val noOfBananas: Int = items.count(p => p.equalsIgnoreCase("banana"))

    val total = Offers.offer("apple")(noOfApples) + Offers.offer("orange")(noOfOranges) + Offers.offer("banana")(noOfBananas)
    BigDecimal(total).setScale(2, RoundingMode.HALF_EVEN).toDouble
  }

  def getPrice(item: String): Double = {
    priceList.getOrElse(item toLowerCase(), 0)
  }

  def price(item: String): Option[Double] = priceList.get(item toLowerCase)

}
