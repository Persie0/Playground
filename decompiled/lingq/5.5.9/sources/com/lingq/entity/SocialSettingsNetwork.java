package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/SocialSettingsNetwork;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SocialSettingsNetwork {

    /* JADX INFO: renamed from: a */
    public final SocialSettingsType f17447a;

    /* JADX INFO: renamed from: b */
    public final SocialSettingsType f17448b;

    /* JADX INFO: renamed from: c */
    public final SocialSettingsType f17449c;

    public SocialSettingsNetwork(SocialSettingsType socialSettingsType, SocialSettingsType socialSettingsType2, SocialSettingsType socialSettingsType3) {
        this.f17447a = socialSettingsType;
        this.f17448b = socialSettingsType2;
        this.f17449c = socialSettingsType3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialSettingsNetwork)) {
            return false;
        }
        SocialSettingsNetwork socialSettingsNetwork = (SocialSettingsNetwork) obj;
        if (C5207g.m11106a(this.f17447a, socialSettingsNetwork.f17447a) && C5207g.m11106a(this.f17448b, socialSettingsNetwork.f17448b) && C5207g.m11106a(this.f17449c, socialSettingsNetwork.f17449c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 0;
        SocialSettingsType socialSettingsType = this.f17447a;
        int iHashCode2 = (socialSettingsType == null ? 0 : socialSettingsType.hashCode()) * 31;
        SocialSettingsType socialSettingsType2 = this.f17448b;
        int iHashCode3 = (iHashCode2 + (socialSettingsType2 == null ? 0 : socialSettingsType2.hashCode())) * 31;
        SocialSettingsType socialSettingsType3 = this.f17449c;
        if (socialSettingsType3 != null) {
            iHashCode = socialSettingsType3.hashCode();
        }
        return iHashCode3 + iHashCode;
    }

    public final String toString() {
        return "SocialSettingsNetwork(reward=" + this.f17447a + ", signup=" + this.f17448b + ", all=" + this.f17449c + ")";
    }
}
