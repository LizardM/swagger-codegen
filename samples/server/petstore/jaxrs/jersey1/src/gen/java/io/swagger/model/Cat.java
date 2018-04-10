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


package io.swagger.model;


import java.util.Objects;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Animal;



import javax.validation.constraints.*;




/**
 * Cat
 */

public class Cat extends Animal  {
  
    
      
  
  @JsonProperty("className")
  
  
  
  
  private String className = null;
  

  
    
      
  
  @JsonProperty("color")
  
  
  
  
  private String color = "red";
  

  
    
      
  
  @JsonProperty("declawed")
  
  
  
  
  private Boolean declawed = null;
  

  
  
  
  public Cat className(String className) {
    this.className = className;
    return this;
  }
  
  

  
  /**
  
  
   * Get className
  
  
  
   * @return className
   **/
 
  
  @JsonProperty("className")
  
  @ApiModelProperty(required = true, value = "")

  @NotNull

  public String getClassName() {
    return className;
  }
  

  public void setClassName(String className) {
    this.className = className;
  }
  

  
  
  public Cat color(String color) {
    this.color = color;
    return this;
  }
  
  

  
  /**
  
  
   * Get color
  
  
  
   * @return color
   **/
 
  
  @JsonProperty("color")
  
  @ApiModelProperty(value = "")

  public String getColor() {
    return color;
  }
  

  public void setColor(String color) {
    this.color = color;
  }
  

  
  
  public Cat declawed(Boolean declawed) {
    this.declawed = declawed;
    return this;
  }
  
  

  
  /**
  
  
   * Get declawed
  
  
  
   * @return declawed
   **/
 
  
  @JsonProperty("declawed")
  
  @ApiModelProperty(value = "")

  public Boolean isisDeclawed() {
    return declawed;
  }
  

  public void setDeclawed(Boolean declawed) {
    this.declawed = declawed;
  }
  

  


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cat cat = (Cat) o;
    return Objects.equals(this.className, cat.className) &&
        Objects.equals(this.color, cat.color) &&
        Objects.equals(this.declawed, cat.declawed) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(className, color, declawed, super.hashCode());
  }




  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cat {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    className: ").append(toIndentedString(className)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    declawed: ").append(toIndentedString(declawed)).append("\n");
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



