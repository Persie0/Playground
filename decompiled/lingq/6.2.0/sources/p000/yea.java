package p000;

/* JADX INFO: loaded from: classes.dex */
public final class yea extends wj7 {

    /* JADX INFO: renamed from: c */
    public static final yea f69753c = new yea(zea.f71476a);

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        return ((wea) obj).f66738a.length;
    }

    @Override // p000.i81, p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        xea xeaVar = (xea) obj;
        xeaVar.getClass();
        xeaVar.m24479e(df1Var.mo4080d(this.f66933b, i).mo4075I());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        return new xea(((wea) obj).f66738a);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: j */
    public final Object mo12406j() {
        return new wea(new short[0]);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: k */
    public final void mo12407k(mk9 mk9Var, Object obj, int i) {
        short[] sArr = ((wea) obj).f66738a;
        mk9Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            mk9Var.m16877u(this.f66933b, i2).mo15609e(sArr[i2]);
        }
    }
}
