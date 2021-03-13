package recursion.subsets;

import java.util.ArrayList;
import java.util.List;

public class FindAllSubsets {
	
	public static List<List<String>> findSubsets(List<String> input) {
		List<List<String>> allSets = new ArrayList<List<String>>();
		
		for(int i = 0; i < input.size(); i++) {
			List<List<String>> tmp = new ArrayList<>();
			String currElem = input.get(i);

			List<String> singleElem = new ArrayList<>();
			singleElem.add(currElem);	
			tmp.add(singleElem);
		
			for (int j = 0; j < allSets.size(); j++) {
				List<String> subset = allSets.get(j);
				List<String> copy = new ArrayList<String>(subset);
				copy.add(currElem);
				
				tmp.add(copy);
			}
			
			allSets.addAll(tmp);
		}
		

		List<String> emptySet = new ArrayList<String>();
		emptySet.add("");
		allSets.add(emptySet);
		return allSets;
	}

}
