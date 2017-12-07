package Shogi.application

/**
 * Created by inuma on 2017/12/07.
 */

import tornadofx.*

class ShogiView : View(){
    override val root = Form()

    init{
        with(root){
            // fieldsetはjavafxのVBoxを継承する.
            fieldset{
                field("Helllo Shogi App.")
            }
        }
    }
}