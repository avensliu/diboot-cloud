/*
 * Copyright (c) 2015-2021, www.dibo.ltd (service@dibo.ltd).
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * https://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.diboot.cloud.service.impl;

import com.diboot.cloud.service.IamOperationLogApiService;
import com.diboot.cloud.service.AsyncLogService;
import com.diboot.iam.entity.IamOperationLog;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 异步日志记录service实现
 * @author JerryMa
 * @version v2.2
 * @date 2020/11/09
 */
@Slf4j
@Service
public class AsyncLogServiceImpl implements AsyncLogService {

    @Autowired(required = false)
    private IamOperationLogApiService iamOperationLogRemoteService;

    @Override
    public void saveOperationLog(IamOperationLog operationLog) {
        if(iamOperationLogRemoteService != null){
            iamOperationLogRemoteService.saveOperationLog(operationLog);
        }
        else{
            log.error("该模块无OperationLogRemoteService，操作日志将无法被记录.");
        }
    }

}
