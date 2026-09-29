package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public final class gy5 implements xy2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41522a;

    /* JADX INFO: renamed from: b */
    public final so7 f41523b;

    /* JADX INFO: renamed from: c */
    public final so7 f41524c;

    public /* synthetic */ gy5(so7 so7Var, so7 so7Var2, int i) {
        this.f41522a = i;
        this.f41523b = so7Var;
        this.f41524c = so7Var2;
    }

    @Override // p000.so7
    public final Object get() {
        int i = this.f41522a;
        so7 so7Var = this.f41523b;
        switch (i) {
            case 0:
                return new fy5((Context) ((nr1) so7Var).f53162b, (C3309ls) ((nr1) this.f41524c).get());
            default:
                return new hk8(new nj0(18), new jj5(17), m40.f50553f, (an8) so7Var.get(), this.f41524c);
        }
    }
}
