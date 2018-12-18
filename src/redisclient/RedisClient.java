package redisclient;

import java.util.HashMap;

import redis.clients.jedis.Jedis;

public class RedisClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //连接本地的 Redis 服务192.168.47.128
        Jedis jedis = new Jedis("127.0.0.1", 6996);
        
        System.out.println("连接成功");
        //查看服务是否运行
        System.out.println("服务正在运行: "+jedis.ping());
        
        
/*		System.out.println(Long.parseLong("9900121504692063556"));
		System.out.println(3.141516276432547354);*/
	}

}
