package com.scala_hw.hero.heroes

trait Hero {

  var power: Int
  var hp: Int

  def kick(attacker: Hero): Unit

  def isAlive: Boolean = hp > 0

  def decreasePower(delta: Int): Unit = power -= delta

  def decreaseHp(delta: Int): Unit = hp -= delta

  def die(): Unit = hp = 0

  def printStatus(): Unit = {
    val className = this.getClass.getSimpleName; println(s"$className has power $power and hp $hp")
  }
}
