import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

public class ManageStudents{


  public static void main(String[] args) {
      Session session = HibernateUtil.getSessionFactory().openSession();

      session.beginTransaction();

      StudentPOJO student = new StudentPOJO();

      student.setStName("sms"+(int) (Math.random()*100));
      student.setStAddress("Nagole"+(int) (Math.random()*100));

      session.save(student);

      session.flush();

      session.getTransaction().commit();

      // Query to list students in the database
      Query q = session.createQuery("From StudentPOJO ");

      List<StudentPOJO> stuList = q.list();

      System.out.println("Number of students: "+stuList.size());

      for (StudentPOJO studentPOJO: stuList ){
          System.out.println("Student: "+studentPOJO.getStName());
      }

      HibernateUtil.shutdown();
      
  }

}
