(function() {
  const dialogoHTML = `
    <div id="mensajeDlg" class="dialogo">
      <div class="contenido-dialogo">
        <p id="textoMensaje">Mensaje aqui</p>
        <div class="botones">
          <button id="botonAceptar" type="button">Aceptar</button>
        </div>
      </div>
    </div>
  `;

  const estiloCSS = `
    .dialogo {
      display: none;
      position: fixed;
      inset: 0;
      background-color: rgba(10, 31, 29, 0.42);
      z-index: 1000;
      justify-content: center;
      align-items: center;
      padding: 20px;
    }
    .contenido-dialogo {
      width: min(420px, 100%);
      background-color: #ffffff;
      border: 1px solid #d7e1dc;
      border-left: 8px solid #ef7b45;
      border-radius: 6px;
      padding: 22px;
      box-shadow: 0 18px 42px rgba(22, 48, 42, 0.22);
      color: #1d2a27;
      text-align: left;
      font-family: "Segoe UI", Arial, Helvetica, sans-serif;
    }
    .contenido-dialogo p {
      margin: 0 0 18px;
      color: #1d2a27;
      line-height: 1.45;
    }
    .botones {
      display: flex;
      justify-content: flex-end;
      gap: 12px;
    }
    .botones button {
      min-height: 40px;
      padding: 8px 18px;
      background-color: #0f6b61;
      color: white;
      border: 1px solid #0f6b61;
      border-radius: 6px;
      cursor: pointer;
      font-weight: 800;
    }
    .botones button:hover {
      background-color: #0a433f;
      border-color: #0a433f;
    }
  `;

  const styleSheet = document.createElement("style");
  styleSheet.type = "text/css";
  styleSheet.innerText = estiloCSS;
  document.head.appendChild(styleSheet);
  document.body.insertAdjacentHTML('beforeend', dialogoHTML);

  window.cerrarDialogoMensaje = function() {
    document.getElementById('mensajeDlg').style.display = 'none';
  };

  window.mostrarMensaje = function(textoMensaje) {
    return new Promise((resolve) => {
      document.getElementById('textoMensaje').textContent = textoMensaje;
      document.getElementById('mensajeDlg').style.display = 'flex';
      document.getElementById('botonAceptar').onclick = function() {
        cerrarDialogoMensaje();
        resolve();
      };
    });
  };

  window.serializarFormulario = function(formularioId) {
    const formulario = document.getElementById(formularioId);
    if (!formulario) {
      return {};
    }

    return Object.fromEntries(new FormData(formulario).entries());
  };
})();
