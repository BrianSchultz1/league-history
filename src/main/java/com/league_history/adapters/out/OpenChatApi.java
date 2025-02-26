package com.league_history.adapters.out;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "openChatApi", url = "${openai.base.url}")
public interface OpenChatApi {
}
