package p000;

import com.lingq.core.playlists.AbstractC1825a;
import com.lingq.feature.chat.AbstractC2008l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ey0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38061a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f38062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f38063c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f38064d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f38065e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f38066f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f38067g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f38068h;

    public /* synthetic */ ey0(tx0 tx0Var, String str, String str2, t17 t17Var, jv0 jv0Var, int i, int i2) {
        this.f38066f = tx0Var;
        this.f38062b = str;
        this.f38063c = str2;
        this.f38067g = t17Var;
        this.f38068h = jv0Var;
        this.f38064d = i;
        this.f38065e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f38061a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f38064d;
        Object obj3 = this.f38068h;
        Object obj4 = this.f38067g;
        Object obj5 = this.f38063c;
        Object obj6 = this.f38066f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC2008l.m8912c((tx0) obj6, this.f38062b, (String) obj5, (t17) obj4, (jv0) obj3, (ye1) obj, iM19383z, this.f38065e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC1825a.m8507b(this.f38062b, (String) obj5, (ui3) obj6, (vi3) obj4, (ui3) obj3, (ye1) obj, iM19383z2, this.f38065e);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                yhd.m25145a(this.f38062b, (zh9) obj6, (ui3) obj5, (zi3) obj4, (vi3) obj3, (ye1) obj, iM19383z3, this.f38065e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ey0(String str, zh9 zh9Var, ui3 ui3Var, zi3 zi3Var, vi3 vi3Var, int i, int i2) {
        this.f38062b = str;
        this.f38066f = zh9Var;
        this.f38063c = ui3Var;
        this.f38067g = zi3Var;
        this.f38068h = vi3Var;
        this.f38064d = i;
        this.f38065e = i2;
    }

    public /* synthetic */ ey0(String str, String str2, ui3 ui3Var, vi3 vi3Var, ui3 ui3Var2, int i, int i2) {
        this.f38062b = str;
        this.f38063c = str2;
        this.f38066f = ui3Var;
        this.f38067g = vi3Var;
        this.f38068h = ui3Var2;
        this.f38064d = i;
        this.f38065e = i2;
    }
}
