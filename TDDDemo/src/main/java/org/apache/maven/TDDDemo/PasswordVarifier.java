package org.apache.maven.TDDDemo;

public class PasswordVarifier {

	public String verify(String password) throws RuntimeException {

		boolean isDigit = false;
		boolean isUpperCase = false;
		boolean isLowerCase = false;
		int count = 0;
		char[] ch = password.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (Character.isUpperCase(ch[i]))
				isUpperCase = true;
			if (Character.isLowerCase(ch[i]))
				isLowerCase = true;
			if (Character.isDigit(ch[i]))
				isDigit = true;
		}

		if (!password.isEmpty()) {
			if (isLowerCase) {
				if (isUpperCase)
					count++;
				if (isDigit)
					count++;
				if (password.length() > 8)
					count++;
			} else {
				throw new RuntimeException("Password should have at least one lower case letter");
			}
		} else {
			throw new RuntimeException("Password should not be empty...");
		}

		if (count < 1) {
			throw new RuntimeException(
					"Password should have at least one upper case letter and one digit with minimum 8 characters..");
		}
		return "Password is OK..";

	}

}
