package doctor1.uz;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "studentone")
public class StudentEntity {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(name = "name" , nullable = false)
        private String name;
        @Column
        private String surname;

        @Column(columnDefinition = "int check (age >1) " )
        private Integer age;// age int -> age int check(age>10)

        @Column(name = "email" , length=100 , unique=false )
        private String email;
//3-ishga
//        @OneToMany
//        @JoinColumn(name="studentid_manyadd")
//        private List<Address> address;
//
//        public List<Address> getAddress() {
//                return address;
//        }
//
//        public void setAddress(List<Address> address) {
//                this.address = address;
//        }

        //bu kun 2

//        @Column(columnDefinition = "text")
//        private String password;

// create table student if not exists {
//   id number primary key
//   name varchar(255),
//   surname varchar(255),
//   age number,
//  }
//
// }


        @ManyToMany
        @JoinTable( name = "student_address_mxm",
                        joinColumns = @JoinColumn(name="student_id"),
                inverseJoinColumns = @JoinColumn(name="address_id")
        )
        private List<Address> addressl;

        public List<Address> getAddressl() {
                return addressl;
        }

        public void setAddressl(List<Address> addressl) {
                this.addressl = addressl;
        }

        public String getEmail() {
                return email;
        }

        public void setEmail(String email) {
                this.email = email;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getName() {
                return name;
        }

        public void setName(String name) {
                this.name = name;
        }

        public String getSurname() {
                return surname;
        }

        public void setSurname(String surname) {
                this.surname = surname;
        }

        public Integer getAge() {
                return age;
        }

        public void setAge(Integer age) {
                this.age = age;
        }
}

