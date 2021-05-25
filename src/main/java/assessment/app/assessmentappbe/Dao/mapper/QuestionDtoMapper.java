package assessment.app.assessmentappbe.Dao.mapper;

import assessment.app.assessmentappbe.Dao.dto.QuestionDto;
import assessment.app.assessmentappbe.Dao.model.Question;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionDtoMapper {
    List<QuestionDto> map(List<Question> questionDto);
}
