# Tekton CI example: Java, Maven, SonarQube 

## Prerequisites
OpenShift 4.7 or Code Ready Containers (CRC) and CLI installed

## Installation
### Install OpenShift Pipelines Operator
```
oc apply -k https://github.com/redhat-canada-gitops/catalog/openshift-pipelines-operator/overlays/stable
```

### Clone repository:
```
git clone git@github.com:mgubaidullin/tekton-sonarqube.git
cd tekton-sonarqube
```

### Create CI/CD project:
- Namespaces: cicd-tools
- PersistentVolumeClaims: workspace
- ConfigMap: maven-settings-cm
- Pipeline: sample-app-pipeline
```
oc apply -k cluster/cicd
```
Check if SonarQube pods are up and running and Open SonarQube UI is available at http://sonarqube-cicd-tools.apps.hostname

### Create Application project:
- Namespaces: app
- Deployment
- Service
- Route
```
oc apply -k cluster/application
```


## Demo
### Run pipeline
Run sample-app-pipeline
```
oc apply -f cluster/cicd/pipeline-run.yaml
```

### Check results
 - Check Pipeline Runs
 - Check SonarQube UI 
