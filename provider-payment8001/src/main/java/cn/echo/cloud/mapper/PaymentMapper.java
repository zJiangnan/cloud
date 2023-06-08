package cn.echo.cloud.mapper;

import cn.echo.cloud.entity.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 付款数据访问
 * <p></p>
 *
 * @author Unicorn Pink
 * @createdate 2023/6/8
 * @see PaymentMapper
 **/
@Mapper
public interface PaymentMapper {

    int create(@Param("payment") Payment payment);

    Payment getPaymentByid(@Param("id") Long id);

    List<Payment> queryList();

}
