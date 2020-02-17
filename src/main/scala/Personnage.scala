trait Personnage {
  val nbVie : Int
  val money : Int
  val nom : String
  def gagnerArgent(): Unit = {
    money+1
  }
  def perdreArgent():Unit = {
    money-1
  }
  def perdreVie():Unit = {
    nbVie-1
  }
  def attaquer(ennemi: Ennemi): Unit ={
    ennemi.PV-1;
  }
  def estMort(): Boolean ={
    (nbVie<=0)
  }
  def donnerBisous(princesse: Princesse): Unit ={
    princesse.pv+1
  }
  def sauter(): Unit

}