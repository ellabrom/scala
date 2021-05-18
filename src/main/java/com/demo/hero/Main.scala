package com.demo.hero

import org.reflections.Reflections

object Main {
  def main(args: Array[String]): Unit = {
    val gameManager : GameManager = new GameManager
    gameManager.fightWithRandomHeroes()
  }

}
