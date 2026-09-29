package p000;

import com.lingq.core.tooltips.components.AbstractC1914a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e6a implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36785a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e28 f36786b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36787c;

    public /* synthetic */ e6a(e28 e28Var, int i, int i2) {
        this.f36785a = i2;
        this.f36786b = e28Var;
        this.f36787c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36785a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f36787c;
        e28 e28Var = this.f36786b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                AbstractC1914a.m8786e(e28Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            case 1:
                AbstractC1914a.m8785d(e28Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC1914a.m8782a(e28Var, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
