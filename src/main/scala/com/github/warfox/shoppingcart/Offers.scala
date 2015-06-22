package com.github.warfox.shoppingcart

object Offers {

  def buyOneGetOne(numberOfItems: Int, costOfOne: Double): Double = ((numberOfItems / 2) + (numberOfItems % 2)) * costOfOne

  def threeForTwo(numberOfItems: Int, costOfOne: Double): Double = (2 * (numberOfItems/3) + (numberOfItems %3)) * costOfOne

  def offer(item: String): Int => Double = {
    val price: Double = ShoppingCart.getPrice(item)
    item toLowerCase() match {
      case "apple" => (numberOfItems:Int) => buyOneGetOne(numberOfItems, price)
      case "banana" => (numberOfItems:Int) => buyOneGetOne(numberOfItems, price)
      case "orange" => (numberOfItems:Int) => threeForTwo(numberOfItems, price)
      case _ => (numberOfItems:Int) => numberOfItems * price
    }
  }

}
