package com.scala_hw.hero

import com.scala_hw.hero.factory.HeroFactory

class GameManager {
  private val heroFactory = new HeroFactory

  def fightWithRandomHeroes(): Unit = {
    val h1 = heroFactory.createRandomHero
    h1.printStatus()
    val h2 = heroFactory.createRandomHero
    h2.printStatus()
    while ( {
      h1.isAlive && h2.isAlive
    }) {
      h1.kick(h2)
      h2.kick(h1)
      h1.printStatus()
      h2.printStatus()
    }
    if (h1.isAlive) println(h1.getClass.getSimpleName + " won")
    else println(h2.getClass.getSimpleName + " won")
  }

}
