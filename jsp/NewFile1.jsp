<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='formAction' value='${pageContext.request.contextPath}${applicationScope.adminToolPath}'/>
<c:set var='data' value='${requestScope.adminModuleData.actionData}' />
<c:set var='label' value='Add'/>

<div class="panel panel-default">
	<div class="panel-heading">
		
	</div>
	<div class="panel-body">
		<form class="form-horizontal" name='' action='<c:out value='${formAction}'/>' method='POST' enctype="multipart/form-data">
			<input type='hidden' name='requestType' value='reqUpdate'>
			<input type='hidden' name='actionId' value='<c:out value='${param.actionId}'/>'>
			<input type='hidden' name='siteId' value='<c:out value='${param.siteId}'/>'>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">:</label>
				<div class="col-sm-10">
					<input type='hidden' name='' value='<c:out value='${data.actionId}'/>'>
					<label class="control-label"><c:out value='${data.actionId}'/></label>
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">:</label>
				<div class="col-sm-10">
					<input type='text' class="form-control" id="" name='' size='50' maxlength="50" value='<c:out value='${data.}'/>'>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for=""></label>
				<div class="col-sm-10">
					<select class="selectpicker" name="" id="">
						<option value="0" <c:if test="${data.== 0}">selected</c:if>>No</option>
						<option value="1" <c:if test="${data. == 1}">selected</c:if>>Yes</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<label for="" class="col-sm-2 control-label">:</label>
				<div class="col-sm-10">
					<input type="file" class="form-control" name="">
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-2">
					<input type='button' value='<c:out value='${label}'/>' onClick="updateOrg(this.form, '');" class="btn btn-primary">
				</div>
			</div>
		</form>
	</div>
</div>