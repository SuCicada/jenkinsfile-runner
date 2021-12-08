#!/bin/bash
set -e
cd "$(dirname "$0")"/ || exit

#mvn clean package -Dmaven.test.skip=true -P package-vanilla

tar_dir=jenkinsfile-runner
plugins=dist/target/$tar_dir/plugins
jar_dir=dist/target/$tar_dir/jar
mkdir -p $plugins
mkdir -p $jar_dir
cp vanilla-package/target/plugins/*.hpi $plugins
for f in "$plugins"/*.hpi; do
  mv -- "$f" "${f%.hpi}.jpi"
done
cp dist/target/jenkinsfile-runner.jar $jar_dir
cp dist/src/main/resources/jenkinsfile-runner dist/target/$tar_dir

cd dist/target/ && tar zcvf $tar_dir.tar.gz $tar_dir
