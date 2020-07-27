package com.rsatech.core.db.dao.impl.user.profile.sql.company;

import com.rsatech.core.db.dao.entity.user.CompanyProfileDo;
import com.rsatech.core.db.dao.impl.user.profile.sql.common.UserProfileBaseRowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class BaseCompanyProfileRowMapper<T extends CompanyProfileDo> extends UserProfileBaseRowMapper<T> {

    @Override
    protected void mapData(T data, ResultSet rs, int rowNum) throws SQLException {
        super.mapData(data, rs, rowNum);

        data.setCompanyName(rs.getString(DB_COMMON_COMPANY_PROFILE_COLUMN_COMPANY_NAME));
        data.setCompanyWebUrl(rs.getString(DB_COMMON_COMPANY_PROFILE_COLUMN_COMPANY_WEB_URL));
        data.setCompanyOverview(rs.getString(DB_COMMON_COMPANY_PROFILE_COLUMN_COMPANY_OVERVIEW));

    }
}
