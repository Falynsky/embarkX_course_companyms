package com.falynsky.companyms.app.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "REVIEWMS-DEV")
public interface ReviewClient {

    @GetMapping("/reviews/averageRating")
   Double getAvarageRatingForCompany(@RequestParam("companyId") Long companyId);
}
