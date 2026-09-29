package p000;

import com.lingq.core.token.AbstractC1899b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i4a implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43522a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f5a f43523b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f43524c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f43525d;

    public /* synthetic */ i4a(f5a f5aVar, vi3 vi3Var, int i, int i2) {
        this.f43522a = i2;
        this.f43523b = f5aVar;
        this.f43524c = vi3Var;
        this.f43525d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f43522a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f43525d;
        vi3 vi3Var = this.f43524c;
        f5a f5aVar = this.f43523b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC1899b.m8698g(f5aVar, vi3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                AbstractC1899b.m8692a(f5aVar, vi3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC1899b.m8697f(f5aVar, vi3Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
