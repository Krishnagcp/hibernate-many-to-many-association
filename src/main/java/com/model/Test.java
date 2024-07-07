package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;


public class Test {

	public static void main(String[] args) {

		Transaction tr;
		try(Session ses=HBUtil.getSessionFactory().openSession()){
			tr = ses.beginTransaction();
			Answer a1= new Answer();
			a1.setAnswer("First answer");
			a1.setPostedBy("Ramesh");
			Answer a2= new Answer("second answer","Sumesh");
			List<Answer> li= new ArrayList<Answer>();
			li.add(a1);li.add(a2);
			Question q1= new Question();
			q1.setQuestion("FirstQuestion");
			q1.setAnswers(li);
			ses.merge(q1);
			tr.commit();
			ses.close();
		}
	}

}
