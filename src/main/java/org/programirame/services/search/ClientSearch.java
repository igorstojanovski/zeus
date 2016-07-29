package org.programirame.services.search;

import org.hibernate.search.jpa.FullTextEntityManager;
import org.hibernate.search.query.dsl.QueryBuilder;
import org.programirame.models.client.Client;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Service
@Transactional
public class ClientSearch {

    // Spring will inject here the entity manager object
    @PersistenceContext
    private EntityManager entityManager;

    /**
     * A basic search for the entity User. The search is done by exact match per
     * keywords on fields name, city and email.
     *
     * @param text The query text.
     */
    public List search(String text) {

        // get the full text entity manager
        FullTextEntityManager fullTextEntityManager =
                org.hibernate.search.jpa.Search.
                        getFullTextEntityManager(entityManager);

        // create the query using Hibernate Search query DSL
        QueryBuilder queryBuilder =
                fullTextEntityManager.getSearchFactory()
                        .buildQueryBuilder().forEntity(Client.class).get();

        // a very basic query by keywords
        org.apache.lucene.search.Query query =
                queryBuilder
                        .keyword()
                        .onFields("name", "surname", "uid", "taxNumber")
                        .matching(text)
                        .createQuery();

        // wrap Lucene query in an Hibernate Query object
        org.hibernate.search.jpa.FullTextQuery jpaQuery =
                fullTextEntityManager.createFullTextQuery(query, Client.class);

        // execute search and return results (sorted by relevance as default)
        @SuppressWarnings("unchecked")
        List results = jpaQuery.getResultList();

        return results;
    } // method search

} // class UserSearch