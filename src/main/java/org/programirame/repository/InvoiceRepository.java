package org.programirame.repository;

import org.programirame.models.Invoice;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvoiceRepository extends CrudRepository<Invoice, Long> {

    @Query("SELECT i FROM Invoice i WHERE :minDays <= (CURRENT_DATE - i.dueDate) AND :maxDays > (CURRENT_DATE - i.dueDate)")
    List<Invoice> findInvoiceByDueDateMinMax(@Param("minDays") double minDays, @Param("maxDays") double maxDays);

    List<Invoice> findInvoiceByClientId(long clientId);


}
