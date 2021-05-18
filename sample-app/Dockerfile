FROM image-registry.openshift-image-registry.svc:5000/openshift/fuse7-java-openshift:1.7
# Fuse 7, Spring Boot and Third Party Dependencies
COPY target/lib /deployments/lib
# Application
COPY target/*.jar /deployments