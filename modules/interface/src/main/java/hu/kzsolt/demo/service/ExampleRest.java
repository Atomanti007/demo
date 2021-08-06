package hu.kzsolt.demo.service;

import hu.kzsolt.demo.dto.ExampleDto;
import hu.kzsolt.storesync.common.feign.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "Demo", url = "${url.demo}", configuration = {FeignConfig.class})
public interface ExampleRest {

    @GetMapping("/check")
    ExampleDto check();
}
