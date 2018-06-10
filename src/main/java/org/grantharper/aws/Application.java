package org.grantharper.aws;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class Application implements RequestHandler<Request,Response>
{

  @Override
  public Response handleRequest(Request input, Context context)
  {
    String inputMessage = input.getMessage();
    LambdaLogger lambdaLogger = context.getLogger();
    lambdaLogger.log("input=" + inputMessage);

    return new Response("1", "input message: " + inputMessage);
  }
}
