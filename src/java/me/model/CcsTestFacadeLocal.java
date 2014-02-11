/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package me.model;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Lucas
 */
@Local
public interface CcsTestFacadeLocal {

    void create(CcsTest ccsTest);

    void edit(CcsTest ccsTest);

    void remove(CcsTest ccsTest);

    CcsTest find(Object id);

    List<CcsTest> findAll();

    List<CcsTest> findRange(int[] range);

    int count();
    
}
