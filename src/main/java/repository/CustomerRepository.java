package repository;

import model.Customer;
import model.Province;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends PagingAndSortingRepository <Customer, Long> {
    Iterable<Customer> findAllByProvince(Province province);
}
