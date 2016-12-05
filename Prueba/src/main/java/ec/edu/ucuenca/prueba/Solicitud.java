package ec.edu.ucuenca.prueba;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@org.kie.api.definition.type.Label("SOlicitud de tr?mites")
public class Solicitud implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "SOLICITUD_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(sequenceName = "SOLICITUD_ID_SEQ", name = "SOLICITUD_ID_GENERATOR")
   @org.kie.api.definition.type.Label("Id")
   private java.lang.Long id;

   @org.kie.api.definition.type.Label("Fecha de solicitud")
   private java.util.Date fechaSolicitud;

   @org.kie.api.definition.type.Label("Fecha del Tr?mite")
   private java.util.Date fechaTramite;

   @javax.persistence.ElementCollection(fetch = javax.persistence.FetchType.EAGER)
   @org.kie.api.definition.type.Label("Esun documento de Quipux?")
   private java.util.List<java.lang.Boolean> esQuipux;

   @org.kie.api.definition.type.Label("T?tulo de la solicutud")
   private java.lang.String titulo;

   @org.kie.api.definition.type.Label("Finalizado?")
   private java.lang.Boolean finalizado;

   @org.kie.api.definition.type.Label("Feca de finalizaci?n del tr?mite")
   private java.util.Date fechaFin;

   public Solicitud()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.util.Date getFechaSolicitud()
   {
      return this.fechaSolicitud;
   }

   public void setFechaSolicitud(java.util.Date fechaSolicitud)
   {
      this.fechaSolicitud = fechaSolicitud;
   }

   public java.util.Date getFechaTramite()
   {
      return this.fechaTramite;
   }

   public void setFechaTramite(java.util.Date fechaTramite)
   {
      this.fechaTramite = fechaTramite;
   }

   public java.util.List<java.lang.Boolean> getEsQuipux()
   {
      return this.esQuipux;
   }

   public void setEsQuipux(java.util.List<java.lang.Boolean> esQuipux)
   {
      this.esQuipux = esQuipux;
   }

   public java.lang.String getTitulo()
   {
      return this.titulo;
   }

   public void setTitulo(java.lang.String titulo)
   {
      this.titulo = titulo;
   }

   public java.lang.Boolean getFinalizado()
   {
      return this.finalizado;
   }

   public void setFinalizado(java.lang.Boolean finalizado)
   {
      this.finalizado = finalizado;
   }

   public java.util.Date getFechaFin()
   {
      return this.fechaFin;
   }

   public void setFechaFin(java.util.Date fechaFin)
   {
      this.fechaFin = fechaFin;
   }

   public Solicitud(java.lang.Long id, java.util.Date fechaSolicitud,
         java.util.Date fechaTramite,
         java.util.List<java.lang.Boolean> esQuipux, java.lang.String titulo,
         java.lang.Boolean finalizado, java.util.Date fechaFin)
   {
      this.id = id;
      this.fechaSolicitud = fechaSolicitud;
      this.fechaTramite = fechaTramite;
      this.esQuipux = esQuipux;
      this.titulo = titulo;
      this.finalizado = finalizado;
      this.fechaFin = fechaFin;
   }

}