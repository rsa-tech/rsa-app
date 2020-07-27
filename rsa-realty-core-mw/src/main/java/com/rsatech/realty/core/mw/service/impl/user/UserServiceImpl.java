package com.rsatech.realty.core.mw.service.impl.user;

import com.rsatech.realty.core.db.service.service.user.UserDbService;
import com.rsatech.realty.core.mw.service.impl.common.RealtyServiceImpl;
import com.rsatech.realty.core.shared.dto.common.RealtyActionDto;
import com.rsatech.realty.core.shared.dto.user.UserActionDto;
import com.rsatech.realty.core.shared.dto.user.UserProfileDto;
import com.rsatech.realty.core.shared.filter.user.UserProfileFilter;
import com.rsatech.realty.core.shared.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends RealtyServiceImpl implements UserService {

    @Autowired
   private UserDbService userDbService;

    public List<UserProfileDto>  findAllUserProfiles(UserProfileFilter filter)
    {
        return userDbService.findAllUserProfiles(filter);

    }

    public UserProfileDto findUserProfileById(long id)
    {
        return userDbService.findUserProfileById(id);

    }
    public long saveUserProfile(UserProfileDto dto, UserActionDto action)
    {
        return userDbService.saveUserProfile(dto, action);

    }

}
