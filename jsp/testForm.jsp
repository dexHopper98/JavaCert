<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var='formAction' value='${pageContext.request.contextPath}${applicationScope.adminToolPath}'/>
<c:set var='data' value='${requestScope.adminModuleData.actionData}' />
<c:set var='label' value='Add'/>

<div class="panel panel-default">
	<div class="panel-heading">
		[PANEL-HEADING]
	</div>
	<div class="panel-body">
		<form class="form-horizontal" name='[FORM-NAME]' action='<c:out value='${formAction}'/>' method='POST' enctype="multipart/form-data">
			<input type='hidden' name='requestType' value='reqUpdate'>
			<input type='hidden' name='actionId' value='<c:out value='${param.actionId}'/>'>
			<input type='hidden' name='siteId' value='<c:out value='${param.siteId}'/>'>
			<div class="form-group">
				<label for="[STATIC-FIELD-ID]" class="col-sm-2 control-label">[STATIC-FIELD-NAME]:</label>
				<div class="col-sm-10">
					<input type='hidden' name='[STATIC-FIELD-ID]' value='<c:out value='${data.actionId}'/>'>
					<label class="control-label"><c:out value='${data.actionId}'/></label>
				</div>
			</div>
			<div class="form-group">
				<label for="[INPUT-FIELD-NAME]" class="col-sm-2 control-label">[INPUT-FIELD-NAME]:</label>
				<div class="col-sm-10">
					<input type='text' class="form-control" id="[INPUT-FIELD-NAME]" name='[INPUT-FIELD-NAME]' size='50' maxlength="50" value='<c:out value='${data.[FIELD-VALUE]}'/>'>
				</div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label" for="SMS_Campaign">[SIMPLE-SELECT-NAME]</label>
				<div class="col-sm-10">
					<select class="selectpicker" name="[SIMPLE-SELECT-NAME]" id="[SIMPLE-SELECT-ID]">
						<option value="0" <c:if test="${data.[SIMPLE-SELECT-VALUE] == 0}">selected</c:if>>No</option>
						<option value="1" <c:if test="${data.[SIMPLE-SELECT-VALUE] == 1}">selected</c:if>>Yes</option>
					</select>
				</div>
			</div>
			<div class="form-group">
				<div class="col-sm-10 col-sm-offset-2">
					<input type='button' value='<c:out value='${label}'/>' onClick="updateOrg(this.form, '[FORM-NAME]');" class="btn btn-primary">
				</div>
			</div>
		</form>
	</div>
</div>