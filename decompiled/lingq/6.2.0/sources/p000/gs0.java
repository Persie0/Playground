package p000;

import com.lingq.feature.onboarding.p014v2.pages.AbstractC2228a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class gs0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f41254a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f41255b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ e16 f41256c;

    public /* synthetic */ gs0(e16 e16Var, String str, int i, int i2) {
        this.f41254a = i2;
        this.f41256c = e16Var;
        this.f41255b = str;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f41254a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f41256c;
        String str = this.f41255b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                b6d.m3389i(pk9.m19383z(1), ye1Var, e16Var, str);
                break;
            case 1:
                us1.m22888a(pk9.m19383z(1), ye1Var, e16Var, str);
                break;
            case 2:
                x9d.m24418a(pk9.m19383z(1), ye1Var, e16Var, str);
                break;
            case 3:
                ls3.m16526d(pk9.m19383z(1), ye1Var, e16Var, str);
                break;
            default:
                AbstractC2228a.m9187g(pk9.m19383z(1), ye1Var, e16Var, str);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gs0(String str, e16 e16Var, int i, int i2) {
        this.f41254a = i2;
        this.f41255b = str;
        this.f41256c = e16Var;
    }
}
