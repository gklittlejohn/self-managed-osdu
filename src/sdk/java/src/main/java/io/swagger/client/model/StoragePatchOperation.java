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
import java.util.ArrayList;
import java.util.List;

/**
 * Patch api operation specific information
 */
@ApiModel(description = "Patch api operation specific information")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-01-06T19:56:05.916Z")
public class StoragePatchOperation {
  /**
   * Type of patch operation
   */
  @JsonAdapter(OpEnum.Adapter.class)
  public enum OpEnum {
    ADD("add"),
    
    REPLACE("replace"),
    
    REMOVE("remove");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<OpEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final OpEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public OpEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return OpEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("op")
  private OpEnum op = null;

  @SerializedName("path")
  private String path = null;

  @SerializedName("value")
  private List<String> value = new ArrayList<String>();

  public StoragePatchOperation op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * Type of patch operation
   * @return op
  **/
  @ApiModelProperty(required = true, value = "Type of patch operation")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public StoragePatchOperation path(String path) {
    this.path = path;
    return this;
  }

   /**
   * Path for batch operation
   * @return path
  **/
  @ApiModelProperty(required = true, value = "Path for batch operation")
  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public StoragePatchOperation value(List<String> value) {
    this.value = value;
    return this;
  }

  public StoragePatchOperation addValueItem(String valueItem) {
    this.value.add(valueItem);
    return this;
  }

   /**
   * Path for batch operation
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Path for batch operation")
  public List<String> getValue() {
    return value;
  }

  public void setValue(List<String> value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoragePatchOperation storagePatchOperation = (StoragePatchOperation) o;
    return Objects.equals(this.op, storagePatchOperation.op) &&
        Objects.equals(this.path, storagePatchOperation.path) &&
        Objects.equals(this.value, storagePatchOperation.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, path, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoragePatchOperation {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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

