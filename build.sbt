organization := "com.github.gphat"

name := "datadog-scala"

scalaVersion := "2.11.8"

crossScalaVersions := Seq("2.10.6", "2.11.8")

resolvers += "spray repo" at "http://repo.spray.io"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

scalacOptions in Test ++= Seq("-Yrangepos")

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature")

libraryDependencies += "org.scalaz.stream" %% "scalaz-stream" % "0.7.3"

libraryDependencies += "io.spray" %% "spray-can" % "1.3.2"

libraryDependencies += "io.spray" %% "spray-http" % "1.3.2"

libraryDependencies += "io.spray" %% "spray-httpx" % "1.3.2"

libraryDependencies += "io.spray" %% "spray-util" % "1.3.2"

libraryDependencies += "org.json4s" %% "json4s-native" % "3.5.3"

libraryDependencies += "org.json4s" %% "json4s-core" % "3.5.3"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.5.3"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.5.26"

libraryDependencies += "org.clapper" %% "grizzled-slf4j" % "1.0.2"

libraryDependencies += "org.specs2" %% "specs2-core" % "3.0.1" % "test"

libraryDependencies += "org.slf4j" % "slf4j-simple" % "1.7.6" % "test"

releaseCrossBuild := true

Publish.settings

publishTo := Some(Resolver.file("file", new File("/tmp/fck")))
