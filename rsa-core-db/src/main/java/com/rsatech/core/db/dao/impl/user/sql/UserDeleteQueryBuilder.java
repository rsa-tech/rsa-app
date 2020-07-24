package com.rsatech.core.db.dao.impl.user.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.user.UserDo;
import com.rsatech.core.db.dao.impl.common.sql.CoreDeleteQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserDeleteQueryBuilder extends CoreDeleteQueryBuilder<UserDo, CoreAuditDo, CoreActionBaseDto> {
    private static final Logger logger = LoggerFactory.getLogger(UserDeleteQueryBuilder.class);


    public UserDeleteQueryBuilder() {

    }





    @Override
    protected void buildDeleteQuery() {
        query.append("DELETE USER_PROFILE ");


    }

    @Override
    protected void buildWhereQuery() {
        includeWhereClause();
        if (data.getUserId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, data.getUserId());
        }else {
            includeNotMatchingClause();
        }
    }


}
