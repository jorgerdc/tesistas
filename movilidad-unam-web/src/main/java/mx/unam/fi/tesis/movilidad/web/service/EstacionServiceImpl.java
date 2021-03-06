package mx.unam.fi.tesis.movilidad.web.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import mx.unam.fi.tesis.movilidad.dao.EstacionDAO;
import mx.unam.fi.tesis.movilidad.web.controller.EstacionController;
import mx.unam.fi.tesis.movilidad.web.model.Estacion;
import mx.unam.fi.tesis.movilidad.web.model.Ruta;

/**
 * Declaracion de las funciones para el servicio de las estaciones.
 */
@Service("estacionService")
public class EstacionServiceImpl implements EstacionService {
  private static final Logger log = LoggerFactory.getLogger(EstacionController.class);
  @Resource
  private EstacionDAO estacionDao;

  @Override
  public List<Estacion> listadoEstaciones() {
    List<Estacion> listado = estacionDao.getListado();
    return listado;
  }

  @Override
  public void guardarEstacion(Estacion estacion) {
    estacionDao.guardarEstacion(estacion);
  }

  @Override
  public List<Ruta> verificarRuta(Estacion estacion) {
    return estacionDao.verificarRuta(estacion);
  }

  @Override
  public List<Estacion> getEstacionesRuta(Ruta ruta) {
    return estacionDao.getEstacionesRuta(ruta);
  }

  @Override
  public List<Estacion> getEstacionesCercanas(Estacion estacion) {
    return estacionDao.getEstacionesCercanas(estacion);
  }
}
