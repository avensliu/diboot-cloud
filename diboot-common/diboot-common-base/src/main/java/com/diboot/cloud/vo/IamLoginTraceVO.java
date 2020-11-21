/*
 * Copyright (c) 2015-2020, www.dibo.ltd (service@dibo.ltd).
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
package com.diboot.cloud.vo;

import com.diboot.core.binding.annotation.BindDict;
import com.diboot.cloud.entity.IamLoginTrace;
import lombok.Data;

/**
* 登录记录 VO定义
* @author mazc@dibo.ltd
* @version 2.0
* @date 2019-12-17
*/
@Data
public class IamLoginTraceVO extends IamLoginTrace  {
    private static final long serialVersionUID = -753084580143028183L;

    @BindDict(type="AUTH_TYPE", field = "authType")
    private String authTypeLabel;

}