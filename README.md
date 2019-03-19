# redis-rocketmq
spring-boot2整合RocketMQ4.4

### 1.搭建RocketMQ环境
 到http://rocketmq.apache.org/release_notes/release-notes-4.4.0/下载source版本的
 解压之后
  > unzip rocketmq-all-4.4.0-source-release.zip
  > cd rocketmq-all-4.4.0/
  > mvn -Prelease-all -DskipTests clean install -U
进入distribution/target目录，拷贝程序，楼主这边是linux下同所以把apache-rocketmq.tar.gz上传到服务器
  解压之后
  执行Start Name Server
```
  > nohup sh bin/mqnamesrv &
  > tail -f ~/logs/rocketmqlogs/namesrv.log
  The Name Server boot success...
```
  启动Start Broker
```
  > nohup sh bin/mqbroker -n localhost:9876 &
  > tail -f ~/logs/rocketmqlogs/broker.log 
  The broker[%s, 127.0.0.1:10911] boot success...
```
### 2.创建所需的Topic
```
bash bin/mqadmin updateTopic -b localhost:10911 -t string-topic
bash bin/mqadmin updateTopic -b localhost:10911 -t order-paid-topic
bash bin/mqadmin updateTopic -b localhost:10911 -t message-ext-topic
bash bin/mqadmin updateTopic -b localhost:10911 -t spring-transaction-topic
```
