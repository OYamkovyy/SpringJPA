package com.yamkoviy.jpa.workers;

import org.springframework.beans.factory.annotation.Autowired;

import com.yamkoviy.jpa.dao.LectureDao;
import com.yamkoviy.jpa.data.Lecture;

public class LecturesWorker {
	@Autowired
	LectureDao lecturesDao;
	public Lecture addLecture(Lecture lecture){
	lecture = lecturesDao.addLecture(lecture);
	System.out.println(lecture);
	return lecture;
	}

}
