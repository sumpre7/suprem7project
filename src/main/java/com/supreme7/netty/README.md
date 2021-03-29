### 是什么
1. Netty基于NIO 
2. 简化TCP和UDP等网络编程，并且性能和安全性好

### 演化过程
####   1.BIO
#####  传统阻塞通信流程
###### Java.net(包) 使用Socket进行网络通信，只支持阻塞函数使用。
###### Socket网络通信过程
1. 建立服务端并且监听客户端请求
2. 客户端请求，服务端和客户端建立连接
3. 传递数据
4. 关闭资源

###### 对应服务端过程
1. 创建ServerSocket对象并且绑定IP和端口
2. 通过accept()方法监听客户端请求
3. 建立连接后，通过输入流读取客户端发送的请求信息
4. 通过输出流向客户端发送相应信息
5. 关闭资源

###### 对应客户端过程
1. 创建socket对象，并且连接服务器的IP和端口
2. 建立连接后，通过输出流传送信息
3. 通过输入流，获取服务器响应信息
4. 关闭资源

####   2. NIO
NIO是一种同步非阻塞的I/O模型，Java 1.4后开始引用，提供Channel,
Selector,Buffer等抽象。

NIO 提供了与传统BIO模式中的socket和serversocket相对应
SocketChannel和ServerSocketchannel,
两种通道都支持阻塞和非阻塞模式：
* 阻塞模式： （不使用）
* 非阻塞模式： 对高负载、高并发友好

##### NIO 核心组件解读
* Channel
  NIO 使用Channel通道和Buffer(缓冲区)传输数据
  数据总是从缓冲区写入到通道，并从通道读取到缓冲区
  在面向流到I/O中，可以将数据直接写入或者将数据直接读到Stream对象中。
  在NIO库中，所有数据都通过Buffer处理。
  Channel可以看作Netty的网络操作抽象类，对应于JDK底层的Socket
* Buffer
  
* Selector
  NIO利用Selector（选择器）来监视多个通道的对象。单线程可以监视多个通道中的数据。
* Selection Key 
  Channel注册到Selector中的时候，回返回一个Selection key 对象，Selection Key
  表示一个特定的通道对象和一个特定的选择器对象之间的注册关系。
  
  #### 3.Netty
  1. Netty 是一个基于NIO的client-server框架，使用它可以快速简单地开发网络应用
  2. 简化了TCP和UDP套接字服务器等网络编程，并且性能和安全性更好
  3. 支持多种协议FTP，SMTP，HTTP
  ⚠️：Netty在保持可维护性和性能的情况下，实现易于开发，性能，稳定性和灵活性
  
  ##### 特点：
  ##### 使用场景：



 
