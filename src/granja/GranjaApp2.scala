package granja

import scala.collection.mutable.Set

object GranjaApp2 extends App {
  var f: Vaca => Vaca = null

  def g(vaca: Vaca): Vaca = ??? // Recibe una Vaca y devuelve una Vaca
  def h(vaca: Vaca): Animal = ??? // Devuelve un Animal
  def i(vaca: Vaca): VacaLoca = ??? // Devuelve una VacaLoca
  def j(vacaLoca: VacaLoca): Vaca = {
    vacaLoca.reite
    vacaLoca
  }// Recibe una VacaLoca
  def k(animal: Animal): Vaca = {
    animal.come
    new Vaca
  } // Recibe un Animal

  f = k

  f(new Vaca).ordeñate
}