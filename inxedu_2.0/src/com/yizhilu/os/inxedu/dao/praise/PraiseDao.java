package com.yizhilu.os.inxedu.dao.praise;

import com.yizhilu.os.inxedu.entity.praise.Praise;

/**
 * 点赞管理接口
 *
 */
public interface PraiseDao {
	/**
	 * 添加点赞记录
	 */
	public Long addPraise(Praise praise);
	
	/**
	 * 根据条件查询点赞数
	 */
	public int queryPraiseCount(Praise praise);
}
