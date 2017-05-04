
package org.openhab.binding.plex.internal.communication.webhook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Server {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("uuid")
    @Expose
    private String uuid;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

}
