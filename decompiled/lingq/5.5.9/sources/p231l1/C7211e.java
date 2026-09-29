package p231l1;

import androidx.activity.result.C0204c;
import dm.C5207g;
import p338qd.C8573r0;
import p445w1.C9794d;
import p445w1.C9795e;
import p445w1.C9796f;
import p445w1.C9797g;
import p445w1.C9799i;
import p445w1.C9801k;
import p445w1.C9802l;
import p470x1.C10023k;
import p470x1.C10024l;

/* JADX INFO: renamed from: l1.e */
/* JADX INFO: loaded from: classes.dex */
public final class C7211e {

    /* JADX INFO: renamed from: a */
    public final C9797g f40558a;

    /* JADX INFO: renamed from: b */
    public final C9799i f40559b;

    /* JADX INFO: renamed from: c */
    public final long f40560c;

    /* JADX INFO: renamed from: d */
    public final C9801k f40561d;

    /* JADX INFO: renamed from: e */
    public final C9795e f40562e;

    /* JADX INFO: renamed from: f */
    public final C9794d f40563f;

    /* JADX INFO: renamed from: g */
    public final C9802l f40564g;

    /* JADX INFO: renamed from: h */
    public final int f40565h;

    /* JADX INFO: renamed from: i */
    public final int f40566i;

    /* JADX INFO: renamed from: j */
    public final int f40567j;

    public C7211e(C9797g c9797g, C9799i c9799i, long j10, C9801k c9801k, C9796f c9796f, C9795e c9795e, C9794d c9794d) {
        this(c9797g, c9799i, j10, c9801k, c9796f, c9795e, c9794d, null);
    }

    public C7211e(C9797g c9797g, C9799i c9799i, long j10, C9801k c9801k, C9796f c9796f, C9795e c9795e, C9794d c9794d, C9802l c9802l) {
        this.f40558a = c9797g;
        this.f40559b = c9799i;
        this.f40560c = j10;
        this.f40561d = c9801k;
        this.f40562e = c9795e;
        this.f40563f = c9794d;
        this.f40564g = c9802l;
        this.f40565h = c9797g != null ? c9797g.f49910a : 5;
        this.f40566i = c9795e != null ? c9795e.f49906a : C9795e.f49905b;
        boolean z10 = true;
        this.f40567j = c9794d != null ? c9794d.f49904a : 1;
        if (C10023k.m18630a(j10, C10023k.f50982c)) {
            return;
        }
        if (C10023k.m18632c(j10) < 0.0f) {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + C10023k.m18632c(j10) + ')').toString());
    }

    /* JADX INFO: renamed from: a */
    public final C7211e m14527a(C7211e c7211e) {
        if (c7211e == null) {
            return this;
        }
        long j10 = c7211e.f40560c;
        if (C8573r0.m16670E0(j10)) {
            j10 = this.f40560c;
        }
        long j11 = j10;
        C9801k c9801k = c7211e.f40561d;
        if (c9801k == null) {
            c9801k = this.f40561d;
        }
        C9801k c9801k2 = c9801k;
        C9797g c9797g = c7211e.f40558a;
        if (c9797g == null) {
            c9797g = this.f40558a;
        }
        C9797g c9797g2 = c9797g;
        C9799i c9799i = c7211e.f40559b;
        if (c9799i == null) {
            c9799i = this.f40559b;
        }
        C9799i c9799i2 = c9799i;
        c7211e.getClass();
        C9795e c9795e = c7211e.f40562e;
        if (c9795e == null) {
            c9795e = this.f40562e;
        }
        C9795e c9795e2 = c9795e;
        C9794d c9794d = c7211e.f40563f;
        if (c9794d == null) {
            c9794d = this.f40563f;
        }
        C9794d c9794d2 = c9794d;
        C9802l c9802l = c7211e.f40564g;
        if (c9802l == null) {
            c9802l = this.f40564g;
        }
        return new C7211e(c9797g2, c9799i2, j11, c9801k2, null, c9795e2, c9794d2, c9802l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7211e)) {
            return false;
        }
        C7211e c7211e = (C7211e) obj;
        if (!C5207g.m11106a(this.f40558a, c7211e.f40558a) || !C5207g.m11106a(this.f40559b, c7211e.f40559b) || !C10023k.m18630a(this.f40560c, c7211e.f40560c) || !C5207g.m11106a(this.f40561d, c7211e.f40561d)) {
            return false;
        }
        c7211e.getClass();
        if (!C5207g.m11106a(null, null)) {
            return false;
        }
        c7211e.getClass();
        return C5207g.m11106a(null, null) && C5207g.m11106a(this.f40562e, c7211e.f40562e) && C5207g.m11106a(this.f40563f, c7211e.f40563f) && C5207g.m11106a(this.f40564g, c7211e.f40564g);
    }

    public final int hashCode() {
        int iHashCode = 0;
        C9797g c9797g = this.f40558a;
        int iHashCode2 = (c9797g != null ? Integer.hashCode(c9797g.f49910a) : 0) * 31;
        C9799i c9799i = this.f40559b;
        int iHashCode3 = (iHashCode2 + (c9799i != null ? Integer.hashCode(c9799i.f49915a) : 0)) * 31;
        C10024l[] c10024lArr = C10023k.f50981b;
        int iM847f = C0204c.m847f(this.f40560c, iHashCode3, 31);
        C9801k c9801k = this.f40561d;
        int iHashCode4 = (((((iM847f + (c9801k != null ? c9801k.hashCode() : 0)) * 31) + 0) * 31) + 0) * 31;
        C9795e c9795e = this.f40562e;
        int iHashCode5 = (iHashCode4 + (c9795e != null ? Integer.hashCode(c9795e.f49906a) : 0)) * 31;
        C9794d c9794d = this.f40563f;
        int iHashCode6 = (iHashCode5 + (c9794d != null ? Integer.hashCode(c9794d.f49904a) : 0)) * 31;
        C9802l c9802l = this.f40564g;
        if (c9802l != null) {
            iHashCode = c9802l.hashCode();
        }
        return iHashCode6 + iHashCode;
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + this.f40558a + ", textDirection=" + this.f40559b + ", lineHeight=" + ((Object) C10023k.m18633d(this.f40560c)) + ", textIndent=" + this.f40561d + ", platformStyle=null, lineHeightStyle=" + ((Object) null) + ", lineBreak=" + this.f40562e + ", hyphens=" + this.f40563f + ", textMotion=" + this.f40564g + ')';
    }
}
