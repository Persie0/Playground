package p000;

import androidx.media3.common.ParserException;

/* JADX INFO: loaded from: classes2.dex */
public final class uh0 {

    /* JADX INFO: renamed from: a */
    public final int f63915a;

    /* JADX INFO: renamed from: b */
    public int f63916b;

    /* JADX INFO: renamed from: c */
    public int f63917c;

    /* JADX INFO: renamed from: d */
    public long f63918d;

    /* JADX INFO: renamed from: e */
    public final boolean f63919e;

    /* JADX INFO: renamed from: f */
    public final k47 f63920f;

    /* JADX INFO: renamed from: g */
    public final k47 f63921g;

    /* JADX INFO: renamed from: h */
    public int f63922h;

    /* JADX INFO: renamed from: i */
    public int f63923i;

    public uh0(k47 k47Var, k47 k47Var2, boolean z) throws ParserException {
        this.f63921g = k47Var;
        this.f63920f = k47Var2;
        this.f63919e = z;
        k47Var2.m14818M(12);
        this.f63915a = k47Var2.m14809D();
        k47Var.m14818M(12);
        this.f63923i = k47Var.m14809D();
        ucd.m22677a("first_chunk must be 1", k47Var.m14829m() == 1);
        this.f63916b = -1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22736a() {
        int i = this.f63916b + 1;
        this.f63916b = i;
        if (i == this.f63915a) {
            return false;
        }
        boolean z = this.f63919e;
        k47 k47Var = this.f63920f;
        this.f63918d = z ? k47Var.m14811F() : k47Var.m14807B();
        if (this.f63916b == this.f63922h) {
            k47 k47Var2 = this.f63921g;
            this.f63917c = k47Var2.m14809D();
            k47Var2.m14819N(4);
            int i2 = this.f63923i - 1;
            this.f63923i = i2;
            this.f63922h = i2 > 0 ? k47Var2.m14809D() - 1 : -1;
        }
        return true;
    }
}
