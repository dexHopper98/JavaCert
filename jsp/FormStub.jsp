<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%--Text stub --%>
								<div class="row">
									<div class="col-xs-12 col-sm-3">
										<span class="req">*</span>
										<label for="{IdofInputType}">LabelName:</label>
									</div>
									<div class="col-xs-12 col-sm-9">
										<input type="text" class="form-control" id="labelNameId" name="reg_||formId" value="${dataMap['formId'].userResponse}" required>
										<input type="hidden" name="formFields" value="formId"/>
									</div>
								</div>	
								
	<%--Select box stuf --%>	
								<div class="row">
									<div class="col-xs-12 col-sm-3">
										<span class="req">*</span>
										<label for="fieldID">LabelName</label>									
									</div>								
									<div class="col-xs-12 col-sm-9">
											<div class="select-wrapper">
											<select class="form-control" role="menu" name="reg_||fieldId" id="id" required >
													<c:forEach var="o" items="${dataMap['fieldId'].options }">
														<option value="<c:out value='${o.optionValue}'/>" <c:if test="${o.selected}">selected="selected"</c:if>><c:out value="${o.optionDesc}"/></option>
													</c:forEach>
												</select>
												<input type="hidden" name="formFields" value="fieldId"/>
												<span class="sprite sprite-red_arrow_down_sm_more">&nbsp;</span>
											</div>
									</div>
								</div>	
</body>
</html>