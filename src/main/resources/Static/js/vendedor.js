document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');

    // Transición de Login al Panel
    loginForm.addEventListener('submit', (e) => {
        e.preventDefault();

        const usuario = document.getElementById('username').value.trim();
        const contrasena = document.getElementById('password').value.trim();

        if (!usuario || !contrasena) {
            alert('Por favor ingresa usuario y contraseña.');
            return;
        }

        document.getElementById('vista-login').classList.add('hidden');
        document.getElementById('vista-vendedor').classList.remove('hidden');
    });
});

// Navegación entre las pestañas del menú lateral
function cambiarPestana(nombrePestana, botonPresionado) {
    const pestanas = document.querySelectorAll('.tab-content');
    pestanas.forEach(tab => tab.classList.remove('active'));

    const botones = document.querySelectorAll('.sidebar-nav .nav-btn:not(.btn-logout)');
    botones.forEach(btn => btn.classList.remove('active'));

    const destino = document.getElementById(`tab-${nombrePestana}`);
    if (destino) {
        destino.classList.add('active');
    }
    botonPresionado.classList.add('active');
}

// Cerrar sesión y volver al login
function cerrarSesion() {
    document.getElementById('username').value = '';
    document.getElementById('password').value = '';

    document.getElementById('vista-vendedor').classList.add('hidden');
    document.getElementById('vista-login').classList.remove('hidden');
}