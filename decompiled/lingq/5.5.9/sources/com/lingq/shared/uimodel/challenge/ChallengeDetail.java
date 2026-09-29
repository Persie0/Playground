package com.lingq.shared.uimodel.challenge;

import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/challenge/ChallengeDetail;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ChallengeDetail {

    /* JADX INFO: renamed from: a */
    public final int f21633a;

    /* JADX INFO: renamed from: b */
    public final String f21634b;

    /* JADX INFO: renamed from: c */
    public final String f21635c;

    /* JADX INFO: renamed from: d */
    public final String f21636d;

    /* JADX INFO: renamed from: e */
    public final String f21637e;

    /* JADX INFO: renamed from: f */
    public final String f21638f;

    /* JADX INFO: renamed from: g */
    public final String f21639g;

    /* JADX INFO: renamed from: h */
    public final int f21640h;

    /* JADX INFO: renamed from: i */
    public final boolean f21641i;

    /* JADX INFO: renamed from: j */
    public final String f21642j;

    /* JADX INFO: renamed from: k */
    public final boolean f21643k;

    /* JADX INFO: renamed from: l */
    public final int f21644l;

    /* JADX INFO: renamed from: m */
    public final ChallengeSocialSettings f21645m;

    public ChallengeDetail(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, boolean z10, String str7, boolean z11, int i12, ChallengeSocialSettings challengeSocialSettings) {
        C5207g.m11111f(str, "code");
        C5207g.m11111f(str2, "title");
        C5207g.m11111f(str3, "description");
        C5207g.m11111f(str6, "challengeType");
        C5207g.m11111f(str7, "badgeUrl");
        this.f21633a = i10;
        this.f21634b = str;
        this.f21635c = str2;
        this.f21636d = str3;
        this.f21637e = str4;
        this.f21638f = str5;
        this.f21639g = str6;
        this.f21640h = i11;
        this.f21641i = z10;
        this.f21642j = str7;
        this.f21643k = z11;
        this.f21644l = i12;
        this.f21645m = challengeSocialSettings;
    }

    public /* synthetic */ ChallengeDetail(int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, boolean z10, String str7, boolean z11, int i12, ChallengeSocialSettings challengeSocialSettings, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? 0 : i10, (i13 & 2) != 0 ? "" : str, (i13 & 4) != 0 ? "" : str2, (i13 & 8) != 0 ? "" : str3, (i13 & 16) != 0 ? null : str4, (i13 & 32) != 0 ? null : str5, (i13 & 64) != 0 ? "" : str6, (i13 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i11, (i13 & 256) != 0 ? false : z10, (i13 & 512) != 0 ? "" : str7, (i13 & 1024) != 0 ? false : z11, (i13 & 2048) != 0 ? 0 : i12, challengeSocialSettings);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeDetail)) {
            return false;
        }
        ChallengeDetail challengeDetail = (ChallengeDetail) obj;
        return this.f21633a == challengeDetail.f21633a && C5207g.m11106a(this.f21634b, challengeDetail.f21634b) && C5207g.m11106a(this.f21635c, challengeDetail.f21635c) && C5207g.m11106a(this.f21636d, challengeDetail.f21636d) && C5207g.m11106a(this.f21637e, challengeDetail.f21637e) && C5207g.m11106a(this.f21638f, challengeDetail.f21638f) && C5207g.m11106a(this.f21639g, challengeDetail.f21639g) && this.f21640h == challengeDetail.f21640h && this.f21641i == challengeDetail.f21641i && C5207g.m11106a(this.f21642j, challengeDetail.f21642j) && this.f21643k == challengeDetail.f21643k && this.f21644l == challengeDetail.f21644l && C5207g.m11106a(this.f21645m, challengeDetail.f21645m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r0v15, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10, types: [int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final int hashCode() {
        int iM758d = C0166e.m758d(this.f21636d, C0166e.m758d(this.f21635c, C0166e.m758d(this.f21634b, Integer.hashCode(this.f21633a) * 31, 31), 31), 31);
        int iHashCode = 0;
        String str = this.f21637e;
        int iHashCode2 = (iM758d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f21638f;
        int iM16d = C0009a.m16d(this.f21640h, C0166e.m758d(this.f21639g, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        ?? r10 = 1;
        boolean z10 = this.f21641i;
        ?? r11 = z10;
        if (z10) {
            r11 = 1;
        }
        int iM758d2 = C0166e.m758d(this.f21642j, (iM16d + r11) * 31, 31);
        boolean z11 = this.f21643k;
        if (!z11) {
            r10 = z11;
        }
        int iM16d2 = C0009a.m16d(this.f21644l, (iM758d2 + r10) * 31, 31);
        ChallengeSocialSettings challengeSocialSettings = this.f21645m;
        if (challengeSocialSettings != null) {
            iHashCode = challengeSocialSettings.hashCode();
        }
        return iM16d2 + iHashCode;
    }

    public final String toString() {
        return "ChallengeDetail(pk=" + this.f21633a + ", code=" + this.f21634b + ", title=" + this.f21635c + ", description=" + this.f21636d + ", startDate=" + this.f21637e + ", endDate=" + this.f21638f + ", challengeType=" + this.f21639g + ", participantsCount=" + this.f21640h + ", isPast=" + this.f21641i + ", badgeUrl=" + this.f21642j + ", isJoined=" + this.f21643k + ", rank=" + this.f21644l + ", socialSettings=" + this.f21645m + ")";
    }
}
