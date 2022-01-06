/*
 * self-managed-osdu
 * Rest API Documentation for Self Managed OSDU
 *
 * OpenAPI spec version: 0.11.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * EntitlementMemberDto
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:43:35.687Z")
public class EntitlementMemberDto {
  @SerializedName("email")
  private String email = null;

  @SerializedName("role")
  private String role = null;

  public EntitlementMemberDto email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Object ID or Email Address
   * @return email
  **/
  @ApiModelProperty(example = "email@domain.com", value = "Object ID or Email Address")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public EntitlementMemberDto role(String role) {
    this.role = role;
    return this;
  }

   /**
   * Role Name
   * @return role
  **/
  @ApiModelProperty(example = "MEMBER", value = "Role Name")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntitlementMemberDto entitlementMemberDto = (EntitlementMemberDto) o;
    return Objects.equals(this.email, entitlementMemberDto.email) &&
        Objects.equals(this.role, entitlementMemberDto.role);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, role);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntitlementMemberDto {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

