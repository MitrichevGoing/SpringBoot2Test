package com.cjj.utils.web;

import java.io.Serializable;

public class Result<T> implements Serializable {
  /**请求是否成功**/
  private boolean success;
  /**状态码**/
  private  String code;
  /**返回数据集合体**/
  private T results;
  /**返回信息**/
  private String msg;
  /**总记录数**/
  private Integer total;

  public Result() {
  }

  private Result(JsonResultBuilder<T> builder) {
    this.success = builder.success;
    this.results = builder.results;
    this.msg = builder.msg;
    this.code = builder.code;
    this.total = builder.total;
  }

  public static <T>Result.JsonResultBuilder<T> builder(){
    return new JsonResultBuilder<>();
  }

  public static final class JsonResultBuilder<T> {

    private boolean success;

    private T results;

    private String msg;

    private String code;

    private Integer total;

    private JsonResultBuilder() {}

    public JsonResultBuilder ok(String msg) {
      this.msg = msg;
      this.success = true;
      this.code = HttpResponseConst.SC_OK;
      return this;
    }

    public JsonResultBuilder create(String msg) {
      this.msg = msg;
      this.success = true;
      this.code = HttpResponseConst.SC_CREATED;
      return this;
    }

    public JsonResultBuilder error(String msg) {
      this.msg = msg;
      this.success = false;
      this.code = HttpResponseConst.SC_BAD_REQUEST;
      return this;
    }

    public JsonResultBuilder conflict(String msg) {
      this.msg = msg;
      this.success = false;
      this.code = HttpResponseConst.SC_CONFLICT;
      return this;
    }

    public JsonResultBuilder notFound(String msg) {
      this.msg = msg;
      this.success = false;
      this.code = HttpResponseConst.SC_NOT_FOUND;
      return this;
    }


    public JsonResultBuilder page(Integer total){
      this.total = total;
      return this;
    }

    public JsonResultBuilder data(T data){
      this.results = data;
      return this;
    }

    public JsonResultBuilder message(String msg){
      this.msg = msg;
      return this;
    }

    public JsonResultBuilder status(String code){
      this.code = code;
      return this;
    }

    public JsonResultBuilder success(boolean bool){
      this.success = success;
      return this;
    }

    public Result build() {
      return new Result<>(this);
    }
  }


  public boolean isSuccess() {
    return success;
  }

  public String getCode() {
    return code;
  }

  public T getResults() {
    return results;
  }

  public String getMsg() {
    return msg;
  }

  public Integer getTotal() {
    return total;
  }

  @Override
  public String toString() {
    return "Result{" +
        "success=" + success +
        ", code='" + code + '\'' +
        ", results=" + results +
        ", sms='" + msg + '\'' +
        ", total=" + total +
        '}';
  }


}

