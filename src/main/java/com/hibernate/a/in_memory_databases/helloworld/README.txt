In this package I am testing the HSQL DB , using it as an in-memory DB as well as testing it as an externally launched DB

# Use of in-memory databases:
1. Used when you do not have access to local databases
2. They are light-weight. hsql db is very light weight. An hsql jar is aruond 1.5MB, while an unzipped jar is about 3.5MB. A typical SQL Server installation can go upto 1.5 GB.
3. in-memory databases rely on system memory as opposed to disk space for storage, so these databases are faster.

# =============== HSQLDB =============== #

# To launch the HSQLDB engine below is the command (for version 1.8.0.10 and 2.5.0 resp.)
C:\Vrishali\eclipse-interview\Java-Spring-Boot-Hibernate-REST\external.db.server\hsqldb-1.8.0.10>"C:\Program Files\Java\jdk1.8.0_171\bin\java.exe" org.hsqldb.Server
C:\Vrishali\eclipse-interview\Java-Spring-Boot-Hibernate-REST\external.db.server\hsqldb-2.5.0>"c:\Program Files\Java\jdk1.8.0_171\bin\java.exe" org.hsqldb.server.Server
# To launch the HSQLDB GUI
C:\Vrishali\eclipse-interview\Java-Spring-Boot-Hibernate-REST\external.db.server\hsqldb-2.5.0>"c:\Program Files\Java\jdk1.8.0_171\bin\java.exe" org.hsqldb.util.DatabaseManagerSwing

# HSQL User Guide = http://hsqldb.org/doc/guide/guide.html
# https://www.baeldung.com/java-in-memory-databases

# ================ H2DB =============== #

# To launch the H2DB engine below is the command
C:\Vrishali\eclipse-interview\Java-Spring-Boot-Hibernate-REST\external.db.server\h2-1.4.200>"c:\Program Files\Java\jdk1.8.0_171\bin\java.exe" org.h2.tools.Server -tcp -ifNotExists

# H2 User Guide = http://www.h2database.com/html/main.html

# =============== DERBYDB ============== #

# DERBY User Guide = https://db.apache.org/derby/
# Download server from - http://mirrors.estointernet.in/apache//db/derby/db-derby-10.14.2.0/db-derby-10.14.2.0-bin.zip
and run:
C:\Vrishali\eclipse-interview\Java-Spring-Boot-Hibernate-REST\external.db.server\derby-10.14.2.0\db-derby-10.14.2.0-bin\bin>startNetworkServer.bat
# Derby client server mode is supported by Derby Network Server - http://db.apache.org/derby/papers/DerbyTut/ns_intro.html
