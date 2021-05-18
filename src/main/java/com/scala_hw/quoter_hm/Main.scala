package com.scala_hw.quoter_hm

object Main {
  def main(args: Array[String]): Unit = {
    RandomQuoter
    new ShakespearQuoter("Hello Julia")
    MessageQuoter("Maccabi Tel Aviv in summer in winter")
    QuoterAggregator.printAllMessages()
  }

}
