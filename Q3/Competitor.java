//FRQS 3A

compList = new ArrayList<Competitor>(); 

for (int i = 0; i < names.length; i++) { 

	compList.add(new Competitor(names\[x\] // fighter name, x + 1 // fighter rank));

    }
}
//FRQS 3B
ArrayList<Competitor> pairs = new ArrayList<Competitor>(); 



if (compList.size() % 2 == 0) { 

	for (int i = 0; i < (compList.size() / 2); i++) { 

		pairs.add(i, compList.add(compList.size() - i - 1) // this solution won't actually work since I can't remember the exact names of the array lists

	}

} else { 

	for (int j = 1; j <= ((compList.size() - 1)/2); j++) { 

		pairs.add(j, compeList.get(compList.size() - j));

	}

}

return pairs; 
}



