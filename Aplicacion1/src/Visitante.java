public class Visitante {
    private String nombre;
    private String cedula;
    private String telefono;
    private String motivoVisita;
    private String nombrePersonaVisitar;
    private String fecha;
    private String tipoVisita;
    private String documento;
    
    public Visitante() {
        setNombre("");
        setCedula("");
        setTelefono("");
        setMotivoVisita("");
        setNombrePersonaVisitar("");
        setFecha("");
        setTipoVisita("");
        setDocumento("");
    }

    public Visitante(String nombre, String cedula, String telefono, String motivoVisita, String nombrePersonaVisitar, String fecha, String tipoVisita, String documento) {
        setNombre(nombre);
        setCedula(cedula);
        setTelefono(telefono);
        setMotivoVisita(motivoVisita);
        setNombrePersonaVisitar(nombrePersonaVisitar);
        setFecha(fecha);
        setTipoVisita(tipoVisita);
        setDocumento(documento);
    }

    public String getNombre() {
        return nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public String getTelefono() {
        return telefono;
    }
    public String getMotivoVisita() {
        return motivoVisita;
    }
    public String getNombrePersonaVisitar() {
        return nombrePersonaVisitar;
    }
    public String getFecha() {
        return fecha;
    }
    public String getTipoVisita() {
        return tipoVisita;
    }
    public String getDocumento() {
        return documento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void setMotivoVisita (String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }
    public void setNombrePersonaVisitar(String nombrePersonaVisitar) {
        this.nombrePersonaVisitar = nombrePersonaVisitar;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    public void setTipoVisita(String tipoVisita) {
        this.tipoVisita = tipoVisita;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
