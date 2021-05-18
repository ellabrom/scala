package com.demo.hero.factory

import com.demo.hero.heroes.Hero
import com.demo.hero.utils.RandomUtil
import org.reflections.Reflections

import java.util

class HeroFactory {
  val packageToScan = "com.demo.hero.heroes."
  val heroTypes: java.util.Set[Class[_ <: Hero]] = (new Reflections(packageToScan)).getSubTypesOf(classOf[Hero])

  def createRandomHero: Hero = {
    val randomClass = RandomUtil.getRandomItem(heroTypes).getSimpleName
    Class.forName( packageToScan+randomClass).getDeclaredConstructor().newInstance().asInstanceOf[Hero]
  }

}
