package p231l1;

import android.support.v4.media.AbstractC0140a;
import androidx.activity.result.C0204c;
import androidx.compose.p017ui.text.font.AbstractC0696b;
import androidx.compose.p017ui.text.style.TextForegroundStyle;
import com.kochava.tracker.BuildConfig;
import dm.C5207g;
import p328q1.C8471h;
import p328q1.C8472i;
import p328q1.C8476m;
import p338qd.C8573r0;
import p376s1.C8948d;
import p387t0.AbstractC9161o;
import p387t0.C9152j0;
import p387t0.C9169u;
import p445w1.C9791a;
import p445w1.C9793c;
import p445w1.C9798h;
import p445w1.C9800j;
import p470x1.C10023k;
import p470x1.C10024l;

/* JADX INFO: renamed from: l1.h */
/* JADX INFO: loaded from: classes.dex */
public final class C7214h {

    /* JADX INFO: renamed from: a */
    public final TextForegroundStyle f40570a;

    /* JADX INFO: renamed from: b */
    public final long f40571b;

    /* JADX INFO: renamed from: c */
    public final C8476m f40572c;

    /* JADX INFO: renamed from: d */
    public final C8471h f40573d;

    /* JADX INFO: renamed from: e */
    public final C8472i f40574e;

    /* JADX INFO: renamed from: f */
    public final AbstractC0696b f40575f;

    /* JADX INFO: renamed from: g */
    public final String f40576g;

    /* JADX INFO: renamed from: h */
    public final long f40577h;

    /* JADX INFO: renamed from: i */
    public final C9791a f40578i;

    /* JADX INFO: renamed from: j */
    public final C9800j f40579j;

    /* JADX INFO: renamed from: k */
    public final C8948d f40580k;

    /* JADX INFO: renamed from: l */
    public final long f40581l;

    /* JADX INFO: renamed from: m */
    public final C9798h f40582m;

    /* JADX INFO: renamed from: n */
    public final C9152j0 f40583n;

    /* JADX INFO: renamed from: o */
    public final AbstractC0140a f40584o;

    /* JADX WARN: Illegal instructions before constructor call */
    public C7214h(long j10, long j11, C8476m c8476m, C8471h c8471h, C8472i c8472i, AbstractC0696b abstractC0696b, String str, long j12, C9791a c9791a, C9800j c9800j, C8948d c8948d, long j13, C9798h c9798h, C9152j0 c9152j0, int i10) {
        long j14 = (i10 & 1) != 0 ? C9169u.f47703f : j10;
        this((j14 > C9169u.f47703f ? 1 : (j14 == C9169u.f47703f ? 0 : -1)) != 0 ? new C9793c(j14) : TextForegroundStyle.C0710a.f4688a, (i10 & 2) != 0 ? C10023k.f50982c : j11, (i10 & 4) != 0 ? null : c8476m, (i10 & 8) != 0 ? null : c8471h, (i10 & 16) != 0 ? null : c8472i, (i10 & 32) != 0 ? null : abstractC0696b, (i10 & 64) != 0 ? null : str, (i10 & BuildConfig.SDK_TRUNCATE_LENGTH) != 0 ? C10023k.f50982c : j12, (i10 & 256) != 0 ? null : c9791a, (i10 & 512) != 0 ? null : c9800j, (i10 & 1024) != 0 ? null : c8948d, (i10 & 2048) != 0 ? C9169u.f47703f : j13, (i10 & 4096) != 0 ? null : c9798h, (i10 & 8192) != 0 ? null : c9152j0);
    }

    public C7214h(TextForegroundStyle textForegroundStyle, long j10, C8476m c8476m, C8471h c8471h, C8472i c8472i, AbstractC0696b abstractC0696b, String str, long j11, C9791a c9791a, C9800j c9800j, C8948d c8948d, long j12, C9798h c9798h, C9152j0 c9152j0) {
        this(textForegroundStyle, j10, c8476m, c8471h, c8472i, abstractC0696b, str, j11, c9791a, c9800j, c8948d, j12, c9798h, c9152j0, (AbstractC0140a) null);
    }

    public C7214h(TextForegroundStyle textForegroundStyle, long j10, C8476m c8476m, C8471h c8471h, C8472i c8472i, AbstractC0696b abstractC0696b, String str, long j11, C9791a c9791a, C9800j c9800j, C8948d c8948d, long j12, C9798h c9798h, C9152j0 c9152j0, AbstractC0140a abstractC0140a) {
        this.f40570a = textForegroundStyle;
        this.f40571b = j10;
        this.f40572c = c8476m;
        this.f40573d = c8471h;
        this.f40574e = c8472i;
        this.f40575f = abstractC0696b;
        this.f40576g = str;
        this.f40577h = j11;
        this.f40578i = c9791a;
        this.f40579j = c9800j;
        this.f40580k = c8948d;
        this.f40581l = j12;
        this.f40582m = c9798h;
        this.f40583n = c9152j0;
        this.f40584o = abstractC0140a;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC9161o m14528a() {
        return this.f40570a.mo2618d();
    }

    /* JADX INFO: renamed from: b */
    public final long m14529b() {
        return this.f40570a.mo2615a();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m14530c(C7214h c7214h) {
        C5207g.m11111f(c7214h, "other");
        if (this == c7214h) {
            return true;
        }
        return C10023k.m18630a(this.f40571b, c7214h.f40571b) && C5207g.m11106a(this.f40572c, c7214h.f40572c) && C5207g.m11106a(this.f40573d, c7214h.f40573d) && C5207g.m11106a(this.f40574e, c7214h.f40574e) && C5207g.m11106a(this.f40575f, c7214h.f40575f) && C5207g.m11106a(this.f40576g, c7214h.f40576g) && C10023k.m18630a(this.f40577h, c7214h.f40577h) && C5207g.m11106a(this.f40578i, c7214h.f40578i) && C5207g.m11106a(this.f40579j, c7214h.f40579j) && C5207g.m11106a(this.f40580k, c7214h.f40580k) && C9169u.m17497c(this.f40581l, c7214h.f40581l) && C5207g.m11106a(null, null);
    }

    /* JADX INFO: renamed from: d */
    public final C7214h m14531d(C7214h c7214h) {
        if (c7214h == null) {
            return this;
        }
        TextForegroundStyle textForegroundStyleM2617c = this.f40570a.m2617c(c7214h.f40570a);
        AbstractC0696b abstractC0696b = c7214h.f40575f;
        if (abstractC0696b == null) {
            abstractC0696b = this.f40575f;
        }
        AbstractC0696b abstractC0696b2 = abstractC0696b;
        long j10 = c7214h.f40571b;
        if (C8573r0.m16670E0(j10)) {
            j10 = this.f40571b;
        }
        long j11 = j10;
        C8476m c8476m = c7214h.f40572c;
        if (c8476m == null) {
            c8476m = this.f40572c;
        }
        C8476m c8476m2 = c8476m;
        C8471h c8471h = c7214h.f40573d;
        if (c8471h == null) {
            c8471h = this.f40573d;
        }
        C8471h c8471h2 = c8471h;
        C8472i c8472i = c7214h.f40574e;
        if (c8472i == null) {
            c8472i = this.f40574e;
        }
        C8472i c8472i2 = c8472i;
        String str = c7214h.f40576g;
        if (str == null) {
            str = this.f40576g;
        }
        String str2 = str;
        long j12 = c7214h.f40577h;
        if (C8573r0.m16670E0(j12)) {
            j12 = this.f40577h;
        }
        long j13 = j12;
        C9791a c9791a = c7214h.f40578i;
        if (c9791a == null) {
            c9791a = this.f40578i;
        }
        C9791a c9791a2 = c9791a;
        C9800j c9800j = c7214h.f40579j;
        if (c9800j == null) {
            c9800j = this.f40579j;
        }
        C9800j c9800j2 = c9800j;
        C8948d c8948d = c7214h.f40580k;
        if (c8948d == null) {
            c8948d = this.f40580k;
        }
        C8948d c8948d2 = c8948d;
        long j14 = C9169u.f47703f;
        long j15 = c7214h.f40581l;
        long j16 = (j15 > j14 ? 1 : (j15 == j14 ? 0 : -1)) != 0 ? j15 : this.f40581l;
        C9798h c9798h = c7214h.f40582m;
        if (c9798h == null) {
            c9798h = this.f40582m;
        }
        C9798h c9798h2 = c9798h;
        C9152j0 c9152j0 = c7214h.f40583n;
        if (c9152j0 == null) {
            c9152j0 = this.f40583n;
        }
        C9152j0 c9152j1 = c9152j0;
        AbstractC0140a abstractC0140a = c7214h.f40584o;
        if (abstractC0140a == null) {
            abstractC0140a = this.f40584o;
        }
        return new C7214h(textForegroundStyleM2617c, j11, c8476m2, c8471h2, c8472i2, abstractC0696b2, str2, j13, c9791a2, c9800j2, c8948d2, j16, c9798h2, c9152j1, abstractC0140a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7214h)) {
            return false;
        }
        C7214h c7214h = (C7214h) obj;
        if (m14530c(c7214h)) {
            if (C5207g.m11106a(this.f40570a, c7214h.f40570a) && C5207g.m11106a(this.f40582m, c7214h.f40582m) && C5207g.m11106a(this.f40583n, c7214h.f40583n) && C5207g.m11106a(this.f40584o, c7214h.f40584o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jM14529b = m14529b();
        int i10 = C9169u.f47704g;
        int iHashCode = Long.hashCode(jM14529b) * 31;
        AbstractC9161o abstractC9161oM14528a = m14528a();
        int iHashCode2 = 0;
        int iHashCode3 = (Float.hashCode(this.f40570a.mo2614A()) + ((iHashCode + (abstractC9161oM14528a != null ? abstractC9161oM14528a.hashCode() : 0)) * 31)) * 31;
        C10024l[] c10024lArr = C10023k.f50981b;
        int iM847f = C0204c.m847f(this.f40571b, iHashCode3, 31);
        C8476m c8476m = this.f40572c;
        int i11 = (iM847f + (c8476m != null ? c8476m.f45655a : 0)) * 31;
        C8471h c8471h = this.f40573d;
        int iHashCode4 = (i11 + (c8471h != null ? Integer.hashCode(c8471h.f45643a) : 0)) * 31;
        C8472i c8472i = this.f40574e;
        int iHashCode5 = (iHashCode4 + (c8472i != null ? Integer.hashCode(c8472i.f45644a) : 0)) * 31;
        AbstractC0696b abstractC0696b = this.f40575f;
        int iHashCode6 = (iHashCode5 + (abstractC0696b != null ? abstractC0696b.hashCode() : 0)) * 31;
        String str = this.f40576g;
        int iM847f2 = C0204c.m847f(this.f40577h, (iHashCode6 + (str != null ? str.hashCode() : 0)) * 31, 31);
        C9791a c9791a = this.f40578i;
        int iHashCode7 = (iM847f2 + (c9791a != null ? Float.hashCode(c9791a.f49900a) : 0)) * 31;
        C9800j c9800j = this.f40579j;
        int iHashCode8 = (iHashCode7 + (c9800j != null ? c9800j.hashCode() : 0)) * 31;
        C8948d c8948d = this.f40580k;
        int iM847f3 = C0204c.m847f(this.f40581l, (iHashCode8 + (c8948d != null ? c8948d.hashCode() : 0)) * 31, 31);
        C9798h c9798h = this.f40582m;
        int i12 = (iM847f3 + (c9798h != null ? c9798h.f49914a : 0)) * 31;
        C9152j0 c9152j0 = this.f40583n;
        int iHashCode9 = (((i12 + (c9152j0 != null ? c9152j0.hashCode() : 0)) * 31) + 0) * 31;
        AbstractC0140a abstractC0140a = this.f40584o;
        if (abstractC0140a != null) {
            iHashCode2 = abstractC0140a.hashCode();
        }
        return iHashCode9 + iHashCode2;
    }

    public final String toString() {
        return "SpanStyle(color=" + ((Object) C9169u.m17503i(m14529b())) + ", brush=" + m14528a() + ", alpha=" + this.f40570a.mo2614A() + ", fontSize=" + ((Object) C10023k.m18633d(this.f40571b)) + ", fontWeight=" + this.f40572c + ", fontStyle=" + this.f40573d + ", fontSynthesis=" + this.f40574e + ", fontFamily=" + this.f40575f + ", fontFeatureSettings=" + this.f40576g + ", letterSpacing=" + ((Object) C10023k.m18633d(this.f40577h)) + ", baselineShift=" + this.f40578i + ", textGeometricTransform=" + this.f40579j + ", localeList=" + this.f40580k + ", background=" + ((Object) C9169u.m17503i(this.f40581l)) + ", textDecoration=" + this.f40582m + ", shadow=" + this.f40583n + ", platformStyle=null, drawStyle=" + this.f40584o + ')';
    }
}
