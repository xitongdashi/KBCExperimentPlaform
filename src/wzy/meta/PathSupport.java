package wzy.meta;

import java.util.Comparator;

public class PathSupport implements Comparator{

	public RPath getPath() {
		return path;
	}
	public void setPath(RPath path) {
		this.path = path;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}


	private RPath path;
	private int count;
	private double score;
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		PathSupport p1=(PathSupport)o1;
		PathSupport p2=(PathSupport)o2;
		return -(p1.count-p2.count);
	}
}
