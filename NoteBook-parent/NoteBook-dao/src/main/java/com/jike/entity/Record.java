package com.jike.entity;

import java.util.Date;

public class Record {
	private Integer id;
	private Integer uid;
	private Date rtime;
	private String text;
	private Integer mark;
	private Integer sign;

	public Record() {
		super();
	}

	public Record(Integer uid, Date rtime, String text, Integer mark, Integer sign) {
		super();
		this.uid = uid;
		this.rtime = rtime;
		this.text = text;
		this.mark = mark;
		this.sign = sign;
	}

	public Record(Integer uid, Date rtime, String text, Integer mark) {
		super();
		this.uid = uid;
		this.rtime = rtime;
		this.text = text;
		this.mark = mark;
	}

	public Record(Integer id, Integer uid, Date rtime, String text, Integer mark, Integer sign) {
		super();
		this.id = id;
		this.uid = uid;
		this.rtime = rtime;
		this.text = text;
		this.mark = mark;
		this.sign = sign;
	}

	public Record(Integer uid, Integer mark) {
		super();
		this.uid = uid;
		this.mark = mark;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public Date getRtime() {
		return rtime;
	}

	public void setRtime(Date rtime) {
		this.rtime = rtime;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getMark() {
		return mark;
	}

	public void setMark(Integer mark) {
		this.mark = mark;
	}

	public Integer getSign() {
		return sign;
	}

	public void setSign(Integer sign) {
		this.sign = sign;
	}

	@Override
	public String toString() {
		return "Record [id=" + id + ", uid=" + uid + ", rtime=" + rtime + ", text=" + text + ", mark=" + mark + "]";
	}

	

}
