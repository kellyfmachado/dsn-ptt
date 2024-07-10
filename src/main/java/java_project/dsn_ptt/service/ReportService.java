package java_project.dsn_ptt.service;

import java_project.dsn_ptt.model.Report;

import java.util.Optional;

public interface ReportService {
    void generateReport(Report report);
    Optional<Report> viewReport(Long id);
}
