name := "RunKmeans"
 
version := "1.0"
 
scalaVersion := "2.10.6"
 
val sparkVersion =  "2.0.1"
libraryDependencies += "org.apache.spark" %% "spark-core" % "2.0.1"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.0.1"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.0.1"