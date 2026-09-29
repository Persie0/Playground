package p000;

import com.lingq.core.settings.theme.AbstractC1881a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fz9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39970a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ nz9 f39971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f39972c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f39973d;

    public /* synthetic */ fz9(nz9 nz9Var, vi3 vi3Var, boolean z, int i, int i2) {
        this.f39970a = i2;
        this.f39971b = nz9Var;
        this.f39972c = vi3Var;
        this.f39973d = z;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39970a;
        xfa xfaVar = xfa.f68157a;
        boolean z = this.f39973d;
        vi3 vi3Var = this.f39972c;
        nz9 nz9Var = this.f39971b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1881a.m8680s(nz9Var, vi3Var, z, ye1Var, pk9.m19383z(1));
                break;
            default:
                AbstractC1881a.m8673l(nz9Var, vi3Var, z, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
