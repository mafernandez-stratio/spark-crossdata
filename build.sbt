
name := "spark-crossdata"

version := "1.2.2"

scalaVersion := "2.10.5"

libraryDependencies ++= Seq (
  "com.stratio.crossdata" % "crossdata-core" % "1.2.2",
  "com.stratio.crossdata.connector" % "crossdata-cassandra" % "1.2.2",
  "com.stratio.crossdata.connector" % "crossdata-mongodb" % "1.2.2",
  "com.stratio.crossdata.connector" % "crossdata-elasticsearch" % "1.2.2"
)

spName := "Stratio/spark-crossdata"

sparkVersion := "1.5.2"

sparkComponents ++= Seq("sql")


