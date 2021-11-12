package nextstep.subway.global;

import nextstep.subway.line.domain.LineNameDuplicatedException;
import nextstep.subway.line.domain.LineNotFoundException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(LineNameDuplicatedException.class)
    public void handleLineNameDuplicatedException(HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_BAD_REQUEST);
    }

    @ExceptionHandler(LineNotFoundException.class)
    public void handleEntityNotFoundException(HttpServletResponse response) throws IOException {
        response.sendError(HttpServletResponse.SC_NOT_FOUND);
    }
}
