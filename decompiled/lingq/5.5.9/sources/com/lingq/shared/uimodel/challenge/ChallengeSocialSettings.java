package com.lingq.shared.uimodel.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeSocialSettings;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeSocialSettings {

    /* JADX INFO: renamed from: a */
    public final ChallengeSocialSettingsNetwork f21653a;

    /* JADX INFO: renamed from: b */
    public final ChallengeSocialSettingsType f21654b;

    public ChallengeSocialSettings(ChallengeSocialSettingsNetwork challengeSocialSettingsNetwork, ChallengeSocialSettingsType challengeSocialSettingsType) {
        this.f21653a = challengeSocialSettingsNetwork;
        this.f21654b = challengeSocialSettingsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeSocialSettings)) {
            return false;
        }
        ChallengeSocialSettings challengeSocialSettings = (ChallengeSocialSettings) obj;
        return C5207g.m11106a(this.f21653a, challengeSocialSettings.f21653a) && C5207g.m11106a(this.f21654b, challengeSocialSettings.f21654b);
    }

    public final int hashCode() {
        int iHashCode = 0;
        ChallengeSocialSettingsNetwork challengeSocialSettingsNetwork = this.f21653a;
        int iHashCode2 = (challengeSocialSettingsNetwork == null ? 0 : challengeSocialSettingsNetwork.hashCode()) * 31;
        ChallengeSocialSettingsType challengeSocialSettingsType = this.f21654b;
        if (challengeSocialSettingsType != null) {
            iHashCode = challengeSocialSettingsType.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    public final String toString() {
        return "ChallengeSocialSettings(twitter=" + this.f21653a + ", signup=" + this.f21654b + ")";
    }
}
