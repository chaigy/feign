package com.cgy.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("cgy-member")
public interface MemberService {
	
	@RequestMapping("/member")
	public String get();
}
