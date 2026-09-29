package p000;

import com.lingq.core.premium.AbstractC1839a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class oia implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54382a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f54383b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ui3 f54384c;

    public /* synthetic */ oia(long j, ui3 ui3Var) {
        this.f54383b = j;
        this.f54384c = ui3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f54382a;
        xfa xfaVar = xfa.f68157a;
        ui3 ui3Var = this.f54384c;
        long j = this.f54383b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    AbstractC1839a.m8537o(j, ui3Var, tj3Var, 0);
                }
                break;
            default:
                num.getClass();
                AbstractC1839a.m8537o(j, ui3Var, ye1Var, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ oia(long j, ui3 ui3Var, int i) {
        this.f54383b = j;
        this.f54384c = ui3Var;
    }
}
