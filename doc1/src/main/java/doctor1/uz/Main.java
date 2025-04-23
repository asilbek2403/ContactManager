package doctor1.uz;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome!\n");
        StandardServiceRegistry vov= new StandardServiceRegistryBuilder().configure("spring-config.xml").build();
        Metadata meta = new MetadataSources(vov).getMetadataBuilder().build();
        SessionFactory sef= meta.getSessionFactoryBuilder().build();
        Session session=sef.openSession();
        Transaction tx=session.beginTransaction();

//        StudentEntity student1= new StudentEntity();
//        student1.setName("John");
//        student1.setSurname("Khan");
//        student1.setAge(23);
//        session.save(student1); onetoone uchun edi
//
//        StudentEntity student2= new StudentEntity();
//        student2.setName("Uik");
//        student2.setSurname("Yalmog'iz");
//        student2.setAge(53);

//        StudentEntity student=new StudentEntity();
//        student.setName("James");
//        student.setEmail("james@gmail.com");
//        student.setSurname("Smith");
//        student.setAge(99);
//        session.save(student);
//student,address,ad2 ManytoOne
//        Address address = new Address();
//        address.setCityName("NyuW York");
//        address.setHomeNumber("33");
//        address.setStreetName("Khanaa");
////        address.setStudent(student1); onetoone
//        address.setStudent(student);
//        session.save(address);
//
//        Address address2 = new Address();
//        address2.setCityName("Uzuklar hukmdori");
//        address2.setHomeNumber("23");
//        address2.setStreetName("Beggins");
////        address2.setStudent(student2);
//        address2.setStudent(student);
//        session.save(address2);

        //MXMany
        Address ads=new Address();
        ads.setCityName("Ang");
        ads.setStreetName("Main Street");
        ads.setHomeNumber("9");
        session.save(ads);

        Address ads1=new Address();
        ads1.setCityName("Bri");
        ads1.setStreetName("Gamburg Street");
        ads1.setHomeNumber("4");
        session.save(ads1);

        Address ads2=new Address();
        ads2.setCityName("Kolumb");
        ads2.setStreetName("Matreet");
        ads2.setHomeNumber("39");
        session.save(ads2);

        StudentEntity s=new StudentEntity();
        s.setName("MrBin");
        s.setSurname("BinM");
        s.setAge(66);
        s.setEmail("binbin@binbin.com");
        List<Address> addressl=new ArrayList<>();
        addressl.add(ads);
        addressl.add(ads1);
        addressl.add(ads2);
        s.setAddressl(addressl);
        session.save(s);

        StudentEntity s2=new StudentEntity();
        s2.setName("MrMatritsa");
        s2.setSurname("BMV");
        s2.setAge(36);
        s2.setEmail("MAtrix@binbin.com");
        List<Address> addressl2=new ArrayList<>();
        addressl2.add(ads);
        addressl2.add(ads1);
        s2.setAddressl(addressl2);
        session.save(s2);
//TepasiMAnyXMAny uchun





//Strong ishimiz|||
//        StudentEntity student2= new StudentEntity();
//        student2.setName("Uik");
//        student2.setSurname("Yalmog'iz");
//        student2.setAge(53);
//        student2.setEmail("OneToMany@gmail.com");
//        List<Address> addressList= new ArrayList<>();
//        addressList.add(address);
//        addressList.add(address2);
//        student2.setAddress(addressList);
//        session.save(student2);
//OneTOMany ishimizda bitta studentga kop uyning manzilini berib yubordik

        tx.commit();


        sef.close();
        session.close();
//        hbInsertPract();
//        hbInsertStud();
    }
        public static void hbInsertPract(){
            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("spring-config.xml").build();

            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
            SessionFactory factory = meta.getSessionFactoryBuilder().build();


            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            PracticEntity st1 = new PracticEntity();
//        st1.setId(1);
//        st1.setAge(20);
//        st1.setName("Jack");
//        st1.setSurname("Qaroqchi");

//        st1.setId(2);
//        st1.setAge(20);
//        st1.setName("Karib");
//        st1.setSurname("Qaroqchilari");

            //st1.setId(3);  serialda create>><<update ddl qism
            st1.setName("KaribNil");
            st1.setSurname("QaroqchilariD");

            session.save(st1);
            tx.commit();

            session.close();//Hibernate baza bilan aloqasini yopadi . boshqalar boglanishin uchun
            factory.close();
        }

        public static void hbInsertStud(){
            StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("spring-config.xml").build();

            Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
            SessionFactory factory = meta.getSessionFactoryBuilder().build();


            Session session = factory.openSession();
            Transaction tx = session.beginTransaction();

            StudentEntity st1 = new StudentEntity();
//        st1.setId(1);
//        st1.setAge(20);
//        st1.setName("Jack");
//        st1.setSurname("Qaroqchi");

//        st1.setId(2);
        st1.setAge(20);
        st1.setName("Karib");
        st1.setSurname("Qaroqchilari");

            //st1.setId(3);  serialda create>><<update ddl qism
//            st1.setAge(20);
//            st1.setName("KaribNil");
//            st1.setSurname("QaroqchilariD");
            st1.setEmail("karibnil@gmail.com");

//            st2.setAge(20);
//            st2.setName("KaribNil");
//            st2.setSurname("QaroqchilariD");
//            st2.setEmail("karibnil@gmail.com");
            session.save(st1);
            tx.commit();

            session.close();//Hibernate baza bilan aloqasini yopadi . boshqalar boglanishin uchun
            factory.close();
        }



}
