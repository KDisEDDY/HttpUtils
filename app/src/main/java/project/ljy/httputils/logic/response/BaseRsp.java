package project.ljy.httputils.logic.response;

import java.io.Serializable;

/**
 * Created by liujy006 on 2016/6/3.
 */
public class BaseRsp implements Serializable {
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public int getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        ErrorType = errorType;
    }

    public void setErrorType(int errorType) {
        this.errorType = errorType;
    }

    private boolean isError;
    private int errorType;
    private String ErrorType;
    private String result;

}
