package com.demo.hero.heroes

import com.demo.hero.utils.RandomUtil

class SwordKick {
  def SwordKick(attacker:Hero, defender:Hero): Unit = {
    val damage = RandomUtil.getNumberBetween(0, Math.max(attacker.power,0))
    val defenderName = defender.getClass.getSimpleName
    val attackerName = attacker.getClass.getSimpleName
    println(s"$defenderName kick with a sword to $attackerName for $damage hp")
    attacker.decreaseHp(damage)}

}
