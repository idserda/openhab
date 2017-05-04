
package org.openhab.binding.plex.internal.communication.webhook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Player {

    @SerializedName("local")
    @Expose
    private Boolean local;
    @SerializedName("publicAddress")
    @Expose
    private String publicAddress;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("uuid")
    @Expose
    private String uuid;

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public String getPublicAddress() {
        return publicAddress;
    }

    public void setPublicAddress(String publicAddress) {
        this.publicAddress = publicAddress;
    }

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
