package org.wabc.authorization.service.fallback;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.wabc.authorization.result.Result;
import org.wabc.authorization.result.ResultCode;
import org.wabc.authorization.service.UserFeignClient;
import org.wabc.commons.result.ApiResult;

/**
 * @author haoxr
 * @createTime 2021/4/24 21:30
 */
@Component
@Slf4j
public class UserFeignFallbackClient implements UserFeignClient {

    @Override
    public ApiResult getUserByUsername(String username) {
        log.error("feign远程调用系统用户服务异常后的降级方法");
        return ApiResult.failed(ResultCode.DEGRADATION);
    }
}
