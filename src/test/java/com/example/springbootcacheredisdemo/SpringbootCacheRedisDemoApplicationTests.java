package com.example.springbootcacheredisdemo;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootCacheRedisDemoApplication.class)
public class SpringbootCacheRedisDemoApplicationTests {
	@Autowired
	private TestCacheService testCacheService;

	@Autowired
	private StringRedisTemplate stringRedisTemplate;

	// @Autowired
	// private RedisTemplate<String, UserRedis> redisTemplate;
	


	@Test
	public void testRedis() throws Exception {
		// 保存字符串
		stringRedisTemplate.opsForValue().set("aaa", "111");
		Assert.assertEquals("111", stringRedisTemplate.opsForValue().get("aaa"));
	}

	@Test
	public void test() {
		String id = "test-id";
		System.out.println("第一次访问没有缓存--------");
		long oneNow = System.currentTimeMillis();
		System.out.println(testCacheService.testCache(id));
		System.out.println("耗时:" + (System.currentTimeMillis() - oneNow) + "ms");

		System.out.println("第二次访问有缓存--------");
		long twoNow = System.currentTimeMillis();
		System.out.println(testCacheService.testCache(id));
		System.out.println("耗时:" + (System.currentTimeMillis() - twoNow) + "ms");

		System.out.println("更新缓存信息--------");
		long threeNow = System.currentTimeMillis();
		System.out.println(testCacheService.testCachePut(id));
		System.out.println("耗时:" + (System.currentTimeMillis() - threeNow) + "ms");

		System.out.println("获取更新后的缓存信息-------");
		long fourNow = System.currentTimeMillis();
		System.out.println(testCacheService.testCache(id));
		System.out.println("耗时:" + (System.currentTimeMillis() - fourNow) + "ms");

		System.out.println("移除缓存------并且调用testCache方法");
		testCacheService.removeCache(id);
		long fiveNow = System.currentTimeMillis();
		System.out.println(testCacheService.testCache(id));
		System.out.println("耗时:" + (System.currentTimeMillis() - fiveNow) + "ms");
	}

}
