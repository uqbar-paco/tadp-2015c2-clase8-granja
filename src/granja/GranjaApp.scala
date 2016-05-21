package granja

import scala.collection.mutable.Set

object GranjaApp extends App {
  var animal: Animal = new Vaca
  var vaca: Vaca = new VacaLoca // new Animal

  animal.come
  vaca.ordeñate
  
  vaca = new VacaLoca
  
  vaca.ordeñate
//  vaca.reite

  //------------------------------
  
  var unaColeccion: List[Animal] = List(new VacaLoca, new VacaLoca)
  unaColeccion.filter { unElemento => unElemento.estaGordo }

  //var unaColeccion: Set[Animal] = Set(new Vaca, new Caballo, new Granero)

  //-----------------------------
  val corralito: Corral[Vaca] = new Corral(List(new Vaca, new Vaca))
  val lechero = new Lechero
  val pastor = new Pastor
  
  pastor.pastorear(corralito.animales)

  lechero.ordeñar(corralito)
  
  val otraCol = new Vaca :: unaColeccion 
  
  //------------------------------

  var vacas: Set[Vaca] = Set[Vaca]()
  var animales: Set[Animal] = ??? //Set[Vaca]()

  animales.foreach { animal => animal.come }
  vacas.foreach { vaca => vaca.ordeñate }
  
//  animales = vacas
  animales.add(new Vaca)
  animales.add(new Caballo)
  
  animales.add(new Caballo) // Opa! Un caballo es un animal, así que esto vale
  vacas.foreach { vaca => vaca.ordeñate } //Eh… No.
  
}