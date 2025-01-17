package org.openmrs.module.patientgrid.web.rest;

import java.util.List;
import java.util.Map;

import org.openmrs.module.patientgrid.ExtendedDataSet;
import org.openmrs.module.patientgrid.PatientGrid;

public class PatientGridReport extends BasePatientGridData {
	
	public PatientGridReport(ReportMetadata reportMetadata, PatientGrid patientGrid, List<Map<String, Object>> report) {
		super(reportMetadata, patientGrid, report);
	}
	
}
