package finalmission.exception;

import org.springframework.http.HttpStatus;

public class NotFoundException extends CakeDomainException{

    private static final HttpStatus HTTP_STATUS = HttpStatus.NOT_FOUND;

    public NotFoundException(String message, String errorCode) {
        super(message, HTTP_STATUS, errorCode);
    }


    public static NotFoundException memberNotFound() {
        return new NotFoundException("회원이 존재하지 않습니다.", "MEMBER_NOT_FOUND");
    }
}
