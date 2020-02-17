class Bowser(pv : Int) extends Boss {
  override val PV: Int = pv
  override val nom: String = "Bowser"

  override def attaquer(personnage: Personnage): Unit = {
    super.attaquer(personnage)
    println(nom + "à attaqué "+ personnage.nom)
  }


}
