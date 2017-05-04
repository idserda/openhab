
package org.openhab.binding.plex.internal.communication.webhook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Writer {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("tag")
    @Expose
    private String tag;

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

}
