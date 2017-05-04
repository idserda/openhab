
package org.openhab.binding.plex.internal.communication.webhook;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metadata {

    @SerializedName("librarySectionType")
    @Expose
    private String librarySectionType;
    @SerializedName("ratingKey")
    @Expose
    private String ratingKey;
    @SerializedName("key")
    @Expose
    private String key;
    @SerializedName("guid")
    @Expose
    private String guid;
    @SerializedName("librarySectionID")
    @Expose
    private Integer librarySectionID;
    @SerializedName("studio")
    @Expose
    private String studio;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("contentRating")
    @Expose
    private String contentRating;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("rating")
    @Expose
    private Double rating;
    @SerializedName("viewCount")
    @Expose
    private Integer viewCount;
    @SerializedName("lastViewedAt")
    @Expose
    private Integer lastViewedAt;
    @SerializedName("year")
    @Expose
    private Integer year;
    @SerializedName("tagline")
    @Expose
    private String tagline;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("art")
    @Expose
    private String art;
    @SerializedName("duration")
    @Expose
    private Integer duration;
    @SerializedName("originallyAvailableAt")
    @Expose
    private String originallyAvailableAt;
    @SerializedName("addedAt")
    @Expose
    private Integer addedAt;
    @SerializedName("updatedAt")
    @Expose
    private Integer updatedAt;
    @SerializedName("chapterSource")
    @Expose
    private String chapterSource;
    @SerializedName("primaryExtraKey")
    @Expose
    private String primaryExtraKey;
    @SerializedName("Genre")
    @Expose
    private List<Genre> genre = null;
    @SerializedName("Director")
    @Expose
    private List<Director> director = null;
    @SerializedName("Writer")
    @Expose
    private List<Writer> writer = null;
    @SerializedName("Producer")
    @Expose
    private List<Producer> producer = null;
    @SerializedName("Country")
    @Expose
    private List<Country> country = null;
    @SerializedName("Role")
    @Expose
    private List<Role> role = null;

    public String getLibrarySectionType() {
        return librarySectionType;
    }

    public void setLibrarySectionType(String librarySectionType) {
        this.librarySectionType = librarySectionType;
    }

    public String getRatingKey() {
        return ratingKey;
    }

    public void setRatingKey(String ratingKey) {
        this.ratingKey = ratingKey;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public Integer getLibrarySectionID() {
        return librarySectionID;
    }

    public void setLibrarySectionID(Integer librarySectionID) {
        this.librarySectionID = librarySectionID;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContentRating() {
        return contentRating;
    }

    public void setContentRating(String contentRating) {
        this.contentRating = contentRating;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Integer getViewCount() {
        return viewCount;
    }

    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Integer getLastViewedAt() {
        return lastViewedAt;
    }

    public void setLastViewedAt(Integer lastViewedAt) {
        this.lastViewedAt = lastViewedAt;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getOriginallyAvailableAt() {
        return originallyAvailableAt;
    }

    public void setOriginallyAvailableAt(String originallyAvailableAt) {
        this.originallyAvailableAt = originallyAvailableAt;
    }

    public Integer getAddedAt() {
        return addedAt;
    }

    public void setAddedAt(Integer addedAt) {
        this.addedAt = addedAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getChapterSource() {
        return chapterSource;
    }

    public void setChapterSource(String chapterSource) {
        this.chapterSource = chapterSource;
    }

    public String getPrimaryExtraKey() {
        return primaryExtraKey;
    }

    public void setPrimaryExtraKey(String primaryExtraKey) {
        this.primaryExtraKey = primaryExtraKey;
    }

    public List<Genre> getGenre() {
        return genre;
    }

    public void setGenre(List<Genre> genre) {
        this.genre = genre;
    }

    public List<Director> getDirector() {
        return director;
    }

    public void setDirector(List<Director> director) {
        this.director = director;
    }

    public List<Writer> getWriter() {
        return writer;
    }

    public void setWriter(List<Writer> writer) {
        this.writer = writer;
    }

    public List<Producer> getProducer() {
        return producer;
    }

    public void setProducer(List<Producer> producer) {
        this.producer = producer;
    }

    public List<Country> getCountry() {
        return country;
    }

    public void setCountry(List<Country> country) {
        this.country = country;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }

}
