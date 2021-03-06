package za.ac.cput.repository;
/**
 IPackageRepository.java
 Repository: IPackageRepository
 Author: Zimkhitha Nkqenkqa 216280427
 Date: 25 July 2021
 */

import za.ac.cput.entity.Package;

import java.util.Set;

public interface IPackageRepository extends IRepository<Package, Integer> {
    Set<Package> getAll();
}

