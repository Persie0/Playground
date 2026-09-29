package com.lingq.shared.network.result;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/network/result/ResultLanguageProgress;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class ResultLanguageProgress {

    /* JADX INFO: renamed from: a */
    public final int f18465a;

    /* JADX INFO: renamed from: b */
    public final double f18466b;

    /* JADX INFO: renamed from: c */
    public final int f18467c;

    /* JADX INFO: renamed from: d */
    public final double f18468d;

    /* JADX INFO: renamed from: e */
    public final int f18469e;

    /* JADX INFO: renamed from: f */
    public final int f18470f;

    /* JADX INFO: renamed from: g */
    public final int f18471g;

    /* JADX INFO: renamed from: h */
    public final double f18472h;

    /* JADX INFO: renamed from: i */
    public final double f18473i;

    /* JADX INFO: renamed from: j */
    public final int f18474j;

    /* JADX INFO: renamed from: k */
    public final int f18475k;

    /* JADX INFO: renamed from: l */
    public final List<String> f18476l;

    /* JADX INFO: renamed from: m */
    public final int f18477m;

    /* JADX INFO: renamed from: n */
    public final int f18478n;

    /* JADX INFO: renamed from: o */
    public final double f18479o;

    /* JADX INFO: renamed from: p */
    public final int f18480p;

    /* JADX INFO: renamed from: q */
    public final int f18481q;

    /* JADX INFO: renamed from: r */
    public final int f18482r;

    public ResultLanguageProgress(int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List<String> list, int i17, int i18, double d14, int i19, int i20, int i21) {
        this.f18465a = i10;
        this.f18466b = d10;
        this.f18467c = i11;
        this.f18468d = d11;
        this.f18469e = i12;
        this.f18470f = i13;
        this.f18471g = i14;
        this.f18472h = d12;
        this.f18473i = d13;
        this.f18474j = i15;
        this.f18475k = i16;
        this.f18476l = list;
        this.f18477m = i17;
        this.f18478n = i18;
        this.f18479o = d14;
        this.f18480p = i19;
        this.f18481q = i20;
        this.f18482r = i21;
    }

    public /* synthetic */ ResultLanguageProgress(int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List list, int i17, int i18, double d14, int i19, int i20, int i21, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this((i22 & 1) != 0 ? 0 : i10, (i22 & 2) != 0 ? 0.0d : d10, (i22 & 4) != 0 ? 0 : i11, (i22 & 8) != 0 ? 0.0d : d11, (i22 & 16) != 0 ? 0 : i12, (i22 & 32) != 0 ? 0 : i13, (i22 & 64) != 0 ? 0 : i14, (i22 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0.0d : d12, (i22 & 256) != 0 ? 0.0d : d13, (i22 & 512) != 0 ? 0 : i15, (i22 & 1024) != 0 ? 0 : i16, list, (i22 & 4096) != 0 ? 0 : i17, (i22 & 8192) != 0 ? 0 : i18, (i22 & 16384) != 0 ? 0.0d : d14, (32768 & i22) != 0 ? 0 : i19, (65536 & i22) != 0 ? 0 : i20, (i22 & 131072) != 0 ? 0 : i21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ResultLanguageProgress)) {
            return false;
        }
        ResultLanguageProgress resultLanguageProgress = (ResultLanguageProgress) obj;
        if (this.f18465a == resultLanguageProgress.f18465a && Double.compare(this.f18466b, resultLanguageProgress.f18466b) == 0 && this.f18467c == resultLanguageProgress.f18467c && Double.compare(this.f18468d, resultLanguageProgress.f18468d) == 0 && this.f18469e == resultLanguageProgress.f18469e && this.f18470f == resultLanguageProgress.f18470f && this.f18471g == resultLanguageProgress.f18471g && Double.compare(this.f18472h, resultLanguageProgress.f18472h) == 0 && Double.compare(this.f18473i, resultLanguageProgress.f18473i) == 0 && this.f18474j == resultLanguageProgress.f18474j && this.f18475k == resultLanguageProgress.f18475k && C5207g.m11106a(this.f18476l, resultLanguageProgress.f18476l) && this.f18477m == resultLanguageProgress.f18477m && this.f18478n == resultLanguageProgress.f18478n && Double.compare(this.f18479o, resultLanguageProgress.f18479o) == 0 && this.f18480p == resultLanguageProgress.f18480p && this.f18481q == resultLanguageProgress.f18481q && this.f18482r == resultLanguageProgress.f18482r) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f18475k, C0009a.m16d(this.f18474j, C0141b.m609e(this.f18473i, C0141b.m609e(this.f18472h, C0009a.m16d(this.f18471g, C0009a.m16d(this.f18470f, C0009a.m16d(this.f18469e, C0141b.m609e(this.f18468d, C0009a.m16d(this.f18467c, C0141b.m609e(this.f18466b, Integer.hashCode(this.f18465a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        List<String> list = this.f18476l;
        return Integer.hashCode(this.f18482r) + C0009a.m16d(this.f18481q, C0009a.m16d(this.f18480p, C0141b.m609e(this.f18479o, C0009a.m16d(this.f18478n, C0009a.m16d(this.f18477m, (iM16d + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResultLanguageProgress(writtenWordsGoal=");
        sb2.append(this.f18465a);
        sb2.append(", speakingTimeGoal=");
        sb2.append(this.f18466b);
        sb2.append(", totalWordsKnown=");
        sb2.append(this.f18467c);
        sb2.append(", readWords=");
        sb2.append(this.f18468d);
        sb2.append(", totalCards=");
        sb2.append(this.f18469e);
        sb2.append(", activityIndex=");
        sb2.append(this.f18470f);
        sb2.append(", knownWordsGoal=");
        sb2.append(this.f18471g);
        sb2.append(", listeningTimeGoal=");
        sb2.append(this.f18472h);
        sb2.append(", speakingTime=");
        sb2.append(this.f18473i);
        sb2.append(", cardsCreatedGoal=");
        sb2.append(this.f18474j);
        sb2.append(", knownWords=");
        sb2.append(this.f18475k);
        sb2.append(", intervals=");
        sb2.append(this.f18476l);
        sb2.append(", cardsCreated=");
        sb2.append(this.f18477m);
        sb2.append(", readWordsGoal=");
        sb2.append(this.f18478n);
        sb2.append(", listeningTime=");
        sb2.append(this.f18479o);
        sb2.append(", cardsLearned=");
        sb2.append(this.f18480p);
        sb2.append(", writtenWords=");
        sb2.append(this.f18481q);
        sb2.append(", cardsLearnedGoal=");
        return C0166e.m768o(sb2, this.f18482r, ")");
    }
}
