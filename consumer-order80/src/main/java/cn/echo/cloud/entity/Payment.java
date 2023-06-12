package cn.echo.cloud.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>付款实体</p>
 *
 * @author Unicorn Pink
 * @createdate 2023/6/8
 * @see Payment
 **/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Payment implements Serializable {

    private Long id;

    private String serial;

}
