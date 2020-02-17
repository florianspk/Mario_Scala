trait Ennemi {
  val PV : Int
  val nom : String
def attaquer(personnage: Personnage) : Unit= {
  personnage.perdreVie()
}
}
