import org.hibernate.Session;

public class ManageStudents{


  public static void main(String[] args) {
      Session session = HibernateUtil.getSessionFactory().openSession();

      session.beginTransaction();

      StudentPOJO student = new StudentPOJO();

      student.setStNo(1);
      student.setStName("sms");
      student.setStAddress("Nagole");

      session.save(student);

      session.getTransaction().commit();
      
  }

}
