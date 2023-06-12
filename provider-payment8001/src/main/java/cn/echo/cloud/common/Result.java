package cn.echo.cloud.common;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * 响应实体
 * <p></p>
 *
 * @author Unicorn Pink
 * @version 1.0
 * @createdate 2023/6/8
 * @see Result
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Result<T> {

    private Integer code;

    private String message;

    private T data;

    public Result(Integer code, String message) {
        this(code, message, null);
    }

    public static Result<String> ok(String msg) {
        return new Result<>(200, msg, "");
    }

    public static Result<String> error(String msg) {
        return new Result<>(500, msg, "");
    }

}
