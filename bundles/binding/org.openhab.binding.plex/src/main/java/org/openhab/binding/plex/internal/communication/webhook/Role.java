
package org.openhab.binding.plex.internal.communication.webhook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Role {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tag")
    @Expose
    private String tag;
    @SerializedName("role")
    @Expose
    private String role;
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("count")
    @Expose
    private Integer count;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

}
