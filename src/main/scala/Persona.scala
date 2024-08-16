class Persona(val Nombre: String,private var Edad: Int,private var banco: Any){
  def Cumpleaños(): Unit = {
    Edad+=1
  }
  def DeRegistrar(): Unit = {
    banco = ""
}
  def Registrar(Otro_banco: Banco): Unit = {
    banco = Otro_banco
  }

}
