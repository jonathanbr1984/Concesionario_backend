/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.concesionario.REST.service;

import com.concesionario.entities.Vehiculos;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author bratc
 */
@Stateless
@Path("vehiculos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VehiculosFacadeREST extends AbstractFacade<Vehiculos> {

    @PersistenceContext(unitName = "ConcesionarioApp_concesionarioApp_war_conc-1.0PU")
    private EntityManager em;

    public VehiculosFacadeREST() {
        super(Vehiculos.class);
    }

    @POST
    @Override
    public void create(Vehiculos entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    public void edit(@PathParam("id") Integer id, Vehiculos entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    public Vehiculos find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    public List<Vehiculos> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    public List<Vehiculos> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
