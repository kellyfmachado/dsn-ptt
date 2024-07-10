package java_project.dsn_ptt.service.impl;

import java_project.dsn_ptt.model.Report;
import java_project.dsn_ptt.repository.ReportRepository;
import java_project.dsn_ptt.service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReportServiceImpl implements ReportService {

    @Autowired
    public ReportRepository reportRepository;

    @Override
    public void generateReport(Report report){
        reportRepository.save(report);
    }

    @Override
    public Optional<Report> viewReport(Long id){
        return reportRepository.findById(id);
    }

}
