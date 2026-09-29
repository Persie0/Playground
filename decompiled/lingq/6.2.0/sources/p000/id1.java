package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class id1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f43950a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f43951b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f43952c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f43953d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f43954e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f43955f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f43956g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f43957h;

    public /* synthetic */ id1(int i, zi3 zi3Var, C0282a c0282a, zi3 zi3Var2, zi3 zi3Var3, z66 z66Var, zi3 zi3Var4) {
        this.f43956g = i;
        this.f43952c = zi3Var;
        this.f43951b = c0282a;
        this.f43953d = zi3Var2;
        this.f43954e = zi3Var3;
        this.f43955f = z66Var;
        this.f43957h = zi3Var4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f43950a;
        int i2 = this.f43956g;
        Object obj3 = this.f43955f;
        Object obj4 = this.f43954e;
        Object obj5 = this.f43953d;
        Object obj6 = this.f43952c;
        Object obj7 = this.f43957h;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                this.f43951b.m1292j(this.f43952c, (Boolean) obj7, this.f43953d, this.f43954e, this.f43955f, (ye1) obj, pk9.m19383z(i2) | 1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                this.f43951b.m1296n(this.f43952c, this.f43953d, this.f43954e, this.f43955f, this.f43957h, (ye1) obj, pk9.m19383z(i2) | 1);
                break;
            case 2:
                zi3 zi3Var = (zi3) obj6;
                zi3 zi3Var2 = (zi3) obj5;
                zi3 zi3Var3 = (zi3) obj4;
                z66 z66Var = (z66) obj3;
                zi3 zi3Var4 = (zi3) obj7;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    b34.m3234c(this.f43956g, zi3Var, this.f43951b, zi3Var2, zi3Var3, z66Var, zi3Var4, tj3Var, 0);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                b34.m3234c(this.f43956g, (zi3) obj6, this.f43951b, (zi3) obj5, (zi3) obj4, (e5b) obj3, (zi3) obj7, (ye1) obj, pk9.m19383z(1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ id1(int i, zi3 zi3Var, C0282a c0282a, zi3 zi3Var2, zi3 zi3Var3, e5b e5bVar, zi3 zi3Var4, int i2) {
        this.f43956g = i;
        this.f43952c = zi3Var;
        this.f43951b = c0282a;
        this.f43953d = zi3Var2;
        this.f43954e = zi3Var3;
        this.f43955f = e5bVar;
        this.f43957h = zi3Var4;
    }

    public /* synthetic */ id1(C0282a c0282a, Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, int i) {
        this.f43951b = c0282a;
        this.f43952c = obj;
        this.f43957h = bool;
        this.f43953d = obj2;
        this.f43954e = obj3;
        this.f43955f = obj4;
        this.f43956g = i;
    }

    public /* synthetic */ id1(C0282a c0282a, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.f43951b = c0282a;
        this.f43952c = obj;
        this.f43953d = obj2;
        this.f43954e = obj3;
        this.f43955f = obj4;
        this.f43957h = obj5;
        this.f43956g = i;
    }
}
