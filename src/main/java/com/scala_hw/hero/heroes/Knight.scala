package com.scala_hw.hero.heroes

import com.scala_hw.hero.utils.RandomUtil

class Knight extends Hero {
  override var power: Int = RandomUtil.getNumberBetween(2, 12)

  override var hp: Int = RandomUtil.getNumberBetween(2, 12)

  val sword = new SwordKickTool
  override def kick(attacker: Hero): Unit = sword.swordKick(attacker, this)
}


