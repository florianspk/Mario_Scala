class Goomba() extends Ennemi {
  override val nom: String = "Goomba"
  override val PV: Int = 5

  override def attaquer(personnage: Personnage): Unit = {
    super.attaquer(personnage)
    println("Un " + nom + " à attaqué "+personnage.nom)
  }
}
