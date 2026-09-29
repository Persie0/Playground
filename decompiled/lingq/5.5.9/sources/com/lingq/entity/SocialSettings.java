package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/SocialSettings;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class SocialSettings {

    /* JADX INFO: renamed from: a */
    public final SocialSettingsNetwork f17440a;

    /* JADX INFO: renamed from: b */
    public final SocialSettingsType f17441b;

    /* JADX INFO: renamed from: c */
    public final SocialSettingsType f17442c;

    /* JADX INFO: renamed from: d */
    public final SocialSettingsType f17443d;

    public SocialSettings(SocialSettingsNetwork socialSettingsNetwork, SocialSettingsType socialSettingsType, SocialSettingsType socialSettingsType2, SocialSettingsType socialSettingsType3) {
        this.f17440a = socialSettingsNetwork;
        this.f17441b = socialSettingsType;
        this.f17442c = socialSettingsType2;
        this.f17443d = socialSettingsType3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SocialSettings)) {
            return false;
        }
        SocialSettings socialSettings = (SocialSettings) obj;
        if (C5207g.m11106a(this.f17440a, socialSettings.f17440a) && C5207g.m11106a(this.f17441b, socialSettings.f17441b) && C5207g.m11106a(this.f17442c, socialSettings.f17442c) && C5207g.m11106a(this.f17443d, socialSettings.f17443d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        SocialSettingsNetwork socialSettingsNetwork = this.f17440a;
        int iHashCode = (socialSettingsNetwork == null ? 0 : socialSettingsNetwork.hashCode()) * 31;
        SocialSettingsType socialSettingsType = this.f17441b;
        int iHashCode2 = (iHashCode + (socialSettingsType == null ? 0 : socialSettingsType.hashCode())) * 31;
        SocialSettingsType socialSettingsType2 = this.f17442c;
        int iHashCode3 = (iHashCode2 + (socialSettingsType2 == null ? 0 : socialSettingsType2.hashCode())) * 31;
        SocialSettingsType socialSettingsType3 = this.f17443d;
        return iHashCode3 + (socialSettingsType3 != null ? socialSettingsType3.hashCode() : 0);
    }

    public final String toString() {
        return "SocialSettings(twitter=" + this.f17440a + ", reward=" + this.f17441b + ", signup=" + this.f17442c + ", all=" + this.f17443d + ")";
    }
}
