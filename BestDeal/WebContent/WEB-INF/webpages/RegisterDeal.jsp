<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Register Your Deal</title>
    <!-- Bootstrap -->
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
  </head>
  <body>
  <h1 class="header">Register Your Deal</h1>
  
  <div class="container">
	<label>DEAL TYPE</label>
	<div class="row">
		<div class="col-lg-12">
			<label class="radio-inline">
			  <input type="radio" name="inlineRadioOptions" id="deals" value="option1">Deals
			</label>
			<label class="radio-inline">
				<input type="radio" name="inlineRadioOptions" id="vouchers" value="option2">Vouchers
			</label>
			<label class="radio-inline">
				<input type="radio" name="inlineRadioOptions" id="freebies" value="option3">Freebies
			</label>
			<label class="radio-inline">
			  <input type="radio" name="inlineRadioOptions" id="ask" value="option4">Ask
			</label>
			<label class="radio-inline">
				<input type="radio" name="inlineRadioOptions" id="competitions" value="option5">Competitions
			</label>
			<label class="radio-inline">
				<input type="radio" name="inlineRadioOptions" id="sales_trade" value="option6">For sale/Trade
			</label>
			<label class="radio-inline">
			  <input type="radio" name="inlineRadioOptions" id="misc" value="option7">Misc
			</label>
			<label class="radio-inline">
				<input type="radio" name="inlineRadioOptions" id="feedbacks" value="option8">Feedbacks
			</label>			
		</div>
	</div>
	<div class="row">
		<div class="col-lg-7">
			<div class="panel panel-primary">
				<div class="panel-body">
					<form name="submitDealInfo">
						<div class="form-group">
							<label for="dealURL">DEAL URL</label>
							<input type="url" class="form-control" id="dealURL" placeholder="Enter Your Deal URL">
						</div>
						<div class="form-group">
							<label for="title">TITLE</label>
							<input type="text" class="form-control" id="title" placeholder="Deal Title">
						</div>
						<div class="form-group">
							<label for="price">PRICE</label>
							<input type="text" class="form-control" id="price" placeholder="Deal Price">
						</div>
						<div class="form-group">
							<label for="price">TOPIC</label>
							<!- As per the need give id and name to option in select box->
							<select class="form-control">
							  <option selected>SELECT OPTION</option>
							  <option>Option 1</option>
							  <option>Option 2</option>
							  <option>Option 3</option>
							  <option>Option 4</option>
							  <option>Option 5</option>
							</select>
						</div>
						<div class="form-group">
							<label for="price">DETAILS</label>
							<textarea class="form-control" id="deal_info" rows="4" placeholder="Type your Deal description here......"  style="resize:none;"></textarea>
						</div>
					</form>
				</div>
			</div>
		</div>
		<div class="col-lg-5">
			<div class="panel panel-default">
				<div class="panel-heading">Optional Fields
				</div>
				<div class="panel-body">
					<div class="row">
						<div class="col-lg-5">
							<img src="#" id="preview" class="img-responsive" alt="Responsive image">
						</div>
						<div class="col-lg-7">
							<div class="form-group">
								  <div class="form-group">
									<label for="imageSourceFile">UPLOAD IMAGE</label>
									<input type="file" id="imageSourceFile">
									<p class="help-block">Select image to upload.</p>
								  </div>
								<label for="dealURL">..OR ENTER IMAGE URL</label>
								<input type="url" class="form-control" id="dealURL" placeholder="Enter Your Deal URL">
							</div>
						</div>
					</div>
					<div class="form-group">
						<label for="tags">TAGS</label>
						<input type="text" class="form-control" id="tags" placeholder="Image Tag">
					</div>
					<div class="row">
						<div class="col-lg-6">
							<label for="tags">START-DATE</label>
							<input type="date" class="form-control" id="start_date" placeholder="Image Tag">
						</div>
						<div class="col-lg-6">
							<label for="tags">END-DATE</label>
							<input type="date" class="form-control" id="end_date" placeholder="Image Tag">
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<div class="row">
		<button type="submit" class="btn btn-primary pull-right">Submit Deal</button>
	</div>
</div>
   
	<!-- custom js files-->
	<script src="<c:url value="resources/js/custom.js" />"></script>
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="<c:url value="resources/js/jquery.min.js" />"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="<c:url value="resources/js/bootstrap.min.js" />"></script>
  </body>
</html>