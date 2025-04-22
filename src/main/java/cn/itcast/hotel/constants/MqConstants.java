package cn.itcast.hotel.constants;

/**
 * @Author: Faruk
 * @CreateTime: 2025-04-22  10:30
 * @Description: 使用Mq的各种常数
 * @Version: 1.0
 */
public class MqConstants {
    //交换机名称
    public static final String HOTEL_EXCHANGE="hotel.exchange";
    //队列名称,添加队列
    public static final  String HOTEL_INSERT_QUEUE="hotel.insert.queue";
    //队列名称，删除队列
    public static final String HOTEL_DELETE_QUEUE="hotel.delete.queue";
    //routingKey:添加
    public static final String HOTEL_DELETE="hotel.delete";
    //routingKey:删除
    public static final String HOTEL_INSERT="hotel.insert";
}
