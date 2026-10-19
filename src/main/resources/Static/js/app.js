let autoSeleccionado = null;

// Función para cambiar de vista siguiendo el diagrama de continuidad
function mostrarVista(idVista) {
    let vistas = document.querySelectorAll('.vista');
    vistas.forEach(function(vista) {
        vista.style.display = "none";
    });

    let vistaActiva = document.getElementById(idVista);
    if (vistaActiva) {
        vistaActiva.style.display = "block";
    }
    
    window.scrollTo(0, 0);
}

// Capturar el vehículo seleccionado del catálogo
function seleccionarAuto(nombre, precio, imagenUrl) {
    autoSeleccionado = {
        nombre: nombre,
        precio: precio,
        imagen: imagenUrl,
        niv: "1ZRCASDDW21243RFT32RF4",
        color: "Azul"
    };

    // Rellenar vista de vehículo seleccionado
    document.getElementById("nombre-auto-sel").innerHTML = nombre;
    document.getElementById("precio-auto-sel").innerHTML = "<strong>Precio:</strong> " + precio;
    document.getElementById("img-seleccionada").src = imagenUrl;

    // Rellenar datos en la cotización y dejar el estatus listo como pendiente de envío
    document.getElementById("cotiz-nombre").innerHTML = "<strong>" + autoSeleccionado.nombre + "</strong>";
    document.getElementById("cotiz-precio").innerHTML = autoSeleccionado.precio;
    document.getElementById("cotiz-niv").innerHTML = "NIV: " + autoSeleccionado.niv;
    document.getElementById("cotiz-color").innerHTML = "Color: " + autoSeleccionado.color;
    document.getElementById("cotiz-estatus").innerHTML = "Estatus: <span style='color: #d97706;'>Pendiente de envío</span>";

    // Ir a la vista del vehículo seleccionado
    mostrarVista('vista-vehiculo');
}

// Enviar solicitud de cotización
function enviarCotizacion() {
    if (!autoSeleccionado) {
        alert("Primero debes seleccionar un vehículo del catálogo para poder cotizar.");
        mostrarVista('vista-catalogo');
        return;
    }

    // Actualizar estatus oficial a pendiente registrado
    document.getElementById("cotiz-estatus").innerHTML = "Estatus: <span style='color: #2563eb; font-weight: bold;'>⏳ Cotización Pendiente / Solicitada</span>";
    
    alert("¡Solicitud de cotización enviada con éxito! Quedará registrada como pendiente.");
    mostrarVista('vista-inicio');
}
// Función para cambiar dinámicamente la imagen, el color de fondo, título y descripción
function cambiarAuto(nuevaImagenUrl, nuevoTitulo, nuevaDescripcion) {
    // 1. Capturamos los elementos del DOM de la caja derecha
    let cajaInfo = document.getElementById("caja-info-auto");
    let imagenAuto = document.getElementById("imagen-auto-cambiante");
    let titulo = document.getElementById("titulo-auto-cambiante");
    let descripcion = document.getElementById("desc-auto-cambiante");

    // 2. Actualizamos la imagen del carro con la variante seleccionada
    imagenAuto.src = nuevaImagenUrl;

    // 4. Actualizamos el nombre y la descripción
    titulo.innerHTML = nuevoTitulo;
    descripcion.innerHTML = nuevaDescripcion;
}