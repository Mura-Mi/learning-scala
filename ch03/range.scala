val lineup = new Array[String](4)
lineup(0) = "Kuwahara"
lineup(1) = "Elian"
lineup(2) = "Kajitani"
lineup(3) = "Tsutsugoh"

for (i <- 0 to lineup.length - 1) println(lineup(i))

println("---")

// Same process
for (i <- 0.to(lineup.length - 1)) println(lineup(i))
