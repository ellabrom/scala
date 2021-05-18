package com.demo.hero.heroes

import com.demo.hero.utils.RandomUtil

class Knight extends Hero {
  override var power: Int = RandomUtil.getNumberBetween(2, 12)

  override var hp: Int = RandomUtil.getNumberBetween(2, 12)

  override def kick(attacker: Hero): Unit = (new SwordKick).SwordKick(attacker, this)
}


