package com.sufow.util.redis;

import redis.clients.jedis.Jedis;

public class RedisConnect {
	public static void main(String[] args) {
		//���ӱ��ص� Redis ����
		@SuppressWarnings("resource")
		Jedis jedis = new Jedis("192.168.10.130");
		System.out.println(jedis.getClient().getPort());
		//�鿴�����Ƿ�����
		System.out.println("������������: "+jedis.ping());
		// redis-server
		// redis-cli
	}
}
