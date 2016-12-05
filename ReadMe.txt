Camel Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.redhat.tutorials/simpleSoapRestSvc/1.0-SNAPSHOT

To deploy on fabric8

    fabric8:deploy

For more help see the Apache Camel documentation

    http://camel.apache.org/

how to commit to gitlab

git commit -m "Comment" -a
git push