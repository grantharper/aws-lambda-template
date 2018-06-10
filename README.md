# Java AWS Lambda Function Template

## Deployment

`gradlew build`

Create Function

`aws lambda create-function --region us-east-1 --function-name java-template --zip-file fileb://build/libs/aws-lambda-template-1.0-SNAPSHOT.jar --role arn:aws:iam::762000445678:role/lambda_basic_execution --handler org.grantharper.aws.Application --runtime java8 --timeout 15 --memory-size 512`

Update Function Code

`aws lambda update-function-code --function-name java-template --zip-file fileb://build/libs/aws-lambda-template-1.0-SNAPSHOT.jar`

OR

`gradlew deploy`