package com.lingq.shared.network.result;

import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.entity.ChallengeJoinedStats;
import com.lingq.entity.SocialSettings;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9303g;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultChallenge;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultChallenge {

    /* JADX INFO: renamed from: a */
    public final int f18311a;

    /* JADX INFO: renamed from: b */
    public final String f18312b;

    /* JADX INFO: renamed from: c */
    public final String f18313c;

    /* JADX INFO: renamed from: d */
    @InterfaceC9303g(name = "challenge_type")
    public final String f18314d;

    /* JADX INFO: renamed from: e */
    public final String f18315e;

    /* JADX INFO: renamed from: f */
    public final String f18316f;

    /* JADX INFO: renamed from: g */
    @InterfaceC9303g(name = "start_date")
    public final String f18317g;

    /* JADX INFO: renamed from: h */
    @InterfaceC9303g(name = "end_date")
    public final String f18318h;

    /* JADX INFO: renamed from: i */
    public final String f18319i;

    /* JADX INFO: renamed from: j */
    @InterfaceC9303g(name = "time_left")
    public final String f18320j;

    /* JADX INFO: renamed from: k */
    @InterfaceC9303g(name = "is_permanent")
    public final boolean f18321k;

    /* JADX INFO: renamed from: l */
    @InterfaceC9303g(name = "participants_count")
    public final int f18322l;

    /* JADX INFO: renamed from: m */
    @InterfaceC9303g(name = "is_disabled")
    public final boolean f18323m;

    /* JADX INFO: renamed from: n */
    @InterfaceC9303g(name = "is_active")
    public final boolean f18324n;

    /* JADX INFO: renamed from: o */
    public final String f18325o;

    /* JADX INFO: renamed from: p */
    @InterfaceC9303g(name = "badge_url")
    public final String f18326p;

    /* JADX INFO: renamed from: q */
    public final int f18327q;

    /* JADX INFO: renamed from: r */
    @InterfaceC9303g(name = "context_participants")
    public final int f18328r;

    /* JADX INFO: renamed from: s */
    @InterfaceC9303g(name = "screen_title")
    public final String f18329s;

    /* JADX INFO: renamed from: t */
    @InterfaceC9303g(name = "social_settings")
    public final SocialSettings f18330t;

    /* JADX INFO: renamed from: u */
    @InterfaceC9303g(name = "is_completed")
    public final boolean f18331u;

    /* JADX INFO: renamed from: v */
    public final ChallengeJoinedStats f18332v;

    public ResultChallenge(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, int i11, boolean z11, boolean z12, String str10, String str11, int i12, int i13, String str12, SocialSettings socialSettings, boolean z13, ChallengeJoinedStats challengeJoinedStats) {
        this.f18311a = i10;
        this.f18312b = str;
        this.f18313c = str2;
        this.f18314d = str3;
        this.f18315e = str4;
        this.f18316f = str5;
        this.f18317g = str6;
        this.f18318h = str7;
        this.f18319i = str8;
        this.f18320j = str9;
        this.f18321k = z10;
        this.f18322l = i11;
        this.f18323m = z11;
        this.f18324n = z12;
        this.f18325o = str10;
        this.f18326p = str11;
        this.f18327q = i12;
        this.f18328r = i13;
        this.f18329s = str12;
        this.f18330t = socialSettings;
        this.f18331u = z13;
        this.f18332v = challengeJoinedStats;
    }

    public /* synthetic */ ResultChallenge(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, boolean z10, int i11, boolean z11, boolean z12, String str10, String str11, int i12, int i13, String str12, SocialSettings socialSettings, boolean z13, ChallengeJoinedStats challengeJoinedStats, int i14, DefaultConstructorMarker defaultConstructorMarker) {
        this((i14 & 1) != 0 ? 0 : i10, str, str2, str3, str4, str5, str6, str7, str8, str9, (i14 & 1024) != 0 ? false : z10, (i14 & 2048) != 0 ? 0 : i11, (i14 & 4096) != 0 ? false : z11, (i14 & 8192) != 0 ? false : z12, str10, str11, (65536 & i14) != 0 ? 0 : i12, (131072 & i14) != 0 ? 0 : i13, str12, socialSettings, (i14 & 1048576) != 0 ? false : z13, challengeJoinedStats);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultChallenge)) {
            return false;
        }
        ResultChallenge resultChallenge = (ResultChallenge) obj;
        return this.f18311a == resultChallenge.f18311a && C5207g.m11106a(this.f18312b, resultChallenge.f18312b) && C5207g.m11106a(this.f18313c, resultChallenge.f18313c) && C5207g.m11106a(this.f18314d, resultChallenge.f18314d) && C5207g.m11106a(this.f18315e, resultChallenge.f18315e) && C5207g.m11106a(this.f18316f, resultChallenge.f18316f) && C5207g.m11106a(this.f18317g, resultChallenge.f18317g) && C5207g.m11106a(this.f18318h, resultChallenge.f18318h) && C5207g.m11106a(this.f18319i, resultChallenge.f18319i) && C5207g.m11106a(this.f18320j, resultChallenge.f18320j) && this.f18321k == resultChallenge.f18321k && this.f18322l == resultChallenge.f18322l && this.f18323m == resultChallenge.f18323m && this.f18324n == resultChallenge.f18324n && C5207g.m11106a(this.f18325o, resultChallenge.f18325o) && C5207g.m11106a(this.f18326p, resultChallenge.f18326p) && this.f18327q == resultChallenge.f18327q && this.f18328r == resultChallenge.f18328r && C5207g.m11106a(this.f18329s, resultChallenge.f18329s) && C5207g.m11106a(this.f18330t, resultChallenge.f18330t) && this.f18331u == resultChallenge.f18331u && C5207g.m11106a(this.f18332v, resultChallenge.f18332v);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v21, types: [int] */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26, types: [int] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v4, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18311a) * 31;
        int iHashCode2 = 0;
        String str = this.f18312b;
        int iHashCode3 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18313c;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18314d;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18315e;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f18316f;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f18317g;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f18318h;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f18319i;
        int iHashCode10 = (iHashCode9 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f18320j;
        int iHashCode11 = (iHashCode10 + (str9 == null ? 0 : str9.hashCode())) * 31;
        ?? r10 = 1;
        boolean z10 = this.f18321k;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM16d = C0009a.m16d(this.f18322l, (iHashCode11 + r11) * 31, 31);
        boolean z11 = this.f18323m;
        ?? r12 = z11;
        if (z11) {
            r12 = 1;
        }
        int i10 = (iM16d + r12) * 31;
        boolean z12 = this.f18324n;
        ?? r13 = z12;
        if (z12) {
            r13 = 1;
        }
        int i11 = (i10 + r13) * 31;
        String str10 = this.f18325o;
        int iHashCode12 = (i11 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f18326p;
        int iM16d2 = C0009a.m16d(this.f18328r, C0009a.m16d(this.f18327q, (iHashCode12 + (str11 == null ? 0 : str11.hashCode())) * 31, 31), 31);
        String str12 = this.f18329s;
        int iHashCode13 = (iM16d2 + (str12 == null ? 0 : str12.hashCode())) * 31;
        SocialSettings socialSettings = this.f18330t;
        int iHashCode14 = (iHashCode13 + (socialSettings == null ? 0 : socialSettings.hashCode())) * 31;
        boolean z13 = this.f18331u;
        if (!z13) {
            r10 = z13;
        }
        int i12 = (iHashCode14 + r10) * 31;
        ChallengeJoinedStats challengeJoinedStats = this.f18332v;
        if (challengeJoinedStats != null) {
            iHashCode2 = challengeJoinedStats.hashCode();
        }
        return i12 + iHashCode2;
    }

    public final String toString() {
        return "ResultChallenge(pk=" + this.f18311a + ", code=" + this.f18312b + ", title=" + this.f18313c + ", challengeType=" + this.f18314d + ", description=" + this.f18315e + ", prize=" + this.f18316f + ", startDate=" + this.f18317g + ", endDate=" + this.f18318h + ", language=" + this.f18319i + ", timeLeft=" + this.f18320j + ", isPermanent=" + this.f18321k + ", participantsCount=" + this.f18322l + ", isDisabled=" + this.f18323m + ", isActive=" + this.f18324n + ", badge=" + this.f18325o + ", badgeUrl=" + this.f18326p + ", duration=" + this.f18327q + ", contextParticipants=" + this.f18328r + ", screenTitle=" + this.f18329s + ", socialSettings=" + this.f18330t + ", isCompleted=" + this.f18331u + ", challenger=" + this.f18332v + ")";
    }
}
