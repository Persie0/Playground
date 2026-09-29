package p000;

import com.lingq.core.tooltips.components.AbstractC1914a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h6a implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41848a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e28 f41849b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f41850c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f41851d;

    public /* synthetic */ h6a(e28 e28Var, boolean z, int i, int i2) {
        this.f41848a = i2;
        this.f41849b = e28Var;
        this.f41850c = z;
        this.f41851d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41848a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f41851d;
        boolean z = this.f41850c;
        e28 e28Var = this.f41849b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC1914a.m8784c(e28Var, z, ye1Var, pk9.m19383z(i2 | 1));
                break;
            default:
                AbstractC1914a.m8783b(e28Var, z, ye1Var, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }
}
