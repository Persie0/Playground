package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yr0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f70308a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f70309b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f70310c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f70311d;

    public /* synthetic */ yr0(e16 e16Var, List list, int i, int i2, int i3) {
        this.f70308a = i3;
        this.f70309b = e16Var;
        this.f70310c = list;
        this.f70311d = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f70308a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f70311d;
        List list = this.f70310c;
        e16 e16Var = this.f70309b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b6d.m3386f(e16Var, list, i2, ye1Var, pk9.m19383z(1));
                break;
            case 1:
                b6d.m3387g(e16Var, list, i2, ye1Var, pk9.m19383z(1));
                break;
            default:
                b6d.m3385e(e16Var, list, i2, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
