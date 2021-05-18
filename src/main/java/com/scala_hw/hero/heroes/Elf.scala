package com.scala_hw.hero.heroes

class Elf extends Hero {
  override var power: Int = 10

  override var hp: Int = 10

  override def kick(attacker: Hero): Unit = {
    if(attacker.power<this.power)
      attacker.die()
    else
      attacker.decreaseHp(1)
  }
}
