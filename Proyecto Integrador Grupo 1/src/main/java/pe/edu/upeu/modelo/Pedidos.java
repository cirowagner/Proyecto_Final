package pe.edu.upeu.modelo;

public class Pedidos {

    public String pedidoId;
    public String fechaPed;

    public String productoId;
    public String descripPedido;
    public double cantidad;
    public double precioUnit;
    public double precioTotal;

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public String getDescripPedido() {
        return descripPedido;
    }

    public void setDescripPedido(String descripPedido) {
        this.descripPedido = descripPedido;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnit() {
        return precioUnit;
    }

    public void setPrecioUnit(double precioUnit) {
        this.precioUnit = precioUnit;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public String getPedidoId() {
        return pedidoId;
    }

    public void setPedidoId(String pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String getFechaPed() {
        return fechaPed;
    }

    public void setFechaPed(String fechaPed) {
        this.fechaPed = fechaPed;
    }

}