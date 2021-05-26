package assessment.app.assessmentappbe.Dao.mapper;
import assessment.app.assessmentappbe.Dao.dto.TestDto;
import assessment.app.assessmentappbe.Dao.model.Test;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TestMapper {

    TestDto map(Test testDto);

}
