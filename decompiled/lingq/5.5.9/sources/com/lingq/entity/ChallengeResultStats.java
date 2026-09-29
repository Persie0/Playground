package com.lingq.entity;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/ChallengeResultStats;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeResultStats {

    /* JADX INFO: renamed from: a */
    public final String f16932a;

    /* JADX INFO: renamed from: b */
    public final String f16933b;

    /* JADX INFO: renamed from: c */
    public final String f16934c;

    /* JADX INFO: renamed from: d */
    public final String f16935d;

    /* JADX INFO: renamed from: e */
    public final String f16936e;

    /* JADX INFO: renamed from: f */
    @InterfaceC9303g(name = "is_managed")
    public final boolean f16937f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "is_timed")
    public final boolean f16938g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "is_displayed")
    public final boolean f16939h;

    public ChallengeResultStats(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12) {
        this.f16932a = str;
        this.f16933b = str2;
        this.f16934c = str3;
        this.f16935d = str4;
        this.f16936e = str5;
        this.f16937f = z10;
        this.f16938g = z11;
        this.f16939h = z12;
    }

    public /* synthetic */ ChallengeResultStats(String str, String str2, String str3, String str4, String str5, boolean z10, boolean z11, boolean z12, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? false : z10, (i10 & 64) != 0 ? false : z11, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? false : z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResultStats)) {
            return false;
        }
        ChallengeResultStats challengeResultStats = (ChallengeResultStats) obj;
        return C5207g.m11106a(this.f16932a, challengeResultStats.f16932a) && C5207g.m11106a(this.f16933b, challengeResultStats.f16933b) && C5207g.m11106a(this.f16934c, challengeResultStats.f16934c) && C5207g.m11106a(this.f16935d, challengeResultStats.f16935d) && C5207g.m11106a(this.f16936e, challengeResultStats.f16936e) && this.f16937f == challengeResultStats.f16937f && this.f16938g == challengeResultStats.f16938g && this.f16939h == challengeResultStats.f16939h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    public final int hashCode() {
        int iHashCode = 0;
        String str = this.f16932a;
        int iHashCode2 = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f16933b;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16934c;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16935d;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f16936e;
        if (str5 != null) {
            iHashCode = str5.hashCode();
        }
        int i10 = (iHashCode5 + iHashCode) * 31;
        ?? r10 = 1;
        boolean z10 = this.f16937f;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z11 = this.f16938g;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i12 = (i11 + r12) * 31;
        boolean z12 = this.f16939h;
        if (!z12) {
            r10 = z12;
        }
        return i12 + r10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeResultStats(code=");
        sb2.append(this.f16932a);
        sb2.append(", title=");
        sb2.append(this.f16933b);
        sb2.append(", progress=");
        sb2.append(this.f16934c);
        sb2.append(", actual=");
        sb2.append(this.f16935d);
        sb2.append(", target=");
        sb2.append(this.f16936e);
        sb2.append(", isManaged=");
        sb2.append(this.f16937f);
        sb2.append(", isTimed=");
        sb2.append(this.f16938g);
        sb2.append(", isDisplayed=");
        return C0166e.m769p(sb2, this.f16939h, ")");
    }
}
