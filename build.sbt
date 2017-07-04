name := "akka-persistence-cassandra"

version := "2.4.11"

scalaVersion := "2.11.11"

lazy val akkaVersion = "2.5.3"

libraryDependencies ++= Seq(
  "com.typesafe.akka"     %%    "akka-actor"                   %   akkaVersion,
  "com.typesafe.akka"     %%    "akka-persistence"             %   akkaVersion,
  "com.typesafe.akka"     %%    "akka-persistence-cassandra"   %   "0.54",
  "com.github.dnvriend" %% "akka-persistence-jdbc" % "2.4.18.2",
  "com.microsoft.sqlserver" % "mssql-jdbc" % "6.1.0.jre8",
  "org.iq80.leveldb"            % "leveldb"          % "0.7",
"org.fusesource.leveldbjni"   % "leveldbjni-all"   % "1.8",
  "com.typesafe.akka" %% "akka-persistence-query" % "2.5.3"
)


