package com.yamkoviy.jpa.dao;

import com.yamkoviy.jpa.data.Lecture;

public interface LectureDao {
	Lecture addLecture(Lecture lecture);

	Lecture getLecture(int id);

	void saveLecture(Lecture lecture);

}
