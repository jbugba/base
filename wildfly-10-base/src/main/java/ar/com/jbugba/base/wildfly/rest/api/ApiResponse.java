package ar.com.jbugba.base.wildfly.rest.api;

import java.util.Collection;

public class ApiResponse<T> {

    private String status;
    private String description;
    private T data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getSize() {
        if (this.getData() instanceof Collection) {
            return ((Collection) this.getData()).size();
        } else {
            return 1;
        }
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
