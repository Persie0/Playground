package p000;

import com.lingq.core.settings.AbstractC1858a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t29 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f61771a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ d39 f61772b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f61773c;

    public /* synthetic */ t29(d39 d39Var, vi3 vi3Var) {
        this.f61772b = d39Var;
        this.f61773c = vi3Var;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f61771a;
        xfa xfaVar = xfa.f68157a;
        vi3 vi3Var = this.f61773c;
        d39 d39Var = this.f61772b;
        ye1 ye1Var = (ye1) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                num.getClass();
                AbstractC1858a.m8607w(d39Var, vi3Var, ye1Var, pk9.m19383z(1));
                break;
            default:
                int iIntValue = num.intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    had.m13166a(d39Var.f34969k, vi3Var, tj3Var, 0);
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ t29(d39 d39Var, vi3 vi3Var, int i) {
        this.f61772b = d39Var;
        this.f61773c = vi3Var;
    }
}
