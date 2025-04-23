package doctor1.uz;


import javax.persistence.*;

@Entity
@Table(name = "address_student")


public class Address {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;
        @Column(name = "city_name")
        private String cityName;
        @Column
        private String streetName;
        @Column
        private String homeNumber;

//        @OneToOne
//        @JoinColumn(name="student_id")
//        private StudentEntity student;
//MAnyToOne?|||
//
//        @ManyToOne
//        @JoinColumn(name="address_student_id")
//        private StudentEntity student;
//
//        public StudentEntity getStudent() {
//                return student;
//        }
//
//        public void setStudent(StudentEntity student) {
//                this.student = student;
//        }



        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public String getCityName() {
                return cityName;
        }

        public void setCityName(String cityName) {
                this.cityName = cityName;
        }

        public String getStreetName() {
                return streetName;
        }

        public void setStreetName(String streetName) {
                this.streetName = streetName;
        }

        public String getHomeNumber() {
                return homeNumber;
        }

        public void setHomeNumber(String homeNumber) {
                this.homeNumber = homeNumber;
        }

//        public StudentEntity getStudent() {
//                return student;
//        }
//
//        public void setStudent(StudentEntity student) {
//                this.student = student;
//        } OneToOne uchun edi bu


}
