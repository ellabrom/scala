package com.scala_hw.quoter_hm

import org.fluttercode.datafactory.impl.DataFactory

object RandomQuoter extends Quoter {
  val df = new DataFactory
  override def printMessage(): Unit = {
    for (a <- 1 to 10) {
      print(df.getRandomWord() + " ")
    }
  }
}

