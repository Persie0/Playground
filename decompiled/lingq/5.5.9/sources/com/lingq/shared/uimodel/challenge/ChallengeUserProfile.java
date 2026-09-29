package com.lingq.shared.uimodel.challenge;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeUserProfile;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeUserProfile {

    /* JADX INFO: renamed from: a */
    public final int f21664a;

    /* JADX INFO: renamed from: b */
    public final String f21665b;

    /* JADX INFO: renamed from: c */
    public final String f21666c;

    /* JADX INFO: renamed from: d */
    public final String f21667d;

    public ChallengeUserProfile() {
        this(0, null, null, null, 15, null);
    }

    public /* synthetic */ ChallengeUserProfile(int i10, String str, String str2, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 2) != 0 ? "" : str, (i11 & 1) != 0 ? 0 : i10, (i11 & 4) != 0 ? "" : str2, (i11 & 8) != 0 ? null : str3);
    }

    public ChallengeUserProfile(String str, int i10, String str2, String str3) {
        C5207g.m11111f(str, "username");
        C5207g.m11111f(str2, "photo");
        this.f21664a = i10;
        this.f21665b = str;
        this.f21666c = str2;
        this.f21667d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeUserProfile)) {
            return false;
        }
        ChallengeUserProfile challengeUserProfile = (ChallengeUserProfile) obj;
        return this.f21664a == challengeUserProfile.f21664a && C5207g.m11106a(this.f21665b, challengeUserProfile.f21665b) && C5207g.m11106a(this.f21666c, challengeUserProfile.f21666c) && C5207g.m11106a(this.f21667d, challengeUserProfile.f21667d);
    }

    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21666c, C0166e.m758d(this.f21665b, Integer.hashCode(this.f21664a) * 31, 31), 31);
        String str = this.f21667d;
        return iM758d + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeUserProfile(id=");
        sb2.append(this.f21664a);
        sb2.append(", username=");
        sb2.append(this.f21665b);
        sb2.append(", photo=");
        sb2.append(this.f21666c);
        sb2.append(", role=");
        return C0009a.m23l(sb2, this.f21667d, ")");
    }
}
