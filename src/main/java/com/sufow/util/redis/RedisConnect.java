package com.sufow.util.redis;

import redis.clients.jedis.Jedis;

public class RedisConnect {
	public static void main(String[] args) {
		//连接本地的 Redis 服务
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("192.168.10.130");
		System.out.println(jedis.getClient().getPort());
		//查看服务是否运行
		System.out.println("服务正在运行: "+jedis.ping());
		// redis-server
		// redis-cli
	}
}
