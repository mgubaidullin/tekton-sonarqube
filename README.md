# Tekton CI example: Java, Maven, SonarQube 

## Prerequisites
OpenShift 4.7 or Code Ready Containers (CRC) and CLI installed

## Installation
### Install OpenShift Pipelines Operator
```
oc apply -k https://github.com/redhat-canada-gitops/catalog/openshift-pipelines-operator/overlays/stable
```

### Prepare environment
Following command creates:
- Namespaces: cicd-tools and app
- PersistentVolumeClaims: workspace
- ConfigMap: maven-settings-cm
- Pipeline: sample-app-pipeline

```
git clone git@github.com:mgubaidullin/tekton-sonarqube.git
cd tekton-sonarqube
oc apply -k environment
```

## Demo
### Run pipeline
Run sample-app-pipeline
```
```
### Check results
 - Check Pipeline Runs
 - Open SonarQube UI http://sonarqube-cicd-tools.apps.hostname