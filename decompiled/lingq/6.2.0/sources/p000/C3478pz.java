package p000;

import com.lingq.core.settings.AbstractC1858a;
import com.lingq.feature.edit.components.AbstractC2078a;

/* JADX INFO: renamed from: pz */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3478pz implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f57007b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f57008c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ui3 f57009d;

    public /* synthetic */ C3478pz(String str, ui3 ui3Var, ui3 ui3Var2, int i, int i2) {
        this.f57006a = i2;
        this.f57007b = str;
        this.f57008c = ui3Var;
        this.f57009d = ui3Var2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57006a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f57009d;
        ui3 ui3Var2 = this.f57008c;
        String str = this.f57007b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                AbstractC2078a.m8990a(str, ui3Var2, ui3Var, ye1Var, pk9.m19383z(7));
                break;
            case 1:
                ljd.m16310c(str, ui3Var2, ui3Var, ye1Var, pk9.m19383z(1));
                break;
            case 2:
                yjd.m25163b(str, ui3Var2, ui3Var, ye1Var, pk9.m19383z(49));
                break;
            default:
                AbstractC1858a.m8587c(str, ui3Var2, ui3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }
}
