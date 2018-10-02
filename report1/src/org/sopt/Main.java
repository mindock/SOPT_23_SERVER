package org.sopt;

import org.sopt.model.Department;
import org.sopt.model.Professor;
import org.sopt.model.Student;
import org.sopt.model.University;
import org.sopt.model.builder.DepartmentBuilder;
import org.sopt.model.builder.ProfessorBuilder;
import org.sopt.model.builder.StudentBuilder;
import org.sopt.model.builder.UniversityBuilder;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //대학
	    final ArrayList<University> universityList = new ArrayList<>();

	    final University university1 = new UniversityBuilder()
				.setUniversityNo(1L)
				.setAddress("인천광역시 연수구 아카데미로 119")
				.setName("인천대학교")
				.setPhoneNo("032-835-8114")
				.build();
	    final University university2 = new UniversityBuilder()
				.setUniversityNo(2L)
				.setAddress("서울특별시 동작구 상도로 369")
				.setName("숭실대학교")
				.setPhoneNo("02-820-0114")
				.build();
	    final University university3 = new UniversityBuilder()
				.setUniversityNo(3L)
				.setAddress("서울특별시 성동구 왕십리로 222")
				.setName("한양대학교")
				.setPhoneNo("02-2220-0114")
				.build();

	    universityList.add(university1);
	    universityList.add(university2);
	    universityList.add(university3);

	    for(final University university : universityList) {
	        System.out.println(university.toString());
        }

        //학과
        final ArrayList<Department> departmentList = new ArrayList<>();

	    final Department department1 = new DepartmentBuilder()
				.setDepartmentNo(1L)
				.setName("컴퓨터공학부")
				.setPhoneNo("032-525-5533")
				.setType("공대")
				.build();
	    final Department department2 = new DepartmentBuilder()
				.setDepartmentNo(2L)
				.setName("화학과")
				.setPhoneNo("032-525-5555")
				.setType("자연대")
				.build();
	    final Department department3 = new DepartmentBuilder()
				.setDepartmentNo(3L)
				.setName("일어일문학과")
				.setPhoneNo("032-525-0033")
				.setType("인문대")
				.build();

	    departmentList.add(department1);
	    departmentList.add(department2);
	    departmentList.add(department3);

	    for(final Department department : departmentList) {
	        System.out.println(department.toString());
        }

        //학생
        final ArrayList<Student> studentList = new ArrayList<>();

	    final Student student1 = new StudentBuilder()
				.setStudentNo(1L)
				.setAddress("인천광역시 부평구")
				.setAge(24)
				.setEmail("psy@gmail.com")
				.setGrade(5)
				.setStatus("수료")
				.setName("박선영")
				.build();
	    final Student student2 = new StudentBuilder()
				.setStudentNo(2L)
				.setAddress("서울특별시 송파구")
				.setAge(20)
				.setEmail("pab@gmail.com")
				.setGrade(1)
				.setStatus("재학")
				.setName("김수진")
				.build();
	    final Student student3 = new StudentBuilder()
				.setStudentNo(3L)
				.setAddress("경기도 부천시")
				.setAge(22)
				.setEmail("vsh@gmail.com")
				.setGrade(3)
				.setStatus("휴학")
				.setName("이혜린")
				.build();

	    studentList.add(student1);
	    studentList.add(student2);
	    studentList.add(student3);

	    for(final Student student : studentList) {
	        System.out.println(student.toString());
        }

        //교수
        final ArrayList<Professor> professorList = new ArrayList<>();

	    final Professor professor1 = new ProfessorBuilder()
				.setProfessorNo(1L)
				.setName("김반박")
				.setPhoneNo("010-3212-2131")
				.setSubject("컴퓨터공학개론")
				.build();
	    final Professor professor2 = new ProfessorBuilder()
				.setProfessorNo(2L)
				.setName("박문지")
				.setPhoneNo("010-0112-2235")
				.setSubject("시스템 프로그래밍")
				.build();
	    final Professor professor3 = new ProfessorBuilder()
				.setProfessorNo(3L)
				.setName("이후리")
				.setPhoneNo("010-9563-1123")
				.setSubject("물리")
				.build();

	    professorList.add(professor1);
	    professorList.add(professor2);
	    professorList.add(professor3);

	    for(final Professor professor : professorList) {
	        System.out.println(professor.toString());
        }
    }
}
