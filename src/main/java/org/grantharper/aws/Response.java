package org.grantharper.aws;

public class Response
{

  private String id;
  private String message;

  public Response(String id, String message)
  {
    this.id = id;
    this.message = message;
  }

  public Response()
  {
  }

  public String getId()
  {
    return id;
  }

  public void setId(String id)
  {
    this.id = id;
  }

  public String getMessage()
  {
    return message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }
}
