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
import com.konfigthis.client.model.SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean;
import com.konfigthis.client.model.SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull;
import com.konfigthis.client.model.SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber;
import com.konfigthis.client.model.SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Details for static mapping type.
 */
@ApiModel(description = "Details for static mapping type.")@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic {
  public static final String SERIALIZED_NAME_STRING = "string";
  @SerializedName(SERIALIZED_NAME_STRING)
  private SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString string;

  public static final String SERIALIZED_NAME_NUMBER = "number";
  @SerializedName(SERIALIZED_NAME_NUMBER)
  private SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber number;

  public static final String SERIALIZED_NAME_BOOLEAN = "boolean";
  @SerializedName(SERIALIZED_NAME_BOOLEAN)
  private SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean _boolean;

  public static final String SERIALIZED_NAME_NULL = "null";
  @SerializedName(SERIALIZED_NAME_NULL)
  private SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull _null;

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic() {
  }

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic string(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString string) {
    
    
    
    
    this.string = string;
    return this;
  }

   /**
   * Get string
   * @return string
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString getString() {
    return string;
  }


  public void setString(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString string) {
    
    
    
    this.string = string;
  }


  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic number(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber number) {
    
    
    
    
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber getNumber() {
    return number;
  }


  public void setNumber(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber number) {
    
    
    
    this.number = number;
  }


  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic _boolean(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean _boolean) {
    
    
    
    
    this._boolean = _boolean;
    return this;
  }

   /**
   * Get _boolean
   * @return _boolean
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean getBoolean() {
    return _boolean;
  }


  public void setBoolean(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean _boolean) {
    
    
    
    this._boolean = _boolean;
  }


  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic _null(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull _null) {
    
    
    
    
    this._null = _null;
    return this;
  }

   /**
   * Get _null
   * @return _null
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull getNull() {
    return _null;
  }


  public void setNull(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull _null) {
    
    
    
    this._null = _null;
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
   * @return the SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic instance itself
   */
  public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic putAdditionalProperty(String key, Object value) {
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
    SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic = (SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic) o;
    return Objects.equals(this.string, syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.string) &&
        Objects.equals(this.number, syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.number) &&
        Objects.equals(this._boolean, syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic._boolean) &&
        Objects.equals(this._null, syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic._null)&&
        Objects.equals(this.additionalProperties, syncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(string, number, _boolean, _null, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic {\n");
    sb.append("    string: ").append(toIndentedString(string)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    _boolean: ").append(toIndentedString(_boolean)).append("\n");
    sb.append("    _null: ").append(toIndentedString(_null)).append("\n");
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
    openapiFields.add("string");
    openapiFields.add("number");
    openapiFields.add("boolean");
    openapiFields.add("null");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic is not found in the empty JSON string", SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.openapiRequiredFields.toString()));
        }
      }
      // validate the optional field `string`
      if (jsonObj.get("string") != null && !jsonObj.get("string").isJsonNull()) {
        SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticString.validateJsonObject(jsonObj.getAsJsonObject("string"));
      }
      // validate the optional field `number`
      if (jsonObj.get("number") != null && !jsonObj.get("number").isJsonNull()) {
        SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNumber.validateJsonObject(jsonObj.getAsJsonObject("number"));
      }
      // validate the optional field `boolean`
      if (jsonObj.get("boolean") != null && !jsonObj.get("boolean").isJsonNull()) {
        SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticBoolean.validateJsonObject(jsonObj.getAsJsonObject("boolean"));
      }
      // validate the optional field `null`
      if (jsonObj.get("null") != null && !jsonObj.get("null").isJsonNull()) {
        SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStaticNull.validateJsonObject(jsonObj.getAsJsonObject("null"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.class));

       return (TypeAdapter<T>) new TypeAdapter<SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic>() {
           @Override
           public void write(JsonWriter out, SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic value) throws IOException {
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
           public SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic
  * @throws IOException if the JSON string is invalid with respect to SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic
  */
  public static SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic.class);
  }

 /**
  * Convert an instance of SyncsGetReportDataResponseDataConfigurationsCatalogMappingTypesStatic to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

