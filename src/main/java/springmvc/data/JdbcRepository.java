package springmvc.data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import springmvc.Spittle;
@Service
public class JdbcRepository implements Repository {

	@Override
	public List<Spittle> findSpittles(long max, int count) {
		List<Spittle> spittleList = new ArrayList<Spittle>();
		for(int i=0; i<count; i++){
			spittleList.add(new Spittle("Spittle"+i, new Date()));
		}
		return spittleList;
	}

	@Override
	public Spittle findSpittle(long spittleId) {
		return new Spittle("Spittle"+spittleId, new Date());
	}
	
}
