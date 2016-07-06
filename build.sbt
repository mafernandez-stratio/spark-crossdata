
name := "spark-crossdata"

version := "1.4.0"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq (
  "com.stratio.crossdata" %% "crossdata-core" % "1.4.0",
  "com.stratio.crossdata.connector" %% "crossdata-cassandra" % "1.4.0",
  "com.stratio.crossdata.connector" %% "crossdata-mongodb" % "1.4.0",
  "com.stratio.crossdata.connector" %% "crossdata-elasticsearch" % "1.4.0"
)

spName := "Stratio/spark-crossdata"

sparkVersion := "1.6.2"

sparkComponents ++= Seq("sql")


