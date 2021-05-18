package com.demo.quoter_hm

case class MessageQuoter(message: String) extends Quoter{
  override def printMessage(): Unit = println(message)
}
