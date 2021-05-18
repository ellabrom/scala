package com.demo.quoter_hm

import com.demo.traits.Zoo

trait Quoter {

  registerInAggregator()
  final def registerInAggregator(): Unit = QuoterAggregator.addQuoter(this)
  def printMessage() : Unit
}
