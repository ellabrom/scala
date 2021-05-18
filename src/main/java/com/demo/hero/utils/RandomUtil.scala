package com.demo.hero.utils

import com.demo.hero.heroes.Hero


object RandomUtil {

  def getRandomItem(set: java.util.Set[Class[_ <: Hero]]): Class[_ <: Hero] = {
    val i = getNumberBetween(0, set.size - 1)
    val hero = set.toArray
    hero(i).asInstanceOf[Class[_ <: Hero]]
  }

  def getNumberBetween(min: Int, max: Int): Int = scala.util.Random.between(min, max + 1)

}
