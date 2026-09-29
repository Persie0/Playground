package p231l1;

import android.support.v4.media.AbstractC0140a;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import dm.C5212l;
import p328q1.C8470g;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p376s1.C8948d;
import p387t0.C9152j0;
import p387t0.C9169u;
import p445w1.C9791a;
import p445w1.C9793c;
import p445w1.C9794d;
import p445w1.C9795e;
import p445w1.C9796f;
import p445w1.C9797g;
import p445w1.C9798h;
import p445w1.C9799i;
import p445w1.C9800j;
import p445w1.C9801k;
import p470x1.C10023k;

/* JADX INFO: renamed from: l1.l */
/* JADX INFO: loaded from: classes.dex */
public final class C7218l {

    /* JADX INFO: renamed from: c */
    public static final C7218l f40599c = new C7218l(0, null, null, 4194303);

    /* JADX INFO: renamed from: a */
    public final C7214h f40600a;

    /* JADX INFO: renamed from: b */
    public final C7211e f40601b;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7218l(long j10, long j11, C8476m c8476m, C8471h c8471h, AbstractC0696b abstractC0696b, long j12, C9798h c9798h, C9797g c9797g, long j13, int i10) {
        long j14 = (i10 & 1) != 0 ? C9169u.f47703f : j10;
        this(new C7214h((j14 > C9169u.f47703f ? 1 : (j14 == C9169u.f47703f ? 0 : -1)) != 0 ? new C9793c(j14) : TextForegroundStyle.C0710a.f4688a, (i10 & 2) != 0 ? C10023k.f50982c : j11, (i10 & 4) != 0 ? null : c8476m, (i10 & 8) != 0 ? null : c8471h, (C8472i) null, (i10 & 32) != 0 ? null : abstractC0696b, (String) null, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? C10023k.f50982c : j12, (C9791a) null, (C9800j) null, (C8948d) null, (i10 & 2048) != 0 ? C9169u.f47703f : 0L, (i10 & 4096) != 0 ? null : c9798h, (C9152j0) null, (AbstractC0140a) null), new C7211e((i10 & 16384) != 0 ? null : c9797g, null, (i10 & 65536) != 0 ? C10023k.f50982c : j13, null, null, null, null, null), null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C7218l(long j10, C8476m c8476m, C8470g c8470g, int i10) {
        long j11 = (i10 & 1) != 0 ? C9169u.f47703f : 0L;
        this(new C7214h((j11 > C9169u.f47703f ? 1 : (j11 == C9169u.f47703f ? 0 : -1)) != 0 ? new C9793c(j11) : TextForegroundStyle.C0710a.f4688a, (i10 & 2) != 0 ? C10023k.f50982c : j10, (i10 & 4) != 0 ? null : c8476m, null, null, (i10 & 32) != 0 ? null : c8470g, null, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? C10023k.f50982c : 0L, null, null, null, (i10 & 2048) != 0 ? C9169u.f47703f : 0L, null, null), new C7211e(null, null, (i10 & 65536) != 0 ? C10023k.f50982c : 0L, null, null, null, null), null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7218l(C7214h c7214h, C7211e c7211e) {
        this(c7214h, c7211e, null);
        C5207g.m11111f(c7214h, "spanStyle");
    }

    public C7218l(C7214h c7214h, C7211e c7211e, C5212l c5212l) {
        C5207g.m11111f(c7214h, "spanStyle");
        this.f40600a = c7214h;
        this.f40601b = c7211e;
    }

    /* JADX INFO: renamed from: a */
    public static C7218l m14543a(C7218l c7218l, long j10, C9152j0 c9152j0, int i10) {
        C5212l c5212l;
        C9796f c9796f;
        TextForegroundStyle textForegroundStyle;
        TextForegroundStyle c9793c;
        long jM14529b = (i10 & 1) != 0 ? c7218l.f40600a.m14529b() : 0L;
        long j11 = (i10 & 2) != 0 ? c7218l.f40600a.f40571b : j10;
        C8476m c8476m = (i10 & 4) != 0 ? c7218l.f40600a.f40572c : null;
        C8471h c8471h = (i10 & 8) != 0 ? c7218l.f40600a.f40573d : null;
        C8472i c8472i = (i10 & 16) != 0 ? c7218l.f40600a.f40574e : null;
        AbstractC0696b abstractC0696b = (i10 & 32) != 0 ? c7218l.f40600a.f40575f : null;
        String str = (i10 & 64) != 0 ? c7218l.f40600a.f40576g : null;
        long j12 = (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? c7218l.f40600a.f40577h : 0L;
        C9791a c9791a = (i10 & 256) != 0 ? c7218l.f40600a.f40578i : null;
        C9800j c9800j = (i10 & 512) != 0 ? c7218l.f40600a.f40579j : null;
        C8948d c8948d = (i10 & 1024) != 0 ? c7218l.f40600a.f40580k : null;
        long j13 = (i10 & 2048) != 0 ? c7218l.f40600a.f40581l : 0L;
        C9798h c9798h = (i10 & 4096) != 0 ? c7218l.f40600a.f40582m : null;
        C9152j0 c9152j1 = (i10 & 8192) != 0 ? c7218l.f40600a.f40583n : c9152j0;
        C9797g c9797g = (i10 & 16384) != 0 ? c7218l.f40601b.f40558a : null;
        C9799i c9799i = (32768 & i10) != 0 ? c7218l.f40601b.f40559b : null;
        long j14 = (65536 & i10) != 0 ? c7218l.f40601b.f40560c : 0L;
        C9801k c9801k = (131072 & i10) != 0 ? c7218l.f40601b.f40561d : null;
        if ((262144 & i10) != 0) {
            c5212l = null;
            c7218l.getClass();
        } else {
            c5212l = null;
        }
        if ((524288 & i10) != 0) {
            c7218l.f40601b.getClass();
            c9796f = null;
        } else {
            c9796f = null;
        }
        C9795e c9795e = (1048576 & i10) != 0 ? c7218l.f40601b.f40562e : null;
        C9794d c9794d = (i10 & 2097152) != 0 ? c7218l.f40601b.f40563f : null;
        C7214h c7214h = c7218l.f40600a;
        if (!C9169u.m17497c(jM14529b, c7214h.m14529b())) {
            if (jM14529b != C9169u.f47703f) {
                c9793c = new C9793c(jM14529b);
            } else {
                textForegroundStyle = TextForegroundStyle.C0710a.f4688a;
            }
            return new C7218l(new C7214h(c9793c, j11, c8476m, c8471h, c8472i, abstractC0696b, str, j12, c9791a, c9800j, c8948d, j13, c9798h, c9152j1, c7214h.f40584o), new C7211e(c9797g, c9799i, j14, c9801k, c9796f, c9795e, c9794d, c7218l.f40601b.f40564g), c5212l);
        }
        textForegroundStyle = c7214h.f40570a;
        c9793c = textForegroundStyle;
        return new C7218l(new C7214h(c9793c, j11, c8476m, c8471h, c8472i, abstractC0696b, str, j12, c9791a, c9800j, c8948d, j13, c9798h, c9152j1, c7214h.f40584o), new C7211e(c9797g, c9799i, j14, c9801k, c9796f, c9795e, c9794d, c7218l.f40601b.f40564g), c5212l);
    }

    /* JADX INFO: renamed from: b */
    public final C7218l m14544b(C7218l c7218l) {
        return (c7218l == null || C5207g.m11106a(c7218l, f40599c)) ? this : new C7218l(this.f40600a.m14531d(c7218l.f40600a), this.f40601b.m14527a(c7218l.f40601b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7218l)) {
            return false;
        }
        C7218l c7218l = (C7218l) obj;
        if (!C5207g.m11106a(this.f40600a, c7218l.f40600a) || !C5207g.m11106a(this.f40601b, c7218l.f40601b)) {
            return false;
        }
        c7218l.getClass();
        return C5207g.m11106a(null, null);
    }

    public final int hashCode() {
        return ((this.f40601b.hashCode() + (this.f40600a.hashCode() * 31)) * 31) + 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        C7214h c7214h = this.f40600a;
        sb2.append((Object) C9169u.m17503i(c7214h.m14529b()));
        sb2.append(", brush=");
        sb2.append(c7214h.m14528a());
        sb2.append(", alpha=");
        sb2.append(c7214h.f40570a.mo2614A());
        sb2.append(", fontSize=");
        sb2.append((Object) C10023k.m18633d(c7214h.f40571b));
        sb2.append(", fontWeight=");
        sb2.append(c7214h.f40572c);
        sb2.append(", fontStyle=");
        sb2.append(c7214h.f40573d);
        sb2.append(", fontSynthesis=");
        sb2.append(c7214h.f40574e);
        sb2.append(", fontFamily=");
        sb2.append(c7214h.f40575f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(c7214h.f40576g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) C10023k.m18633d(c7214h.f40577h));
        sb2.append(", baselineShift=");
        sb2.append(c7214h.f40578i);
        sb2.append(", textGeometricTransform=");
        sb2.append(c7214h.f40579j);
        sb2.append(", localeList=");
        sb2.append(c7214h.f40580k);
        sb2.append(", background=");
        sb2.append((Object) C9169u.m17503i(c7214h.f40581l));
        sb2.append(", textDecoration=");
        sb2.append(c7214h.f40582m);
        sb2.append(", shadow=");
        sb2.append(c7214h.f40583n);
        sb2.append(", drawStyle=");
        sb2.append(c7214h.f40584o);
        sb2.append(", textAlign=");
        C7211e c7211e = this.f40601b;
        sb2.append(c7211e.f40558a);
        sb2.append(", textDirection=");
        sb2.append(c7211e.f40559b);
        sb2.append(", lineHeight=");
        sb2.append((Object) C10023k.m18633d(c7211e.f40560c));
        sb2.append(", textIndent=");
        sb2.append(c7211e.f40561d);
        sb2.append(", platformStyle=");
        sb2.append((Object) null);
        sb2.append(", lineHeightStyle=");
        c7211e.getClass();
        sb2.append((Object) null);
        sb2.append(", lineBreak=");
        sb2.append(c7211e.f40562e);
        sb2.append(", hyphens=");
        sb2.append(c7211e.f40563f);
        sb2.append(", textMotion=");
        sb2.append(c7211e.f40564g);
        sb2.append(')');
        return sb2.toString();
    }
}
