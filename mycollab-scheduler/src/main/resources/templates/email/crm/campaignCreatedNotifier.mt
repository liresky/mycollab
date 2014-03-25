<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>New Campagin created</title>
</head>
<body>
	<table width="650" cellpadding="0" cellspacing="0" border="0" style="margin: 0px auto;">
		<tr>
			<td style="background: url('${defaultUrls.cdn_url}border_large_top_new.png') no-repeat 0 0 transparent; font-size: 11px; line-height: 11px;" height="11">&nbsp;</td>
		</tr>
		<tr>
			<td style="background: url('${defaultUrls.cdn_url}border_large_center_orange.png') repeat-y 0 0 transparent; text-align: center; padding-bottom: 10px;"><div style="width: 440px; display: inline-block; vertical-align: middle; text-align: left;"><span style="font: bold 18px Tahoma, Geneva, sans-serif; color: white;">New Campaign</span></div><div style="width: 150px; display: inline-block; vertical-align: middle;"><img src="${defaultUrls.cdn_url}logo_new.png" alt="esofthead-logo" width="150" height="45" style="margin: 0px; padding: 0px;"></div>
			</td>
		</tr>
		<tr>
			<td style="background: url('${defaultUrls.cdn_url}border_large_center_new.png') repeat-y 0 0 transparent; color: #4e4e4e; font: 13px 'Lucida Sans Unicode', 'Lucida Grande', sans-serif; padding: 10px 30px 0px;">
				<div style="font-weight: bold; display: block; border-bottom: 1px solid rgb(212, 212, 212); padding-bottom: 5px; margin-bottom: 10px;">Hi $!userName,</div>
				<div style="display: block; padding: 8px; background-color: rgb(247, 228, 221);">Just wanna let you know that a new campaign <a href="$!hyperLinks.campaignURL" style="color: rgb(216, 121, 55); text-decoration: underline;">$!simpleCampaign.campaignname</a> has been created. Here're details about it:</div>
				<table width="588" cellpadding="0" cellspacing="0" border="0" style="margin: 0 auto 25px;">
					<tr>
						<td style="color: #5a5a5a; font: 10px 'Lucida Sans Unicode', 'Lucida Grande', sans-serif; padding: 3px 10px;">
							<table cellpadding="0" cellspacing="5" border="0" style="font-size: 10px; width: 100%;">
								<tr>
									<td style="text-align: right; width : 100px; vertical-align: top;">Name:&nbsp;</td>
									<td style="word-wrap: break-word; white-space: normal;vertical-align: top; word-break: break-all;">$!simpleCampaign.campaignname</a></td>
									<td style="text-align: right; width : 100px; vertical-align: top;">Status:&nbsp;</td>
									<td style="width: 180px; vertical-align: top;">$!simpleCampaign.status</td>	
								</tr>
								<tr>
									<td style="text-align: right; vertical-align: top;">StartDate:&nbsp;</td>
									<td style="vertical-align: top;">$!date.format('short_date', $!simpleCampaign.startdate)</td>
									<td style="text-align: right; min-width: 90px; vertical-align: top;">Type:&nbsp;</td>
									<td style="width:180px;word-wrap: break-word; vertical-align: top; white-space: normal; word-break: break-all;">$!simpleCampaign.type</td>		
								</tr>
								<tr>
									<td style="text-align: right; vertical-align: top;">EndDate:&nbsp;</td>
									<td style="vertical-align: top;">$!date.format('short_date', $!simpleCampaign.enddate)</td>
									<td style="text-align: right; min-width: 90px; vertical-align: top;">Assignee:&nbsp;</td>
									<td style="width:180px;word-wrap: break-word;vertical-align: top; white-space: normal; word-break: break-all;">
										<a href="$!hyperLinks.assignUserURL" style="color: rgb(216, 121, 55); text-decoration: underline;">$!simpleCampaign.assignUserFullName</a>
									</td>	
								</tr>
								<tr>
									<td style="text-align: right; vertical-align: top;">Currency:&nbsp;</td>
									<td></td>
									<td style="text-align: right; width : 100px; vertical-align: top;">Budget:&nbsp;</td>
									<td style="width:180px;word-wrap: break-word; vertical-align: top; white-space: normal; word-break: break-all;">$!simpleCampaign.budget</td>		
								</tr>
								<tr>
									<td style="text-align: right; vertical-align: top;">Expected Cost:&nbsp;</td>
									<td>$!simpleCampaign.expectedcost</td>
									<td style="text-align: right; vertical-align: top;">Actual Cost:&nbsp;</td>
									<td style="width:180px; vertical-align: top;">$!simpleCampaign.actualcost</td>		
								</tr>
								<tr>
									<td style="text-align: right;">Expected Revenue:&nbsp;</td>
									<td>$!simpleCampaign.expectedrevenue</td>
								</tr>
								<tr>
									<td style="text-align: right; min-width: 90px; vertical-align: top;">Description:&nbsp;</td>
									<td colspan="3" style="word-wrap: break-word; white-space: normal; word-break: break-all;">$!simpleCampaign.description</td>
								</tr>
							</table>
						</td>
					</tr>
				</table>
			</td>
		</tr>
		#parse("templates/email/footer.mt")
	</table>
</body>
</html>