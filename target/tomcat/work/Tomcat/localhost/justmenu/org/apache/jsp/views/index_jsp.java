/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-17 15:48:46 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Map;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("        <title>Just Menu</title>\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("\n");
      out.write("        <!-- Font -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,600\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"Lib/css/fonts/beyond_the_mountains-webfont.css\" type=\"text/css\"/>\n");
      out.write("\n");
      out.write("        <!-- Stylesheets -->\n");
      out.write("        <link href=\"Lib/plugin-frameworks/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Lib/plugin-frameworks/swiper.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Lib/fonts/ionicons.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Lib/common/styles.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"Lib/css/custom.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("<style>\n");
      out.write(".footerx {\n");
      out.write("   position: fixed;\n");
      out.write("   left: 0;\n");
      out.write("   bottom: 0;\n");
      out.write("   width: 100%;\n");
      out.write("   background-color: red;\n");
      out.write("   color: white;\n");
      out.write("   text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("\n");
      out.write("        <script src=\"Lib/js/angular.min.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body ng-app=\"myApp\" ng-controller=\"myCtrl\">\n");
      out.write("\n");
      out.write("<header>\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <!-- <a class=\"logo\" href=\"#\"><img src=\"Lib/img/logo-white.png\" alt=\"Logo\"></a> -->\n");
      out.write("\n");
      out.write("                <div class=\"right-area\">\n");
      out.write("                        <h6><a class=\"plr-20 color-white btn-fill-primary\" href=\"#\">ORDER: +34 685 778 8892</a></h6>\n");
      out.write("                </div><!-- right-area -->\n");
      out.write("\n");
      out.write("                <a class=\"menu-nav-icon\" data-menu=\"#main-menu\" href=\"#\"><i class=\"ion-navicon\"></i></a>\n");
      out.write("\n");
      out.write("                <ul class=\"main-menu font-mountainsre\" id=\"main-menu\">\n");
      out.write("                        <li><a href=\"?pager=index\">HOME</a></li>\n");
      out.write("                        <li><a href=\"#aboutUs\">ABOUT US</a></li>\n");
      out.write("                        <li><a href=\"?pager=Cart\">Cart</a></li>\n");
      out.write("                        <li><a href=\"#contact\">CONTACT</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div class=\"clearfix\"></div>\n");
      out.write("        </div><!-- container -->\n");
      out.write("</header>\n");
      out.write("\n");
      out.write("\n");
      out.write("<section class=\"bg-1 h-900x main-slider pos-relative\">\n");
      out.write("        <div class=\"triangle-up pos-bottom\"></div>\n");
      out.write("        <div class=\"container h-100\">\n");
      out.write("                <div class=\"dplay-tbl\">\n");
      out.write("                        <div class=\"dplay-tbl-cell center-text color-white\">\n");
      out.write("\n");
      out.write("                                <h5><b>BEST IN TOWN</b></h5>\n");
      out.write("                                <h1 class=\"mt-30 mb-15\" >\n");
      out.write("                                    <!-- <u>Kota Zone</u> -->\n");
      out.write("                                    <img class=\"logoImage\" src=\"Lib/img/logo-white.png\" alt=\"Logo\">\n");
      out.write("                                </h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("var app = angular.module(\"myApp\", []);\n");
      out.write("app.controller(\"myCtrl\", function($scope) {\n");
      out.write("    $scope.kotas = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Kotas}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("    $scope.drinks = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Drinks}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("    $scope.others = ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${Others}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(";\n");
      out.write("\n");
      out.write("    console.log(\"kotas :\" + $scope.kotas);\n");
      out.write("});\n");
      out.write("</script>\n");
      out.write("                                <!-- <h5><a href=\"#\" class=\"btn-primaryc plr-25\"><b>SEE TODAYS MENU</b></a></h5> -->\n");
      out.write("                        </div><!-- dplay-tbl-cell -->\n");
      out.write("                </div><!-- dplay-tbl -->\n");
      out.write("        </div><!-- container -->\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<form action=\"OrderController\" method=\"post\">\n");
      out.write("\n");
      out.write("<section>\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"heading\">\n");
      out.write("                        <!-- <img class=\"heading-img\" src=\"Lib/img/heading_logo.png\" alt=\"\"> -->\n");
      out.write("                        <h2>Our Menu</h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-12\">\n");
      out.write("                                <ul class=\"selecton brdr-b-primary mb-70\">\n");
      out.write("                                        <li><a class=\"active\" href=\"#\" data-select=\"*\"><b>ALL</b></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-select=\"kotas\"><b>KOTAS</b></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-select=\"drinks\"><b>DRINKS</b></a></li>\n");
      out.write("                                        <li><a href=\"#\" data-select=\"others\"><b>OTHERS</b></a></li>\n");
      out.write("                                </ul>\n");
      out.write("                        </div><!--col-sm-12-->\n");
      out.write("                </div><!--row-->\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6 food-menu kotas\" ng-repeat=\"k in kotas\">\n");
      out.write("                                <div class=\"sided-90x mb-30 \">\n");
      out.write("                                        <div class=\"s-left\">\n");
      out.write("                                            <img class=\"br-3\" src=\"Lib/img/kotas/{{k.image}}\" alt=\"Menu Image\">\n");
      out.write("                                        </div><!--s-left-->\n");
      out.write("                                        <div class=\"s-right\">\n");
      out.write("                                                <h5 class=\"mb-10\"><b>{{k.name}}</b><b class=\"color-primary float-right\">R {{k.price}}</b></h5>\n");
      out.write("                                            <input type=\"checkbox\" name=\"kota{{k.id}}\" value={{k.id}} style=\"height: 40px;width: 40px;\">\n");
      out.write("                                                <p class=\"pr-70\">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea dictumst. </p>\n");
      out.write("                                        </div><!--s-right-->\n");
      out.write("                                </div><!-- sided-90x -->\n");
      out.write("                        </div><!-- food-menu -->\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6 food-menu drinks\"  ng-repeat=\"d in drinks\">\n");
      out.write("                                <div class=\"sided-90x mb-30 \">\n");
      out.write("                                        <div class=\"s-left\">\n");
      out.write("                                            <img class=\"br-3\" src=\"Lib/img/kotas/{{d.image}}\" alt=\"Menu Image\">\n");
      out.write("                                        </div><!--s-left-->\n");
      out.write("                                        <div class=\"s-right\">\n");
      out.write("                                                <h5 class=\"mb-10\"><b>{{d.name}}</b><b class=\"color-primary float-right\">R {{d.price}}</b></h5>\n");
      out.write("                                            <input type=\"checkbox\" name=\"drink{{d.id}}\" value={{d.id}} style=\"height: 40px;width: 40px;\">\n");
      out.write("                                                <p class=\"pr-70\">Proin dictum viverra varius. Etiam vulputate libero dui, at pretium elit elementum quis. </p>\n");
      out.write("                                        </div><!--s-right-->\n");
      out.write("                                </div><!-- sided-90x -->\n");
      out.write("                        </div><!-- food-menu -->\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6 food-menu others\"  ng-repeat=\"o in others\">\n");
      out.write("                                <div class=\"sided-90x mb-30 \">\n");
      out.write("                                        <div class=\"s-left\">\n");
      out.write("                                            <img class=\"br-3\" src=\"Lib/img/kotas/{{o.image}}\" alt=\"Menu Image\">\n");
      out.write("                                        </div><!--s-left-->\n");
      out.write("                                        <div class=\"s-right\">\n");
      out.write("                                                <h5 class=\"mb-10\"><b>{{o.name}}</b><b class=\"color-primary float-right\">R {{o.price}}</b></h5>\n");
      out.write("                                            <input type=\"checkbox\" name=\"other{{o.id}}\" value={{o.id}} style=\"height: 40px;width: 40px;\">\n");
      out.write("                                                <p class=\"pr-70\">Maecenas fermentum tortor id fringilla molestie. In hac habitasse platea dictumst. </p>\n");
      out.write("                                        </div><!--s-right-->\n");
      out.write("                                </div><!-- sided-90x -->\n");
      out.write("                        </div><!-- food-menu -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div><!-- row -->\n");
      out.write("\n");
      out.write("                <!-- <h6 class=\"center-text mt-40 mt-sm-20 mb-30\"><a href=\"#\" class=\"btn-primaryc plr-25\"><b>SEE TODAYS MENU</b></a></h6> -->\n");
      out.write("        </div><!-- container -->\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<div class=\"footerx center-sm-text pos-relative\">\n");
      out.write("     <br/>\n");
      out.write("     <div class=\"row\">\n");
      out.write("          <div class=\"col-md-6 food-menu others\">\n");
      out.write("                <input type=\"hidden\" value=\"Nceba\" name=\"user\" />\n");
      out.write("                <input type=\"submit\" value=\"Complete Order\" class=\"btn-brdr-primary plr-25\" />\n");
      out.write("          </div>\n");
      out.write("           <div class=\"col-md-6 food-menu others\">\n");
      out.write("                <input type=\"cancel\" value=\"Cancel\" class=\"btn-brdr-primary plr-25\" />\n");
      out.write("          </div>\n");
      out.write("     </div>\n");
      out.write("     <br/>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("<section class=\"story-area\" id=\"aboutUs\">\n");
      out.write("        <div class=\"abs-tbl bg-2 w-20 z--1 dplay-md-none\"></div>\n");
      out.write("        <div class=\"abs-tbr bg-3 w-20 z--1 dplay-md-none\"></div>\n");
      out.write("        <div class=\"container\">\n");
      out.write("                <div class=\"heading\">\n");
      out.write("                       <!-- <img class=\"heading-img\" src=\"Lib/img/heading_logo.png\" alt=\"\"> -->\n");
      out.write("                        <h2>Our Story</h2>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <p class=\"mb-30\">\n");
      out.write("                                        This is the project made by giants. The concept is clear.. the system is to\n");
      out.write("                                        create an ordering system for a kota shop. this shop does not actually exist.\n");
      out.write("                                        this system could have easily be created by using Angular, phonegap, IOS or\n");
      out.write("                                        android native... but due my practice in java, i chose to use Maven to create a\n");
      out.write("                                        war file that can be hosted on a java web server. the core of the data base is\n");
      out.write("                                        JSON files. plan was if i were to go live i would encrypt the JSON files and use\n");
      out.write("                                        secure certificates to protect the site and its content. or alternately use couchDB.\n");
      out.write("                                </p>\n");
      out.write("                        </div><!-- col-md-6 -->\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                                <p class=\"mb-30\">\n");
      out.write("                                        the site uses Java at its core. the plan is for the code to keep mutating and the\n");
      out.write("                                        approaches to change as i practice, learning more about java and Spring framework.\n");
      out.write("\n");
      out.write("                                </p>\n");
      out.write("                        </div><!-- col-md-6 -->\n");
      out.write("                </div><!-- row -->\n");
      out.write("        </div><!-- container -->\n");
      out.write("</section>\n");
      out.write("\n");
      out.write("<section id=\"#contact\" style=\"padding: 0 0 0 0;\">\n");
      out.write("<footer class=\"story-area pb-50  pt-70 pos-absolute\" >\n");
      out.write("        <div class=\"pos-top triangle-bottom\"></div>\n");
      out.write("        <div class=\"container-fluid\">\n");
      out.write("                <a href=\"index.html\"><img src=\"Lib/img/logo-white.png\" alt=\"Logo\"></a>\n");
      out.write("\n");
      out.write("                <div class=\"pt-30\">\n");
      out.write("                        <p class=\"underline-secondary\"><b>Address:</b></p>\n");
      out.write("                        <p>2410 Swan Rd , Riverlea, Ext 3</p>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"pt-30\">\n");
      out.write("                        <p class=\"underline-secondary mb-10\"><b>Phone:</b></p>\n");
      out.write("                        <a href=\"tel:+27 81 320 3500 \">+27 81 320 3500</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"pt-30\">\n");
      out.write("                        <p class=\"underline-secondary mb-10\"><b>Email:</b></p>\n");
      out.write("                        <a href=\"mailto:yourmail@gmail.com\"> Ncebsobikwa1@hotmail.com</a>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <ul class=\"icon mt-30\">\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-pinterest\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-facebook\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-twitter\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-dribbble-outline\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-linkedin\"></i></a></li>\n");
      out.write("                        <li><a href=\"#\"><i class=\"ion-social-vimeo\"></i></a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <p class=\"color-light font-9 mt-50 mt-sm-30\"><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->\n");
      out.write("Copyright &copy; <script>document.write(new Date().getFullYear());</script> All rights reserved | Nceba Sobikwa</a>\n");
      out.write("        </div><!-- container -->\n");
      out.write("</footer>\n");
      out.write("</section>\n");
      out.write("<!-- SCIPTS -->\n");
      out.write("<script src=\"Lib/plugin-frameworks/jquery-3.2.1.min.js\"></script>\n");
      out.write("<script src=\"Lib/plugin-frameworks/bootstrap.min.js\"></script>\n");
      out.write("<script src=\"Lib/plugin-frameworks/swiper.js\"></script>\n");
      out.write("<script src=\"Lib/common/scripts.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
