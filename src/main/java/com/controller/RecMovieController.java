package com.controller;

import com.sparrowrecsys.online.datamanager.Movie;
import com.sparrowrecsys.online.recprocess.SimilarMovieProcess;
import com.vo.MovieRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author szx
 * @Date 2021/11/28 11:25
 * @Description
 */
@RestController
@RequestMapping("/recomand-movie")
public class RecMovieController {

    @PostMapping
    public List<Movie> recommoandMovie(@RequestBody MovieRequest movieRequest){
        return SimilarMovieProcess.getRecList(Integer.parseInt(movieRequest.getMovieId()), movieRequest.getSize(), movieRequest.getModel());
    }
}
