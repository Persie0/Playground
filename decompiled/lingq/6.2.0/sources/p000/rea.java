package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rea extends wj7 {

    /* JADX INFO: renamed from: c */
    public static final rea f59166c = new rea(sea.f60769a);

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        return ((pea) obj).f56017a.length;
    }

    @Override // p000.i81, p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        qea qeaVar = (qea) obj;
        qeaVar.getClass();
        qeaVar.m19902e(df1Var.mo4080d(this.f66933b, i).mo4093u());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        return new qea(((pea) obj).f56017a);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: j */
    public final Object mo12406j() {
        return new pea(new long[0]);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: k */
    public final void mo12407k(mk9 mk9Var, Object obj, int i) {
        long[] jArr = ((pea) obj).f56017a;
        mk9Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            mk9Var.m16877u(this.f66933b, i2).mo15619o(jArr[i2]);
        }
    }
}
