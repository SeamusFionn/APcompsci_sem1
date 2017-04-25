public class Magpie
{
	public String getGreeting()
	{
		return "hello, wanna talk my dood?";
	}

	public String getResponse(String statement)
	{
		String response = "";
		if (statement.length() == 0)
		{
			response = "pls respond my dood";
		}
		
		else if (findKeyword(statement, "yea") >= 0
				|| findKeyword(statement, "yes") >= 0
				|| findKeyword(statement, "hi") >= 0
				|| findKeyword(statement, "hello") >= 0
				|| findKeyword(statement, "sup") >= 0)
		{
			response = "whats up?";
		}
		
		else if (findKeyword(statement, "no") >= 0)
		{
			response = "Whats wrong dood?";
		}
		else if (findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "father") >= 0
				|| findKeyword(statement, "sister") >= 0
				|| findKeyword(statement, "brother") >= 0
				|| findKeyword(statement, "sibling") >= 0
				|| findKeyword(statement, "bro") >= 0
				|| findKeyword(statement, "sis") >= 0
				|| findKeyword(statement, "mother") >= 0
				|| findKeyword(statement, "mom") >= 0
				|| findKeyword(statement, "dad") >= 0)
		{
			response = "whaddup with ur fam?";
		}

		else if (findKeyword(statement, "dog") >= 0
				|| findKeyword(statement, "cat") >= 0
				|| findKeyword(statement, "fish") >= 0
				|| findKeyword(statement, "lizard") >= 0
				|| findKeyword(statement, "frog") >= 0)
		{
			response = "yoooooooo I want a pet";
		}

		else if (findKeyword(statement, "robinette") >= 0
				|| findKeyword(statement, "teacher") >= 0)
		{
			response = "oh are you talking about the robinette my dood?";
		}


		else if (statement.trim().length() == 0)
		{
			response = "pls respond";
		}

		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	private int findKeyword(String statement, String goal, int startPos)
	{
		String phrase = statement.trim().toLowerCase();
		goal = goal.toLowerCase();

		int psn = phrase.indexOf(goal, startPos);

		while (psn >= 0)
		{

			String before = " ", after = " ";
			if (psn > 0)
			{
				before = phrase.substring(psn - 1, psn);
			}
			if (psn + goal.length() < phrase.length())
			{
				after = phrase.substring(psn + goal.length(),
										psn + goal.length() + 1);
			}

			if (((before.compareTo("a") < 0) || (before.compareTo("z") > 0))
					&& ((after.compareTo("a") < 0) || (after.compareTo("z") > 0)))
			{
				return psn;
			}
			psn = phrase.indexOf(goal, psn + 1);
		}

		return -1;
	}

	/**
	 * Search for one word in phrase. The search is not case
	 * sensitive. This method will check that the given goal
	 * is not a substring of a longer string (so, for
	 * example, "I know" does not contain "no"). The search
	 * begins at the beginning of the string.
	 * 
	 * @param statement
	 *            the string to search
	 * @param goal
	 *            the string to search for
	 * @return the index of the first occurrence of goal in
	 *         statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal)
	{
		return findKeyword(statement, goal, 0);
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * 
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int) (r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0)
		{
			response = "wow thats super intersting";
		}
		else if (whichResponse == 1)
		{
			response = "you can tell me more";
		}
		else if (whichResponse == 2)
		{
			response = "- system malfunction -";
		}
		else if (whichResponse == 3)
		{
			response = "wow something I dont know about";
		}

		return response;
	}

}
