package p000;

import androidx.compose.p002ui.state.ToggleableState;
import androidx.glance.appwidget.components.AbstractC0655b;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gk0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f40895a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f40896b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f40897c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f40898d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f40899e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f40900f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f40901g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f40902h;

    public /* synthetic */ gk0(e16 e16Var, ui3 ui3Var, boolean z, o39 o39Var, ly3 ly3Var, zi3 zi3Var, int i) {
        this.f40898d = e16Var;
        this.f40899e = ui3Var;
        this.f40896b = z;
        this.f40900f = o39Var;
        this.f40901g = ly3Var;
        this.f40902h = zi3Var;
        this.f40897c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f40895a;
        int i2 = this.f40897c;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f40902h;
        Object obj4 = this.f40901g;
        Object obj5 = this.f40900f;
        Object obj6 = this.f40899e;
        Object obj7 = this.f40898d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(1);
                AbstractC0655b.m2220b((String) obj7, (tg9) obj6, (on3) obj5, this.f40896b, (zz3) obj4, (uj0) obj3, this.f40897c, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                pvc.m19506b(this.f40896b, (ToggleableState) obj7, (e16) obj6, (h01) obj5, (el9) obj4, (el9) obj3, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                omd.m18143d((e16) obj7, (ui3) obj6, this.f40896b, (o39) obj5, (ly3) obj4, (zi3) obj3, (ye1) obj, iM19383z3);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ gk0(String str, tg9 tg9Var, on3 on3Var, boolean z, zz3 zz3Var, uj0 uj0Var, int i, int i2) {
        this.f40898d = str;
        this.f40899e = tg9Var;
        this.f40900f = on3Var;
        this.f40896b = z;
        this.f40901g = zz3Var;
        this.f40902h = uj0Var;
        this.f40897c = i;
    }

    public /* synthetic */ gk0(boolean z, ToggleableState toggleableState, e16 e16Var, h01 h01Var, el9 el9Var, el9 el9Var2, int i) {
        this.f40896b = z;
        this.f40898d = toggleableState;
        this.f40899e = e16Var;
        this.f40900f = h01Var;
        this.f40901g = el9Var;
        this.f40902h = el9Var2;
        this.f40897c = i;
    }
}
