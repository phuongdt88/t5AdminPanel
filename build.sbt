
name := """t5-adminpanel"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

ivyScala := ivyScala.value map { _.copy(overrideScalaVersion = true) }

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs,
  "org.json" % "json" % "20141113",
  "uk.co.panaxiom" %% "play-jongo" % "0.8.0-jongo1.2",
  "com.google.gdata" % "core" % "1.47.1",
  "com.typesafe.play" %% "play-json" % "2.4.2",
  "com.google.api-client"%"google-api-client"%"1.20.0",
  "com.google.oauth-client"%"google-oauth-client-jetty"%"1.20.0",
  "com.google.apis"%"google-api-services-drive"%"v2-rev170-1.20.0",
  "com.google.http-client" % "google-http-client-jackson" % "1.19.0",
  "net.sf.opencsv" % "opencsv" % "2.3",
  "com.typesafe.play" %% "play-mailer" % "3.0.1",
  "mysql" % "mysql-connector-java" % "5.1.18",
  "com.opencsv" % "opencsv" % "3.7"
)



// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
//routesGenerator := StaticRoutesGenerator
routesGenerator := InjectedRoutesGenerator