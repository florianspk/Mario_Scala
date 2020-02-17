trait Princesse {
  val nom : String
  val pv : Int
def donnerbisous(personnage: Personnage):Unit = {
  personnage.nbVie+1
}
  def donnergifle(personnage: Personnage): Unit ={
    personnage.nbVie-1
  }


}
