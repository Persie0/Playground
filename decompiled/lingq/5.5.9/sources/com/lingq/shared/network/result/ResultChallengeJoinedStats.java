package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeProfile;
import com.lingq.entity.ChallengeResultStats;
import com.lingq.entity.Language;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallengeJoinedStats;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultChallengeJoinedStats {

    /* JADX INFO: renamed from: a */
    public final int f18340a;

    /* JADX INFO: renamed from: b */
    public final String f18341b;

    /* JADX INFO: renamed from: c */
    @InterfaceC9303g(name = "start_date")
    public final String f18342c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "end_date")
    public final String f18343d;

    /* JADX INFO: renamed from: e */
    @InterfaceC9303g(name = "signup_datetime")
    public final String f18344e;

    /* JADX INFO: renamed from: f */
    public final int f18345f;

    /* JADX INFO: renamed from: g */
    public final ChallengeProfile f18346g;

    /* JADX INFO: renamed from: h */
    public final Language f18347h;

    /* JADX INFO: renamed from: i */
    @InterfaceC9303g(name = "activity_index")
    public final int f18348i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "is_completed")
    public final boolean f18349j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "membership_ptr_id")
    public final int f18350k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "known_words")
    public final int f18351l;

    /* JADX INFO: renamed from: m */
    public final int f18352m;

    /* JADX INFO: renamed from: n */
    public final int f18353n;

    /* JADX INFO: renamed from: o */
    public final int f18354o;

    /* JADX INFO: renamed from: p */
    public final List<ChallengeResultStats> f18355p;

    public ResultChallengeJoinedStats(int i10, String str, String str2, String str3, String str4, int i11, ChallengeProfile challengeProfile, Language language, int i12, boolean z10, int i13, int i14, int i15, int i16, int i17, List<ChallengeResultStats> list) {
        this.f18340a = i10;
        this.f18341b = str;
        this.f18342c = str2;
        this.f18343d = str3;
        this.f18344e = str4;
        this.f18345f = i11;
        this.f18346g = challengeProfile;
        this.f18347h = language;
        this.f18348i = i12;
        this.f18349j = z10;
        this.f18350k = i13;
        this.f18351l = i14;
        this.f18352m = i15;
        this.f18353n = i16;
        this.f18354o = i17;
        this.f18355p = list;
    }

    public /* synthetic */ ResultChallengeJoinedStats(int i10, String str, String str2, String str3, String str4, int i11, ChallengeProfile challengeProfile, Language language, int i12, boolean z10, int i13, int i14, int i15, int i16, int i17, List list, int i18, DefaultConstructorMarker defaultConstructorMarker) {
        this((i18 & 1) != 0 ? 0 : i10, str, str2, str3, str4, (i18 & 32) != 0 ? 0 : i11, challengeProfile, language, (i18 & 256) != 0 ? 0 : i12, (i18 & 512) != 0 ? false : z10, (i18 & 1024) != 0 ? 0 : i13, (i18 & 2048) != 0 ? 0 : i14, (i18 & 4096) != 0 ? 0 : i15, (i18 & 8192) != 0 ? 0 : i16, (i18 & 16384) != 0 ? 0 : i17, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallengeJoinedStats)) {
            return false;
        }
        ResultChallengeJoinedStats resultChallengeJoinedStats = (ResultChallengeJoinedStats) obj;
        return this.f18340a == resultChallengeJoinedStats.f18340a && C5207g.m11106a(this.f18341b, resultChallengeJoinedStats.f18341b) && C5207g.m11106a(this.f18342c, resultChallengeJoinedStats.f18342c) && C5207g.m11106a(this.f18343d, resultChallengeJoinedStats.f18343d) && C5207g.m11106a(this.f18344e, resultChallengeJoinedStats.f18344e) && this.f18345f == resultChallengeJoinedStats.f18345f && C5207g.m11106a(this.f18346g, resultChallengeJoinedStats.f18346g) && C5207g.m11106a(this.f18347h, resultChallengeJoinedStats.f18347h) && this.f18348i == resultChallengeJoinedStats.f18348i && this.f18349j == resultChallengeJoinedStats.f18349j && this.f18350k == resultChallengeJoinedStats.f18350k && this.f18351l == resultChallengeJoinedStats.f18351l && this.f18352m == resultChallengeJoinedStats.f18352m && this.f18353n == resultChallengeJoinedStats.f18353n && this.f18354o == resultChallengeJoinedStats.f18354o && C5207g.m11106a(this.f18355p, resultChallengeJoinedStats.f18355p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21, types: [int] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v35 */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18340a) * 31;
        int iHashCode2 = 0;
        String str = this.f18341b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18342c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18343d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18344e;
        int iM16d = C0009a.m16d(this.f18345f, (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        ChallengeProfile challengeProfile = this.f18346g;
        int iHashCode6 = (iM16d + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31;
        Language language = this.f18347h;
        int iM16d2 = C0009a.m16d(this.f18348i, (iHashCode6 + (language == null ? 0 : language.hashCode())) * 31, 31);
        boolean z10 = this.f18349j;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int iM16d3 = C0009a.m16d(this.f18354o, C0009a.m16d(this.f18353n, C0009a.m16d(this.f18352m, C0009a.m16d(this.f18351l, C0009a.m16d(this.f18350k, (iM16d2 + r10) * 31, 31), 31), 31), 31), 31);
        List<ChallengeResultStats> list = this.f18355p;
        if (list != null) {
            iHashCode2 = list.hashCode();
        }
        return iM16d3 + iHashCode2;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultChallengeJoinedStats(pk=");
        sb2.append(this.f18340a);
        sb2.append(", status=");
        sb2.append(this.f18341b);
        sb2.append(", startDate=");
        sb2.append(this.f18342c);
        sb2.append(", endDate=");
        sb2.append(this.f18343d);
        sb2.append(", signupDatetime=");
        sb2.append(this.f18344e);
        sb2.append(", rank=");
        sb2.append(this.f18345f);
        sb2.append(", profile=");
        sb2.append(this.f18346g);
        sb2.append(", language=");
        sb2.append(this.f18347h);
        sb2.append(", activityIndex=");
        sb2.append(this.f18348i);
        sb2.append(", isCompleted=");
        sb2.append(this.f18349j);
        sb2.append(", membershipPtrId=");
        sb2.append(this.f18350k);
        sb2.append(", knownWords=");
        sb2.append(this.f18351l);
        sb2.append(", lingqs=");
        sb2.append(this.f18352m);
        sb2.append(", streakDays=");
        sb2.append(this.f18353n);
        sb2.append(", context=");
        sb2.append(this.f18354o);
        sb2.append(", stats=");
        return C0009a.m24m(sb2, this.f18355p, ")");
    }
}
