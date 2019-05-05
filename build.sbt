name := """project-001"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.6"

crossScalaVersions := Seq("2.12.6", "2.11.12")

libraryDependencies += guice

// https://mvnrepository.com/artifact/com.datadoghq/java-dogstatsd-client
libraryDependencies += "com.datadoghq" % "java-dogstatsd-client" % "2.6.1"