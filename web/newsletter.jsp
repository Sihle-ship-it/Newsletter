
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML>
<html>
    <head>
        <title>Editorial by HTML5 UP</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no", shrink-to-fit=no />
        <link rel="stylesheet" href="assets2/css/main.css" />

        <link rel="stylesheet" href="assets/vendors/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">

        <link rel="stylesheet" href="assets/css/style.css">
        <!-- End layout styles -->
        <link rel="shortcut icon" href="assets/images/favicon.ico" />

        <link rel="stylesheet" href="assets/modal/style.css">
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">

    </head>
    <body class="is-preload">

        <!-- Wrapper -->
        <div id="wrapper">

            <!-- Main -->
            <div id="main">
                <div class="inner">

                    <!-- Header -->
                    <header id="header">
                        <a href="index.html" class="logo"><strong>Newsletter</strong></a>

                    </header>

                    <!-- Section -->
                    <section>

                        <div class="posts">
                            <article>
                                <a href="#" class="image"><img src="images/cnn.png" alt="" /></a>
                                <h3>CNN</h3>

                                <ul class="actions">
                                    <li><a href="#" class="button">Unsubscribe</a></li>
                                </ul>
                            </article>
                            <article>
                                <a href="#" class="image"><img src="images/sabc.png" alt="" /></a>
                                <h3>SABC News</h3>

                                <ul class="actions">
                                    <li><a href="#" class="button">Unsubscribe</a></li>
                                </ul>
                            </article>
                            <article>
                                <a href="#" class="image"><img src="images/enews.png" alt="" /></a>
                                <h3>eNews</h3>

                                <ul class="actions">
                                    <li><a href="#" class="button">Unsubscribe</a></li>
                                </ul>
                            </article>


                        </div>
                    </section>

                </div>
            </div>

            <!-- Navbar -->
            <nav class="navbar default-layout-navbar col-lg-12 col-12 p-0 fixed-top d-flex flex-row">
                <div class="text-center navbar-brand-wrapper d-flex align-items-center justify-content-center">
                    <a class="navbar-brand brand-logo" href="index.html"><img src="assets/images/news.png" alt="logo" /></a>
                    <a class="navbar-brand brand-logo-mini" href="index.html"><img src="assets/images/news.png" alt="logo" /></a>
                </div>
                <div class="navbar-menu-wrapper d-flex align-items-stretch">


                    <ul class="navbar-nav navbar-nav-right">
                        <li class="nav-item nav-profile dropdown">
                            <a class="nav-link dropdown-toggle" id="profileDropdown" href="#" data-bs-toggle="dropdown" aria-expanded="false">
                                <div class="nav-profile-img">
                                    <img src="assets/images/faces/face1.jpg" alt="image">
                                    <span class="availability-status online"></span>
                                </div>
                                <div class="nav-profile-text">
                                    <p class="mb-1 text-black">John Doe</p>
                                </div>
                            </a>
                            <div class="dropdown-menu navbar-dropdown" aria-labelledby="profileDropdown">

                                <div class="dropdown-divider"></div>
                                <a class="dropdown-item" href="#">
                                    <i class="mdi mdi-logout me-2 text-primary"></i> Signout </a>
                            </div>
                        </li>


                        <li class="nav-item nav-logout d-none d-lg-block">
                            <a class="nav-link" href="#">
                                <i class="mdi mdi-power"></i>
                            </a>
                        </li>

                    </ul>

                </div>
            </nav>

            <!-- Edd of Navar -->
            <!-- Sidebar -->
            <div id="sidebar">
                <div class="inner">

                    <!-- Section -->
                    <section>
                        <header class="major">
                            <h2>Subscribe to Newsletter</h2>
                        </header>
                        <!-- The Modal -->


                        <!-- Modal -->
                        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                            <div class="modal-dialog">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <h5 class="modal-title" id="exampleModalLabel">Subscribe to newsletter</h5>

                                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                    </div>
                                    <div class="modal-body">
                                        <form>
                                            <div class="mb-3">
                                                <label for="exampleInputEmail1" class="form-label">End date</label>
                                                <input type="date" class="form-control" id="exampleInputEmail1">                                               
                                            </div>
                                        </form>
                                    </div>
                                    <div class="modal-footer">
                                        <button type="button" class="btn btn-outline-danger" data-bs-dismiss="modal">Close</button>
                                        <button type="submit" class="btn btn-outline-danger">Subscribe</button>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="mini-posts">
                            <article>
                                <a href="#" class="image"><img src="images/cnn.png" alt="" /></a>
                                <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Subscribe to CNN</button>

                            </article>

                            <article>
                                <a href="#" class="image"><img src="images/enews.png" alt="" /></a>
                                <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Subscribe to eNews</button>

                            </article>
                            <article>
                                <a href="#" class="image"><img src="images/sabc.png" alt="" /></a>
                                <button type="button" class="btn btn-outline-danger" data-bs-toggle="modal" data-bs-target="#exampleModal">Subscribe to SABC News</button>

                            </article>
                        </div>

                    </section>

                    <!-- Footer -->
                    <footer id="footer">
                        <p class="copyright">&copy; Untitled. All rights reserved. Demo Images: <a href="https://unsplash.com">Unsplash</a>. Design: <a href="https://html5up.net">HTML5 UP</a>.</p>
                    </footer>

                </div>
            </div>

        </div>

        <!-- Scripts -->
        <script src="assets2/js/jquery.min.js"></script>
        <script src="assets2/js/browser.min.js"></script>
        <script src="assets2/js/breakpoints.min.js"></script>
        <script src="assets2/js/util.js"></script>
        <script src="assets2/js/main.js"></script>
        <script src="assets/modal/script.js"></script>
        <!-- JavaScript Bundle with Popper -->
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-A3rJD856KowSb7dwlZdYEkO39Gagi7vIsF0jrRAoQmDKKtQBHUuLZ9AsSv4jD4Xa" crossorigin="anonymous"></script>
        <!-- endinject -->

    </body>
</html>
