package org.tree.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardVO {

	private long b_code;
	private String b_title;
	private Date b_regdate;
	private long b_hit;
	private String b_img;
	private String b_content;
	private String username;
	
}
