
public class President
	{
		String name;
		int presidentialNumber;
		String yearsServed;
		String party;
		
		public President(String n, int p, String y, String pa)
			{
				name = n;
				presidentialNumber = p;
				yearsServed = y;
				party = pa;
			}

		public String getName()
			{
				return name;
			}

		public void setName(String name)
			{
				this.name = name;
			}

		public int getPresidentialNumber()
			{
				return presidentialNumber;
			}

		public void setPresidentialNumber(int presidentialNumber)
			{
				this.presidentialNumber = presidentialNumber;
			}

		public String getYearsServed()
			{
				return yearsServed;
			}

		public void setYearsServed(String yearsServed)
			{
				this.yearsServed = yearsServed;
			}

		public String getParty()
			{
				return party;
			}

		public void setParty(String party)
			{
				this.party = party;
			}
		
	}
