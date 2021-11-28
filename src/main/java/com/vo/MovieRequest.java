package com.vo;

import lombok.Data;

/**
 * @Author szx
 * @Date 2021/11/28 11:36
 * @Description：接口入参
 */
@Data
public class MovieRequest {

    /**
     * 电影id
     */
    private String movieId;

    /**
     * 大小
     */
    private int size;

    /**
     * 模型
     */
    private String model;
}
