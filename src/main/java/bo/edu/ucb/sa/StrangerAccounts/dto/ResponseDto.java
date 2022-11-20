package bo.edu.ucb.sa.StrangerAccounts.dto;


import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;


public class ResponseDto<T> {

    private boolean success;

    private String message;
    private T data;



    public ResponseDto() {
    }

    public ResponseDto(boolean success, String message, T data) {
        this.success = success;
        this.message = message;

        this.data = data;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }



    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "Response{" +
                "success=" + success +
                ", message='" + message + '\'' +
                ", data=" + data +

                '}';
    }
}
