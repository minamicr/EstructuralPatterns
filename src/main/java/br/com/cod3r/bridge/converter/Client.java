package br.com.cod3r.bridge.converter;

import br.com.cod3r.bridge.converter.converters.CSVConverter;
import br.com.cod3r.bridge.converter.converters.Converter;
import br.com.cod3r.bridge.converter.converters.JsonConverter;
import br.com.cod3r.bridge.converter.employees.ITGuy;
import br.com.cod3r.bridge.converter.employees.ProjectManager;

public class Client {

	public static void main(String[] args) {
		Converter csv = new CSVConverter();
		Converter json = new JsonConverter();

		ITGuy itGuy = new ITGuy("Cris", 30, 1000.0);
		ProjectManager pm = new ProjectManager("Joe", 55, 15000.0);

		System.out.println(csv.getEmployeeFormated(itGuy));
		System.out.println(json.getEmployeeFormated(itGuy));
		System.out.println(csv.getEmployeeFormated(pm));
		System.out.println(json.getEmployeeFormated(pm));

	}
}
