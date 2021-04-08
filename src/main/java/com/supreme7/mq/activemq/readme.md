####    1.基于队列的点对点传输类型
队列中数据会平均分配给每一个消费者，且每条信息只能被消费一次


####   2. 基于发布/订阅模式的传输类型
数据广播给每一个订阅的消费者。
发布/订阅模型采用的是主题(Topic)作为消息通讯载体。
该模式类似微信公众号的模式。
发布者发布一条信息，然后将该信息传递给所有的订阅者。
注意：订阅者想要接收到该信息，必须在该信息发布之前订阅。


####   3. 两种模式的对比
 (1) activemq 的实现步骤
  * 建立ConnectionFactory工厂对象，需要填入用户名、密码、连接地址
  * 通过ConnectionFactory对象创建一个Connection连接
  * 通过Connection对象创建Session会话
  * 通过Session对象创建Destination对象；在P2P的模式中，Destination被称作队列（Queue），在Pub/Sub模式中，Destination被称作主题（Topic）
  * 通过Session对象创建消息的发送和接收对象
  * 发送消息
  * 关闭资源
  
（2）  区别-- 创建的Destination对象不同
  P2P模式和Pub/Sub模式，
  在实现上的区别是通过Session创建的Destination对象不一样，
  在P2P的模式中，Destination被称作队列（Queue），
  在Pub/Sub模式中，Destination被称作主题（Topic）