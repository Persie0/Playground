package com.lingq.shared.uimodel.challenge;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeSocialSettingsNetwork;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeSocialSettingsNetwork {

    /* JADX INFO: renamed from: a */
    public final ChallengeSocialSettingsType f21658a;

    public ChallengeSocialSettingsNetwork(ChallengeSocialSettingsType challengeSocialSettingsType) {
        this.f21658a = challengeSocialSettingsType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ChallengeSocialSettingsNetwork) && C5207g.m11106a(this.f21658a, ((ChallengeSocialSettingsNetwork) obj).f21658a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        ChallengeSocialSettingsType challengeSocialSettingsType = this.f21658a;
        if (challengeSocialSettingsType == null) {
            return 0;
        }
        return challengeSocialSettingsType.hashCode();
    }

    public final String toString() {
        return "ChallengeSocialSettingsNetwork(all=" + this.f21658a + ")";
    }
}
