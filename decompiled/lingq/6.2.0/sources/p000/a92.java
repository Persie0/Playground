package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class a92 extends g92 implements Comparable {

    /* JADX INFO: renamed from: e */
    public final int f376e;

    /* JADX INFO: renamed from: f */
    public final int f377f;

    public a92(int i, j8a j8aVar, int i2, d92 d92Var, int i3) {
        int i4;
        super(i, j8aVar, i2);
        this.f376e = y90.m24989n(i3, d92Var.f35199B) ? 1 : 0;
        C0713b c0713b = this.f40418d;
        int i5 = c0713b.f6413v;
        int i6 = -1;
        if (i5 != -1 && (i4 = c0713b.f6414w) != -1) {
            i6 = i5 * i4;
        }
        this.f377f = i6;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: a */
    public final int mo186a() {
        return this.f376e;
    }

    @Override // p000.g92
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ boolean mo187b(g92 g92Var) {
        return false;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f377f, ((a92) obj).f377f);
    }
}
