
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New User</title>
        
        <%@include file="components/common-css-js.jsp" %>
        
    </head>
    <body>
        
        
        <%@include file="components/nevbar.jsp" %>
        
        <div class="container textcenter">
        <div class="container-fluid textcenter  mt-5 ml-10 ">
        <div class="row textcenter">
            <div class="col-md-6 ofset-md-3">
                
                <%@include file="components/message.jsp" %>
                
                <div class="card ml-10" >
                    
                    <div class="card-body px-5 textcenter">
                        
                         
                <h3>REGISTER HERE</h3>
                
                <form action="RegisterServlet" method="post">
                    
                     <div class="md-3">
                                 <label for="name" class="form-label">username</label>
                                 <input name="user_name" type="text" class="form-control" id="exampleInputEmail1"placeholder="Entername" aria-describedby="emailHelp">
                                 
                           </div>
                     <div class="md-3">
                                 
                                 <label for="email" class="form-label">Email</label>
                                 <input name="user_email" type="email" class="form-control" id="exampleInputEmail1"placeholder="example@xyz.com" aria-describedby="emailHelp">
                           </div>
                     <div class="md-3">
                                 <label for="password" class="form-label">Password</label>
                                 <input name="user_password" type="password" class="form-control" id="exampleInputEmail1"placeholder="EnterPassword" aria-describedby="emailHelp">
                                 
                           </div>
                     <div class="md-3">
                                 <label for="phone" class="form-label">Phone</label>
                                 <input name="user_phone" type="number" class="form-control" id="exampleInputEmail1"placeholder="EnterPhonenumber" aria-describedby="emailHelp">
                                 
                           </div>
                     <div class="md-3">
                                 <label for="address" class="form-label">User Address</label>
                                 <textarea name="user_address" class= "form-control"placeholder="Enter Address" ></textarea>
                                 
                           </div>
                    
                    <div class="container mt-3">
                        
                        <button class="btn btn-outline-success">Register</button>
                        <button class="btn btn-outline-warning">Reset</button>
                        
                    </div>
                    
                    
                </form>
              
                        
                    </div>
                
            </div>
        </div>
        </div>
        
        </div>
        
    </body>
</html>
