package p000;

import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class jy7 {

    /* JADX INFO: renamed from: a */
    public final boolean f46393a;

    /* JADX INFO: renamed from: b */
    public final boolean f46394b;

    /* JADX INFO: renamed from: c */
    public final long f46395c;

    /* JADX INFO: renamed from: d */
    public final long f46396d;

    /* JADX INFO: renamed from: e */
    public final float f46397e;

    /* JADX INFO: renamed from: f */
    public final Integer f46398f;

    /* JADX INFO: renamed from: g */
    public final boolean f46399g;

    /* JADX INFO: renamed from: h */
    public final boolean f46400h;

    /* JADX INFO: renamed from: i */
    public final boolean f46401i;

    /* JADX INFO: renamed from: j */
    public final boolean f46402j;

    /* JADX INFO: renamed from: k */
    public final boolean f46403k;

    /* JADX INFO: renamed from: l */
    public final InterfaceC3055gy f46404l;

    /* JADX INFO: renamed from: m */
    public final boolean f46405m;

    /* JADX INFO: renamed from: n */
    public final boolean f46406n;

    /* JADX INFO: renamed from: o */
    public final f00 f46407o;

    /* JADX INFO: renamed from: p */
    public final List f46408p;

    public jy7(boolean z, boolean z2, long j, long j2, float f, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, InterfaceC3055gy interfaceC3055gy, boolean z8, boolean z9, f00 f00Var, List list) {
        this.f46393a = z;
        this.f46394b = z2;
        this.f46395c = j;
        this.f46396d = j2;
        this.f46397e = f;
        this.f46398f = num;
        this.f46399g = z3;
        this.f46400h = z4;
        this.f46401i = z5;
        this.f46402j = z6;
        this.f46403k = z7;
        this.f46404l = interfaceC3055gy;
        this.f46405m = z8;
        this.f46406n = z9;
        this.f46407o = f00Var;
        this.f46408p = list;
    }

    /* JADX INFO: renamed from: a */
    public static jy7 m14750a(jy7 jy7Var, boolean z, boolean z2, long j, long j2, float f, Integer num, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, InterfaceC3055gy interfaceC3055gy, boolean z8, boolean z9, f00 f00Var, List list, int i) {
        boolean z10 = (i & 1) != 0 ? jy7Var.f46393a : z;
        boolean z11 = (i & 2) != 0 ? jy7Var.f46394b : z2;
        long j3 = (i & 4) != 0 ? jy7Var.f46395c : j;
        long j4 = (i & 8) != 0 ? jy7Var.f46396d : j2;
        float f2 = (i & 16) != 0 ? jy7Var.f46397e : f;
        Integer num2 = (i & 32) != 0 ? jy7Var.f46398f : num;
        boolean z12 = (i & 64) != 0 ? jy7Var.f46399g : z3;
        boolean z13 = (i & 128) != 0 ? jy7Var.f46400h : z4;
        boolean z14 = (i & 256) != 0 ? jy7Var.f46401i : z5;
        boolean z15 = (i & 512) != 0 ? jy7Var.f46402j : z6;
        boolean z16 = (i & 1024) != 0 ? jy7Var.f46403k : z7;
        InterfaceC3055gy interfaceC3055gy2 = (i & 2048) != 0 ? jy7Var.f46404l : interfaceC3055gy;
        boolean z17 = z10;
        boolean z18 = (i & 4096) != 0 ? jy7Var.f46405m : z8;
        boolean z19 = (i & 8192) != 0 ? jy7Var.f46406n : z9;
        f00 f00Var2 = (i & 16384) != 0 ? jy7Var.f46407o : f00Var;
        List list2 = (i & 32768) != 0 ? jy7Var.f46408p : list;
        jy7Var.getClass();
        list2.getClass();
        return new jy7(z17, z11, j3, j4, f2, num2, z12, z13, z14, z15, z16, interfaceC3055gy2, z18, z19, f00Var2, list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy7)) {
            return false;
        }
        jy7 jy7Var = (jy7) obj;
        return this.f46393a == jy7Var.f46393a && this.f46394b == jy7Var.f46394b && this.f46395c == jy7Var.f46395c && this.f46396d == jy7Var.f46396d && Float.compare(this.f46397e, jy7Var.f46397e) == 0 && fa4.m11650l(this.f46398f, jy7Var.f46398f) && this.f46399g == jy7Var.f46399g && this.f46400h == jy7Var.f46400h && this.f46401i == jy7Var.f46401i && this.f46402j == jy7Var.f46402j && this.f46403k == jy7Var.f46403k && fa4.m11650l(this.f46404l, jy7Var.f46404l) && this.f46405m == jy7Var.f46405m && this.f46406n == jy7Var.f46406n && fa4.m11650l(this.f46407o, jy7Var.f46407o) && fa4.m11650l(this.f46408p, jy7Var.f46408p);
    }

    public final int hashCode() {
        int iM24105a = wq1.m24105a(ux5.m22981d(this.f46396d, ux5.m22981d(this.f46395c, g9a.m12428e(Boolean.hashCode(this.f46393a) * 31, 31, this.f46394b), 31), 31), this.f46397e, 31);
        Integer num = this.f46398f;
        int iM12428e = g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e(g9a.m12428e((iM24105a + (num == null ? 0 : num.hashCode())) * 31, 31, this.f46399g), 31, this.f46400h), 31, this.f46401i), 31, this.f46402j), 31, this.f46403k);
        InterfaceC3055gy interfaceC3055gy = this.f46404l;
        int iM12428e2 = g9a.m12428e(g9a.m12428e((iM12428e + (interfaceC3055gy == null ? 0 : interfaceC3055gy.hashCode())) * 31, 31, this.f46405m), 31, this.f46406n);
        f00 f00Var = this.f46407o;
        return this.f46408p.hashCode() + ((iM12428e2 + (f00Var != null ? f00Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbM13357g = hn1.m13357g("ReaderPlayerState(isPlaying=", ", isMiniPlayerVisible=", ", currentPosition=", this.f46393a, this.f46394b);
        sbM13357g.append(this.f46395c);
        sbM13357g.append(", duration=");
        sbM13357g.append(this.f46396d);
        sbM13357g.append(", playbackSpeed=");
        sbM13357g.append(this.f46397e);
        sbM13357g.append(", currentSentenceIndex=");
        sbM13357g.append(this.f46398f);
        sbM13357g.append(", hasAudio=");
        wq1.m24101A(sbM13357g, this.f46399g, ", canGenerateAudio=", this.f46400h, ", isSentenceTtsPlaying=");
        wq1.m24101A(sbM13357g, this.f46401i, ", isSentenceTtsLoading=", this.f46402j, ", showGenerateAudioDialog=");
        sbM13357g.append(this.f46403k);
        sbM13357g.append(", audioFetchState=");
        sbM13357g.append(this.f46404l);
        sbM13357g.append(", showAudioError=");
        wq1.m24101A(sbM13357g, this.f46405m, ", showUpgradePopup=", this.f46406n, ", audioWaveState=");
        sbM13357g.append(this.f46407o);
        sbM13357g.append(", sentenceTimestamps=");
        sbM13357g.append(this.f46408p);
        sbM13357g.append(")");
        return sbM13357g.toString();
    }

    public /* synthetic */ jy7() {
        this(false, false, 0L, 0L, 1.0f, null, false, false, false, false, false, null, false, false, null, EmptyList.f47638a);
    }
}
