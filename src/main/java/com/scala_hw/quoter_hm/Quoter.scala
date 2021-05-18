package com.scala_hw.quoter_hm

trait Quoter {

  registerInAggregator()
  final def registerInAggregator(): Unit = QuoterAggregator.addQuoter(this)
  def printMessage() : Unit
}
