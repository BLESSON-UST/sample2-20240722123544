The provided Java code is written in Java 8. 

Here's the modified code upgraded to Java 17:

```java
package com.UST.departmentservice.Controller;

import com.UST.departmentservice.Model.Department;
import com.UST.departmentservice.Services.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    private final DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;
    }

    @PostMapping("/")
    public Department saveDepartmentById(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/{id}")
    public Department findDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
}
```

Please note that in Java 17, the 'var' keyword can be used to infer local variable types, but it is not necessary to modify the provided code in this case.