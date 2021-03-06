package com.vm.movie.service.dto;


import com.vm.base.service.dto.BaseDto;
import com.vm.movie.dao.po.VmFilmmakers;
import com.vm.movie.dao.po.VmTags;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by ZhangKe on 2018/1/10.
 */
public class VmMoviesDto extends BaseDto{

    private String name;

    private String alias;

    private String description;

    private Long directorId;

    private Integer releaseTime;

    private Float score;

    private Long watchNum;

    private Integer movieTime;

    private String posterUrl;

    private String imgUrl;


    //附加属性
    private List<VmFilmmakers> actors;
    private VmFilmmakers director;
    private List<VmTags> tags;

    private String tagIds;
    private String actorIds;

    public String getTagIds() {
        return tagIds;
    }

    public void setTagIds(String tagIds) {
        this.tagIds = tagIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getDirectorId() {
        return directorId;
    }

    public void setDirectorId(Long directorId) {
        this.directorId = directorId;
    }

    public Integer getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Integer releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Float getScore() {
        return score;
    }

    public void setScore(Float score) {
        this.score = score;
    }

    public Long getWatchNum() {
        return watchNum;
    }

    public void setWatchNum(Long watchNum) {
        this.watchNum = watchNum;
    }

    public Integer getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Integer movieTime) {
        this.movieTime = movieTime;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public List<VmFilmmakers> getActors() {
        return actors;
    }

    public void setActors(List<VmFilmmakers> actors) {
        this.actors = actors;
    }

    public VmFilmmakers getDirector() {
        return director;
    }

    public void setDirector(VmFilmmakers director) {
        this.director = director;
    }

    public List<VmTags> getTags() {
        return tags;
    }

    public void setTags(List<VmTags> tags) {
        this.tags = tags;
    }

    public String getActorIds() {
        return actorIds;
    }

    public void setActorIds(String actorIds) {
        this.actorIds = actorIds;
    }
}
