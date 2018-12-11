scalaVersion := "2.12.7"

lazy val `sbt-jupiter-junit4` =
  project
    .in(file("."))
    .settings(
      libraryDependencies ++= Seq(
        "com.novocode" % "junit-interface" % "0.11" % Test,
        "junit" % "junit" % "4.12" % Test,
      ),
      testOptions += Tests.Argument( "-v", "-n"),
    )
