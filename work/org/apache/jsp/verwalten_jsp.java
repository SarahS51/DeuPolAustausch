/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.19
 * Generated at: 2021-11-19 10:49:36 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class verwalten_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(8);
    _jspx_dependants.put("/WEB-INF/tags/header.tag", Long.valueOf(1637317857247L));
    _jspx_dependants.put("/WEB-INF/tags/scripts.tag", Long.valueOf(1637318037881L));
    _jspx_dependants.put("/WEB-INF/tags/modalAccept.tag", Long.valueOf(1637318969628L));
    _jspx_dependants.put("/WEB-INF/tags/modalCancel.tag", Long.valueOf(1637318969631L));
    _jspx_dependants.put("/WEB-INF/tags/modalRegKey.tag", Long.valueOf(1637318969635L));
    _jspx_dependants.put("/WEB-INF/tags/logoGSO.tag", Long.valueOf(1637317857247L));
    _jspx_dependants.put("/WEB-INF/tags/navigationbar.tag", Long.valueOf(1637318037881L));
    _jspx_dependants.put("/WEB-INF/tags/modalGenCon.tag", Long.valueOf(1637318969632L));
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\t\t<title>Insert title here</title>\r\n");
      out.write("    \t");
      if (_jspx_meth_tag_005fheader_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      if (_jspx_meth_tag_005fnavigationbar_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t<h1 class=\"text-center\" id=\"titleSite\">\r\n");
      out.write("\t\tVerwalten\r\n");
      out.write("\t</h1>\r\n");
      out.write("\t<div id=\"content\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<strong>Rahmenbedingungen</strong>\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#genConModal\">Generieren!</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tzuletzt geändert am TT.DD.JJJJ\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<strong>Stronierung und Rückerstattung</strong>\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#cancelModal\">Generieren!</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tzuletzt geändert am TT.DD.JJJJ\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<strong>Zusage</strong>\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#acceptModal\">Generieren!</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tzuletzt geändert am TT.DD.JJJJ\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\t\t\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<strong>Schülerliste</strong>\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col d-flex justify-content-center\">\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\">Generieren!</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\tzuletzt geändert am TT.DD.JJJJ\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<h5>\r\n");
      out.write("\t\t\t\t\t\t<strong>Registrierungsschlüssel</strong>\r\n");
      out.write("\t\t\t\t\t</h5>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col d-flex justify-content-center\" >\r\n");
      out.write("\t\t\t\t\t<!-- Button trigger modal -->\r\n");
      out.write("\t\t\t\t\t<button type=\"button\" class=\"btn btn-primary btn-lg\" data-toggle=\"modal\" data-target=\"#regKeyModal\">\r\n");
      out.write("\t\t\t\t\t  Generieren!\r\n");
      out.write("\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"col\">\r\n");
      out.write("\t\t\t\t\t<strong>XXXXXXXXXXXXXXXX</strong>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<hr>\r\n");
      out.write("\t\t\t<h5 class=\"text-center\" id=\"titleSite\"><strong>Anwesenheitsliste</strong></h5>\r\n");
      out.write("\t\t\t<table class=\"table table-bordered\">\r\n");
      out.write("\t\t\t  <thead>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Nr.</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Name</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Vorname</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Klasse</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Klassenlehrer</th>\r\n");
      out.write("\t\t\t      <th scope=\"col\">Anwesenheit</th>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </thead>\r\n");
      out.write("\t\t\t  <tbody>\r\n");
      out.write("\t\t\t    <tr>\r\n");
      out.write("\t\t\t      <th scope=\"row\">1</th>\r\n");
      out.write("\t\t\t      <td>Mark</td>\r\n");
      out.write("\t\t\t      <td>Otto</td>\r\n");
      out.write("\t\t\t      <td>FIA9A</td>\r\n");
      out.write("\t\t\t      <td>Volker Stern</td>\r\n");
      out.write("\t\t\t      <td>\r\n");
      out.write("\t\t\t      <button type=\"button\" class=\"btn\" id=\"anwesend\">Anwesend</button>\r\n");
      out.write("\t\t\t      <button type=\"button\" class=\"btn\" id=\"entschuldigt\">Entschuldigt</button>\r\n");
      out.write("\t\t\t      <button type=\"button\" class=\"btn\" id=\"fehlt\">Fehlt</button>\r\n");
      out.write("\t\t\t      </td>\r\n");
      out.write("\t\t\t    </tr>\r\n");
      out.write("\t\t\t  </tbody>\r\n");
      out.write("\t\t\t</table>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_tag_005fmodalAccept_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tag_005fmodalCancel_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tag_005fmodalGenCon_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tag_005fmodalRegKey_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      if (_jspx_meth_tag_005fscripts_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_tag_005fmodalAccept_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:modalAccept
    org.apache.jsp.tag.web.modalAccept_tag _jspx_th_tag_005fmodalAccept_005f0 = new org.apache.jsp.tag.web.modalAccept_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fmodalAccept_005f0);
    try {
      _jspx_th_tag_005fmodalAccept_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fmodalAccept_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fmodalAccept_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmodalCancel_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:modalCancel
    org.apache.jsp.tag.web.modalCancel_tag _jspx_th_tag_005fmodalCancel_005f0 = new org.apache.jsp.tag.web.modalCancel_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fmodalCancel_005f0);
    try {
      _jspx_th_tag_005fmodalCancel_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fmodalCancel_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fmodalCancel_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmodalGenCon_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:modalGenCon
    org.apache.jsp.tag.web.modalGenCon_tag _jspx_th_tag_005fmodalGenCon_005f0 = new org.apache.jsp.tag.web.modalGenCon_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fmodalGenCon_005f0);
    try {
      _jspx_th_tag_005fmodalGenCon_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fmodalGenCon_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fmodalGenCon_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_tag_005fmodalRegKey_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  tag:modalRegKey
    org.apache.jsp.tag.web.modalRegKey_tag _jspx_th_tag_005fmodalRegKey_005f0 = new org.apache.jsp.tag.web.modalRegKey_tag();
    _jsp_getInstanceManager().newInstance(_jspx_th_tag_005fmodalRegKey_005f0);
    try {
      _jspx_th_tag_005fmodalRegKey_005f0.setJspContext(_jspx_page_context);
      _jspx_th_tag_005fmodalRegKey_005f0.doTag();
    } finally {
      _jsp_getInstanceManager().destroyInstance(_jspx_th_tag_005fmodalRegKey_005f0);
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
