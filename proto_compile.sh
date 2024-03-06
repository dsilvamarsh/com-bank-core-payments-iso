#protoc  --java_out=./src/main/java/com/bank/core/payments/iso/proto ./src/main/proto/*.proto
export SRC_DIR=./src/main/proto 
export DST_DIR=./src/main/java
#java -jar xsd2thrift/target/xsd2thrift-1.0.jar --protobuf --package=test com-bank-core-payments-iso/src/main/resources/payments_initiation/pain.008.001.10.xsd


java -jar xsd2thrift-1.0.jar --protobuf --filename=./src/main/proto/pain8.proto --package=com.bank.core.payments.iso.proto  src/main/resources/payments_initiation/pain.008.001.10.xsd
protoc -I=$SRC_DIR --java_out=$DST_DIR $SRC_DIR/pain8.proto
