package bo.edu.ucb.sa.StrangerAccounts.dto;

<<<<<<< HEAD
import bo.edu.ucb.sa.StrangerAccounts.entity.SAServices;

=======
>>>>>>> 0ae9e5aeecddec3d26eb9d2916f5f8d8284669e2
public class ResponseDto<T> {

    private boolean success;

<<<<<<< HEAD
=======
    private String message;
    private T data;


>>>>>>> 0ae9e5aeecddec3d26eb9d2916f5f8d8284669e2
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
