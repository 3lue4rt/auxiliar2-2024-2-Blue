import scala.collection.mutable.ArrayBuffer

class Banco(val Nombre: String,private var subs: ArrayBuffer[Persona]){
  def Registrar(dude: Persona): Unit = {
    subs.addOne(dude)
  }
  def Eliminar(dude: Persona): Unit = {
    subs.remove(subs.indexOf(dude))
  }
}
