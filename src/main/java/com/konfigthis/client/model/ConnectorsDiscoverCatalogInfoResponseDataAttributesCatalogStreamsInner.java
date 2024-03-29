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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
 * ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ACTION = "action";
  @SerializedName(SERIALIZED_NAME_ACTION)
  private String action;

  public static final String SERIALIZED_NAME_JSON_SCHEMA = "json_schema";
  @SerializedName(SERIALIZED_NAME_JSON_SCHEMA)
  private Map<String, Object> jsonSchema = null;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;

  public static final String SERIALIZED_NAME_REQUEST_METHOD = "request_method";
  @SerializedName(SERIALIZED_NAME_REQUEST_METHOD)
  private String requestMethod;

  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner() {
  }

  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner name(String name) {
    
    
    
    
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


  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner action(String action) {
    
    
    
    
    this.action = action;
    return this;
  }

   /**
   * Get action
   * @return action
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAction() {
    return action;
  }


  public void setAction(String action) {
    
    
    
    this.action = action;
  }


  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner jsonSchema(Map<String, Object> jsonSchema) {
    
    
    
    
    this.jsonSchema = jsonSchema;
    return this;
  }

  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner putJsonSchemaItem(String key, Object jsonSchemaItem) {
    if (this.jsonSchema == null) {
      this.jsonSchema = new HashMap<>();
    }
    this.jsonSchema.put(key, jsonSchemaItem);
    return this;
  }

   /**
   * Get jsonSchema
   * @return jsonSchema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, Object> getJsonSchema() {
    return jsonSchema;
  }


  public void setJsonSchema(Map<String, Object> jsonSchema) {
    
    
    
    this.jsonSchema = jsonSchema;
  }


  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner url(String url) {
    
    
    
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    
    
    
    this.url = url;
  }


  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner requestMethod(String requestMethod) {
    
    
    
    
    this.requestMethod = requestMethod;
    return this;
  }

   /**
   * Get requestMethod
   * @return requestMethod
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRequestMethod() {
    return requestMethod;
  }


  public void setRequestMethod(String requestMethod) {
    
    
    
    this.requestMethod = requestMethod;
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
   * @return the ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner instance itself
   */
  public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner putAdditionalProperty(String key, Object value) {
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
    ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner = (ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner) o;
    return Objects.equals(this.name, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.name) &&
        Objects.equals(this.action, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.action) &&
        Objects.equals(this.jsonSchema, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.jsonSchema) &&
        Objects.equals(this.url, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.url) &&
        Objects.equals(this.requestMethod, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.requestMethod)&&
        Objects.equals(this.additionalProperties, connectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, action, jsonSchema, url, requestMethod, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    requestMethod: ").append(toIndentedString(requestMethod)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("action");
    openapiFields.add("json_schema");
    openapiFields.add("url");
    openapiFields.add("request_method");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner is not found in the empty JSON string", ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if ((jsonObj.get("action") != null && !jsonObj.get("action").isJsonNull()) && !jsonObj.get("action").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `action` to be a primitive type in the JSON string but got `%s`", jsonObj.get("action").toString()));
      }
      if ((jsonObj.get("url") != null && !jsonObj.get("url").isJsonNull()) && !jsonObj.get("url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("url").toString()));
      }
      if ((jsonObj.get("request_method") != null && !jsonObj.get("request_method").isJsonNull()) && !jsonObj.get("request_method").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `request_method` to be a primitive type in the JSON string but got `%s`", jsonObj.get("request_method").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.class));

       return (TypeAdapter<T>) new TypeAdapter<ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner>() {
           @Override
           public void write(JsonWriter out, ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner value) throws IOException {
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
           public ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner
  * @throws IOException if the JSON string is invalid with respect to ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner
  */
  public static ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner.class);
  }

 /**
  * Convert an instance of ConnectorsDiscoverCatalogInfoResponseDataAttributesCatalogStreamsInner to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

