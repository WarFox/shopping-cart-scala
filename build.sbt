name := "shopping-cart"

version := "0.0.0-SNAPSHOT"

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  "org.assertj" % "assertj-core" % "3.0.0" % Test,
  "junit" % "junit" % "4.12" % Test,
  "org.specs2" %% "specs2-core" % "3.6.1" % Test
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
