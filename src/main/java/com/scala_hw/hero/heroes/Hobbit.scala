package com.scala_hw.hero.heroes

class Hobbit extends Hero {
  override var power: Int = 0
  override var hp: Int = 3
  override def kick(attacker: Hero): Unit = println("Cryingggg")
}
