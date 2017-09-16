package com.wrw.eduonline.shiro.dao;

import java.util.List;

import com.wrw.eduonline.common.dao.BaseDao;
import com.wrw.eduonline.shiro.entity.SysRoleEntity;

public interface SysRoleDao extends BaseDao<SysRoleEntity>{
    
	/**
	 * 查询用户创建的角色ID列表
	 */
	List<Long> queryRoleIdList(Long createUserId);
}