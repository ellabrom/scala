package com.scala_hw.hero.heroes

import com.scala_hw.hero.utils.RandomUtil

class King extends Hero {
  override var power: Int = RandomUtil.getNumberBetween(5,15)

  override var hp: Int = RandomUtil.getNumberBetween(5,15)

  override def kick(attacker: Hero): Unit = (new SwordKick).swordKick(attacker, this)
}
