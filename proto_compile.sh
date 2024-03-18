export SRC_DIR=./src/main/resources/pain_008_001_10
export DST_DIR=./src/main/java
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/*.proto
