package p000;

import androidx.glance.AbstractC0640a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tz3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f63130a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f63131b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f63132c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f63133d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f63134e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f63135f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f63136g;

    public /* synthetic */ tz3(zz3 zz3Var, String str, on3 on3Var, int i, ea1 ea1Var, int i2) {
        this.f63130a = 0;
        this.f63133d = zz3Var;
        this.f63134e = str;
        this.f63135f = on3Var;
        this.f63131b = i;
        this.f63136g = ea1Var;
        this.f63132c = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f63130a;
        int i2 = this.f63131b;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f63136g;
        Object obj4 = this.f63135f;
        Object obj5 = this.f63134e;
        Object obj6 = this.f63133d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(this.f63132c | 1);
                AbstractC0640a.m2211b((zz3) obj6, (String) obj5, (on3) obj4, this.f63131b, (ea1) obj3, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                xwc.m24760d((x85) obj6, (vi3) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1), this.f63132c);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC3184kh.m15207a((e16) obj6, (z85) obj5, (vi3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1), this.f63132c);
                break;
            default:
                ((Integer) obj2).getClass();
                omd.m18153i((h68) obj6, (ui3) obj5, (ui3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1), this.f63132c);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ tz3(Object obj, Object obj2, xi3 xi3Var, xi3 xi3Var2, int i, int i2, int i3) {
        this.f63130a = i3;
        this.f63133d = obj;
        this.f63134e = obj2;
        this.f63135f = xi3Var;
        this.f63136g = xi3Var2;
        this.f63131b = i;
        this.f63132c = i2;
    }
}
