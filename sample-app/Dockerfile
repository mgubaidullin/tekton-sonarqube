FROM image-registry.openshift-image-registry.svc:5000/openshift/fuse7-java-openshift
COPY target/*.jar /deployments
ENTRYPOINT ["/opt/jboss/container/java/run/run-java.sh"]