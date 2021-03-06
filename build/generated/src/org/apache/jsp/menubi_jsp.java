package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menubi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        \n");
      out.write("        <!--Bootstrap CSS-->\n");
      out.write("        <link href=\"Bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Discovery Books</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                font-family: 'Fredoke One',cursive;\n");
      out.write("                overflow-x: hidden;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100vh;\n");
      out.write("                position: relative;\n");
      out.write("                background-attachment: fixed;\n");
      out.write("                background-position: center;\n");
      out.write("                background-size: cover;   \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            .flex-column{\n");
      out.write("                min-height: 35vh;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("                background-color: rgba(0,0,0,.315);\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 5px 8px 8px rgba(100,100,100,0.6);\n");
      out.write("            }\n");
      out.write("            .cardc{\n");
      out.write("                width: 300px;\n");
      out.write("                background-color: rgba(400,0,0,.315);\n");
      out.write("                text-align: center;\n");
      out.write("                box-shadow: 5px 8px 8px rgba(200,100,100,0.6);\n");
      out.write("                height: 60px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                align-items: center;\n");
      out.write("            }\n");
      out.write("            .cardc:hover{\n");
      out.write("                transform: scale(1.02);\n");
      out.write("                background-color: rgba(200,54,54,.415);\n");
      out.write("            }\n");
      out.write("            .card:hover{\n");
      out.write("                transform: scale(1.02);\n");
      out.write("                background-color: rgba(0,0,0,.415); \n");
      out.write("            }\n");
      out.write("            .row-title {\n");
      out.write("                padding: 30px;\n");
      out.write("                width: 100%;z-index: 2;\n");
      out.write("            }\n");
      out.write("            .cont-title {\n");
      out.write("                padding: 30px;\n");
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
      out.write("                color:white;font-size:26px;\n");
      out.write("            }\n");
      out.write("            .plane{\n");
      out.write("                width: 314px;height: 253px;padding: 12px;\n");
      out.write("            }\n");
      out.write("            .client{\n");
      out.write("                width: 260px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .deg-background\n");
      out.write("            {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 0px;\n");
      out.write("                left: 0px;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 100%;\n");
      out.write("                background: rgba(0,0, 0, 0.6);\n");
      out.write("                z-index: -1;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body background=\"imagenes/cafe.jpg\">\n");
      out.write("        <div class=\"deg-background\"></div>\n");
      out.write("        <div class=\"row-title\">\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <h1 class=\"text-white display-4\">Discovery Books</h1>\n");
      out.write("                </div>                \n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <span style=\"margin-left: 15.5%\"></span>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <a href=\"Prestamo.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Prestamo.png\" width=\"54%\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                        <label>Prestamos</label><br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"margin-left: 10%\"></span>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <div class=\"m-auto\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <a href=\"Devolucion.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                        <img class=\"cliente\" src=\"imagenes/Devolucion.png\" width=\"40%\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\" style=\"margin-left: -10px\">\n");
      out.write("                                    <label>Devoluciones</label><br>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"margin-left: 10%\"></span>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                <div class=\"m-auto\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <a href=\"Lector.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <img class=\"cliente\" src=\"imagenes/Usuario.png\" width=\"29%\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                    <label>Lectores</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            \n");
      out.write("            <span style=\"margin-left: 28.5%\"></span>\n");
      out.write("            <div class=\"col-sm-2 \">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <a href=\"Material.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <img class=\"cliente\" src=\"imagenes/Material.png\" width=\"30%\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                    <label>Material</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("            <span style=\"margin-left: 10%\"></span>\n");
      out.write("            <div class=\"col-sm-2\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <a href=\"Reporte.jsp\">\n");
      out.write("                            <div class=\"card\">\n");
      out.write("                                <div class=\"card-body\">\n");
      out.write("                                    <img class=\"cliente\" src=\"imagenes/Reporte.png\" width=\"30%\">\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"card-footer\">\n");
      out.write("                                    <label>Reportes</label>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </a>\n");
      out.write("                        \n");
      out.write("                    </div>\n");
      out.write("            </div>\n");
      out.write("        </div><br><br>\n");
      out.write("        <div class=\"container\" style=\"margin-left: 135px\">\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col-sm-4\"></div>\n");
      out.write("        <div class=\"col-sm-4\">\n");
      out.write("            <a href=\"index.jsp\">\n");
      out.write("                <div class=\"cardc rounded\">\n");
      out.write("                    <div class=\"card-body\">\n");
      out.write("                        <label>Cerrar sesi??n</label>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"col-sm-4\"></div>\n");
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
