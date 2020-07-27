package com.rsatech.core.db.dao.impl.common.sql;

import com.rsatech.core.db.dao.entity.common.CoreAuditDo;
import com.rsatech.core.db.dao.entity.common.CoreDo;
import com.rsatech.core.shared.dto.common.CoreActionBaseDto;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.SQLType;
import java.sql.Timestamp;
import java.sql.Types;
import java.util.Date;
import java.util.Optional;

public abstract class CoreUpdateQueryBuilder<D extends CoreDo, AD extends CoreAuditDo, AN extends CoreActionBaseDto> extends CoreDmlQueryBuilder<D, AD, AN> {
    private static final Logger logger = LoggerFactory.getLogger(CoreUpdateQueryBuilder.class);

    protected D data;
    protected D oldData;
    protected boolean updateFound = false;

    public String build() {
        buildUpdateQuery();
        addUpdatedByParams();
        buildWhereQuery();
        logSqlAndParams();
        logAuditSqlAndParams();
        return query.toString();
    }

    protected abstract void buildUpdateQuery();


    protected abstract void buildWhereQuery();



    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public D getOldData() {
        return oldData;
    }

    public void setOldData(D oldData) {
        this.oldData = oldData;
    }

    public boolean isUpdateFound() {
        return updateFound;
    }

    protected  void buildStringUpdateQuery(String value, String oldValue, String colName) {
        String newVal = Optional.ofNullable(value).orElse("");
        String oldVal = Optional.ofNullable(oldValue).orElse("");
        if (!newVal.equals(oldVal)) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(colName));
            queryParams.addValue(colName, newVal);
            auditQueryParams.addValue(colName, newVal);
        }
    }

    protected  void buildNumberUpdateQuery(long value, long oldValue, String colName) {
        if (value != oldValue) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(colName));
            queryParams.addValue(colName, value);
            auditQueryParams.addValue(colName, value);
        }
    }

    protected  void buildDecimalUpdateQuery(double value, double oldValue, String colName) {
        if (value != oldValue) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(colName));
            queryParams.addValue(colName, value);
            auditQueryParams.addValue(colName, value);
        }
    }

    protected  void buildTimestampUpdateQuery(Timestamp value, Timestamp oldValue, String colName) {
        Timestamp now = new Timestamp(new Date().getTime());
        Timestamp newVal = Optional.ofNullable(value).orElse(now);
        Timestamp oldVal = Optional.ofNullable(oldValue).orElse(now);
        if (newVal.getTime() != oldVal.getTime()) {
            updateFound = true;
            query.append(DbQueryUtil.createUpdateNamedParam(colName));
            queryParams.addValue(colName, newVal, Types.TIMESTAMP);
            auditQueryParams.addValue(colName, newVal, Types.TIMESTAMP);
        }
    }
}
