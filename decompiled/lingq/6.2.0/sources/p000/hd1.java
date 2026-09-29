package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hd1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f42201a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f42202b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f42203c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f42204d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f42205e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f42206f;

    public /* synthetic */ hd1(e16 e16Var, d85 d85Var, vi3 vi3Var, ui3 ui3Var, int i, int i2) {
        this.f42201a = 1;
        this.f42203c = e16Var;
        this.f42204d = d85Var;
        this.f42205e = vi3Var;
        this.f42206f = ui3Var;
        this.f42202b = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f42201a;
        int i2 = this.f42202b;
        Object obj3 = this.f42204d;
        Object obj4 = this.f42206f;
        Object obj5 = this.f42205e;
        xfa xfaVar = xfa.f68157a;
        Object obj6 = this.f42203c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2) | 1;
                ((C0282a) obj6).m1294l(this.f42204d, this.f42205e, this.f42206f, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                pvc.m19510f((e16) obj6, (d85) obj3, (vi3) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(1), this.f42202b);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC3352my.m17110b((Boolean) obj6, this.f42204d, (ub5) obj5, (vi3) obj4, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(1);
                AbstractC3695vr.m23495e((Integer) obj6, (String) obj3, (String) obj5, this.f42202b, (tg9) obj4, (ye1) obj, iM19383z3);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ hd1(Integer num, String str, String str2, int i, tg9 tg9Var, int i2) {
        this.f42201a = 3;
        this.f42203c = num;
        this.f42204d = str;
        this.f42205e = str2;
        this.f42202b = i;
        this.f42206f = tg9Var;
    }

    public /* synthetic */ hd1(Object obj, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.f42201a = i2;
        this.f42203c = obj;
        this.f42204d = obj2;
        this.f42205e = obj3;
        this.f42206f = obj4;
        this.f42202b = i;
    }
}
