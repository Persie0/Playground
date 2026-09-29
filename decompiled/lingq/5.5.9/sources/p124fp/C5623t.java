package p124fp;

import dm.C5207g;
import tl.C9322j;

/* JADX INFO: renamed from: fp.t */
/* JADX INFO: loaded from: classes2.dex */
public final class C5623t {

    /* JADX INFO: renamed from: a */
    public final byte[] f34463a;

    /* JADX INFO: renamed from: b */
    public int f34464b;

    /* JADX INFO: renamed from: c */
    public int f34465c;

    /* JADX INFO: renamed from: d */
    public boolean f34466d;

    /* JADX INFO: renamed from: e */
    public final boolean f34467e;

    /* JADX INFO: renamed from: f */
    public C5623t f34468f;

    /* JADX INFO: renamed from: g */
    public C5623t f34469g;

    public C5623t() {
        this.f34463a = new byte[8192];
        this.f34467e = true;
        this.f34466d = false;
    }

    public C5623t(byte[] bArr, int i10, int i11, boolean z10) {
        C5207g.m11111f(bArr, "data");
        this.f34463a = bArr;
        this.f34464b = i10;
        this.f34465c = i11;
        this.f34466d = z10;
        this.f34467e = false;
    }

    /* JADX INFO: renamed from: a */
    public final C5623t m12002a() {
        C5623t c5623t = this.f34468f;
        if (c5623t == this) {
            c5623t = null;
        }
        C5623t c5623t2 = this.f34469g;
        C5207g.m11108c(c5623t2);
        c5623t2.f34468f = this.f34468f;
        C5623t c5623t3 = this.f34468f;
        C5207g.m11108c(c5623t3);
        c5623t3.f34469g = this.f34469g;
        this.f34468f = null;
        this.f34469g = null;
        return c5623t;
    }

    /* JADX INFO: renamed from: b */
    public final void m12003b(C5623t c5623t) {
        c5623t.f34469g = this;
        c5623t.f34468f = this.f34468f;
        C5623t c5623t2 = this.f34468f;
        C5207g.m11108c(c5623t2);
        c5623t2.f34469g = c5623t;
        this.f34468f = c5623t;
    }

    /* JADX INFO: renamed from: c */
    public final C5623t m12004c() {
        this.f34466d = true;
        return new C5623t(this.f34463a, this.f34464b, this.f34465c, true);
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: d */
    public final void m12005d(C5623t c5623t, int i10) {
        if (!c5623t.f34467e) {
            throw new IllegalStateException("only owner can write".toString());
        }
        int i11 = c5623t.f34465c;
        int i12 = i11 + i10;
        byte[] bArr = c5623t.f34463a;
        if (i12 > 8192) {
            if (c5623t.f34466d) {
                throw new IllegalArgumentException();
            }
            int i13 = c5623t.f34464b;
            if (i12 - i13 > 8192) {
                throw new IllegalArgumentException();
            }
            C9322j.m17671Y(0, i13, i11, bArr, bArr);
            c5623t.f34465c -= c5623t.f34464b;
            c5623t.f34464b = 0;
        }
        int i14 = c5623t.f34465c;
        int i15 = this.f34464b;
        C9322j.m17671Y(i14, i15, i15 + i10, this.f34463a, bArr);
        c5623t.f34465c += i10;
        this.f34464b += i10;
    }
}
