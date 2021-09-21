
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "issuetype",
    "timespent",
    "project",
    "fixVersions",
    "aggregatetimespent",
    "resolution",
    "customfield_10027",
    "resolutiondate",
    "workratio",
    "watches",
    "lastViewed",
    "created",
    "customfield_10020",
    "customfield_10021",
    "customfield_10022",
    "priority",
    "labels",
    "customfield_10026",
    "customfield_10016",
    "customfield_10017",
    "customfield_10018",
    "customfield_10019",
    "timeestimate",
    "aggregatetimeoriginalestimate",
    "versions",
    "issuelinks",
    "assignee",
    "updated",
    "status",
    "components",
    "timeoriginalestimate",
    "description",
    "customfield_10010",
    "customfield_10014",
    "timetracking",
    "customfield_10015",
    "customfield_10005",
    "customfield_10006",
    "customfield_10007",
    "security",
    "customfield_10008",
    "customfield_10009",
    "attachment",
    "aggregatetimeestimate",
    "summary",
    "creator",
    "subtasks",
    "reporter",
    "aggregateprogress",
    "customfield_10000",
    "customfield_10001",
    "customfield_10002",
    "customfield_10003",
    "customfield_10004",
    "environment",
    "duedate",
    "progress",
    "comment",
    "votes",
    "worklog"
})
public class Fields {

    @JsonProperty("issuetype")
    private Issuetype issuetype;
    @JsonProperty("timespent")
    private Object timespent;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("fixVersions")
    private List<Object> fixVersions = null;
    @JsonProperty("aggregatetimespent")
    private Object aggregatetimespent;
    @JsonProperty("resolution")
    private Object resolution;
    @JsonProperty("customfield_10027")
    private Object customfield10027;
    @JsonProperty("resolutiondate")
    private Object resolutiondate;
    @JsonProperty("workratio")
    private Integer workratio;
    @JsonProperty("watches")
    private Watches watches;
    @JsonProperty("lastViewed")
    private Object lastViewed;
    @JsonProperty("created")
    private String created;
    @JsonProperty("customfield_10020")
    private Object customfield10020;
    @JsonProperty("customfield_10021")
    private Object customfield10021;
    @JsonProperty("customfield_10022")
    private String customfield10022;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("labels")
    private List<Object> labels = null;
    @JsonProperty("customfield_10026")
    private Object customfield10026;
    @JsonProperty("customfield_10016")
    private Object customfield10016;
    @JsonProperty("customfield_10017")
    private Object customfield10017;
    @JsonProperty("customfield_10018")
    private Customfield10018 customfield10018;
    @JsonProperty("customfield_10019")
    private Object customfield10019;
    @JsonProperty("timeestimate")
    private Object timeestimate;
    @JsonProperty("aggregatetimeoriginalestimate")
    private Object aggregatetimeoriginalestimate;
    @JsonProperty("versions")
    private List<Object> versions = null;
    @JsonProperty("issuelinks")
    private List<Object> issuelinks = null;
    @JsonProperty("assignee")
    private Object assignee;
    @JsonProperty("updated")
    private String updated;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("components")
    private List<Object> components = null;
    @JsonProperty("timeoriginalestimate")
    private Object timeoriginalestimate;
    @JsonProperty("description")
    private String description;
    @JsonProperty("customfield_10010")
    private Object customfield10010;
    @JsonProperty("customfield_10014")
    private Object customfield10014;
    @JsonProperty("timetracking")
    private Timetracking timetracking;
    @JsonProperty("customfield_10015")
    private Object customfield10015;
    @JsonProperty("customfield_10005")
    private Object customfield10005;
    @JsonProperty("customfield_10006")
    private Object customfield10006;
    @JsonProperty("customfield_10007")
    private Object customfield10007;
    @JsonProperty("security")
    private Object security;
    @JsonProperty("customfield_10008")
    private Object customfield10008;
    @JsonProperty("customfield_10009")
    private Object customfield10009;
    @JsonProperty("attachment")
    private List<Object> attachment = null;
    @JsonProperty("aggregatetimeestimate")
    private Object aggregatetimeestimate;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("creator")
    private Creator creator;
    @JsonProperty("subtasks")
    private List<Object> subtasks = null;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("aggregateprogress")
    private Aggregateprogress aggregateprogress;
    @JsonProperty("customfield_10000")
    private String customfield10000;
    @JsonProperty("customfield_10001")
    private Object customfield10001;
    @JsonProperty("customfield_10002")
    private Object customfield10002;
    @JsonProperty("customfield_10003")
    private Object customfield10003;
    @JsonProperty("customfield_10004")
    private Object customfield10004;
    @JsonProperty("environment")
    private Object environment;
    @JsonProperty("duedate")
    private Object duedate;
    @JsonProperty("progress")
    private Progress progress;
    @JsonProperty("comment")
    private Comment comment;
    @JsonProperty("votes")
    private Votes votes;
    @JsonProperty("worklog")
    private Worklog worklog;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("issuetype")
    public Issuetype getIssuetype() {
        return issuetype;
    }

    @JsonProperty("issuetype")
    public void setIssuetype(Issuetype issuetype) {
        this.issuetype = issuetype;
    }

    @JsonProperty("timespent")
    public Object getTimespent() {
        return timespent;
    }

    @JsonProperty("timespent")
    public void setTimespent(Object timespent) {
        this.timespent = timespent;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public void setProject(Project project) {
        this.project = project;
    }

    @JsonProperty("fixVersions")
    public List<Object> getFixVersions() {
        return fixVersions;
    }

    @JsonProperty("fixVersions")
    public void setFixVersions(List<Object> fixVersions) {
        this.fixVersions = fixVersions;
    }

    @JsonProperty("aggregatetimespent")
    public Object getAggregatetimespent() {
        return aggregatetimespent;
    }

    @JsonProperty("aggregatetimespent")
    public void setAggregatetimespent(Object aggregatetimespent) {
        this.aggregatetimespent = aggregatetimespent;
    }

    @JsonProperty("resolution")
    public Object getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public void setResolution(Object resolution) {
        this.resolution = resolution;
    }

    @JsonProperty("customfield_10027")
    public Object getCustomfield10027() {
        return customfield10027;
    }

    @JsonProperty("customfield_10027")
    public void setCustomfield10027(Object customfield10027) {
        this.customfield10027 = customfield10027;
    }

    @JsonProperty("resolutiondate")
    public Object getResolutiondate() {
        return resolutiondate;
    }

    @JsonProperty("resolutiondate")
    public void setResolutiondate(Object resolutiondate) {
        this.resolutiondate = resolutiondate;
    }

    @JsonProperty("workratio")
    public Integer getWorkratio() {
        return workratio;
    }

    @JsonProperty("workratio")
    public void setWorkratio(Integer workratio) {
        this.workratio = workratio;
    }

    @JsonProperty("watches")
    public Watches getWatches() {
        return watches;
    }

    @JsonProperty("watches")
    public void setWatches(Watches watches) {
        this.watches = watches;
    }

    @JsonProperty("lastViewed")
    public Object getLastViewed() {
        return lastViewed;
    }

    @JsonProperty("lastViewed")
    public void setLastViewed(Object lastViewed) {
        this.lastViewed = lastViewed;
    }

    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(String created) {
        this.created = created;
    }

    @JsonProperty("customfield_10020")
    public Object getCustomfield10020() {
        return customfield10020;
    }

    @JsonProperty("customfield_10020")
    public void setCustomfield10020(Object customfield10020) {
        this.customfield10020 = customfield10020;
    }

    @JsonProperty("customfield_10021")
    public Object getCustomfield10021() {
        return customfield10021;
    }

    @JsonProperty("customfield_10021")
    public void setCustomfield10021(Object customfield10021) {
        this.customfield10021 = customfield10021;
    }

    @JsonProperty("customfield_10022")
    public String getCustomfield10022() {
        return customfield10022;
    }

    @JsonProperty("customfield_10022")
    public void setCustomfield10022(String customfield10022) {
        this.customfield10022 = customfield10022;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    @JsonProperty("labels")
    public List<Object> getLabels() {
        return labels;
    }

    @JsonProperty("labels")
    public void setLabels(List<Object> labels) {
        this.labels = labels;
    }

    @JsonProperty("customfield_10026")
    public Object getCustomfield10026() {
        return customfield10026;
    }

    @JsonProperty("customfield_10026")
    public void setCustomfield10026(Object customfield10026) {
        this.customfield10026 = customfield10026;
    }

    @JsonProperty("customfield_10016")
    public Object getCustomfield10016() {
        return customfield10016;
    }

    @JsonProperty("customfield_10016")
    public void setCustomfield10016(Object customfield10016) {
        this.customfield10016 = customfield10016;
    }

    @JsonProperty("customfield_10017")
    public Object getCustomfield10017() {
        return customfield10017;
    }

    @JsonProperty("customfield_10017")
    public void setCustomfield10017(Object customfield10017) {
        this.customfield10017 = customfield10017;
    }

    @JsonProperty("customfield_10018")
    public Customfield10018 getCustomfield10018() {
        return customfield10018;
    }

    @JsonProperty("customfield_10018")
    public void setCustomfield10018(Customfield10018 customfield10018) {
        this.customfield10018 = customfield10018;
    }

    @JsonProperty("customfield_10019")
    public Object getCustomfield10019() {
        return customfield10019;
    }

    @JsonProperty("customfield_10019")
    public void setCustomfield10019(Object customfield10019) {
        this.customfield10019 = customfield10019;
    }

    @JsonProperty("timeestimate")
    public Object getTimeestimate() {
        return timeestimate;
    }

    @JsonProperty("timeestimate")
    public void setTimeestimate(Object timeestimate) {
        this.timeestimate = timeestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public Object getAggregatetimeoriginalestimate() {
        return aggregatetimeoriginalestimate;
    }

    @JsonProperty("aggregatetimeoriginalestimate")
    public void setAggregatetimeoriginalestimate(Object aggregatetimeoriginalestimate) {
        this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    @JsonProperty("issuelinks")
    public List<Object> getIssuelinks() {
        return issuelinks;
    }

    @JsonProperty("issuelinks")
    public void setIssuelinks(List<Object> issuelinks) {
        this.issuelinks = issuelinks;
    }

    @JsonProperty("assignee")
    public Object getAssignee() {
        return assignee;
    }

    @JsonProperty("assignee")
    public void setAssignee(Object assignee) {
        this.assignee = assignee;
    }

    @JsonProperty("updated")
    public String getUpdated() {
        return updated;
    }

    @JsonProperty("updated")
    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("components")
    public List<Object> getComponents() {
        return components;
    }

    @JsonProperty("components")
    public void setComponents(List<Object> components) {
        this.components = components;
    }

    @JsonProperty("timeoriginalestimate")
    public Object getTimeoriginalestimate() {
        return timeoriginalestimate;
    }

    @JsonProperty("timeoriginalestimate")
    public void setTimeoriginalestimate(Object timeoriginalestimate) {
        this.timeoriginalestimate = timeoriginalestimate;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("customfield_10010")
    public Object getCustomfield10010() {
        return customfield10010;
    }

    @JsonProperty("customfield_10010")
    public void setCustomfield10010(Object customfield10010) {
        this.customfield10010 = customfield10010;
    }

    @JsonProperty("customfield_10014")
    public Object getCustomfield10014() {
        return customfield10014;
    }

    @JsonProperty("customfield_10014")
    public void setCustomfield10014(Object customfield10014) {
        this.customfield10014 = customfield10014;
    }

    @JsonProperty("timetracking")
    public Timetracking getTimetracking() {
        return timetracking;
    }

    @JsonProperty("timetracking")
    public void setTimetracking(Timetracking timetracking) {
        this.timetracking = timetracking;
    }

    @JsonProperty("customfield_10015")
    public Object getCustomfield10015() {
        return customfield10015;
    }

    @JsonProperty("customfield_10015")
    public void setCustomfield10015(Object customfield10015) {
        this.customfield10015 = customfield10015;
    }

    @JsonProperty("customfield_10005")
    public Object getCustomfield10005() {
        return customfield10005;
    }

    @JsonProperty("customfield_10005")
    public void setCustomfield10005(Object customfield10005) {
        this.customfield10005 = customfield10005;
    }

    @JsonProperty("customfield_10006")
    public Object getCustomfield10006() {
        return customfield10006;
    }

    @JsonProperty("customfield_10006")
    public void setCustomfield10006(Object customfield10006) {
        this.customfield10006 = customfield10006;
    }

    @JsonProperty("customfield_10007")
    public Object getCustomfield10007() {
        return customfield10007;
    }

    @JsonProperty("customfield_10007")
    public void setCustomfield10007(Object customfield10007) {
        this.customfield10007 = customfield10007;
    }

    @JsonProperty("security")
    public Object getSecurity() {
        return security;
    }

    @JsonProperty("security")
    public void setSecurity(Object security) {
        this.security = security;
    }

    @JsonProperty("customfield_10008")
    public Object getCustomfield10008() {
        return customfield10008;
    }

    @JsonProperty("customfield_10008")
    public void setCustomfield10008(Object customfield10008) {
        this.customfield10008 = customfield10008;
    }

    @JsonProperty("customfield_10009")
    public Object getCustomfield10009() {
        return customfield10009;
    }

    @JsonProperty("customfield_10009")
    public void setCustomfield10009(Object customfield10009) {
        this.customfield10009 = customfield10009;
    }

    @JsonProperty("attachment")
    public List<Object> getAttachment() {
        return attachment;
    }

    @JsonProperty("attachment")
    public void setAttachment(List<Object> attachment) {
        this.attachment = attachment;
    }

    @JsonProperty("aggregatetimeestimate")
    public Object getAggregatetimeestimate() {
        return aggregatetimeestimate;
    }

    @JsonProperty("aggregatetimeestimate")
    public void setAggregatetimeestimate(Object aggregatetimeestimate) {
        this.aggregatetimeestimate = aggregatetimeestimate;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public void setSummary(String summary) {
        this.summary = summary;
    }

    @JsonProperty("creator")
    public Creator getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    @JsonProperty("subtasks")
    public List<Object> getSubtasks() {
        return subtasks;
    }

    @JsonProperty("subtasks")
    public void setSubtasks(List<Object> subtasks) {
        this.subtasks = subtasks;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public void setReporter(Reporter reporter) {
        this.reporter = reporter;
    }

    @JsonProperty("aggregateprogress")
    public Aggregateprogress getAggregateprogress() {
        return aggregateprogress;
    }

    @JsonProperty("aggregateprogress")
    public void setAggregateprogress(Aggregateprogress aggregateprogress) {
        this.aggregateprogress = aggregateprogress;
    }

    @JsonProperty("customfield_10000")
    public String getCustomfield10000() {
        return customfield10000;
    }

    @JsonProperty("customfield_10000")
    public void setCustomfield10000(String customfield10000) {
        this.customfield10000 = customfield10000;
    }

    @JsonProperty("customfield_10001")
    public Object getCustomfield10001() {
        return customfield10001;
    }

    @JsonProperty("customfield_10001")
    public void setCustomfield10001(Object customfield10001) {
        this.customfield10001 = customfield10001;
    }

    @JsonProperty("customfield_10002")
    public Object getCustomfield10002() {
        return customfield10002;
    }

    @JsonProperty("customfield_10002")
    public void setCustomfield10002(Object customfield10002) {
        this.customfield10002 = customfield10002;
    }

    @JsonProperty("customfield_10003")
    public Object getCustomfield10003() {
        return customfield10003;
    }

    @JsonProperty("customfield_10003")
    public void setCustomfield10003(Object customfield10003) {
        this.customfield10003 = customfield10003;
    }

    @JsonProperty("customfield_10004")
    public Object getCustomfield10004() {
        return customfield10004;
    }

    @JsonProperty("customfield_10004")
    public void setCustomfield10004(Object customfield10004) {
        this.customfield10004 = customfield10004;
    }

    @JsonProperty("environment")
    public Object getEnvironment() {
        return environment;
    }

    @JsonProperty("environment")
    public void setEnvironment(Object environment) {
        this.environment = environment;
    }

    @JsonProperty("duedate")
    public Object getDuedate() {
        return duedate;
    }

    @JsonProperty("duedate")
    public void setDuedate(Object duedate) {
        this.duedate = duedate;
    }

    @JsonProperty("progress")
    public Progress getProgress() {
        return progress;
    }

    @JsonProperty("progress")
    public void setProgress(Progress progress) {
        this.progress = progress;
    }

    @JsonProperty("comment")
    public Comment getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(Comment comment) {
        this.comment = comment;
    }

    @JsonProperty("votes")
    public Votes getVotes() {
        return votes;
    }

    @JsonProperty("votes")
    public void setVotes(Votes votes) {
        this.votes = votes;
    }

    @JsonProperty("worklog")
    public Worklog getWorklog() {
        return worklog;
    }

    @JsonProperty("worklog")
    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
