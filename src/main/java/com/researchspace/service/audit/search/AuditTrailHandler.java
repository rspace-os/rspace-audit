package com.researchspace.service.audit.search;

import com.researchspace.core.util.IPagination;
import com.researchspace.core.util.ISearchResults;
import com.researchspace.model.core.Person;

/**
 * top-level handler for searching audit logs  trail

 */
public interface AuditTrailHandler {
	 ISearchResults<AuditTrailSearchResult> searchAuditTrail (IAuditTrailSearchConfig searchConfig, 
	               IPagination<AuditTrailSearchResult> pgCrit, Person subject) ;
	 
	 

}
