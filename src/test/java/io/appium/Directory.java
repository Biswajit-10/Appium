package io.appium;

public class Directory {

	public static void main(String[] args) {
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("java.version"));
	}

}
/*

Key

Description of Associated Value



{@systemProperty java.version}
Java Runtime Environment version, which may be interpreted as a Runtime.Version 

{@systemProperty java.version.date}
Java Runtime Environment version date, in ISO-8601 YYYY-MM-DD format, which may be interpreted as a java.time.LocalDate 

{@systemProperty java.vendor}
Java Runtime Environment vendor 

{@systemProperty java.vendor.url}
Java vendor URL 

{@systemProperty java.vendor.version}
Java vendor version (optional)  

{@systemProperty java.home}
Java installation directory 

{@systemProperty java.vm.specification.version}
Java Virtual Machine specification version, whose value is the feature element of the runtime version 

{@systemProperty java.vm.specification.vendor}
Java Virtual Machine specification vendor 

{@systemProperty java.vm.specification.name}
Java Virtual Machine specification name 

{@systemProperty java.vm.version}
Java Virtual Machine implementation version which may be interpreted as a Runtime.Version 

{@systemProperty java.vm.vendor}
Java Virtual Machine implementation vendor 

{@systemProperty java.vm.name}
Java Virtual Machine implementation name 

{@systemProperty java.specification.version}
Java Runtime Environment specification version, whose value is the feature element of the runtime version 

{@systemProperty java.specification.vendor}
Java Runtime Environment specification vendor 

{@systemProperty java.specification.name}
Java Runtime Environment specification name 

{@systemProperty java.class.version}
Java class format version number 

{@systemProperty java.class.path}
Java class path (refer to ClassLoader.getSystemClassLoader() for details) 

{@systemProperty java.library.path}
List of paths to search when loading libraries 

{@systemProperty java.io.tmpdir}
Default temp file path 

{@systemProperty java.compiler}
Name of JIT compiler to use 

{@systemProperty os.name}
Operating system name 

{@systemProperty os.arch}
Operating system architecture 

{@systemProperty os.version}
Operating system version 

{@systemProperty file.separator}
File separator ("/" on UNIX) 

{@systemProperty path.separator}
Path separator (":" on UNIX) 

{@systemProperty line.separator}
Line separator ("\n" on UNIX) 

{@systemProperty user.name}
User's account name 

{@systemProperty user.home}
User's home directory 

{@systemProperty user.dir}
User's current working directory 

*/