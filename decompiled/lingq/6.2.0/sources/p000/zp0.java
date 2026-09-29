package p000;

import com.lingq.feature.challenges.AbstractC1985e;
import com.lingq.feature.challenges.cup.AbstractC1976c;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zp0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f71928a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f71929b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f71930c;

    public /* synthetic */ zp0(int i, int i2, e16 e16Var) {
        this.f71928a = 3;
        this.f71930c = i;
        this.f71929b = e16Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f71928a;
        xfa xfaVar = xfa.f68157a;
        e16 e16Var = this.f71929b;
        int i2 = this.f71930c;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                q5d.m19671e(i2, pk9.m19383z(1), ye1Var, e16Var);
                break;
            case 1:
                b6d.m3388h(i2, pk9.m19383z(1), ye1Var, e16Var);
                break;
            case 2:
                AbstractC1985e.m8851c(i2, pk9.m19383z(1), ye1Var, e16Var);
                break;
            default:
                AbstractC1976c.m8833p(i2, pk9.m19383z(1), ye1Var, e16Var);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ zp0(int i, int i2, int i3, e16 e16Var) {
        this.f71928a = i3;
        this.f71929b = e16Var;
        this.f71930c = i;
    }
}
