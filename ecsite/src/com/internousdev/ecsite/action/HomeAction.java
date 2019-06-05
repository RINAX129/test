package com.internousdev.ecsite.action;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

/*
import com.opensymphony.xwork2.ActionSupport;
import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.internousdev.ecsite.dao.BuyItemDAO;
import com.internousdev.ecsite.dto.BuyItemDTO;
*/

public class HomeAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String excute(){
		String result = "login";
		if(session.containsKey("llogin_user_id")){
			BuyItemDAO buyItemDAO =new BuyItemDAO();
			BuyItemDTO buyItemDTO = new buyItemDAO.getBuyItemInfo();
			session.put("id", buyItemDTO.getId());
			session.put("buyItem_name", buyItemDTO.getItem());
			session.put("buyItem_price",buyItemDTO.getItemPrice());

			result = SUCCESS;
		}

		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public Map<String,Object> getSession(){
		return this.session;
	}
}
