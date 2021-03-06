package com.paroont.core.db.service.impl.rdm;

import com.paroont.core.db.dao.entity.rdm.AppRefDataDo;
import com.paroont.core.shared.dto.rdm.AppRefDataDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface AppRefDataMapper {
    AppRefDataMapper INSTANCE = Mappers.getMapper(AppRefDataMapper.class);

    AppRefDataDto toDto(AppRefDataDo data);

    AppRefDataDo toDo(AppRefDataDto dto);

    List<AppRefDataDto> toDtos(List<AppRefDataDo> datas);

    List<AppRefDataDo> toDos(List<AppRefDataDto> dtos);
}
