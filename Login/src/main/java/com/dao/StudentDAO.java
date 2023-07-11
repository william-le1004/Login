package com.dao;

import com.hibernate.HibernateUltils;
import com.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.ArrayList;

public class StudentDAO implements DAO<Student> {

    public static StudentDAO getInstance() {
        return new StudentDAO();
    }

    @Override
    public int insert(Student t) {
        try {
            Session session = HibernateUltils.getSessionFactory().openSession();
            org.hibernate.Transaction ts = session.beginTransaction();
            session.save(t);
            ts.commit();
            System.out.println("Done !!");
            session.close();
        } catch (HibernateException e) {
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Student t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int delete(Student t) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public ArrayList<Student> selectAll() {
        Session session = HibernateUltils.getSessionFactory().openSession();
        return (ArrayList<Student>) session.createQuery(" FROM Student c").list();
    }


    @Override
    public Student selectByCondition(String condition) {
        //Student cats = new ;
//		try {
//			Session session = HibernateUltils.getSessionFactory().openSession();
//			Transaction ts = session.beginTransaction();
//			cats = session.get(Cat.class, condition);
//			cats = session.get(, session);
//			System.out.println("Select Successfully !!");
//			session.close();
//		} catch (HibernateException e) {
//			e.printStackTrace();
//		}
        return null;
    }

    @Override
    public ArrayList<Student> selectByTime() {
        return null;
    }

    @Override
    public boolean checkLogin(String username, String password) {
        String hql = "from Student s WHERE s.studentName = :student_name and s.password = :student_password";
        Session session = HibernateUltils.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        query.setParameter("student_name", username);
        query.setParameter("student_password", password);
        ArrayList<Student> emp = (ArrayList<Student>) query.list();
        for (Student student : emp) {
            if (student.getStudentName().equals(username) && student.getPassword().equals(password))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(StudentDAO.getInstance().selectAll());
        System.out.println(StudentDAO.getInstance().checkLogin("dasf","312")==true);
    }

//	public static void main(String[] args) {
//
//		System.out.println(StudentDAO.getInstance().checkLogin("kien","1234"));
//
//		String hql = "from Student s WHERE s.studentName = :student_name ";
//		Session session = HibernateUltils.getSessionFactory().openSession();
//		Query query = session.createQuery(hql);
//		query.setParameter("student_name","kien");
//		ArrayList<Student> emp = (ArrayList<Student>) query.list();
//		for (Student student : emp) {
//
//		System.out.println(student.getStudentName());
//		}
//
//
//	}
}
