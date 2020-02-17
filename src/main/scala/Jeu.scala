
class Jeu {

  val mario = new Mario(10,50)
  val goomba = new Goomba
  val bowser = new Bowser(100)
  val peach = new Peach(20)

  val rand = new scala.util.Random

  def chance(n: Int, m: Int) = {
    rand.nextInt(m) >= n
  }

  val gameOver = false

  def maledictionDeMario(finish : Boolean): Unit = {
    def aux(fini : Boolean , n : Int): Unit ={
      if ((!finish) && n>0 ){
        println("*" * 50)

        if (chance(1, 5)) {
          mario.sauter()

          if(chance(1, 3)) {
            mario.sauter()

            if(chance(1, 4)) {
              mario.attaquer(goomba)

              if(chance(3, 10) || chance(3, 10)) { /* on a deux essais pour le château, il faut
                                                que le premier OU le deuxième soit VRAI */
                mario.entrerChateau

                if(chance(1, 2)){
                  mario.attaquer(bowser)

                  if (chance(1, 3)) {
                    mario.donnerBisous(peach)
                    aux(true,n-1)  // si Mario arrive à baiser Peach alors le jeu se termine

                  } else peach.donnergifle(mario)

                }else bowser.attaquer(mario)

              }else println(mario.nom + " a été attrapé !")

            }else goomba.attaquer(mario)

          }else println(mario.nom + " est tombé dans le 2e trou !")

        }else println(mario.nom + " est tombé dans le premier trou !")

        if(mario.estMort()) aux(true,n-1) // si les vies de Mario sont toutes perdues on perd le jeu
        Thread.sleep(3000)  // temps d'attente 3 secondes
      }
      aux(false,10)
    }

    println("*" * 50)
    println("*" * 50)
    println("Game Over")
  }
}