package com.other.discount.stragetys;

import java.util.Collections;
import java.util.Map;

public class CustomerStrategy implements Strategy {

	@Override
	public Map<String,Object> execute() {
		System.out.println("CustomerStrategy");
		/*select *
		from ad_award_parm
		where status = 1
		    and type = 1
		    and Award_start <= 100001
		    and (100001 < Award_end
		          or Award_end = 0)*/
		
		
		return Collections.EMPTY_MAP;
	}

}
