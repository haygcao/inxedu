package com.inxedu.os.entity.website;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/** 推荐课程DTO */
@Data
@EqualsAndHashCode(callSuper = false)
public class WebsiteCourseDetailDTO extends WebsiteCourseDetail implements Serializable {
	private static final long serialVersionUID = 7475674095165175841L;
	private String recommendName;//推荐名称
	private String courseName;//课程名称
	private int isavaliable;//课程是否下架
}