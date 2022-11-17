package bo.edu.ucb.sa.StrangerAccounts.dto;

import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;
import org.springframework.http.HttpStatus;

import java.util.List;

public class ResponseDto<T> {
    private T data;
    private String message;
    private boolean success;

    public ResponseDto(ResponseDto<String> responseDto, HttpStatus ok) {
    }

    public ResponseDto(T data, String message, boolean success) {
        this.data = data;
        this.message = message;
        this.success = success;
    }

    public ResponseDto(SAServices streamingService, String message, Object o) {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Response{" +
                "data=" + data +
                ", message='" + message + '\'' +
                ", success=" + success +
                '}';
    }
}
