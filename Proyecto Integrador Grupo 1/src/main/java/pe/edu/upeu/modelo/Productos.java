package pe.edu.upeu.modelo;

public class Productos {
  public String productoId; 
  public String nombre;
  public double precioUnit;

  public String getProductoId() {
      return productoId;
  }
  public void setProductoId(String productoId) {
      this.productoId = productoId;
  }
  public String getNombre() {
      return nombre;
  }
  public void setNombre(String nombre) {
      this.nombre = nombre;
  }
  public double getPrecioUnit() {
      return precioUnit;
  }
  public void setPrecioUnit(double precioUnit) {
      this.precioUnit = precioUnit;
  } 
  
  
}