package tv.codely.mooc.students;

import org.springframework.beans.factory.annotation.Autowired;
import tv.codely.mooc.students.infrastructure.persistence.InMemoryStudentRepository;
import tv.codely.shared.infrastructure.InfrastructureTestCase;

public abstract class StudentModuleInfrastructureTestCase extends InfrastructureTestCase {
    @Autowired
    protected InMemoryStudentRepository repository;
}
