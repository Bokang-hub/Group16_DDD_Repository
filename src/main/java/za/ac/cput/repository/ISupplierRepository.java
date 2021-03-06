package za.ac.cput.repository;

/* ISuuplierRepository.java
Interface Repository for the Supplier
Author: Lilitha Moni (219068429)
Date: 22 July 2021
*/

import za.ac.cput.entity.Supplier;
import java.util.List;

public interface ISupplierRepository extends IRepository<Supplier, Integer> {
    public List<Supplier> getAll();
}

