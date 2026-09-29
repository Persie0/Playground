package com.lingq.entity;

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
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/entity/LanguageProgress;", "", "model_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class LanguageProgress {

    /* JADX INFO: renamed from: a */
    public final String f17030a;

    /* JADX INFO: renamed from: b */
    public final String f17031b;

    /* JADX INFO: renamed from: c */
    public final int f17032c;

    /* JADX INFO: renamed from: d */
    public final double f17033d;

    /* JADX INFO: renamed from: e */
    public final int f17034e;

    /* JADX INFO: renamed from: f */
    public final double f17035f;

    /* JADX INFO: renamed from: g */
    public final int f17036g;

    /* JADX INFO: renamed from: h */
    public final int f17037h;

    /* JADX INFO: renamed from: i */
    public final int f17038i;

    /* JADX INFO: renamed from: j */
    public final double f17039j;

    /* JADX INFO: renamed from: k */
    public final double f17040k;

    /* JADX INFO: renamed from: l */
    public final int f17041l;

    /* JADX INFO: renamed from: m */
    public final int f17042m;

    /* JADX INFO: renamed from: n */
    public final List<String> f17043n;

    /* JADX INFO: renamed from: o */
    public final int f17044o;

    /* JADX INFO: renamed from: p */
    public final int f17045p;

    /* JADX INFO: renamed from: q */
    public final double f17046q;

    /* JADX INFO: renamed from: r */
    public final int f17047r;

    /* JADX INFO: renamed from: s */
    public final int f17048s;

    /* JADX INFO: renamed from: t */
    public final int f17049t;

    public LanguageProgress(String str, String str2, int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List<String> list, int i17, int i18, double d14, int i19, int i20, int i21) {
        C5207g.m11111f(str, "interval");
        C5207g.m11111f(str2, "languageCode");
        this.f17030a = str;
        this.f17031b = str2;
        this.f17032c = i10;
        this.f17033d = d10;
        this.f17034e = i11;
        this.f17035f = d11;
        this.f17036g = i12;
        this.f17037h = i13;
        this.f17038i = i14;
        this.f17039j = d12;
        this.f17040k = d13;
        this.f17041l = i15;
        this.f17042m = i16;
        this.f17043n = list;
        this.f17044o = i17;
        this.f17045p = i18;
        this.f17046q = d14;
        this.f17047r = i19;
        this.f17048s = i20;
        this.f17049t = i21;
    }

    public /* synthetic */ LanguageProgress(String str, String str2, int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List list, int i17, int i18, double d14, int i19, int i20, int i21, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i22 & 4) != 0 ? 0 : i10, (i22 & 8) != 0 ? 0.0d : d10, (i22 & 16) != 0 ? 0 : i11, (i22 & 32) != 0 ? 0.0d : d11, (i22 & 64) != 0 ? 0 : i12, (i22 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i13, (i22 & 256) != 0 ? 0 : i14, (i22 & 512) != 0 ? 0.0d : d12, (i22 & 1024) != 0 ? 0.0d : d13, (i22 & 2048) != 0 ? 0 : i15, (i22 & 4096) != 0 ? 0 : i16, list, (i22 & 16384) != 0 ? 0 : i17, (32768 & i22) != 0 ? 0 : i18, (65536 & i22) != 0 ? 0.0d : d14, (131072 & i22) != 0 ? 0 : i19, (262144 & i22) != 0 ? 0 : i20, (i22 & 524288) != 0 ? 0 : i21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LanguageProgress)) {
            return false;
        }
        LanguageProgress languageProgress = (LanguageProgress) obj;
        return C5207g.m11106a(this.f17030a, languageProgress.f17030a) && C5207g.m11106a(this.f17031b, languageProgress.f17031b) && this.f17032c == languageProgress.f17032c && Double.compare(this.f17033d, languageProgress.f17033d) == 0 && this.f17034e == languageProgress.f17034e && Double.compare(this.f17035f, languageProgress.f17035f) == 0 && this.f17036g == languageProgress.f17036g && this.f17037h == languageProgress.f17037h && this.f17038i == languageProgress.f17038i && Double.compare(this.f17039j, languageProgress.f17039j) == 0 && Double.compare(this.f17040k, languageProgress.f17040k) == 0 && this.f17041l == languageProgress.f17041l && this.f17042m == languageProgress.f17042m && C5207g.m11106a(this.f17043n, languageProgress.f17043n) && this.f17044o == languageProgress.f17044o && this.f17045p == languageProgress.f17045p && Double.compare(this.f17046q, languageProgress.f17046q) == 0 && this.f17047r == languageProgress.f17047r && this.f17048s == languageProgress.f17048s && this.f17049t == languageProgress.f17049t;
    }

    public final int hashCode() {
        int iM16d = C0009a.m16d(this.f17042m, C0009a.m16d(this.f17041l, C0141b.m609e(this.f17040k, C0141b.m609e(this.f17039j, C0009a.m16d(this.f17038i, C0009a.m16d(this.f17037h, C0009a.m16d(this.f17036g, C0141b.m609e(this.f17035f, C0009a.m16d(this.f17034e, C0141b.m609e(this.f17033d, C0009a.m16d(this.f17032c, C0166e.m758d(this.f17031b, this.f17030a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
        List<String> list = this.f17043n;
        return Integer.hashCode(this.f17049t) + C0009a.m16d(this.f17048s, C0009a.m16d(this.f17047r, C0141b.m609e(this.f17046q, C0009a.m16d(this.f17045p, C0009a.m16d(this.f17044o, (iM16d + (list == null ? 0 : list.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LanguageProgress(interval=");
        sb2.append(this.f17030a);
        sb2.append(", languageCode=");
        sb2.append(this.f17031b);
        sb2.append(", writtenWordsGoal=");
        sb2.append(this.f17032c);
        sb2.append(", speakingTimeGoal=");
        sb2.append(this.f17033d);
        sb2.append(", totalWordsKnown=");
        sb2.append(this.f17034e);
        sb2.append(", readWords=");
        sb2.append(this.f17035f);
        sb2.append(", totalCards=");
        sb2.append(this.f17036g);
        sb2.append(", activityIndex=");
        sb2.append(this.f17037h);
        sb2.append(", knownWordsGoal=");
        sb2.append(this.f17038i);
        sb2.append(", listeningTimeGoal=");
        sb2.append(this.f17039j);
        sb2.append(", speakingTime=");
        sb2.append(this.f17040k);
        sb2.append(", cardsCreatedGoal=");
        sb2.append(this.f17041l);
        sb2.append(", knownWords=");
        sb2.append(this.f17042m);
        sb2.append(", intervals=");
        sb2.append(this.f17043n);
        sb2.append(", cardsCreated=");
        sb2.append(this.f17044o);
        sb2.append(", readWordsGoal=");
        sb2.append(this.f17045p);
        sb2.append(", listeningTime=");
        sb2.append(this.f17046q);
        sb2.append(", cardsLearned=");
        sb2.append(this.f17047r);
        sb2.append(", writtenWords=");
        sb2.append(this.f17048s);
        sb2.append(", cardsLearnedGoal=");
        return C0166e.m768o(sb2, this.f17049t, ")");
    }
}
