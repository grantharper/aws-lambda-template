package org.grantharper.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Application implements RequestHandler<Request,Response>
{
  @Override
  public Response handleRequest(Request input, Context context)
  {
    return new Response("1", "success");
  }
}
