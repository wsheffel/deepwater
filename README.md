# Deep Water

### What it is
* Native implementation of Deep Learning models for GPU-optimized backends (mxnet, Caffe, TensorFlow, etc.)
* State-of-the-art Deep Learning models trained from the H2O Platform
* The next best thing after sliced bread
* Under development

### What it is not
* An oil drilling platform

### Roadmap, Architecture and Demo
Download the [Deep Water overview slides](./architecture/deepwater_overview.pdf).

![](./architecture/deepwater_overview/deepwater_overview.001.jpeg "Deep Water Roadmap")
![architecture](./architecture/deepwater_overview/deepwater_overview.002.jpeg "More Data")
![architecture](./architecture/deepwater_overview/deepwater_overview.003.jpeg "Deep Water Networks")
![architecture](./architecture/deepwater_overview/deepwater_overview.004.jpeg "Deep Water Architecture")
![architecture](./architecture/deepwater_overview/deepwater_overview.005.jpeg "Deep Water Example in Flow")

### Build instructions here:
If you want to use Deep Water in H2O-3, you'll need to have a .jar file that includes backend support for at least one of MXNet, Caffe or TensorFlow.

##### 1. Build mxnet 
[Instructions to build MXNet](https://github.com/h2oai/deepwater/tree/master/mxnet)

##### 2. Build TensorFlow 
[Instructions to build TensorFlow](https://github.com/h2oai/deepwater/tree/master/tensorflow)

##### 3. Build Caffe 
Coming soon.

##### 4. Build H2O Backend Connectors
From the top-level of the deepwater repository, do
```
DEEPWATER=1 ./gradlew build -x test
```

This will create the following file: `build/libs/deepwater-1.0-SNAPSHOT-all.jar`

##### 5. Add DeepWater support to H2O-3
You need to check out the [deepwater branch of h2o-3](http://github.com/h2oai/h2o-3/tree/deepwater/).
Copy this file to h2o-3/h2o-algos/ and to h2o-3/h2o-genmodel/, and modify the two 'build.gradle' files in 'h2o-3/h2o-algos/build.gradle' and 'h2o-3/h2o-genmodel/build.gradle' to point to this jar instead of the default (empty) one:

```
dependencies {
  ...
  // compile 'com.github.h2oai.deepwater:deepwater.backends:master-SNAPSHOT' # <- comment out
  compile files('deepwater-1.0-SNAPSHOT-all.jar')  # <- add this line
}
```

### Java example use cases
Example [Java GPU-enabled unit tests](https://github.com/h2oai/h2o-3/tree/deepwater/h2o-algos/src/test/java/hex/deepwater).

### Python example use cases
Example [Python GPU-enabled unit tests](https://github.com/h2oai/h2o-3/tree/deepwater/h2o-py/tests/testdir_algos/deepwater).

### R example use cases
Coming soon.

### Scala / Sparkling Water example use cases
Coming soon.
