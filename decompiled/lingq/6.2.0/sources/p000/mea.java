package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mea extends wj7 {

    /* JADX INFO: renamed from: c */
    public static final mea f51222c = new mea(nea.f52657a);

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: d */
    public final int mo12404d(Object obj) {
        return ((kea) obj).f47113a.length;
    }

    @Override // p000.i81, p000.AbstractC3815z
    /* JADX INFO: renamed from: f */
    public final void mo12405f(df1 df1Var, int i, Object obj) {
        lea leaVar = (lea) obj;
        leaVar.getClass();
        leaVar.m16151e(df1Var.mo4080d(this.f66933b, i).mo4089n());
    }

    @Override // p000.AbstractC3815z
    /* JADX INFO: renamed from: g */
    public final Object mo11358g(Object obj) {
        return new lea(((kea) obj).f47113a);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: j */
    public final Object mo12406j() {
        return new kea(new int[0]);
    }

    @Override // p000.wj7
    /* JADX INFO: renamed from: k */
    public final void mo12407k(mk9 mk9Var, Object obj, int i) {
        int[] iArr = ((kea) obj).f47113a;
        mk9Var.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            mk9Var.m16877u(this.f66933b, i2).mo15615k(iArr[i2]);
        }
    }
}
