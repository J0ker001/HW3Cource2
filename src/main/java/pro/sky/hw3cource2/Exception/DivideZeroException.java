package pro.sky.hw3cource2.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivideZeroException extends IllegalArgumentException {
    public DivideZeroException() {
        super("Делить на 0 нельзя");
    }
}
