/*
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import android.os.Parcelable;
import android.os.Parcel;

/**
 * Model for testing model name starting with number
 */@ApiModel(description = "Model for testing model name starting with number")

public class Model200Response {

  @SerializedName("name")
  private Integer name = null;
  
  @SerializedName("class")
  private String propertyClass = null;
  
  public Model200Response name(Integer name) {
    this.name = name;
    return this;
  }

  
  /**
  * Get name
  * @return name
  **/
  @ApiModelProperty(value = "")
  public Integer getName() {
    return name;
  }
  public void setName(Integer name) {
    this.name = name;
  }
  
  public Model200Response propertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
    return this;
  }

  
  /**
  * Get propertyClass
  * @return propertyClass
  **/
  @ApiModelProperty(value = "")
  public String getPropertyClass() {
    return propertyClass;
  }
  public void setPropertyClass(String propertyClass) {
    this.propertyClass = propertyClass;
  }
  
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Model200Response _200Response = (Model200Response) o;
    return Objects.equals(this.name, _200Response.name) &&
        Objects.equals(this.propertyClass, _200Response.propertyClass);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, propertyClass);
  }
  
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Model200Response {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propertyClass: ").append(toIndentedString(propertyClass)).append("\n");
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

  
  public void writeToParcel(Parcel out, int flags) {
    
    out.writeValue(name);
    out.writeValue(propertyClass);
    
  }

  public Model200Response() {
    super();
  }

  Model200Response(Parcel in) {
    
    name = (Integer)in.readValue(null);propertyClass = (String)in.readValue(null);
  }

  public int describeContents() {
    return 0;
  }

  public static final Parcelable.Creator<Model200Response> CREATOR = new Parcelable.Creator<Model200Response>() {
    public Model200Response createFromParcel(Parcel in) {
      return new Model200Response(in);
    }
    public Model200Response[] newArray(int size) {
      return new Model200Response[size];
    }
  };
}



