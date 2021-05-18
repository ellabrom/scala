package com.scala_hw.hero.heroes

import com.scala_hw.hero.utils.RandomUtil

class Knight extends Hero {
  override var power: Int = RandomUtil.getNumberBetween(2, 12)

  override var hp: Int = RandomUtil.getNumberBetween(2, 12)

  override def kick(attacker: Hero): Unit = (new SwordKick).SwordKick(attacker, this)
}


