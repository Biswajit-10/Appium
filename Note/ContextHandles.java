


Set<String> contexts = driver.getContextHandles();
		System.out.println(contexts.size());
		for (String context : contexts) {
			System.out.println(context);
		}
/* Getting output only NATIVE_APP (insta,safari,setting,yono sbi,)*/
