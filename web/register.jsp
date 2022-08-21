
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <title>Register</title>
        <!-- plugins:css -->
        <link rel="stylesheet" href="assets/vendors/mdi/css/materialdesignicons.min.css">
        <link rel="stylesheet" href="assets/vendors/css/vendor.bundle.base.css">
        <!-- endinject -->
        <!-- Plugin css for this page -->
        <!-- End plugin css for this page -->
        <!-- inject:css -->
        <!-- endinject -->
        <!-- Layout styles -->
        <link rel="stylesheet" href="assets/css/style.css">
        <!-- End layout styles -->
        <link rel="shortcut icon" href="assets/images/favicon.ico" />
        <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-gH2yIJqKdNHPEq0n4Mqa/HGKIhSkIHeL5AyhkYV8i59U5AR6csBvApHHNl/vI1Bx" crossorigin="anonymous">
    </head>
    <body>
        <div class="container-scroller">
            <div class="container-fluid page-body-wrapper full-page-wrapper">
                <div class="content-wrapper d-flex align-items-center auth">
                    <div class="row flex-grow">
                        <div class="col-lg-4 mx-auto">
                            <div class="auth-form-light text-left p-5">
                                <div class="brand-logo">
                                    <img src="assets/images/news.png">
                                </div>
                                <h4>New here?</h4>
                                <h6 class="font-weight-light">Signing up is easy. It only takes a few steps</h6>
                                <form class="pt-3" action="./LoginServlet" method="POST">
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="username" name="username" placeholder="Username">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="firstname" name="firstname" placeholder="Firstname">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="lastname" name="lastname" placeholder="Lastname">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="idno" name="idno" placeholder="ID Number">
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control form-control-lg" id="email" name="email" placeholder="Email">
                                    </div>
                                    <div class="form-group">
                                        <select class="form-control form-control-lg" id="country" name="country">
                                            <option disable>Country</option>
                                            <option value="South Africa">South Africa</option>
                                            <option value="Lesotho">Lesotho</option>
                                            <option value="Betswana">Botswana</option>
                                            <option value="Zimbabwe">Zimbabwe</option>
                                            <option value="Argentina">Argentina</option>
                                        </select>
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control form-control-lg" id="password" name="password" placeholder="Password">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control form-control-lg" id="password1" name="password1" placeholder="Retype password">
                                    </div>

                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="raddress" name="raddress" placeholder="Residential Address">
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="rcode" name="rcode" placeholder="Residential Code">
                                    </div>
                                    <div class="form-group">
                                        <label class="form-check-label text-muted">
                                            <input type="checkbox" class="form-check-input" name="isname"> Is same </label>
                                    </div>
                                    <div class="form-group">
                                        <input type="text" class="form-control form-control-lg" id="paddress" name="paddress" placeholder="Postal Address">
                                    </div>
                                    <div class="form-group">
                                        <input type="password" class="form-control form-control-lg" id="pcode" name="pcode" placeholder="Postal Code">
                                    </div>
                                    <div class="mb-4">

                                    </div>
                                    <div class="mt-3">
                                        <button class="btn btn-block btn-gradient-primary btn-lg font-weight-medium auth-form-btn" type="submit">SIGN UP</button>
                                    </div>
                                    <div class="text-center mt-4 font-weight-light"> Already have an account? <a href="index.jsp" class="text-primary">Login</a>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- content-wrapper ends -->
            </div>
            <!-- page-body-wrapper ends -->
        </div>
        <!-- container-scroller -->
        <!-- plugins:js -->
        <script src="assets/vendors/js/vendor.bundle.base.js"></script>
        <!-- endinject -->
        <!-- Plugin js for this page -->
        <!-- End plugin js for this page -->
        <!-- inject:js -->
        <script src="assets/js/off-canvas.js"></script>
        <script src="assets/js/hoverable-collapse.js"></script>
        <script src="assets/js/misc.js"></script>

    </body>
</html>
