```
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestMethod;


@RequestMapping("/api/values")
@RequestMapping(value = "/api/values", produces = MediaType.APPLICATION_JSON_VALUE)
@RequestMapping(value = "/api/values", method = RequestMethod.GET, consumes = MediaType.TEXT_PLAIN_VALUE)
@ResponseBody
```