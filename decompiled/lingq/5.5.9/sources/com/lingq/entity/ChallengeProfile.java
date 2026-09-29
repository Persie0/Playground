package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/ChallengeProfile;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeProfile {

    /* JADX INFO: renamed from: a */
    public final int f16905a;

    /* JADX INFO: renamed from: b */
    public final String f16906b;

    /* JADX INFO: renamed from: c */
    public final String f16907c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "blog_url")
    public final String f16908d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "activity_index")
    public final int f16909e;

    /* JADX INFO: renamed from: f */
    public final boolean f16910f;

    /* JADX INFO: renamed from: g */
    public final String f16911g;

    /* JADX INFO: renamed from: h */
    public final String f16912h;

    public ChallengeProfile(int i10, String str, String str2, String str3, int i11, boolean z10, String str4, String str5) {
        this.f16905a = i10;
        this.f16906b = str;
        this.f16907c = str2;
        this.f16908d = str3;
        this.f16909e = i11;
        this.f16910f = z10;
        this.f16911g = str4;
        this.f16912h = str5;
    }

    public /* synthetic */ ChallengeProfile(int i10, String str, String str2, String str3, int i11, boolean z10, String str4, String str5, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i10, str, str2, str3, (i12 & 16) != 0 ? 0 : i11, (i12 & 32) != 0 ? false : z10, str4, (i12 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? null : str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeProfile)) {
            return false;
        }
        ChallengeProfile challengeProfile = (ChallengeProfile) obj;
        return this.f16905a == challengeProfile.f16905a && C5207g.m11106a(this.f16906b, challengeProfile.f16906b) && C5207g.m11106a(this.f16907c, challengeProfile.f16907c) && C5207g.m11106a(this.f16908d, challengeProfile.f16908d) && this.f16909e == challengeProfile.f16909e && this.f16910f == challengeProfile.f16910f && C5207g.m11106a(this.f16911g, challengeProfile.f16911g) && C5207g.m11106a(this.f16912h, challengeProfile.f16912h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16905a) * 31;
        int iHashCode2 = 0;
        String str = this.f16906b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16907c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16908d;
        int iM16d = C0009a.m16d(this.f16909e, (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
        boolean z10 = this.f16910f;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iM16d + r10) * 31;
        String str4 = this.f16911g;
        int iHashCode5 = (i10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16912h;
        if (str5 != null) {
            iHashCode2 = str5.hashCode();
        }
        return iHashCode5 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeProfile(id=");
        sb2.append(this.f16905a);
        sb2.append(", username=");
        sb2.append(this.f16906b);
        sb2.append(", description=");
        sb2.append(this.f16907c);
        sb2.append(", blogUrl=");
        sb2.append(this.f16908d);
        sb2.append(", activityIndex=");
        sb2.append(this.f16909e);
        sb2.append(", deleted=");
        sb2.append(this.f16910f);
        sb2.append(", photo=");
        sb2.append(this.f16911g);
        sb2.append(", role=");
        return C0009a.m23l(sb2, this.f16912h, ")");
    }
}
