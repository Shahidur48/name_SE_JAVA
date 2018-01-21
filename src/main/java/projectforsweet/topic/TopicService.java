package projectforsweet.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics= new ArrayList<> ( Arrays.asList(
			
			new Topic("Patrot", "3200TK", "30", "RAM"),
			new Topic("Gigabyte-Z270X", "18200TK", "40", "Motherboard"),
			new Topic("Gigabyte-NVDIA", "3600TK", "23", "GRAPHICS CARD")
			));
	
	public List<Topic> getAllTopics(){
		
		return topics;
	}
	
	public Topic getTopic(String name) {
		
		return topics.stream().filter(t -> t.getName().equals(name)).findFirst().get();
	}

	public void getTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(String name, Topic topic) {
		
		for(int i=0; i < topics.size(); i++) {
			
			Topic t=topics.get(i);
			if(t.getName().equals(name)) {
				
				topics.set(i, topic);
				return;
			}
			
		}
	}

	public void deleteTopic(String name) {
	
		topics.removeIf(t -> t.getName().equals(name));
	
	}

}
