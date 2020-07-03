package com.embl.inventory.mapper;

import com.embl.inventory.entity.ItemEntity;
import com.embl.inventory.model.ItemModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * @author Hasham Rasheed
 * 02-07-2020
 * Converts {@link ItemModel} to {@link ItemEntity} and vice versa.
 */
@Mapper(componentModel = "spring")
public interface ItemMapper {

    public static ItemMapper INSTANCE = Mappers.getMapper(ItemMapper.class);

    ItemEntity toEntity(final ItemModel itemModel);

    ItemModel toModel(final ItemEntity itemEntity);

    List<ItemEntity> toEntityList(final List<ItemModel> itemModels);

    List<ItemModel> toModelList(final List<ItemEntity> itemEntities);

}
