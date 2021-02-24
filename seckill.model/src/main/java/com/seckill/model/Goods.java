package com.seckill.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Title: Goods
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/24 11:12
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Goods {
    String name;
    Integer id;
    String size;
    Double price;
    String remarks;
}
