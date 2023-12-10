package uy.org.jlarrayoz.springdtoentity.generic.util;

import org.springframework.core.annotation.AnnotationUtils;
import uy.org.jlarrayoz.springdtoentity.generic.annotation.GenericDtoType;
import uy.org.jlarrayoz.springdtoentity.generic.dto.BaseGenericDTO;
import uy.org.jlarrayoz.springdtoentity.generic.entity.BaseEntity;
import uy.org.jlarrayoz.springdtoentity.generic.rest.AbstractRestController;
import uy.org.jlarrayoz.springdtoentity.generic.rest.BaseRestController;

public abstract class MyAnnotationUtils {

    public static GenericDtoType getGenericDtoTypeAnnotation(Class<?> clazz) {
        return AnnotationUtils.getAnnotation(clazz, GenericDtoType.class);
    }

    public static Class<? extends BaseGenericDTO> getGenericDtoToRestController(String restConstrollerMethodName, Class<?> clazz) {
        GenericDtoType genericDtoTypeAnnotation = getGenericDtoTypeAnnotation(clazz);

        if (genericDtoTypeAnnotation != null){
            if (restConstrollerMethodName == null){
                return genericDtoTypeAnnotation.queryDTO();
            }
            else if (restConstrollerMethodName.equals(AbstractRestController.DEFAULT_CREATE_METHOD)){
                return genericDtoTypeAnnotation.insertDTO();
            }
            else if (restConstrollerMethodName.equals(AbstractRestController.DEFAULT_UPDATE_MEHTOD)){
                return genericDtoTypeAnnotation.updateDTO();
            }
        }
        throw new RuntimeException("No fue posible determinar el DTO a utilizar");
    }
}
