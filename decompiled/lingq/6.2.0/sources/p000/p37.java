package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class p37 extends AbstractC3695vr {

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ int f55526p;

    /* JADX INFO: renamed from: q */
    public final String f55527q;

    /* JADX INFO: renamed from: r */
    public final nj0 f55528r;

    /* JADX INFO: renamed from: s */
    public final boolean f55529s;

    public p37(String str, int i, boolean z) {
        this.f55526p = i;
        switch (i) {
            case 1:
                nj0 nj0Var = nj0.f52807b;
                Objects.requireNonNull(str, "name == null");
                this.f55527q = str;
                this.f55528r = nj0Var;
                this.f55529s = z;
                break;
            default:
                nj0 nj0Var2 = nj0.f52807b;
                Objects.requireNonNull(str, "name == null");
                this.f55527q = str;
                this.f55528r = nj0Var2;
                this.f55529s = z;
                break;
        }
    }

    @Override // p000.AbstractC3695vr
    /* JADX INFO: renamed from: f */
    public final void mo16613f(b78 b78Var, Object obj) {
        int i = this.f55526p;
        boolean z = this.f55529s;
        String str = this.f55527q;
        nj0 nj0Var = this.f55528r;
        switch (i) {
            case 0:
                if (obj != null) {
                    nj0Var.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        b78Var.m3399a(str, string, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    nj0Var.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        b78Var.m3401c(str, string2, z);
                        break;
                    }
                }
                break;
        }
    }
}
