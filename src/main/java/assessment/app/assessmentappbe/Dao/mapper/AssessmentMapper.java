package assessment.app.assessmentappbe.Dao.mapper;


import assessment.app.assessmentappbe.Dao.dto.AssessmentDto;
import assessment.app.assessmentappbe.Dao.model.Assessment;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AssessmentMapper {
    AssessmentDto map(Assessment assessmentDto);

    List<AssessmentDto> map(List<Assessment> departmentList);
}
