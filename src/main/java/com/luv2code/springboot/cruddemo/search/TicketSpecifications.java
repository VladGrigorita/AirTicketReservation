package com.luv2code.springboot.cruddemo.search;

import com.luv2code.springboot.cruddemo.entity.Ticket;
import org.springframework.data.jpa.domain.Specification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class TicketSpecifications implements Specification<Ticket>{
        private SearchCriteria criteria;

        public Predicate toPredicate
                (Root<Ticket> root, javax.persistence.criteria.CriteriaQuery<?> query, CriteriaBuilder builder){
            if (criteria.getOperation().equalsIgnoreCase(">")) {
                return builder.greaterThanOrEqualTo(
                        root.<String> get(criteria.getKey()), criteria.getValue().toString());
            }
            else if (criteria.getOperation().equalsIgnoreCase("<")) {
                return builder.lessThanOrEqualTo(
                        root.<String> get(criteria.getKey()), criteria.getValue().toString());
            }
            else if (criteria.getOperation().equalsIgnoreCase(":")) {
                if (root.get(criteria.getKey()).getJavaType() == String.class) {
                    return builder.like(
                            root.<String>get(criteria.getKey()), "%" + criteria.getValue() + "%");
                } else {
                    return builder.equal(root.get(criteria.getKey()), criteria.getValue());
                }
            }
            return null;
        }

    public TicketSpecifications(SearchCriteria criteria) {
        this.criteria = criteria;
    }
}
