/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2021-11-18 19:21:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1637262575438L));
    _jspx_dependants.put("/WEB-INF/tags/scripts.tag", Long.valueOf(1637262575438L));
    _jspx_dependants.put("/WEB-INF/tags/logoGSO.tag", Long.valueOf(1637262575438L));
    _jspx_dependants.put("/WEB-INF/tags/navigationbar.tag", Long.valueOf(1637263225883L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      user.UserInformation userInfo = null;
      synchronized (session) {
        userInfo = (user.UserInformation) _jspx_page_context.getAttribute("userInfo", javax.servlet.jsp.PageContext.SESSION_SCOPE);
        if (userInfo == null){
          userInfo = new user.UserInformation();
          _jspx_page_context.setAttribute("userInfo", userInfo, javax.servlet.jsp.PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("  \t<title>Startseite</title>\r\n");
      out.write("    ");
      if (_jspx_meth_tag_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("    <div id=\"navigationbar\">\r\n");
      out.write("    \t");
      if (_jspx_meth_tag_005fnavigationbar_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"content\">\r\n");
      out.write("\t    <div>\r\n");
      out.write("\t    \t<img id=\"gsoPanorama\" src=\"assets/Panorama_GSO.jpg\" width=\"100%\" alt=\"panoramaGSO\">\r\n");
      out.write("\t    </div>\r\n");
      out.write("\t    <div id=\"content-home\" style=\"padding-left: 2%;padding-right:2%;\">\r\n");
      out.write("\t\t\t<h1 class=\"text-center\" id=\"titleSite\">\r\n");
      out.write("\t\t\t\tDeutsch-polnischer Jugendaustausch 2022\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa \r\n");
      out.write("\t\t\t<strong>strong</strong>. Cum sociis natoque penatibus \r\n");
      out.write("\t\t\tet magnis dis parturient montes, nascetur ridiculus \r\n");
      out.write("\t\t\tmus. Donec quam felis, ultricies nec, pellentesque \r\n");
      out.write("\t\t\teu, pretium quis, sem. Nulla consequat massa quis \r\n");
      out.write("\t\t\tenim. Donec pede justo, fringilla vel, aliquet nec, \r\n");
      out.write("\t\t\tvulputate eget, arcu. In enim justo, rhoncus ut, \r\n");
      out.write("\t\t\timperdiet a, venenatis vitae, justo. Nullam dictum \r\n");
      out.write("\t\t\tfelis eu pede <a class=\"external ext\" href=\"verwalten.jsp\">link</a> \r\n");
      out.write("\t\t\tmollis pretium. Integer tincidunt. Cras dapibus. \r\n");
      out.write("\t\t\tVivamus elementum semper nisi. Aenean vulputate \r\n");
      out.write("\t\t\teleifend tellus. Aenean leo ligula, porttitor eu, \r\n");
      out.write("\t\t\tconsequat vitae, eleifend ac, enim. Aliquam lorem ante, \r\n");
      out.write("\t\t\tdapibus in, viverra quis, feugiat a, tellus. Phasellus \r\n");
      out.write("\t\t\tviverra nulla ut metus varius laoreet. Quisque rutrum. \r\n");
      out.write("\t\t\tAenean imperdiet. Etiam ultricies nisi vel augue. \r\n");
      out.write("\t\t\tCurabitur ullamcorper ultricies nisi.</p>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"text-right\">\r\n");
      out.write("\t\t\t\t<h1>\r\n");
      out.write("\t\t\t\t\tLorem ipsum dolor sit amet consectetuer adipiscing \r\n");
      out.write("\t\t\t\t\telit\r\n");
      out.write("\t\t\t\t</h1>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t<h2>Aenean commodo ligula eget dolor aenean massa</h2>\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\tLorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa. \r\n");
      out.write("\t\t\t\t\tCum sociis natoque penatibus et magnis dis parturient \r\n");
      out.write("\t\t\t\t\tmontes, nascetur ridiculus mus. Donec quam felis, \r\n");
      out.write("\t\t\t\t\tultricies nec, pellentesque eu, pretium quis, sem.\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div class=\"text-center\">\r\n");
      out.write("\t\t\t\t<h2>Aenean commodo ligula eget dolor aenean massa</h2>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa. \r\n");
      out.write("\t\t\t\tCum sociis natoque penatibus et magnis dis parturient \r\n");
      out.write("\t\t\t\tmontes, nascetur ridiculus mus. Donec quam felis, \r\n");
      out.write("\t\t\t\tultricies nec, pellentesque eu, pretium quis, sem.</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa. \r\n");
      out.write("\t\t\t\tCum sociis natoque penatibus et magnis dis parturient \r\n");
      out.write("\t\t\t\tmontes, nascetur ridiculus mus. Donec quam felis, \r\n");
      out.write("\t\t\t\tultricies nec, pellentesque eu, pretium quis, sem.</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p class=\"text-danger\">Lorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa. \r\n");
      out.write("\t\t\t\tCum sociis natoque penatibus et magnis dis parturient \r\n");
      out.write("\t\t\t\tmontes, nascetur ridiculus mus. Donec quam felis, \r\n");
      out.write("\t\t\t\tultricies nec, pellentesque eu, pretium quis, sem.</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<p>Lorem ipsum dolor sit amet, consectetuer adipiscing \r\n");
      out.write("\t\t\t\telit. Aenean commodo ligula eget dolor. Aenean massa. \r\n");
      out.write("\t\t\t\tCum sociis natoque penatibus et magnis dis parturient \r\n");
      out.write("\t\t\t\tmontes, nascetur ridiculus mus. Donec quam felis, \r\n");
      out.write("\t\t\t\tultricies nec, pellentesque eu, pretium quis, sem.</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t    </div>  \r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"footer\">\r\n");
      out.write("    \t\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      if (_jspx_meth_tag_005fscripts_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tag_005fheader_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:header
    org.apache.jsp.tag.web.header_tag _jspx_th_tag_005fheader_005f0 = new org.apache.jsp.tag.web.header_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fheader_005f0);
    try {
      _jspx_th_tag_005fheader_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fheader_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fheader_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fnavigationbar_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:navigationbar
    org.apache.jsp.tag.web.navigationbar_tag _jspx_th_tag_005fnavigationbar_005f0 = new org.apache.jsp.tag.web.navigationbar_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fnavigationbar_005f0);
    try {
      _jspx_th_tag_005fnavigationbar_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fnavigationbar_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fnavigationbar_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fscripts_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:scripts
    org.apache.jsp.tag.web.scripts_tag _jspx_th_tag_005fscripts_005f0 = new org.apache.jsp.tag.web.scripts_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fscripts_005f0);
    try {
      _jspx_th_tag_005fscripts_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fscripts_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fscripts_005f0);
    }
    return false;
  }
}
