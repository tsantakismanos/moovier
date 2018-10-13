name := "akkademy-db"

version := "1.0"

scalaVersion := "2.11.1"


libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor_2.11" % "2.3.6",
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.3.6" % "test",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test")
