package granja

import scala.collection.mutable.Set

class Corral[T <: Animal](val animales: List[T]) {
  def map[B <: Animal](f: T => B): Corral[B] = {
    animales.foldLeft(0)(_ + _.peso)
    animales.contains(new Vaca)
    new Corral(animales.map(f))
  }
  
  
}

class Pastor {
  def pastorear(animales: List[Animal]) = animales.foreach (_.come)
}

class Lechero {
  def ordeñar(corral:Corral[Vaca]) = corral.animales
    .foreach(animal => animal.ordeñate)
}