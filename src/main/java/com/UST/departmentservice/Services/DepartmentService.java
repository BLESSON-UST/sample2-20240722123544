The given code is written in Java 8. Here's the modified code compatible with Java 17:

```java
package com.UST.departmentservice.Services;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService {
    private final DepartmentRepository repo;

    @Autowired
    public DepartmentService(DepartmentRepository repo) {
        this.repo = repo;
    }

    public Department saveDepartment(Department department) {
        return repo.save(department);
    }

    public Department findDepartmentById(Long departmentId) {
        return repo.findByDepartmentId(departmentId);
    }
}
```

Note: The modifications made to the code are to use constructor injection for autowiring the `DepartmentRepository` instead of field injection, which is considered a best practice.