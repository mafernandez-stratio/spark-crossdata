CROSSDATA
=========

Crossdata is a distributed framework and a fast and general-purpose computing system powered by Apache Spark. It unifies the interaction with different sources supporting multiple datastore technologies thanks to its generic architecture and a custom SQL-like language using SparkSQL as the core of the project. In addition, Crossdata supports batch and streaming processing so that you can mix data from both input technologies. Supporting multiple architectures imposes two main challenges: how to normalize the access to the datastores, and how to cope with datastore limitations. Crossdata provides connectors which can access to multiple datastores natively, speeding up the queries by avoiding the overhead and the block of resources of the Spark Cluster when possible.

This repository converts some modules of Crossdata project in a package ready to be deployed as a Spark package.

For more information, visit:

- https://github.com/Stratio/Crossdata/tree/1.3.0

- https://stratio.atlassian.net/wiki/display/CROSSDATA1x3/Home

CROSSDATA AS A SPARK PACKAGE
=============================
If you want to use crossdata as a Spark Package into your Spark distribution, just follow these steps:

    > mvn clean install -DskipITs -DskipUTs
    > mvn package -Ppackage -DskipITs -DskipUTs

Once the package phase is done, you can find the spark-crossdata-1.3.0.jar at the spark-crossdata/target directory.

Now, you can start your spark-shell as:

    SPARK-HOME> bin/spark-shell --jars $CROSSDATA-HOME/spark-crossdata/target/spark-crossdata-1.3.0.jar
    

Inside the spark shell, you can import our crossdata datasources:

    scala> import com.stratio.crossdata.connectors._
    
You can create a Crossdata context (XDContext) as follows:

    scala> import org.apache.spark.sql.crossdata._
    scala> val xdcontext=new XDContext(sc)
    
Next, you can import data from the Cassandra source:

    scala> xdcontext.sql("IMPORT TABLES USING com.stratio.crossdata.connector.cassandra OPTIONS ( cluster \"Test Cluster\", spark_cassandra_connection_host '127.0.0.1')")

And then check if the Cassandra tables are in Crossdata Catalog:

    scala> xdcontext.sql("SHOW TABLES").show(false)
    
Finally you can execute your queries:

    scala> xdContext.sql("SELECT....")
    
    

