package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.LinkedList;
import java.lang.Integer;

public class Listas 
{
      //-------------CLIENTES--------------------
   private LinkedList<Clientes> ListaClientes= new LinkedList<Clientes>();
   //------------- CATEGORIAS--------------------
   private LinkedList<Categorias> ListaCategorias= new LinkedList<Categorias>(); 
   //-------------- CAUSAS------------------------------
   private LinkedList<Causa> ListaCausas= new LinkedList<Causa>();
   //-------------- RANKING-------------------------------------
    private LinkedList<Ranking> ListaRanking= new LinkedList<Ranking>();
    //------------- OBRAS -------------------------------------
     private LinkedList<Obra> ListaObras= new LinkedList<Obra>();  
   //-------------- RECURSOS ---------------------------
     private LinkedList<Recurso> ListaRecursos = new LinkedList<Recurso>();
     //------------- USUARIOS------------------
    private LinkedList<Usuario> ListaUsuarios = new LinkedList<Usuario>();

    public LinkedList<Obra> getListaObras() 
    {
        return ListaObras;
    }
    
     public LinkedList<Ranking> getListaRanking() {
        return ListaRanking;
    }

    public LinkedList<Categorias> getListaCategorias() {
        return ListaCategorias;
    }
    public LinkedList<Clientes> getListaClientes() 
    {
        return ListaClientes;
        
    }
    //------------- CAUSAS--------------------
    public LinkedList<Causa> getListaCausas()
    {
        return ListaCausas;
    }
     //---------------SERVICIOS------------------
     private LinkedList<Servicio> ListaServicios= new LinkedList<Servicio>();      

    public LinkedList<Servicio> getListaServicios() 
    {
        return ListaServicios;
    }
    //---------------TIPOS RECURSOS------------------
     private LinkedList<TipoRecurso> ListaTiposRecursos= new LinkedList<TipoRecurso>();      

    public LinkedList<TipoRecurso> getListaTiposRecursos() 
    {
        return ListaTiposRecursos;
    }
    
     //---------------TIPOS RECURSOS/SERVICIOS------------------
     private LinkedList<TipoRecursoServicio> ListaTiposRecursosServicios= new LinkedList<TipoRecursoServicio>();      

    public LinkedList<TipoRecursoServicio> getListaTiposRecursosServicios() 
    {
        return ListaTiposRecursosServicios;
    }
    //-------------------------------
         public LinkedList<Recurso> getListaRecurso() 
         
    {
        return ListaRecursos;
    }
         //-----------------------------------
      //---------------------------------
   public LinkedList<Usuario> getListaUsuarios()
   {
       return ListaUsuarios;
       
   }

    public Integer ExisteCausa(int CaCod)
    {
         int i=0;
    Causa causas;
    int CodLista;

   for (i=0; i <  ListaCausas.size();i++ )
   {
     causas=ListaCausas.get(i);
     CodLista=causas.getCacod();
     if (CodLista==CaCod) 
      return i;
             
   }   
      
   return -1;
    }
   //---------------------------------
  public Integer ExisteCliente(String rif)  
  {
     int i=0;
    Clientes cliente;
    String CodLista;

   for (i=0; i <  ListaClientes.size();i++ )
   {
     cliente=ListaClientes.get(i);
     CodLista=cliente.getRif();
                       
     if (CodLista.equals(rif.trim())) 
      return i;
             
   }   
      
   return -1;
 }
//-----------------------------------------------   
    public Integer ExisteServicio(String codigo)  
  {
     int i=0;
    Servicio servicio;
    String CodLista;

   for (i=0; i <  ListaServicios.size();i++ )
   {
     servicio=ListaServicios.get(i);
     CodLista=servicio.getCodigo();
                       
     if (CodLista.equals(codigo.trim())) 
      return i;
             
   }   
      
   return -1;
 }
//-----------------------------------------------     
       public Integer ExisteTipoRecurso(String codigo)  
  {
     int i=0;
    TipoRecurso tiporecurso;
    String CodLista;

   for (i=0; i <  ListaTiposRecursos.size();i++ )
   {
     tiporecurso=ListaTiposRecursos.get(i);
     CodLista=tiporecurso.getCodigo();
                       
     if (CodLista.equals(codigo.trim())) 
      return i;
             
   }   
      
   return -1;
 }
//-----------------------------------------------       
 public Integer ExisteTipoRecursoServicio(String codigo)  
  {
     int i=0;
    TipoRecursoServicio tiporecursoservicio;
    String CodLista;

   for (i=0; i <  ListaTiposRecursosServicios.size();i++ )
   {
     tiporecursoservicio=ListaTiposRecursosServicios.get(i);
     CodLista=tiporecursoservicio.getCodigo();
                       
     if (CodLista.equals(codigo.trim())) 
      return i;
             
   }   
      
   return -1;
 }
  //--------------------------------
 public Integer ExisteRanking(String codRank)  
  {
     int i=0;
    Ranking ranking;
    String CodListaR;

   for (i=0; i <  ListaRanking.size();i++ )
   {
     ranking=ListaRanking.get(i);
     CodListaR=ranking.getCodigoRank();
                       
     if (CodListaR.equals(codRank.trim())) 
      return i;
             
   }   
      
   return -1;
 }
  //----------------------------------------- 
   public Integer ExisteUsuario(String rif)  
  {
     int i=0;
    Usuario usuario;
    String CodLista;

   for (i=0; i <  ListaUsuarios.size();i++ )
   {
     usuario=ListaUsuarios.get(i);
     CodLista=usuario.getRif();
                       
     if (CodLista.equals(rif.trim())) 
      return i;
             
   }   
      
   return -1;
 }
 //-------------Abrir Clientes.txt y Cargar  Lista
 public void CargarClientes()
  {
    Clientes cliente=new Clientes();           
    String Via;
    int Cnt;
    File archivo = null;
    FileReader fr = null;
   // Date Fecha;
    BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Clientes.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                  case 1:cliente.setRif(linea); 
                         break;

                  case 2:cliente.setRazonSocial(linea); 
                         break;
                      
                  case 3:cliente.setDireccion(linea); 
                         break;

                  case 4:cliente.setTelefono(linea); 
                         break;
                      
                  case 5: cliente.setCorreo(linea);                                                                            
                         ListaClientes.add(cliente);                                         
                         cliente=new Clientes();
                         Cnt=0;
                         break;    
              }                
              
            }
                        
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }
 //------------------------------------------------
 public void CargarCategorias()
  {
    Categorias categoria=new Categorias();           
    String Via;
    int Cnt;
    File archivo = null;
    FileReader fr = null;
   // Date Fecha;
    BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Categorias.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         
         // Lectura del fichero
         String linea;
         int linea2;
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                  case 1:categoria.setCodCategoria(linea); 
                         break;
                      
                  case 2: categoria.setNombre(linea);                                                                            
                         ListaCategorias.add(categoria);                                         
                         categoria=new Categorias();
                         Cnt=0;
                         break;    
              }                
              
            }
                        
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }
 public void CargarCausas()
  {
    Causa causa=new Causa();           
    String Via;
    int Cnt;
    File archivo = null;
    FileReader fr = null;
   // Date Fecha;
    BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Archivo.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Causas.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
        
         // Lectura del fichero
         String linea;
        int linea2;
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                  case 1:causa.setCacod(Integer.parseInt(linea)); 
                         break;
                      
                  case 2: causa.setCaNombre(linea); 
                         break;
                  case 3: causa.setCadescrip(linea);
                         break;
                  case 4: causa.setCaduracion(Integer.parseInt(linea));
                         ListaCausas.add(causa);                                         
                         causa=new Causa();
                         Cnt=0;
                         break;    
              }                
              
            }
                        
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }
 //--------------------------------------
 public void CargarRanking()
  {
    Ranking ranking=new Ranking();           
    String Via;
    int Cnt;
    File archivo = null;
    FileReader fr = null;
   // Date Fecha;
    BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Ranking.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                  case 1:ranking.setCodigoRank(linea); 
                         break;

                  case 2:ranking.setNombreRank(linea); 
                         break;
                      
                  case 3:ranking.setDescripcionRank(linea); 
                         break;

                              
                  case 4:ranking.setNivelRank(Integer.parseInt(linea));                                                                            
                         ListaRanking.add(ranking);                                         
                         ranking=new Ranking();
                         Cnt=0;
                         break;    
              }                
              
            }
                        
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }
  public void CargarObras()
  {
    Obra obra=new Obra();           
    String Via;
    int Cnt;
    File archivo = null;
    FileReader fr = null;
   // Date Fecha;
    BufferedReader br = null;

      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         //archivo = new File ("C:\\Arbitros.txt");
                           
         Via=System.getProperty("user.dir")+"/src/Archivos/Obras.txt";   
        
         archivo = new File (Via);
         
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         // Lectura del fichero
         String linea;
         
         Cnt=0;
         
         while((linea=br.readLine())!=null)
            {               
              Cnt++;
              
              switch (Cnt)
              {
                  case 1:obra.setRifCliente(linea); 
                         break;

                  case 2:obra.setNombre(linea); 
                         break;
                      
                  case 3:obra.setDescripcion(linea); 
                  ListaObras.add(obra);                                         
                         obra=new Obra();
                         Cnt=0;
                         break;
                    
              }                
              
            }
                        
      }
      catch(Exception e){
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
         }
      }   
  }
  
}