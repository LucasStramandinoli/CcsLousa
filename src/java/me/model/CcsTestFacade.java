/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.model;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Lucas
 */
@Stateless
public class CcsTestFacade extends AbstractFacade<CcsTest> implements CcsTestFacadeLocal {
    @PersistenceContext(unitName = "ccs_proj1_lousaPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CcsTestFacade() {
        super(CcsTest.class);
    }
    
}
