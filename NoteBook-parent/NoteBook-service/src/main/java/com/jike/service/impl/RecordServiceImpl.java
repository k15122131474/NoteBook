package com.jike.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jike.dao.AccountInfoDao;
import com.jike.dao.RecordDao;
import com.jike.entity.AccountInfo;
import com.jike.entity.Record;
import com.jike.service.AccountInfoService;
import com.jike.service.RecordService;

@Service("recordService")
public class RecordServiceImpl implements RecordService {
	@Autowired
	public RecordDao recordDao;

	@Override
	public Record saveRecord(Record record) {
		record.setRtime(new Date());
		recordDao.insertRecord(record);
		return record;
	}

	@Override
	public Record deleteRecord(Integer id) {
		Record byId = recordDao.getById(id);
		recordDao.updateRecord(byId);
		return byId;
	}

	@Override
	public Record updateRecord(Record record) {
		recordDao.updateRecord(record);
		return record;
	}

	@Override
	public List<Record> getByUid(Integer uid) {
		return recordDao.getByUid(uid);
	}

	@Override
	public List<Record> getByUidAndMark(Integer uid, Integer mark) {
		Record record = new Record(uid, mark);
		return recordDao.getByUidAndMark(record);
	}

}
