package com.class23;

public class Test {

	public static void main(String[] args) {
		
		System.out.println("--------Creating Employee object-----");
		Employee emp=new Employee();
		System.out.println(Employee.department);
		Employee.work();
		emp.salary=90000;
		emp.getPaid();
		
		System.out.println("--------Creating scrumTeam object-----");
		ScrumTeam st=new ScrumTeam();
		ScrumTeam.work();
		st.salary=10000;
		st.getPaid();
		st.artifacts="Product Backlog, Sprint Backlog, BurnDown chart";
		st.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		st.attendScrumMeetings();
		st.workOnArtifacts();
		
		System.out.println("--------Creating Developer object-----");
		Developer dev=new Developer();
		Developer.work();
		dev.salary=120000;
		dev.getPaid();
		dev.artifacts="Sprint backlog";
		dev.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		dev.workOnArtifacts();
		dev.attendScrumMeetings();
		dev.code();
		
		System.out.println("--------Creating Tester object-----");
		Tester qa=new Tester();
		qa.salary=120000;
		qa.getPaid();
		qa.artifacts="Sprint backlog";
		qa.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		qa.workOnArtifacts();
		qa.attendScrumMeetings();
		qa.test();
		
		System.out.println("--------Creating Business Analyst object-----");
		BusinessAnalyst ba=new BusinessAnalyst();
		ba.salary=120000;
		ba.getPaid();
		ba.artifacts="Sprint backlog";
		ba.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		ba.workOnArtifacts();
		ba.attendScrumMeetings();
		ba.writeUserStories();
		
		System.out.println("--------Creating Scrum Master object-----");
		ScrumMaster sm=new ScrumMaster();
		sm.salary=120000;
		sm.getPaid();
		sm.artifacts="Burn Down Chart";
		sm.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		sm.workOnArtifacts();
		sm.attendScrumMeetings();
		sm.driveScrumMeetings();
		
		System.out.println("--------Creating Product Owner object-----");
		ProductOwner po=new ProductOwner();
		po.salary=120000;
		po.getPaid();
		po.artifacts="Burn Down Chart";
		po.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		po.workOnArtifacts();
		po.attendScrumMeetings();
		po.prioritizeBacklog();
		po.talkToTheClient();
		
		System.out.println("--------Creating Front end developers object-----");
		FrontEnd fe=new FrontEnd();
		fe.salary=110000;
		fe.getPaid();
		fe.artifacts="Sprint backlog";
		fe.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		fe.workOnArtifacts();
		fe.attendScrumMeetings();
		fe.doHtml();
		
		System.out.println("--------Creating Back end developers object-----");
		BackEnd be=new BackEnd();
		be.salary=130000;
		be.getPaid();
		be.artifacts="Sprint backlog";
		be.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		be.workOnArtifacts();
		be.attendScrumMeetings();
		be.doSql();
		
		System.out.println("--------Creating Manual Tester object-----");
		ManualTester mt=new ManualTester();
		mt.salary=100000;
		mt.getPaid();
		mt.artifacts="Sprint backlog";
		mt.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		mt.workOnArtifacts();
		mt.attendScrumMeetings();
		mt.testManually();
		
		System.out.println("--------Creating Automotion Tester object-----");
		AutomotionTester at=new AutomotionTester();
		at.salary=130000;
		at.getPaid();
		at.artifacts="Sprint backlog";
		at.ceremonies="Sprint grooming, Sprint Planning, Daily StandUp, Sprint Demo, Sprint Retro ";
		at.workOnArtifacts();
		at.attendScrumMeetings();
		at.codeInJava();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
			
		
	}

}
