package p000;

import androidx.media3.common.C0713b;

/* JADX INFO: loaded from: classes2.dex */
public final class b92 implements Comparable {

    /* JADX INFO: renamed from: a */
    public final boolean f8170a;

    /* JADX INFO: renamed from: b */
    public final boolean f8171b;

    public b92(C0713b c0713b, int i) {
        this.f8170a = (c0713b.f6396e & 1) != 0;
        this.f8171b = y90.m24989n(i, false);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(b92 b92Var) {
        return tb1.f62090a.mo20566c(this.f8171b, b92Var.f8171b).mo20566c(this.f8170a, b92Var.f8170a).mo20568e();
    }
}
