package com.xt.core;

/**
 * 负责java类型和数据库类型的相互转化
 * @author xiatao
 *
 */
public interface TypeConvertor {
	/**
	 * 将数据库数据类型转化成java的数据类型
	 * @param columnType 数据库字段的数据类型
	 * @return java的数据类型
	 */
	public String databaseType2JavaType(String columnType);
	
	/**
	 * 将java的数据类型转化成数据库类型
	 * @param javaType java数据类型
	 * @return 数据库数据类型
	 */
	public String javaType2DatabaseType(String javaType);
}
