package in.co.sanchay.corpus.simple.data;

import java.util.*;

// compare() Inconsistent with equals()
public class ByWTTag implements Comparator
{
	public int compare(Object one, Object two)
	{
		return ( ((WordType) one).getTag().compareTo( ((WordType) two).getTag() ) );
	}
}
