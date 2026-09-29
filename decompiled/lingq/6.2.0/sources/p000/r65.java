package p000;

import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.onboarding.p014v2.pages.p023long.AbstractC2231b;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r65 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f58798b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f58799c;

    public /* synthetic */ r65(String str, int i, int i2, String str2) {
        this.f58797a = i2;
        this.f58798b = str;
        this.f58799c = str2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f58797a;
        xfa xfaVar = xfa.f68157a;
        String str = this.f58799c;
        String str2 = this.f58798b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                ljd.m16312e(str2, str, ye1Var, pk9.m19383z(49));
                break;
            case 1:
                xd5.m24462a(str2, str, ye1Var, pk9.m19383z(1));
                break;
            case 2:
                AbstractC2231b.m9191d(str2, str, ye1Var, pk9.m19383z(7));
                break;
            case 3:
                uwc.m22971c(str2, str, ye1Var, pk9.m19383z(1));
                break;
            case 4:
                AbstractC1839a.m8517C(str2, str, ye1Var, pk9.m19383z(55));
                break;
            default:
                AbstractC1839a.m8538p(str2, str, ye1Var, pk9.m19383z(55));
                break;
        }
        return xfaVar;
    }
}
