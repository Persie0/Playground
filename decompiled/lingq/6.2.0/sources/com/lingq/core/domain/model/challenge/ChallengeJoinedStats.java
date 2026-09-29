package com.lingq.core.domain.model.challenge;

import com.lingq.core.domain.model.language.Language;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.LazyThreadSafetyMode;
import p000.AbstractC3393o1;
import p000.C3072he;
import p000.cs4;
import p000.ey8;
import p000.fa4;
import p000.g9a;
import p000.hn1;
import p000.n3c;
import p000.ux5;
import p000.wq1;

/* JADX INFO: loaded from: classes2.dex */
@ey8
public final class ChallengeJoinedStats {
    public static final C1396b Companion = new C1396b();

    /* JADX INFO: renamed from: o */
    public static final cs4[] f18868o = {null, null, null, null, null, null, null, null, null, null, null, null, null, AbstractC3192a.m15357b(LazyThreadSafetyMode.PUBLICATION, new C3072he(15))};

    /* JADX INFO: renamed from: a */
    public final int f18869a;

    /* JADX INFO: renamed from: b */
    public final String f18870b;

    /* JADX INFO: renamed from: c */
    public final String f18871c;

    /* JADX INFO: renamed from: d */
    public final String f18872d;

    /* JADX INFO: renamed from: e */
    public final String f18873e;

    /* JADX INFO: renamed from: f */
    public final int f18874f;

    /* JADX INFO: renamed from: g */
    public final ChallengeProfile f18875g;

    /* JADX INFO: renamed from: h */
    public final Language f18876h;

    /* JADX INFO: renamed from: i */
    public final int f18877i;

    /* JADX INFO: renamed from: j */
    public final boolean f18878j;

    /* JADX INFO: renamed from: k */
    public final int f18879k;

    /* JADX INFO: renamed from: l */
    public final int f18880l;

    /* JADX INFO: renamed from: m */
    public final int f18881m;

    /* JADX INFO: renamed from: n */
    public final List f18882n;

    public /* synthetic */ ChallengeJoinedStats(int i, int i2, String str, String str2, String str3, String str4, int i3, ChallengeProfile challengeProfile, Language language, int i4, boolean z, int i5, int i6, int i7, List list) {
        if (8414 != (i & 8414)) {
            n3c.m17204b(i, 8414, ChallengeJoinedStats$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.f18869a = 0;
        } else {
            this.f18869a = i2;
        }
        this.f18870b = str;
        this.f18871c = str2;
        this.f18872d = str3;
        this.f18873e = str4;
        if ((i & 32) == 0) {
            this.f18874f = 0;
        } else {
            this.f18874f = i3;
        }
        this.f18875g = challengeProfile;
        this.f18876h = language;
        if ((i & 256) == 0) {
            this.f18877i = 0;
        } else {
            this.f18877i = i4;
        }
        if ((i & 512) == 0) {
            this.f18878j = false;
        } else {
            this.f18878j = z;
        }
        if ((i & 1024) == 0) {
            this.f18879k = 0;
        } else {
            this.f18879k = i5;
        }
        if ((i & 2048) == 0) {
            this.f18880l = 0;
        } else {
            this.f18880l = i6;
        }
        if ((i & 4096) == 0) {
            this.f18881m = 0;
        } else {
            this.f18881m = i7;
        }
        this.f18882n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeJoinedStats)) {
            return false;
        }
        ChallengeJoinedStats challengeJoinedStats = (ChallengeJoinedStats) obj;
        return this.f18869a == challengeJoinedStats.f18869a && fa4.m11650l(this.f18870b, challengeJoinedStats.f18870b) && fa4.m11650l(this.f18871c, challengeJoinedStats.f18871c) && fa4.m11650l(this.f18872d, challengeJoinedStats.f18872d) && fa4.m11650l(this.f18873e, challengeJoinedStats.f18873e) && this.f18874f == challengeJoinedStats.f18874f && fa4.m11650l(this.f18875g, challengeJoinedStats.f18875g) && fa4.m11650l(this.f18876h, challengeJoinedStats.f18876h) && this.f18877i == challengeJoinedStats.f18877i && this.f18878j == challengeJoinedStats.f18878j && this.f18879k == challengeJoinedStats.f18879k && this.f18880l == challengeJoinedStats.f18880l && this.f18881m == challengeJoinedStats.f18881m && fa4.m11650l(this.f18882n, challengeJoinedStats.f18882n);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.f18869a) * 31;
        String str = this.f18870b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f18871c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f18872d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f18873e;
        int iM24106b = wq1.m24106b(this.f18874f, (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31);
        ChallengeProfile challengeProfile = this.f18875g;
        int iHashCode5 = (iM24106b + (challengeProfile == null ? 0 : challengeProfile.hashCode())) * 31;
        Language language = this.f18876h;
        int iM24106b2 = wq1.m24106b(this.f18881m, wq1.m24106b(this.f18880l, wq1.m24106b(this.f18879k, g9a.m12428e(wq1.m24106b(this.f18877i, (iHashCode5 + (language == null ? 0 : language.hashCode())) * 31, 31), 31, this.f18878j), 31), 31), 31);
        List list = this.f18882n;
        return iM24106b2 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM22995r = ux5.m22995r(this.f18869a, "ChallengeJoinedStats(pk=", ", status=", this.f18870b, ", startDate=");
        AbstractC3393o1.m17725C(sbM22995r, this.f18871c, ", endDate=", this.f18872d, ", signupDatetime=");
        AbstractC3393o1.m17748w(this.f18874f, this.f18873e, ", rank=", ", profile=", sbM22995r);
        sbM22995r.append(this.f18875g);
        sbM22995r.append(", language=");
        sbM22995r.append(this.f18876h);
        sbM22995r.append(", activityIndex=");
        hn1.m13368r(sbM22995r, this.f18877i, ", isCompleted=", this.f18878j, ", membershipPtrId=");
        hn1.m13360j(this.f18879k, this.f18880l, ", lingqs=", ", context=", sbM22995r);
        sbM22995r.append(this.f18881m);
        sbM22995r.append(", stats=");
        sbM22995r.append(this.f18882n);
        sbM22995r.append(")");
        return sbM22995r.toString();
    }
}
