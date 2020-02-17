class Peach(nbpv: Int) extends Princesse {
  override val nom: String = "Peach"
  override val pv: Int = nbpv

  override def donnerbisous(personnage: Personnage): Unit = {
    super.donnerbisous(personnage)
    println(nom + "à fait un bisous à"+ personnage.nom)
  }

  override def donnergifle(personnage: Personnage): Unit = {
    super.donnergifle(personnage)
    println(nom + "à donner une gifle à"+ personnage.nom)
  }
}
