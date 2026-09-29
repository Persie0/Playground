package com.lingq.shared.uimodel.language;

import android.support.v4.media.C0141b;
import android.support.v4.media.session.C0166e;
import androidx.activity.result.C0204c;
import com.android.installreferrer.api.InstallReferrerClient;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p003a2.C0009a;
import tk.InterfaceC9307k;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC9307k(generateAdapter = true)
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguageProgress;", "", "shared_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final /* data */ class UserLanguageProgress {

    /* JADX INFO: renamed from: a */
    public final String f21752a;

    /* JADX INFO: renamed from: b */
    public final String f21753b;

    /* JADX INFO: renamed from: c */
    public final int f21754c;

    /* JADX INFO: renamed from: d */
    public final double f21755d;

    /* JADX INFO: renamed from: e */
    public final int f21756e;

    /* JADX INFO: renamed from: f */
    public final double f21757f;

    /* JADX INFO: renamed from: g */
    public final int f21758g;

    /* JADX INFO: renamed from: h */
    public final int f21759h;

    /* JADX INFO: renamed from: i */
    public final int f21760i;

    /* JADX INFO: renamed from: j */
    public final double f21761j;

    /* JADX INFO: renamed from: k */
    public final double f21762k;

    /* JADX INFO: renamed from: l */
    public final int f21763l;

    /* JADX INFO: renamed from: m */
    public final int f21764m;

    /* JADX INFO: renamed from: n */
    public final List<String> f21765n;

    /* JADX INFO: renamed from: o */
    public final int f21766o;

    /* JADX INFO: renamed from: p */
    public final int f21767p;

    /* JADX INFO: renamed from: q */
    public final double f21768q;

    /* JADX INFO: renamed from: r */
    public final int f21769r;

    /* JADX INFO: renamed from: s */
    public final int f21770s;

    /* JADX INFO: renamed from: t */
    public final int f21771t;

    public UserLanguageProgress(String str, String str2, int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List<String> list, int i17, int i18, double d14, int i19, int i20, int i21) {
        C5207g.m11111f(str, "interval");
        C5207g.m11111f(str2, "languageCode");
        C5207g.m11111f(list, "intervals");
        this.f21752a = str;
        this.f21753b = str2;
        this.f21754c = i10;
        this.f21755d = d10;
        this.f21756e = i11;
        this.f21757f = d11;
        this.f21758g = i12;
        this.f21759h = i13;
        this.f21760i = i14;
        this.f21761j = d12;
        this.f21762k = d13;
        this.f21763l = i15;
        this.f21764m = i16;
        this.f21765n = list;
        this.f21766o = i17;
        this.f21767p = i18;
        this.f21768q = d14;
        this.f21769r = i19;
        this.f21770s = i20;
        this.f21771t = i21;
    }

    public UserLanguageProgress(String str, String str2, int i10, double d10, int i11, double d11, int i12, int i13, int i14, double d12, double d13, int i15, int i16, List list, int i17, int i18, double d14, int i19, int i20, int i21, int i22, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i22 & 4) != 0 ? 0 : i10, (i22 & 8) != 0 ? 0.0d : d10, (i22 & 16) != 0 ? 0 : i11, (i22 & 32) != 0 ? 0.0d : d11, (i22 & 64) != 0 ? 0 : i12, (i22 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? 0 : i13, (i22 & 256) != 0 ? 0 : i14, (i22 & 512) != 0 ? 0.0d : d12, (i22 & 1024) != 0 ? 0.0d : d13, (i22 & 2048) != 0 ? 0 : i15, (i22 & 4096) != 0 ? 0 : i16, (i22 & 8192) != 0 ? EmptyList.f38032a : list, (i22 & 16384) != 0 ? 0 : i17, (32768 & i22) != 0 ? 0 : i18, (65536 & i22) != 0 ? 0.0d : d14, (131072 & i22) != 0 ? 0 : i19, (262144 & i22) != 0 ? 0 : i20, (i22 & 524288) != 0 ? 0 : i21);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserLanguageProgress)) {
            return false;
        }
        UserLanguageProgress userLanguageProgress = (UserLanguageProgress) obj;
        return C5207g.m11106a(this.f21752a, userLanguageProgress.f21752a) && C5207g.m11106a(this.f21753b, userLanguageProgress.f21753b) && this.f21754c == userLanguageProgress.f21754c && Double.compare(this.f21755d, userLanguageProgress.f21755d) == 0 && this.f21756e == userLanguageProgress.f21756e && Double.compare(this.f21757f, userLanguageProgress.f21757f) == 0 && this.f21758g == userLanguageProgress.f21758g && this.f21759h == userLanguageProgress.f21759h && this.f21760i == userLanguageProgress.f21760i && Double.compare(this.f21761j, userLanguageProgress.f21761j) == 0 && Double.compare(this.f21762k, userLanguageProgress.f21762k) == 0 && this.f21763l == userLanguageProgress.f21763l && this.f21764m == userLanguageProgress.f21764m && C5207g.m11106a(this.f21765n, userLanguageProgress.f21765n) && this.f21766o == userLanguageProgress.f21766o && this.f21767p == userLanguageProgress.f21767p && Double.compare(this.f21768q, userLanguageProgress.f21768q) == 0 && this.f21769r == userLanguageProgress.f21769r && this.f21770s == userLanguageProgress.f21770s && this.f21771t == userLanguageProgress.f21771t;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f21771t) + C0009a.m16d(this.f21770s, C0009a.m16d(this.f21769r, C0141b.m609e(this.f21768q, C0009a.m16d(this.f21767p, C0009a.m16d(this.f21766o, C0204c.m848g(this.f21765n, C0009a.m16d(this.f21764m, C0009a.m16d(this.f21763l, C0141b.m609e(this.f21762k, C0141b.m609e(this.f21761j, C0009a.m16d(this.f21760i, C0009a.m16d(this.f21759h, C0009a.m16d(this.f21758g, C0141b.m609e(this.f21757f, C0009a.m16d(this.f21756e, C0141b.m609e(this.f21755d, C0009a.m16d(this.f21754c, C0166e.m758d(this.f21753b, this.f21752a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserLanguageProgress(interval=");
        sb2.append(this.f21752a);
        sb2.append(", languageCode=");
        sb2.append(this.f21753b);
        sb2.append(", writtenWordsGoal=");
        sb2.append(this.f21754c);
        sb2.append(", speakingTimeGoal=");
        sb2.append(this.f21755d);
        sb2.append(", totalWordsKnown=");
        sb2.append(this.f21756e);
        sb2.append(", readWords=");
        sb2.append(this.f21757f);
        sb2.append(", totalCards=");
        sb2.append(this.f21758g);
        sb2.append(", activityIndex=");
        sb2.append(this.f21759h);
        sb2.append(", knownWordsGoal=");
        sb2.append(this.f21760i);
        sb2.append(", listeningTimeGoal=");
        sb2.append(this.f21761j);
        sb2.append(", speakingTime=");
        sb2.append(this.f21762k);
        sb2.append(", cardsCreatedGoal=");
        sb2.append(this.f21763l);
        sb2.append(", knownWords=");
        sb2.append(this.f21764m);
        sb2.append(", intervals=");
        sb2.append(this.f21765n);
        sb2.append(", cardsCreated=");
        sb2.append(this.f21766o);
        sb2.append(", readWordsGoal=");
        sb2.append(this.f21767p);
        sb2.append(", listeningTime=");
        sb2.append(this.f21768q);
        sb2.append(", cardsLearned=");
        sb2.append(this.f21769r);
        sb2.append(", writtenWords=");
        sb2.append(this.f21770s);
        sb2.append(", cardsLearnedGoal=");
        return C0166e.m768o(sb2, this.f21771t, ")");
    }
}
