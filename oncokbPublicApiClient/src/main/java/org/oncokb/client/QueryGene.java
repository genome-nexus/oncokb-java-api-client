/*
 * OncoKB APIs
 * OncoKB, a comprehensive and curated precision oncology knowledge base, offers oncologists detailed, evidence-based information about individual somatic mutations and structural alterations present in patient tumors with the goal of supporting optimal treatment decisions.
 *
 * OpenAPI spec version: v1.0.0
 * Contact: contact@oncokb.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.oncokb.client;

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
 * QueryGene
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-02-19T16:53:14.717-05:00")
public class QueryGene {
  @SerializedName("entrezGeneId")
  private Integer entrezGeneId = null;

  @SerializedName("hugoSymbol")
  private String hugoSymbol = null;

  public QueryGene entrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
    return this;
  }

   /**
   * Get entrezGeneId
   * @return entrezGeneId
  **/
  @ApiModelProperty(value = "")
  public Integer getEntrezGeneId() {
    return entrezGeneId;
  }

  public void setEntrezGeneId(Integer entrezGeneId) {
    this.entrezGeneId = entrezGeneId;
  }

  public QueryGene hugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
    return this;
  }

   /**
   * Get hugoSymbol
   * @return hugoSymbol
  **/
  @ApiModelProperty(value = "")
  public String getHugoSymbol() {
    return hugoSymbol;
  }

  public void setHugoSymbol(String hugoSymbol) {
    this.hugoSymbol = hugoSymbol;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QueryGene queryGene = (QueryGene) o;
    return Objects.equals(this.entrezGeneId, queryGene.entrezGeneId) &&
        Objects.equals(this.hugoSymbol, queryGene.hugoSymbol);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entrezGeneId, hugoSymbol);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QueryGene {\n");
    
    sb.append("    entrezGeneId: ").append(toIndentedString(entrezGeneId)).append("\n");
    sb.append("    hugoSymbol: ").append(toIndentedString(hugoSymbol)).append("\n");
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

