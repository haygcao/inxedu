package com.yizhilu.os.inxedu.dao.impl.order;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.yizhilu.os.inxedu.common.dao.GenericDaoImpl;
import com.yizhilu.os.inxedu.common.entity.PageEntity;
import com.yizhilu.os.inxedu.dao.order.OrderDao;
import com.yizhilu.os.inxedu.entity.order.Order;
import com.yizhilu.os.inxedu.entity.order.QueryOrder;

@Repository("orderDao")
public class OrderDaoImpl extends GenericDaoImpl implements OrderDao {

    public int createOrder(Order order) {
        this.insert("OrderMapper.createOrder", order);
        return order.getOrderId();
    }

    public void updateOrderSuccess(Order order) {
        this.update("OrderMapper.updateOrderSuccess", order);

    }


    public void updateOrderState(Order order) {
        this.update("OrderMapper.updateOrderState", order);
    }


    public List<Map<String, Object>> queryOrderListPage(QueryOrder query, PageEntity page) {
        return this.queryForListPage("OrderMapper.queryOrderListPage", query, page);
    }

    public int checkUserCursePay(Map<String, Object> map) {
        return this.selectOne("OrderMapper.checkUserCursePay", map);
    }

    public int queryOrderStateCount(Order order) {
        return this.selectOne("OrderMapper.queryOrderStateCount", order);
    }


    public Order queryOrderById(int orderId) {
        return this.selectOne("OrderMapper.queryOrderById", orderId);
    }
    /**
     * 根据条件查询订单数量
     */
    public int queryOrderCount(Order order){
        return this.selectOne("OrderMapper.queryOrderCount", order);
    }
	/**
	 * 根据条件查询订单
	 */
	public List<Order> queryOrder(Order order){
		 return this.selectList("OrderMapper.queryOrder", order);
	}
}
