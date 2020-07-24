package com.rsatech.core.db.dao.impl.user.sql;

import com.rsatech.core.db.dao.impl.common.sql.CoreSelectQueryBuilder;
import com.rsatech.core.db.dao.impl.common.sql.DbQueryUtil;
import com.rsatech.core.shared.filter.user.UserFilter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserSelectQueryBuilder extends CoreSelectQueryBuilder<UserFilter> {
    private static final Logger logger = LoggerFactory.getLogger(UserSelectQueryBuilder.class);


    public UserSelectQueryBuilder() {

    }

    @Override
    protected void buildSelectQuery() {
        query.append("SELECT * from USER_PROFILE WHERE 1 = 1 ");
    }

    @Override
    protected void buildWhereQuery() {
        if (filter.getUserId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_USER_ID));
            queryParams.addValue(DB_COMMON_COLUMN_USER_ID, filter.getUserId());
        }
        if (StringUtils.isNotBlank(filter.getLoginId())) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_LOGIN_ID));
            queryParams.addValue(DB_COMMON_COLUMN_LOGIN_ID, filter.getLoginId());
        }

        if (filter.getStatusId() > 0) {
            query.append(DbQueryUtil.createAndEqualNamedParam(DB_COMMON_COLUMN_STATUS_ID));
            queryParams.addValue(DB_COMMON_COLUMN_STATUS_ID, filter.getStatusId());
        }
    }

    @Override
    protected void buildOrderByQuery() {
        includeOrderByClause();
        query.append(DB_COMMON_COLUMN_UPDATED_TS + " DESC ");
    }
}
