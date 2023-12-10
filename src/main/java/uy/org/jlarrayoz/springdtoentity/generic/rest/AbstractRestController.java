package uy.org.jlarrayoz.springdtoentity.generic.rest;

import com.google.common.reflect.TypeToken;
import org.modelmapper.ModelMapper;
import uy.org.jlarrayoz.springdtoentity.generic.dto.BaseGenericDTO;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;
import uy.org.jlarrayoz.springdtoentity.generic.util.MyAnnotationUtils;

public abstract class AbstractRestController <T extends BaseEntity> {
    public static final String DEFAULT_CREATE_METHOD = "create";
    public static final String DEFAULT_UPDATE_MEHTOD = "update";

    protected static final ModelMapper modelMapper = new ModelMapper();

    //Clase asociada al tipo genérico T (Entity asociada)
    protected final Class<T> entityClass;

    public AbstractRestController() {
        this.entityClass = getEntityClass();
    }

    protected Class<T> getEntityClass(){
        TypeToken<T> typeToken = new TypeToken<T>(getClass()) {};
        return (Class<T>) typeToken.getRawType();
    }

    protected Class<? extends BaseGenericDTO> getQueryDTO(){
        return MyAnnotationUtils.getGenericDtoToRestController(null, entityClass);
    }
}
