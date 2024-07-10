package java_project.dsn_ptt.controller;

import java_project.dsn_ptt.model.Category;
import java_project.dsn_ptt.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("category")
public class CategoryController {

    @Autowired
    public CategoryService categoryService;

    @PostMapping("/add/{category}")
    public ResponseEntity<Category> add(@PathVariable Category category) {
        categoryService.addCategory(category);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/update/{category}")
    public ResponseEntity<Category> update(Long id, @PathVariable Category category) {
        categoryService.updateCategory(id, category);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/delete/{category}")
    public ResponseEntity<Category> delete(@PathVariable Category category){
        categoryService.deleteCategory(category);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Category> view(@PathVariable Long id){
        categoryService.viewCategory(id);
        return ResponseEntity.ok().build();
    }

}
