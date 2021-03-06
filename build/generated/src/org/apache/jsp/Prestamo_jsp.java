package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Prestamo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <!--Bootstrap CSS-->\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Discovery Books</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: 'Fredoke One',cursive;\n");
      out.write("                padding-bottom: 100px;\n");
      out.write("            }\n");
      out.write("            .flex-column{\n");
      out.write("                min-height: 39vh;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("                width: 250px;\n");
      out.write("                background-color: rgba(0,0,0,.315);\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);\n");
      out.write("            }\n");
      out.write("            .card:hover{\n");
      out.write("                transform: scale(1.02);\n");
      out.write("                background-color: rgba(0,0,0,.415); \n");
      out.write("            }\n");
      out.write("            .row-title {\n");
      out.write("                padding: 10px;\n");
      out.write("                position: absolute;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("            .cont-title {\n");
      out.write("                padding: 15px;\n");
      out.write("                border:15px;\n");
      out.write("                width: 40%;\n");
      out.write("            }\n");
      out.write("            .title{\n");
      out.write("                font-weight: 600;margin-bottom: 0;\n");
      out.write("            }\n");
      out.write("            .card-title{\n");
      out.write("                padding-top: 20px;padding-bottom:20px; \n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                color:white;font-size:30px;\n");
      out.write("            }\n");
      out.write("            .plane{\n");
      out.write("                width: 314px;height: 253px;padding: 12px;\n");
      out.write("            }\n");
      out.write("            .client{\n");
      out.write("                width: 260px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"imagenes/FondoPres.jpg\">\n");
      out.write("        <br>\n");
      out.write("    <center>\n");
      out.write("        <span style=\"margin-left: 90%\"><a class=\"boton btn btn-danger btn-sm\" method=\"post\" href=\"menubi.jsp\">Atras</a><div class=\"row-title\">\n");
      out.write("            <div class=\"col-8 w-100\">\n");
      out.write("                <div class=\"container text-center\">\n");
      out.write("                    <h1 class=\"text-white display-4\">Discovery Books</h1>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </span>\n");
      out.write("    </center><br><br><br><br><br><br>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"Prestamo_registrar.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"card-title\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Prestamo.png\" width=\"65%\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <label>Registar</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"Prestamo_lista.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"card-title\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Prestamo.png\" width=\"65%\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <label>Lista</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"card-title\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Prestamo.png\" width=\"65%\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <label>Modificar</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"col-sm-3\">\n");
      out.write("                        <a href=\"\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <div class=\"card-title\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Prestamo.png\" width=\"65%\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <label>Eliminar</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("         <!--Scripts-->\n");
      out.write("        <script src=\"Bootstrap/js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"jquery/jquery-3.3.1.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"popper/popper.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
