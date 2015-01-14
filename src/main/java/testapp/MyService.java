package testapp;

import com.google.sitebricks.client.transport.Json;
import com.google.sitebricks.headless.Reply;
import com.google.sitebricks.headless.Request;
import com.google.sitebricks.headless.Service;
import com.google.sitebricks.http.Get;

/**
 * @author Miroslav Genov (miroslav.genov@clouway.com)
 */
@Service
public class MyService {
  static class Person {

  }

  @Get
  public Reply<?> sample(Request request) {
    Person person = request.read(Person.class).as(Json.class);
  }
}
