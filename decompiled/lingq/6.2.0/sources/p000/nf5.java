package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nf5 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f52676a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ zi3 f52677b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ zi3 f52678c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0282a f52679d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zi3 f52680e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ zi3 f52681f;

    public /* synthetic */ nf5(zi3 zi3Var, zi3 zi3Var2, C0282a c0282a, zi3 zi3Var3, zi3 zi3Var4, int i) {
        this.f52677b = zi3Var;
        this.f52678c = zi3Var2;
        this.f52679d = c0282a;
        this.f52680e = zi3Var3;
        this.f52681f = zi3Var4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f52676a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    of5.m17960b(this.f52677b, this.f52678c, this.f52679d, this.f52680e, this.f52681f, tj3Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                of5.m17960b(this.f52677b, this.f52678c, this.f52679d, this.f52680e, this.f52681f, (ye1) obj, pk9.m19383z(385));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ nf5(C0282a c0282a, C0282a c0282a2, C0282a c0282a3, C0282a c0282a4, C0282a c0282a5) {
        this.f52677b = c0282a;
        this.f52678c = c0282a2;
        this.f52679d = c0282a3;
        this.f52680e = c0282a4;
        this.f52681f = c0282a5;
    }
}
