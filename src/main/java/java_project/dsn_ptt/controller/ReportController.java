package java_project.dsn_ptt.controller;

import java_project.dsn_ptt.model.Category;
import java_project.dsn_ptt.model.Report;
import java_project.dsn_ptt.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("report")
public class ReportController {

    @Autowired
    public ReportService reportService;

    @PostMapping("/generate/{report}")
    public ResponseEntity<Report> add(@PathVariable Report report) {
        reportService.generateReport(report);
        return ResponseEntity.ok(report);
    }

    @GetMapping("/view/{id}")
    public ResponseEntity<Report> view(@PathVariable Long id){
        reportService.viewReport(id);
        return ResponseEntity.ok().build();
    }

}
