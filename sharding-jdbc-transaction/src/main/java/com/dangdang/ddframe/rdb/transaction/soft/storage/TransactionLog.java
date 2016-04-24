/**
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package com.dangdang.ddframe.rdb.transaction.soft.storage;

import java.util.Date;
import java.util.List;

import com.dangdang.ddframe.rdb.transaction.soft.api.SoftTransactionType;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * 事务日志.
 * 
 * @author zhangliang
 */
@AllArgsConstructor
@Getter
public final class TransactionLog {
    
    private final String id;
    
    private final String transactionId;
    
    private final SoftTransactionType transactionType;
    
    private final String dataSource;
    
    private final String sql;
    
    private final List<Object> parameters;

    private final long creationTime;
    
    @Setter
    private int asyncDeliveryTryTimes;
}
