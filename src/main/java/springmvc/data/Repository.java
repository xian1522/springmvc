package springmvc.data;

import java.util.List;

import springmvc.Spittle;

public interface Repository {
	public List<Spittle> findSpittles(long max, int count);
	
	public Spittle findSpittle(long id );
}
