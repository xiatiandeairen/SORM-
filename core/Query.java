package com.xt.core;

import java.util.List;

/**负责查询
 * @author xiatao
 *
 */
@SuppressWarnings("all")
public interface Query {
	/**
	 * 直接执行一个DML语句
	 * @param sql sql语句
	 * @param params 参数
	 * @return 执行sql语句后影响记录的行数
	 */
	public int executeDML(String sql,Object[] params) ;
	
	/**将一个对象存储到数据库中
	 * @param obj 存储对象
	 */
	public void insert(Object obj);
	
	/**
	 * 删除clazz表示类对应的表中的记录
	 * @param clazz 与表对应的类对象
	 * @param id 主键的值
	 */
	public void delete(Class clazz,int id);
	
	/**
	 * 删除对象对应的表中数据
	 * @param obj 记录所对应的对象
	 */
	public void delete(Object obj);
	
	/**
	 * 更新对象对应的数据，并且只更新字段的值
	 * @param obj 对象
	 * @param fieldnames 更新的属性列表
	 * @return
	 */
	public int update(Object obj,String[] fieldnames);//update user set username=? and password=?
	
	/**
	 * 查询返回多行数据，并将每行记录封装到clazz指定的类对象
	 * @param sql sql查询语句
	 * @param clazz 封装数据的javabean对象
	 * @param params sql的参数
	 * @return 查询到的结果
	 */
	public List queryRows(String sql,Class clazz,Object[] params);
	
	/**
	 * 查询返回一行数据，并将每行记录封装到clazz指定的类对象
	 * @param sql sql查询语句
	 * @param clazz 封装数据的javabean对象
	 * @param params sql的参数
	 * @return 查询到的结果
	 */
	public Object queryUniqueRow(String sql,Class clazz,Object[] params);
	
	/**
	 * 查询返回一个值（一行一列）,并将值返回
	 * @param sql 查询语句
	 * @param params sql参数
	 * @return 查询到的结果
	 */
	public Object queryValue(String sql,Object[] params);
	
	/**
	 * 查询返回一个数字（一行一列）,并将值返回
	 * @param sql 查询语句
	 * @param params sql参数
	 * @return 查询到的结果
	 */
	public Number queryNumber(String sql,Object[] params);
}
