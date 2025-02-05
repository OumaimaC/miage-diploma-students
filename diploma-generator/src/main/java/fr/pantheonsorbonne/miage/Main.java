package fr.pantheonsorbonne.miage;

import com.google.common.collect.Iterables;

public class Main {

	public static void main(String[] args) throws Exception {
		StudentRepository repo = StudentRepository.withDB("../student-repository/src/main/resources/students.db");
		Student student = Iterables.get(repo, 0);
		
		MiageDiplomaGenerator generator = new MiageDiplomaGenerator(student);
		DiplomaFileAdapter adapter = new DiplomaFileAdapter(generator);
		try {
			adapter.generateFile("temp_diploma.pdf");
		} catch (FileUpdateWriteDiplomaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
				

	}

}
