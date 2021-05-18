package com.scala_hw.quoter_hm

class ShakespearQuoter (val message: String = "To be or not to be") extends Quoter {
  override def printMessage: Unit = println (message)
}
