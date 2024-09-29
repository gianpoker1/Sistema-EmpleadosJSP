<%@ include file="common/cabecero.jsp"%>

<%@ include file="common/navegacion.jsp"%>

<div class="container">
  <div class="text-center" style="margin: 30px">
    <h3>A&ntilde;adir Empleado</h3>
  </div>
  <form action="${urlAgregar}" modelAttribute="empleadoForma" method="post">
    <div class="mb-3">
      <label for="nombre" class="form-label">Nombre</label>
      <input type="text" class="form-control" id="nombre" name="nombre" required>
    </div>
    <div class="mb-3">
      <label for="departamento" class="form-label">Departamento</label>
      <input type="text" class="form-control" id="departamento" name="departamento">
    </div>
    <div class="mb-3">
      <label for="sueldo" class="form-label">Sueldo</label>
      <input type="number" step="any" class="form-control" id="sueldo" name="sueldo">
    </div>
    <div class="text-center">
      <button type="submit" class="btn btn-warning btn-sm me-3">Agregar</button>
      <a href="${urlInicio}" class="btn btn-danger btn-sm">Volver</a>
    </div>
  </form>
</div>

<%@ include file="common/pie-pagina.jsp"%>