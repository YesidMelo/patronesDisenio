/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta
import fabricaAbstracta.Fabricas.*
import fabricaAbstracta.ProductoA.*
import fabricaAbstracta.ProductoB.*
/*

  @author Yesid
  Created on 8/08/2020
*/



fun main(args : Array<String>){
    val fabricaSeleccionada = selectorFabrica(fabricasDisponibles.fabrica1)
    fabricaSeleccionada.crearProductoB().nombreProductoB()
}

enum class fabricasDisponibles{
    fabrica1,
    fabrica2,
    ;
}

fun selectorFabrica(fabrica : fabricasDisponibles) : FabricaAbstracta{
    return when(fabrica){
        fabricasDisponibles.fabrica1 -> FabricaConcreta1()
        fabricasDisponibles.fabrica2 -> FabricaConcreta2()        
    }
}



