package p000;

/* JADX INFO: loaded from: classes.dex */
public final class qk0 extends wj7 {

    /* JADX INFO: renamed from: c */
    public static final qk0 f57864c = new qk0(rk0.f59420a);

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // p000.i81, p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        ok0 ok0Var = (ok0) obj;
        ok0Var.getClass();
        ok0Var.m18054e(df1Var.mo4088m(this.f66933b, i));
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return new ok0(bArr);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: j */
    public final Object mo12406j() {
        return new byte[0];
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: k */
    public final void mo12407k(mk9 mk9Var, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        mk9Var.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            vj7 vj7Var = this.f66933b;
            vj7Var.getClass();
            mk9Var.m16875s(vj7Var, i2);
            mk9Var.mo15610f(b);
        }
    }
}
