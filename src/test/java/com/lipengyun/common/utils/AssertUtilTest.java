package com.lipengyun.common.utils;

import static org.junit.Assert.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class AssertUtilTest {

	/**
	 *  测试方法断言为真，如果为假，则抛出自定义异常
	 * @Title: testIsTrue 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testIsTrue() {
		 AssertUtil.isTrue(1>0, "这个是假的");
	}

	/**
	 * 断言为假，如果为真，则抛出自定义异常
	 * @Title: testIsFalse 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testIsFalse() {
		 AssertUtil.isFalse(-1>0, "这个是真的");
	}

	/**
	 * 断言对象不为空，如果为空，则抛出自定义异常
	 * @Title: testNotNull 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testNotNull() {
		Object obj = "1";
		 AssertUtil.notNull(obj, "对象为空");
	}

	/**
	 * 断言对象必须空，如果不为空，则抛出自定义异常
	 * @Title: testIsNull 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testIsNull() {
		Object obj = "1";
		 AssertUtil.isNull(obj, "对象不为空");
	}

	/**
	 * 断言集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常
	 * @Title: testNotEmptyCollectionOfQString 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testNotEmptyCollectionOfQString() {
		 Set set = new HashSet<>();
		 set.add(1);
		 AssertUtil.notEmpty(set, "这个集合里面什么都没有");
	}

	/**
	 *  断言Map集合不为空，对象不能空，以及必须包含1个元素。如果为空，则抛出自定义异常
	 * @Title: testNotEmptyMapOfQQString 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testNotEmptyMapOfQQString() {
		Map map = new HashMap<>();
		map.put("1",1);
		map.clear();
		AssertUtil.notEmpty(map, "集合不能为空");
	}

	/**
	 * 断言字符串必须有值，去掉空格，然后判断字符串长度是否大于0，如果没值，则抛出自定义异常
	 * @Title: testHasText 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testHasText() {
		 String str=" 111";
		 AssertUtil.hasText(str, "当前字符串没有值");
	}

	/**
	 * 断言值必须大于0，如果小于或等于0，则抛出自定义异常
	 * @Title: testGreaterThanZero 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testGreaterThanZero() {
		BigDecimal value = new BigDecimal(-1);
		
		 AssertUtil.greaterThanZero(value, "该值必须大于0");
	}

}
