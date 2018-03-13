package edu.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_COLOR_BURNPeer;

import edu.domain.CarOpDataBean;
import edu.domain.DriverBean;
import edu.model.Page;
import edu.service.DriveManageService;

@Controller
public class DriveManageController {
	@Resource
	DriveManageService driveManageService;
	@Resource
	HttpServletRequest req;
	
	@ResponseBody
	@RequestMapping(value = "/getDriverInfo.action")
	public String getGuaInfo(HttpServletResponse response) {
		
		String teamNum=req.getParameter("teamNum");
		String keyword=req.getParameter("keyword");
		int offset=Integer.parseInt(req.getParameter("offset"));
		int limit=Integer.parseInt(req.getParameter("limit"));
		
		System.out.println(limit);
		System.out.println(offset);
		System.out.println(teamNum);
		System.out.println(keyword);
		
		List<DriverBean> temp=null;
		if((keyword==null||keyword.equals(""))&&teamNum.equals("all")){
			System.out.println("1");
			temp=driveManageService.getAllDriverInfo();
		}else if((keyword==null||keyword.equals(""))&&!teamNum.equals("all")){
			System.out.println("2");
			temp=driveManageService.getDriverInfoByTeamNum(teamNum);
		}else if(!keyword.equals("")&&teamNum.equals("all")){
			System.out.println("3");
			temp=driveManageService.getDriverInfoByNameOrNum(keyword);
		}else if(!keyword.equals("")&&!teamNum.equals("all")){
			System.out.println("4");
			temp=driveManageService.getDriverInfoByBoth(teamNum, keyword);
		}
		
		List<DriverBean> result=new ArrayList<DriverBean>();
		
		int max=temp.size();
		if(max>(offset+limit)){
			max=offset+limit;
		}
		
	    for(int i=offset;i<max;i++){
	    	result.add(temp.get(i));
	    }
		Page page = new Page();
		page.setRows(result);
		page.setTotal(temp.size());
		Gson gson=new Gson();
		String jsonResult = gson.toJson(page);
		System.out.println(jsonResult);
		return jsonResult;
	}
	
	@ResponseBody
	@RequestMapping(value = "/modifyDriverInfo.action")
	public String modifyDriverInfo(HttpServletResponse response) {
		// driverNum, motorcadeNum, carNum, driverName,driverSex,driverPhone,driverPosition
		String driverNum=req.getParameter("driverNum");
		String motorcadeNum=req.getParameter("motorcadeNum");
		String carNum=req.getParameter("carNum");
		String driverName=req.getParameter("driverName");
	    int driverSex=Integer.parseInt(req.getParameter("driverSex"));
	    String driverPhone=req.getParameter("driverPhone");
	    String driverPosition=req.getParameter("driverPosition");
	    
	    
		System.out.println(driverNum);
		System.out.println(motorcadeNum);
		System.out.println(carNum);
		System.out.println(driverName);
		System.out.println(driverSex);
		System.out.println(driverPhone);
		System.out.println(driverPosition);
		
		DriverBean db=new DriverBean(driverNum, motorcadeNum, carNum, driverName,driverSex,driverPhone,driverPosition);
		
		driveManageService.mofidyDriverInfo_service(db);
		
		String temp="修改成功！";
		
		return temp;
		
	}
	
	@ResponseBody
	@RequestMapping(value = "/delDriverInfo.action")
	public String delDriverInfo(HttpServletResponse response) {
		
		String driverNum=req.getParameter("driverNum");
		System.out.println(driverNum);
		driveManageService.delDriverInfo_service(driverNum);
		
		String temp="修改成功！";
		
		return temp;
	}
	
	@ResponseBody
	@RequestMapping(value = "/addDriverInfo.action")
	public String addDriverInfo(HttpServletResponse response) {
		
		String driverNum=req.getParameter("driverNum");
		String motorcadeNum=req.getParameter("motorcadeNum");
		String carNum=req.getParameter("carNum");
		String driverName=req.getParameter("driverName");
	    int driverSex=Integer.parseInt(req.getParameter("driverSex"));
	    String driverPhone=req.getParameter("driverPhone");
	    String driverPosition=req.getParameter("driverPosition");
	    
	    
		System.out.println(driverNum);
		System.out.println(motorcadeNum);
		System.out.println(carNum);
		System.out.println(driverName);
		System.out.println(driverSex);
		System.out.println(driverPhone);
		System.out.println(driverPosition);
		
		DriverBean db=new DriverBean(driverNum, motorcadeNum, carNum, driverName,driverSex,driverPhone,driverPosition);
		
		driveManageService.addDriverInfo_service(db);
		
		String temp="修改成功！";
		
		return temp;
	}
	
	@ResponseBody
	@RequestMapping(value = "/driveEventManage.action")
	public String getDriveEventInfo(HttpServletResponse response) {
		
		String driveEvent=req.getParameter("driveEvent");
		String startDate=req.getParameter("startDate");
		String endDate=req.getParameter("endDate");
		String keyword=req.getParameter("keyword");
		
		System.out.println(driveEvent);
		System.out.println(startDate);
        System.out.println(endDate);
        System.out.println(keyword);
        
        if(endDate==null){
      		 
        	   java.util.Date date=new  java.util.Date();
        	   SimpleDateFormat sdf=new  SimpleDateFormat("yyyy-MM-dd");
        	   endDate=sdf.format(date);
        	   System.out.println(endDate);
        }
        
        if(driveEvent.equals("overSpeed")){
        	
        }else if(driveEvent.equals("overLoad")){
        	
        }else if(driveEvent.equals("collision")){
        	
        }else{
         
        }
		
		List<DriverBean> temp=null;
		if((keyword==null||keyword.equals(""))&&teamNum.equals("all")){
			System.out.println("1");
			temp=driveManageService.getAllDriverInfo();
		}else if((keyword==null||keyword.equals(""))&&!teamNum.equals("all")){
			System.out.println("2");
			temp=driveManageService.getDriverInfoByTeamNum(teamNum);
		}else if(!keyword.equals("")&&teamNum.equals("all")){
			System.out.println("3");
			temp=driveManageService.getDriverInfoByNameOrNum(keyword);
		}else if(!keyword.equals("")&&!teamNum.equals("all")){
			System.out.println("4");
			temp=driveManageService.getDriverInfoByBoth(teamNum, keyword);
		}
		
		List<DriverBean> result=new ArrayList<DriverBean>();
		
		int max=temp.size();
		if(max>(offset+limit)){
			max=offset+limit;
		}
		
	    for(int i=offset;i<max;i++){
	    	result.add(temp.get(i));
	    }
		Page page = new Page();
		page.setRows(result);
		page.setTotal(temp.size());
		Gson gson=new Gson();
		String jsonResult = gson.toJson(page);
		System.out.println(jsonResult);
		return jsonResult;
	}
}