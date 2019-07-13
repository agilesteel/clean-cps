scalaVersion := "2.12.8"

scalacOptions += "-P:continuations:enable"

libraryDependencies += "org.scala-lang.plugins" %% "scala-continuations-library" % "1.0.3"

autoCompilerPlugins := true

addCompilerPlugin("org.scala-lang.plugins" % "scala-continuations-plugin_2.12.2" % "1.0.3")
