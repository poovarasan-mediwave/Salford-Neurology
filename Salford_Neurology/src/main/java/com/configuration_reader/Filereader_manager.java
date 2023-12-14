package com.configuration_reader;

public class Filereader_manager {

	private Filereader_manager() {

	}

	public static Filereader_manager getinstantconfi() {
		Filereader_manager f = new Filereader_manager();
		return f;

	}

	public Configuration_reader getconf() throws Throwable {
		Configuration_reader c = new Configuration_reader();
		return c;

	}

}
