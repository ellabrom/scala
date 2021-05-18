package com.demo.quoter_hm

object QuoterAggregator {
  private var quotes : scala.List[Quoter] = Nil
  def addQuoter(quote: Quoter): Unit = {
    quotes = quote::quotes
  }
  def printAllMessages(): Unit = {
    quotes.foreach(_.printMessage())
  }

}
