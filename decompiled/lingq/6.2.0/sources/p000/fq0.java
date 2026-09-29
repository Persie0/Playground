package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class fq0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f39447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ List f39448b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f39449c;

    public /* synthetic */ fq0(e16 e16Var, List list, int i) {
        this.f39447a = 0;
        this.f39449c = e16Var;
        this.f39448b = list;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f39447a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f39449c;
        List list = this.f39448b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q5d.m19667a(pk9.m19383z(1), ye1Var, e16Var, list);
                break;
            case 1:
                us1.m22890c(pk9.m19383z(1), ye1Var, e16Var, list);
                break;
            default:
                u9d.m22637a(pk9.m19383z(1), ye1Var, e16Var, list);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ fq0(List list, e16 e16Var, int i, int i2) {
        this.f39447a = i2;
        this.f39448b = list;
        this.f39449c = e16Var;
    }
}
