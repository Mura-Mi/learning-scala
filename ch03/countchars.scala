import scala.io.Source

if (args.length == 0)
  Console.err.println("Please enter filename")
else {
  Source.fromFile(args(0))
    .getLines()
    .foreach(line => println(line.length + " " + line))
}
