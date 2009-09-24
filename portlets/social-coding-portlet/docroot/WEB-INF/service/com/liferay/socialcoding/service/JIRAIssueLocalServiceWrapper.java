/**
 * Copyright (c) 2000-2009 Liferay, Inc. All rights reserved.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.liferay.socialcoding.service;

/**
 * <a href="JIRAIssueLocalServiceWrapper.java.html"><b><i>View Source</i></b>
 * </a>
 *
 * @author Brian Wing Shun Chan
 */
public class JIRAIssueLocalServiceWrapper implements JIRAIssueLocalService {
	public JIRAIssueLocalServiceWrapper(
		JIRAIssueLocalService jiraIssueLocalService) {
		_jiraIssueLocalService = jiraIssueLocalService;
	}

	public com.liferay.socialcoding.model.JIRAIssue addJIRAIssue(
		com.liferay.socialcoding.model.JIRAIssue jiraIssue)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.addJIRAIssue(jiraIssue);
	}

	public com.liferay.socialcoding.model.JIRAIssue createJIRAIssue(
		long jiraIssueId) {
		return _jiraIssueLocalService.createJIRAIssue(jiraIssueId);
	}

	public void deleteJIRAIssue(long jiraIssueId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_jiraIssueLocalService.deleteJIRAIssue(jiraIssueId);
	}

	public void deleteJIRAIssue(
		com.liferay.socialcoding.model.JIRAIssue jiraIssue)
		throws com.liferay.portal.SystemException {
		_jiraIssueLocalService.deleteJIRAIssue(jiraIssue);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.dynamicQuery(dynamicQuery);
	}

	public java.util.List<Object> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	public com.liferay.socialcoding.model.JIRAIssue getJIRAIssue(
		long jiraIssueId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getJIRAIssue(jiraIssueId);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getJIRAIssues(
		int start, int end) throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getJIRAIssues(start, end);
	}

	public int getJIRAIssuesCount() throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getJIRAIssuesCount();
	}

	public com.liferay.socialcoding.model.JIRAIssue updateJIRAIssue(
		com.liferay.socialcoding.model.JIRAIssue jiraIssue)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.updateJIRAIssue(jiraIssue);
	}

	public com.liferay.socialcoding.model.JIRAIssue updateJIRAIssue(
		com.liferay.socialcoding.model.JIRAIssue jiraIssue, boolean merge)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.updateJIRAIssue(jiraIssue, merge);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getAssigneeJIRAIssues(
		long projectId, java.lang.String assigneeJiraUserId, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssues(projectId,
			assigneeJiraUserId, start, end);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getAssigneeJIRAIssues(
		java.util.Date modifiedDate, long projectId,
		java.lang.String assigneeJiraUserId, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssues(modifiedDate,
			projectId, assigneeJiraUserId, start, end);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getAssigneeJIRAIssues(
		long projectId, java.lang.String assigneeJiraUserId,
		java.lang.String status, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssues(projectId,
			assigneeJiraUserId, status, start, end);
	}

	public int getAssigneeJIRAIssuesCount(long projectId,
		java.lang.String assigneeJiraUserId)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssuesCount(projectId,
			assigneeJiraUserId);
	}

	public int getAssigneeJIRAIssuesCount(java.util.Date modifiedDate,
		long projectId, java.lang.String assigneeJiraUserId)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssuesCount(modifiedDate,
			projectId, assigneeJiraUserId);
	}

	public int getAssigneeJIRAIssuesCount(long projectId,
		java.lang.String assigneeJiraUserId, java.lang.String status)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getAssigneeJIRAIssuesCount(projectId,
			assigneeJiraUserId, status);
	}

	public com.liferay.socialcoding.model.JIRAIssue getFirstAssigneeJIRAIssue(
		long projectId, java.lang.String assigneeJiraUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getFirstAssigneeJIRAIssue(projectId,
			assigneeJiraUserId);
	}

	public com.liferay.socialcoding.model.JIRAIssue getFirstReporterJIRAIssue(
		long projectId, java.lang.String reporterJiraUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getFirstReporterJIRAIssue(projectId,
			reporterJiraUserId);
	}

	public com.liferay.socialcoding.model.JIRAIssue getJIRAIssue(
		java.lang.String key)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getJIRAIssue(key);
	}

	public com.liferay.socialcoding.model.JIRAIssue getLastAssigneeJIRAIssue(
		long projectId, java.lang.String assigneeJiraUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getLastAssigneeJIRAIssue(projectId,
			assigneeJiraUserId);
	}

	public com.liferay.socialcoding.model.JIRAIssue getLastreporterJIRAIssue(
		long projectId, java.lang.String reporterJiraUserId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getLastreporterJIRAIssue(projectId,
			reporterJiraUserId);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getReporterJIRAIssues(
		long projectId, java.lang.String reporterJiraUserId, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssues(projectId,
			reporterJiraUserId, start, end);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getReporterJIRAIssues(
		java.util.Date modifiedDate, long projectId,
		java.lang.String reporterJiraUserId, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssues(modifiedDate,
			projectId, reporterJiraUserId, start, end);
	}

	public java.util.List<com.liferay.socialcoding.model.JIRAIssue> getReporterJIRAIssues(
		long projectId, java.lang.String reporterJiraUserId,
		java.lang.String status, int start, int end)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssues(projectId,
			reporterJiraUserId, status, start, end);
	}

	public int getReporterJIRAIssuesCount(long projectId,
		java.lang.String reporterJiraUserId)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssuesCount(projectId,
			reporterJiraUserId);
	}

	public int getReporterJIRAIssuesCount(java.util.Date modifiedDate,
		long projectId, java.lang.String reporterJiraUserId)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssuesCount(modifiedDate,
			projectId, reporterJiraUserId);
	}

	public int getReporterJIRAIssuesCount(long projectId,
		java.lang.String reporterJiraUserId, java.lang.String status)
		throws com.liferay.portal.SystemException {
		return _jiraIssueLocalService.getReporterJIRAIssuesCount(projectId,
			reporterJiraUserId, status);
	}

	public void updateJIRAIssues(long projectId)
		throws com.liferay.portal.PortalException,
			com.liferay.portal.SystemException {
		_jiraIssueLocalService.updateJIRAIssues(projectId);
	}

	private JIRAIssueLocalService _jiraIssueLocalService;
}