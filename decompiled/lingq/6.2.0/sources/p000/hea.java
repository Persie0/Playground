package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hea extends wj7 {

    /* JADX INFO: renamed from: c */
    public static final hea f42280c = new hea(iea.f44031a);

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        return ((fea) obj).f38966a.length;
    }

    @Override // p000.i81, p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        gea geaVar = (gea) obj;
        geaVar.getClass();
        geaVar.m12516e(df1Var.mo4080d(this.f66933b, i).mo4074H());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        return new gea(((fea) obj).f38966a);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: j */
    public final Object mo12406j() {
        return new fea(new byte[0]);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: k */
    public final void mo12407k(mk9 mk9Var, Object obj, int i) {
        byte[] bArr = ((fea) obj).f38966a;
        mk9Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            mk9Var.m16877u(this.f66933b, i2).mo15610f(bArr[i2]);
        }
    }
}
