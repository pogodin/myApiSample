package com.abhi.openapi.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-03-29T21:27:48.925634-07:00[America/Los_Angeles]")
public class User   {
  @JsonProperty("userkey")
  private Integer userkey;

  @JsonProperty("name")
  private String name;

  @JsonProperty("employee_id")
  private String employeeId;

  @JsonProperty("title")
  private String title;

  @JsonProperty("employment_type")
  private String employmentType;

  @JsonProperty("first_name")
  private String firstName;

  @JsonProperty("last_name")
  private String lastName;

  @JsonProperty("email")
  private String email;

  @JsonProperty("manager_email")
  private String managerEmail;

  @JsonProperty("employee_class")
  private String employeeClass;

  @JsonProperty("status")
  private String status;

  @JsonProperty("create_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createDate;

  @JsonProperty("start_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime startDate;

  @JsonProperty("end_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime endDate;

  @JsonProperty("update_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime updateDate;

  @JsonProperty("department")
  private String department;

  @JsonProperty("location")
  private String location;

  @JsonProperty("cost_center")
  private String costCenter;

  @JsonProperty("rehire")
  private Boolean rehire;

  @JsonProperty("rehire_date")
  @org.springframework.format.annotation.DateTimeFormat(iso = org.springframework.format.annotation.DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime rehireDate;

  @JsonProperty("team_key")
  private Integer teamKey;

  @JsonProperty("user_type")
  private String userType;

  public User userkey(Integer userkey) {
    this.userkey = userkey;
    return this;
  }

  /**
   * Get userkey
   * @return userkey
  */
  @ApiModelProperty(value = "")


  public Integer getUserkey() {
    return userkey;
  }

  public void setUserkey(Integer userkey) {
    this.userkey = userkey;
  }

  public User name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public User employeeId(String employeeId) {
    this.employeeId = employeeId;
    return this;
  }

  /**
   * Get employeeId
   * @return employeeId
  */
  @ApiModelProperty(value = "")


  public String getEmployeeId() {
    return employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public User title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Get title
   * @return title
  */
  @ApiModelProperty(value = "")


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public User employmentType(String employmentType) {
    this.employmentType = employmentType;
    return this;
  }

  /**
   * Get employmentType
   * @return employmentType
  */
  @ApiModelProperty(value = "")


  public String getEmploymentType() {
    return employmentType;
  }

  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * Get firstName
   * @return firstName
  */
  @ApiModelProperty(value = "")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Get lastName
   * @return lastName
  */
  @ApiModelProperty(value = "")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public User email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Get email
   * @return email
  */
  @ApiModelProperty(value = "")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public User managerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
    return this;
  }

  /**
   * Get managerEmail
   * @return managerEmail
  */
  @ApiModelProperty(value = "")


  public String getManagerEmail() {
    return managerEmail;
  }

  public void setManagerEmail(String managerEmail) {
    this.managerEmail = managerEmail;
  }

  public User employeeClass(String employeeClass) {
    this.employeeClass = employeeClass;
    return this;
  }

  /**
   * Get employeeClass
   * @return employeeClass
  */
  @ApiModelProperty(value = "")


  public String getEmployeeClass() {
    return employeeClass;
  }

  public void setEmployeeClass(String employeeClass) {
    this.employeeClass = employeeClass;
  }

  public User status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
  */
  @ApiModelProperty(value = "")


  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public User createDate(OffsetDateTime createDate) {
    this.createDate = createDate;
    return this;
  }

  /**
   * Get createDate
   * @return createDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getCreateDate() {
    return createDate;
  }

  public void setCreateDate(OffsetDateTime createDate) {
    this.createDate = createDate;
  }

  public User startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Get startDate
   * @return startDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getStartDate() {
    return startDate;
  }

  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  public User endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * Get endDate
   * @return endDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getEndDate() {
    return endDate;
  }

  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }

  public User updateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * Get updateDate
   * @return updateDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getUpdateDate() {
    return updateDate;
  }

  public void setUpdateDate(OffsetDateTime updateDate) {
    this.updateDate = updateDate;
  }

  public User department(String department) {
    this.department = department;
    return this;
  }

  /**
   * Get department
   * @return department
  */
  @ApiModelProperty(value = "")


  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public User location(String location) {
    this.location = location;
    return this;
  }

  /**
   * Get location
   * @return location
  */
  @ApiModelProperty(value = "")


  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public User costCenter(String costCenter) {
    this.costCenter = costCenter;
    return this;
  }

  /**
   * Get costCenter
   * @return costCenter
  */
  @ApiModelProperty(value = "")


  public String getCostCenter() {
    return costCenter;
  }

  public void setCostCenter(String costCenter) {
    this.costCenter = costCenter;
  }

  public User rehire(Boolean rehire) {
    this.rehire = rehire;
    return this;
  }

  /**
   * Get rehire
   * @return rehire
  */
  @ApiModelProperty(value = "")


  public Boolean getRehire() {
    return rehire;
  }

  public void setRehire(Boolean rehire) {
    this.rehire = rehire;
  }

  public User rehireDate(OffsetDateTime rehireDate) {
    this.rehireDate = rehireDate;
    return this;
  }

  /**
   * Get rehireDate
   * @return rehireDate
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getRehireDate() {
    return rehireDate;
  }

  public void setRehireDate(OffsetDateTime rehireDate) {
    this.rehireDate = rehireDate;
  }

  public User teamKey(Integer teamKey) {
    this.teamKey = teamKey;
    return this;
  }

  /**
   * Get teamKey
   * @return teamKey
  */
  @ApiModelProperty(value = "")


  public Integer getTeamKey() {
    return teamKey;
  }

  public void setTeamKey(Integer teamKey) {
    this.teamKey = teamKey;
  }

  public User userType(String userType) {
    this.userType = userType;
    return this;
  }

  /**
   * Get userType
   * @return userType
  */
  @ApiModelProperty(value = "")


  public String getUserType() {
    return userType;
  }

  public void setUserType(String userType) {
    this.userType = userType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.userkey, user.userkey) &&
        Objects.equals(this.name, user.name) &&
        Objects.equals(this.employeeId, user.employeeId) &&
        Objects.equals(this.title, user.title) &&
        Objects.equals(this.employmentType, user.employmentType) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.managerEmail, user.managerEmail) &&
        Objects.equals(this.employeeClass, user.employeeClass) &&
        Objects.equals(this.status, user.status) &&
        Objects.equals(this.createDate, user.createDate) &&
        Objects.equals(this.startDate, user.startDate) &&
        Objects.equals(this.endDate, user.endDate) &&
        Objects.equals(this.updateDate, user.updateDate) &&
        Objects.equals(this.department, user.department) &&
        Objects.equals(this.location, user.location) &&
        Objects.equals(this.costCenter, user.costCenter) &&
        Objects.equals(this.rehire, user.rehire) &&
        Objects.equals(this.rehireDate, user.rehireDate) &&
        Objects.equals(this.teamKey, user.teamKey) &&
        Objects.equals(this.userType, user.userType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userkey, name, employeeId, title, employmentType, firstName, lastName, email, managerEmail, employeeClass, status, createDate, startDate, endDate, updateDate, department, location, costCenter, rehire, rehireDate, teamKey, userType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    userkey: ").append(toIndentedString(userkey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    employeeId: ").append(toIndentedString(employeeId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    employmentType: ").append(toIndentedString(employmentType)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    managerEmail: ").append(toIndentedString(managerEmail)).append("\n");
    sb.append("    employeeClass: ").append(toIndentedString(employeeClass)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createDate: ").append(toIndentedString(createDate)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    department: ").append(toIndentedString(department)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    costCenter: ").append(toIndentedString(costCenter)).append("\n");
    sb.append("    rehire: ").append(toIndentedString(rehire)).append("\n");
    sb.append("    rehireDate: ").append(toIndentedString(rehireDate)).append("\n");
    sb.append("    teamKey: ").append(toIndentedString(teamKey)).append("\n");
    sb.append("    userType: ").append(toIndentedString(userType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

