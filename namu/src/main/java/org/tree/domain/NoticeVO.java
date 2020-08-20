package org.tree.domain;

import java.util.Date;

import lombok.Data;

@Data
public class NoticeVO {

	private long n_code;
	private String n_title;
	private Date n_regdate;
	private long hit;
	private String n_img;
	private String n_content;
	
}