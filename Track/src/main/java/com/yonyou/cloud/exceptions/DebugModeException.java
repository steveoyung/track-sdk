package com.yonyou.cloud.exceptions;

/**
 *  Debug模式下的错误
 * @author daniell
 *
 */
public class DebugModeException extends RuntimeException {

  public DebugModeException(String message) {
    super(message);
  }

  public DebugModeException(Throwable error) {
    super(error);
  }

  public DebugModeException(String message, Throwable error) {
    super(message, error);
  }

}
