package com.inxedu.os.edu.dao.impl.email;

import com.inxedu.os.common.dao.GenericDaoImpl;
import com.inxedu.os.edu.dao.email.UserEmailMsgDao;
import com.inxedu.os.edu.entity.email.UserEmailMsg;
import org.springframework.common.entity.PageEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 
 * @ClassName  com.yizhilu.os.edu.dao.impl.user.UserEmailMsgDaoImpl
 * @description
 * @author : 
 * @Create Date : 2015年1月6日 下午
 */
@Repository("userEmailMsgDao")
public class UserEmailMsgDaoImpl extends GenericDaoImpl implements UserEmailMsgDao{
	/**
     * 查询记录
     * 
     * @param userEmailMsg
     * @param page
     * @return
     */
    public List<UserEmailMsg> queryUserEmailMsgList(UserEmailMsg userEmailMsg,PageEntity page) {
        return this.queryForListPage("UserEmailMsgMapper.queryUserEmailMsgList", userEmailMsg, page);
    }
    
    /**
     * 获得单个记录
     */
    public UserEmailMsg queryUserEmailMsgById(Long id) {
        return this.selectOne("UserEmailMsgMapper.queryUserEmailMsgById", id);
    }
    
    /**
     * 添加发送用户邮箱记录
     */
    public Long addUserEmailMsg(List<UserEmailMsg> userEmailMsgList) {
        return this.insert("UserEmailMsgMapper.addUserEmailMsg", userEmailMsgList);
    }
    
    /**
     * 更新 UserEmailMsg
     */
    public void updateUserEmailMsgById(UserEmailMsg userEmailMsg){
        this.update("UserEmailMsgMapper.updateUserEmailMsgById",userEmailMsg);
    }
    
    /**
     * 删除发送邮件记录
     */
    public void delUserEmailMsgById(Long id){
        this.delete("UserEmailMsgMapper.delUserEmailMsgById",id);
    }
    
    /**
     * 按条件查询邮箱记录
     */
    public List<UserEmailMsg> queryUserEmailList(UserEmailMsg userEmailMsg){
        return this.selectList("UserEmailMsgMapper.queryUserEmailList", userEmailMsg);
    }
    
    /**
     * 更新邮件为已发送
     */
    public void updateUserEmailStatus(UserEmailMsg userEmailMsg){
        this.update("UserEmailMsgMapper.updateUserEmailStatus",userEmailMsg);
    }
}
