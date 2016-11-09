name := "akka-persistence-cassandra"

version := "2.4.11"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "com.typesafe.akka"     %%    "akka-actor"                   %   "2.4.11",
  "com.typesafe.akka"     %%    "akka-persistence"             %   "2.4.11",
  "com.typesafe.akka"     %%    "akka-persistence-cassandra"   %   "0.20"
)


