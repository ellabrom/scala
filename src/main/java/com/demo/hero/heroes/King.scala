package com.demo.hero.heroes

import com.demo.hero.utils.RandomUtil

class King extends Hero {
  override var power: Int = RandomUtil.getNumberBetween(5,15)

  override var hp: Int = RandomUtil.getNumberBetween(5,15)

  override def kick(attacker: Hero): Unit = (new SwordKick).SwordKick(attacker, this)
}
