class Mario(vie : Int , argent : Int) extends Personnage {
  override val nbVie : Int = vie
  override val money : Int= argent
  override val nom: String = "Mario"

  override def attaquer(ennemi: Ennemi): Unit = {
    super.attaquer(ennemi)
    println(nom+" à attaqué " + ennemi.nom)
  }

  override def donnerBisous(princesse: Princesse): Unit = {
    super.donnerBisous(princesse)
    println(nom+ " à fait un bisous a la princesse "+princesse.nom)
  }

  override def estMort(): Boolean = {
    super.estMort()
    println(nom + " est mort")
  }

  override def gagnerArgent(): Unit = {
    super.gagnerArgent()
    println(nom+ " à gagné une piéce")
  }

  override def perdreArgent(): Unit = {
    super.perdreArgent()
    println(nom + " à perdu de l'argent est à "+money+ " pièces")
  }

  override def perdreVie(): Unit = {
    super.perdreVie()
    println(nom + " à perdu de la vie")
  }

  override def sauter(): Unit = {
    println(nom + "à sauté")
  }
  def entrerChateau = println(nom + " est entré dans le château !")

}
