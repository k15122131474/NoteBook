package com.jike.dao;

import java.util.List;

import com.jike.entity.Record;

public interface RecordDao {
	Record getById(Integer id);

	List<Record> getByUid(Integer uid);

	List<Record> getByUidAndMark(Record record);

	Integer insertRecord(Record record);

	Integer updateRecord(Record record);
}
