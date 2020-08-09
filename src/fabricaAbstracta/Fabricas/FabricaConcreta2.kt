/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricaAbstracta.Fabricas

import fabricaAbstracta.ProductoA.*
import fabricaAbstracta.ProductoB.*

/*

  @author Yesid
  Created on 8/08/2020
*/

class FabricaConcreta2 : FabricaAbstracta {
    override fun crearProductoA(): ProductoAbstractoA {
        return ProductoConcretoA2()
    }

    override fun crearProductoB(): ProductoAbstractoB {
        return ProductoConcretoB2()
    }
}