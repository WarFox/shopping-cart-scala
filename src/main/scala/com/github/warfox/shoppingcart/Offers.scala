package com.github.warfox.shoppingcart

object Offers {

  def buyOneGetOne(numberOfItems: Int, costOfOne: Double): Double = ((numberOfItems / 2) + (numberOfItems % 2)) * costOfOne

}
