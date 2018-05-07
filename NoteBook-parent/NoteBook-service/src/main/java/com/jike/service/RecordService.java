package com.jike.service;

import java.util.List;

import com.jike.entity.Record;

public interface RecordService {
	Record saveRecord(Record record);

	Record deleteRecord(Integer id);

	Record updateRecord(Record record);

	List<Record> getByUid(Integer uid);

	List<Record> getByUidAndMark(Integer uid, Integer mark);
}
