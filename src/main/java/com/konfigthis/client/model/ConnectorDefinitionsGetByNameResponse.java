/*
 * MultiWoven API
 * Open-source Reverse ETL that makes data segmentation, sync and activation both easy and fully secure.
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.ConnectorDefinitionsGetByNameResponseConnectorSpec;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ConnectorDefinitionsGetByNameResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectorDefinitionsGetByNameResponse {
  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_CONNECTOR_TYPE = "connector_type";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_TYPE)
  private String connectorType;

  public static final String SERIALIZED_NAME_CONNECTOR_SUBTYPE = "connector_subtype";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_SUBTYPE)
  private String connectorSubtype;

  public static final String SERIALIZED_NAME_DOCUMENTATION_URL = "documentation_url";
  @SerializedName(SERIALIZED_NAME_DOCUMENTATION_URL)
  private String documentationUrl;

  public static final String SERIALIZED_NAME_GITHUB_ISSUE_LABEL = "github_issue_label";
  @SerializedName(SERIALIZED_NAME_GITHUB_ISSUE_LABEL)
  private String githubIssueLabel;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_LICENSE = "license";
  @SerializedName(SERIALIZED_NAME_LICENSE)
  private String license;

  public static final String SERIALIZED_NAME_RELEASE_STAGE = "release_stage";
  @SerializedName(SERIALIZED_NAME_RELEASE_STAGE)
  private String releaseStage;

  public static final String SERIALIZED_NAME_SUPPORT_LEVEL = "support_level";
  @SerializedName(SERIALIZED_NAME_SUPPORT_LEVEL)
  private String supportLevel;

  public static final String SERIALIZED_NAME_CONNECTOR_SPEC = "connector_spec";
  @SerializedName(SERIALIZED_NAME_CONNECTOR_SPEC)
  private ConnectorDefinitionsGetByNameResponseConnectorSpec connectorSpec;

  public ConnectorDefinitionsGetByNameResponse() {
  }

  public ConnectorDefinitionsGetByNameResponse tags(List<String> tags) {
    
    
    
    
    this.tags = tags;
    return this;
  }

  public ConnectorDefinitionsGetByNameResponse addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

   /**
   * Get tags
   * @return tags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getTags() {
    return tags;
  }


  public void setTags(List<String> tags) {
    
    
    
    this.tags = tags;
  }


  public ConnectorDefinitionsGetByNameResponse name(String name) {
    
    
    
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    
    
    
    this.name = name;
  }


  public ConnectorDefinitionsGetByNameResponse connectorType(String connectorType) {
    
    
    
    
    this.connectorType = connectorType;
    return this;
  }

   /**
   * Get connectorType
   * @return connectorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectorType() {
    return connectorType;
  }


  public void setConnectorType(String connectorType) {
    
    
    
    this.connectorType = connectorType;
  }


  public ConnectorDefinitionsGetByNameResponse connectorSubtype(String connectorSubtype) {
    
    
    
    
    this.connectorSubtype = connectorSubtype;
    return this;
  }

   /**
   * Get connectorSubtype
   * @return connectorSubtype
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getConnectorSubtype() {
    return connectorSubtype;
  }


  public void setConnectorSubtype(String connectorSubtype) {
    
    
    
    this.connectorSubtype = connectorSubtype;
  }


  public ConnectorDefinitionsGetByNameResponse documentationUrl(String documentationUrl) {
    
    
    
    
    this.documentationUrl = documentationUrl;
    return this;
  }

   /**
   * Get documentationUrl
   * @return documentationUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDocumentationUrl() {
    return documentationUrl;
  }


  public void setDocumentationUrl(String documentationUrl) {
    
    
    
    this.documentationUrl = documentationUrl;
  }


  public ConnectorDefinitionsGetByNameResponse githubIssueLabel(String githubIssueLabel) {
    
    
    
    
    this.githubIssueLabel = githubIssueLabel;
    return this;
  }

   /**
   * Get githubIssueLabel
   * @return githubIssueLabel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGithubIssueLabel() {
    return githubIssueLabel;
  }


  public void setGithubIssueLabel(String githubIssueLabel) {
    
    
    
    this.githubIssueLabel = githubIssueLabel;
  }


  public ConnectorDefinitionsGetByNameResponse icon(String icon) {
    
    
    
    
    this.icon = icon;
    return this;
  }

   /**
   * Get icon
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    
    
    
    this.icon = icon;
  }


  public ConnectorDefinitionsGetByNameResponse license(String license) {
    
    
    
    
    this.license = license;
    return this;
  }

   /**
   * Get license
   * @return license
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getLicense() {
    return license;
  }


  public void setLicense(String license) {
    
    
    
    this.license = license;
  }


  public ConnectorDefinitionsGetByNameResponse releaseStage(String releaseStage) {
    
    
    
    
    this.releaseStage = releaseStage;
    return this;
  }

   /**
   * Get releaseStage
   * @return releaseStage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getReleaseStage() {
    return releaseStage;
  }


  public void setReleaseStage(String releaseStage) {
    
    
    
    this.releaseStage = releaseStage;
  }


  public ConnectorDefinitionsGetByNameResponse supportLevel(String supportLevel) {
    
    
    
    
    this.supportLevel = supportLevel;
    return this;
  }

   /**
   * Get supportLevel
   * @return supportLevel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getSupportLevel() {
    return supportLevel;
  }


  public void setSupportLevel(String supportLevel) {
    
    
    
    this.supportLevel = supportLevel;
  }


  public ConnectorDefinitionsGetByNameResponse connectorSpec(ConnectorDefinitionsGetByNameResponseConnectorSpec connectorSpec) {
    
    
    
    
    this.connectorSpec = connectorSpec;
    return this;
  }

   /**
   * Get connectorSpec
   * @return connectorSpec
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConnectorDefinitionsGetByNameResponseConnectorSpec getConnectorSpec() {
    return connectorSpec;
  }


  public void setConnectorSpec(ConnectorDefinitionsGetByNameResponseConnectorSpec connectorSpec) {
    
    
    
    this.connectorSpec = connectorSpec;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ConnectorDefinitionsGetByNameResponse instance itself
   */
  public ConnectorDefinitionsGetByNameResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnectorDefinitionsGetByNameResponse connectorDefinitionsGetByNameResponse = (ConnectorDefinitionsGetByNameResponse) o;
    return Objects.equals(this.tags, connectorDefinitionsGetByNameResponse.tags) &&
        Objects.equals(this.name, connectorDefinitionsGetByNameResponse.name) &&
        Objects.equals(this.connectorType, connectorDefinitionsGetByNameResponse.connectorType) &&
        Objects.equals(this.connectorSubtype, connectorDefinitionsGetByNameResponse.connectorSubtype) &&
        Objects.equals(this.documentationUrl, connectorDefinitionsGetByNameResponse.documentationUrl) &&
        Objects.equals(this.githubIssueLabel, connectorDefinitionsGetByNameResponse.githubIssueLabel) &&
        Objects.equals(this.icon, connectorDefinitionsGetByNameResponse.icon) &&
        Objects.equals(this.license, connectorDefinitionsGetByNameResponse.license) &&
        Objects.equals(this.releaseStage, connectorDefinitionsGetByNameResponse.releaseStage) &&
        Objects.equals(this.supportLevel, connectorDefinitionsGetByNameResponse.supportLevel) &&
        Objects.equals(this.connectorSpec, connectorDefinitionsGetByNameResponse.connectorSpec)&&
        Objects.equals(this.additionalProperties, connectorDefinitionsGetByNameResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tags, name, connectorType, connectorSubtype, documentationUrl, githubIssueLabel, icon, license, releaseStage, supportLevel, connectorSpec, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorDefinitionsGetByNameResponse {\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    connectorType: ").append(toIndentedString(connectorType)).append("\n");
    sb.append("    connectorSubtype: ").append(toIndentedString(connectorSubtype)).append("\n");
    sb.append("    documentationUrl: ").append(toIndentedString(documentationUrl)).append("\n");
    sb.append("    githubIssueLabel: ").append(toIndentedString(githubIssueLabel)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    license: ").append(toIndentedString(license)).append("\n");
    sb.append("    releaseStage: ").append(toIndentedString(releaseStage)).append("\n");
    sb.append("    supportLevel: ").append(toIndentedString(supportLevel)).append("\n");
    sb.append("    connectorSpec: ").append(toIndentedString(connectorSpec)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("tags");
    openapiFields.add("name");
    openapiFields.add("connector_type");
    openapiFields.add("connector_subtype");
    openapiFields.add("documentation_url");
    openapiFields.add("github_issue_label");
    openapiFields.add("icon");
    openapiFields.add("license");
    openapiFields.add("release_stage");
    openapiFields.add("support_level");
    openapiFields.add("connector_spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectorDefinitionsGetByNameResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectorDefinitionsGetByNameResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectorDefinitionsGetByNameResponse is not found in the empty JSON string", ConnectorDefinitionsGetByNameResponse.openapiRequiredFields.toString()));
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("connector_type") != null && !jsonObj.get("connector_type").isJsonNull()) && !jsonObj.get("connector_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connector_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connector_type").toString()));
      }
      if ((jsonObj.get("connector_subtype") != null && !jsonObj.get("connector_subtype").isJsonNull()) && !jsonObj.get("connector_subtype").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `connector_subtype` to be a primitive type in the JSON string but got `%s`", jsonObj.get("connector_subtype").toString()));
      }
      if ((jsonObj.get("documentation_url") != null && !jsonObj.get("documentation_url").isJsonNull()) && !jsonObj.get("documentation_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `documentation_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("documentation_url").toString()));
      }
      if ((jsonObj.get("github_issue_label") != null && !jsonObj.get("github_issue_label").isJsonNull()) && !jsonObj.get("github_issue_label").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `github_issue_label` to be a primitive type in the JSON string but got `%s`", jsonObj.get("github_issue_label").toString()));
      }
      if ((jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonNull()) && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if ((jsonObj.get("license") != null && !jsonObj.get("license").isJsonNull()) && !jsonObj.get("license").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license").toString()));
      }
      if ((jsonObj.get("release_stage") != null && !jsonObj.get("release_stage").isJsonNull()) && !jsonObj.get("release_stage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `release_stage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("release_stage").toString()));
      }
      if ((jsonObj.get("support_level") != null && !jsonObj.get("support_level").isJsonNull()) && !jsonObj.get("support_level").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `support_level` to be a primitive type in the JSON string but got `%s`", jsonObj.get("support_level").toString()));
      }
      // validate the optional field `connector_spec`
      if (jsonObj.get("connector_spec") != null && !jsonObj.get("connector_spec").isJsonNull()) {
        ConnectorDefinitionsGetByNameResponseConnectorSpec.validateJsonObject(jsonObj.getAsJsonObject("connector_spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectorDefinitionsGetByNameResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectorDefinitionsGetByNameResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectorDefinitionsGetByNameResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectorDefinitionsGetByNameResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectorDefinitionsGetByNameResponse>() {
           @Override
           public void write(JsonWriter out, ConnectorDefinitionsGetByNameResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ConnectorDefinitionsGetByNameResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectorDefinitionsGetByNameResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ConnectorDefinitionsGetByNameResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectorDefinitionsGetByNameResponse
  * @throws IOException if the JSON string is invalid with respect to ConnectorDefinitionsGetByNameResponse
  */
  public static ConnectorDefinitionsGetByNameResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectorDefinitionsGetByNameResponse.class);
  }

 /**
  * Convert an instance of ConnectorDefinitionsGetByNameResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

