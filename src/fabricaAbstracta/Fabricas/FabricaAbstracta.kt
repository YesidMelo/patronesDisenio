/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.Fabricas
import fabricaAbstracta.ProductoA.ProductoAbstractoA
import fabricaAbstracta.ProductoB.ProductoAbstractoB
/*

  @author Yesid
  Created on 8/08/2020
*/

interface FabricaAbstracta {
    fun crearProductoA() : ProductoAbstractoA
    fun crearProductoB() : ProductoAbstractoB
}