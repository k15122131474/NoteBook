package com.jike.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.jike.entity.Record;
import com.jike.service.RecordService;

@Controller
public class RecordController {
	@Autowired
	private RecordService recordService;

	@RequestMapping(value = "saveRecord")
	@ResponseBody
	public String saveRecord(Record record) {
		System.out.println("hello world");
		System.out.println(record);
		Record saveRecord = recordService.saveRecord(record);
		String jsonString = JSON.toJSONString(saveRecord);
		return jsonString;
	}

	@RequestMapping(value = "deleteRecord")
	@ResponseBody
	public String deleteRecord(Integer id) {
		System.out.println("hello world");
		Record saveRecord = recordService.deleteRecord(id);
		String jsonString = JSON.toJSONString(saveRecord);
		return jsonString;
	}

	@RequestMapping(value = "updateRecord")
	@ResponseBody
	public String updateRecord(Record record) {
		System.out.println("hello world");
		System.out.println(record);
		Record saveRecord = recordService.updateRecord(record);
		String jsonString = JSON.toJSONString(saveRecord);
		return jsonString;
	}

	@RequestMapping(value = "getByUidAndMark")
	@ResponseBody
	public String getByUidAndMark(Record record) {
		System.out.println("hello world");
		System.out.println(record);
		List<Record> saveRecord = recordService.getByUidAndMark(record.getUid(), record.getMark());
		String jsonString = JSON.toJSONString(saveRecord);
		return jsonString;
	}

	@RequestMapping(value = "getByUid")
	@ResponseBody
	public String getByUid(Integer uid) {
		System.out.println("hello world");
		List<Record> saveRecord = recordService.getByUid(uid);
		String jsonString = JSON.toJSONString(saveRecord);
		return jsonString;
	}

	public RecordService getRecordService() {
		return recordService;
	}

	public void setRecordService(RecordService recordService) {
		this.recordService = recordService;
	}
	
}
