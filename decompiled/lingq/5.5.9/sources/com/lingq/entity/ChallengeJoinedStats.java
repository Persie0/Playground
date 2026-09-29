package com.lingq.entity;

import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/ChallengeJoinedStats;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeJoinedStats {

    /* JADX INFO: renamed from: a */
    public final int f16883a;

    /* JADX INFO: renamed from: b */
    public final String f16884b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "start_date")
    public final String f16885c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "end_date")
    public final String f16886d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "signup_datetime")
    public final String f16887e;

    /* JADX INFO: renamed from: f */
    public final int f16888f;

    /* JADX INFO: renamed from: g */
    public final ChallengeProfile f16889g;

    /* JADX INFO: renamed from: h */
    public final Language f16890h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "activity_index")
    public final int f16891i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "is_completed")
    public final boolean f16892j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "membership_ptr_id")
    public final int f16893k;

    /* JADX INFO: renamed from: l */
    public final int f16894l;

    /* JADX INFO: renamed from: m */
    public final int f16895m;

    /* JADX INFO: renamed from: n */
    public final List<ChallengeResultStats> f16896n;

    public ChallengeJoinedStats(int i10, String str, String str2, String str3, String str4, int i11, ChallengeProfile challengeProfile, Language language, int i12, boolean z10, int i13, int i14, int i15, List<ChallengeResultStats> list) {
        this.f16883a = i10;
        this.f16884b = str;
        this.f16885c = str2;
        this.f16886d = str3;
        this.f16887e = str4;
        this.f16888f = i11;
        this.f16889g = challengeProfile;
        this.f16890h = language;
        this.f16891i = i12;
        this.f16892j = z10;
        this.f16893k = i13;
        this.f16894l = i14;
        this.f16895m = i15;
        this.f16896n = list;
    }

    public /* synthetic */ ChallengeJoinedStats(int i10, String str, String str2, String str3, String str4, int i11, ChallengeProfile challengeProfile, Language language, int i12, boolean z10, int i13, int i14, int i15, List list, int i16, DefaultConstructorMarker defaultConstructorMarker) {
        this((i16 & 1) != 0 ? 0 : i10, str, str2, str3, str4, (i16 & 32) != 0 ? 0 : i11, challengeProfile, language, (i16 & 256) != 0 ? 0 : i12, (i16 & 512) != 0 ? false : z10, (i16 & 1024) != 0 ? 0 : i13, (i16 & 2048) != 0 ? 0 : i14, (i16 & 4096) != 0 ? 0 : i15, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeJoinedStats)) {
            return false;
        }
        ChallengeJoinedStats challengeJoinedStats = (ChallengeJoinedStats) obj;
        if (this.f16883a == challengeJoinedStats.f16883a && C5207g.m11106a(this.f16884b, challengeJoinedStats.f16884b) && C5207g.m11106a(this.f16885c, challengeJoinedStats.f16885c) && C5207g.m11106a(this.f16886d, challengeJoinedStats.f16886d) && C5207g.m11106a(this.f16887e, challengeJoinedStats.f16887e) && this.f16888f == challengeJoinedStats.f16888f && C5207g.m11106a(this.f16889g, challengeJoinedStats.f16889g) && C5207g.m11106a(this.f16890h, challengeJoinedStats.f16890h) && this.f16891i == challengeJoinedStats.f16891i && this.f16892j == challengeJoinedStats.f16892j && this.f16893k == challengeJoinedStats.f16893k && this.f16894l == challengeJoinedStats.f16894l && this.f16895m == challengeJoinedStats.f16895m && C5207g.m11106a(this.f16896n, challengeJoinedStats.f16896n)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v33 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f16883a) * 31;
        int iHashCode2 = 0;
        String str = this.f16884b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16885c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16886d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16887e;
        int iM16d = C0009a.m16d(this.f16888f, (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        ChallengeProfile challengeProfile = this.f16889g;
        int iHashCode6 = (iM16d + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31;
        Language language = this.f16890h;
        int iM16d2 = C0009a.m16d(this.f16891i, (iHashCode6 + (language == null ? 0 : language.hashCode())) * 31, 31);
        boolean z10 = this.f16892j;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d3 = C0009a.m16d(this.f16895m, C0009a.m16d(this.f16894l, C0009a.m16d(this.f16893k, (iM16d2 + r10) * 31, 31), 31), 31);
        List<ChallengeResultStats> list = this.f16896n;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iM16d3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChallengeJoinedStats(pk=");
        sb2.append(this.f16883a);
        sb2.append(", status=");
        sb2.append(this.f16884b);
        sb2.append(", startDate=");
        sb2.append(this.f16885c);
        sb2.append(", endDate=");
        sb2.append(this.f16886d);
        sb2.append(", signupDatetime=");
        sb2.append(this.f16887e);
        sb2.append(", rank=");
        sb2.append(this.f16888f);
        sb2.append(", profile=");
        sb2.append(this.f16889g);
        sb2.append(", language=");
        sb2.append(this.f16890h);
        sb2.append(", activityIndex=");
        sb2.append(this.f16891i);
        sb2.append(", isCompleted=");
        sb2.append(this.f16892j);
        sb2.append(", membershipPtrId=");
        sb2.append(this.f16893k);
        sb2.append(", lingqs=");
        sb2.append(this.f16894l);
        sb2.append(", context=");
        sb2.append(this.f16895m);
        sb2.append(", stats=");
        return C0009a.m24m(sb2, this.f16896n, ")");
    }
}
