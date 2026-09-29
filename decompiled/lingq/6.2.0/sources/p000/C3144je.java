package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.playlists.AbstractC1825a;

/* JADX INFO: renamed from: je */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3144je implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f45446a = 3;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f45447b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f45448c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f45449d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f45450e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f45451f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f45452g;

    public /* synthetic */ C3144je(ui3 ui3Var, e16 e16Var, ge2 ge2Var, C0282a c0282a, int i, int i2) {
        this.f45447b = ui3Var;
        this.f45450e = e16Var;
        this.f45451f = ge2Var;
        this.f45452g = c0282a;
        this.f45448c = i;
        this.f45449d = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f45446a;
        int i2 = this.f45448c;
        int i3 = this.f45449d;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f45452g;
        Object obj4 = this.f45451f;
        Object obj5 = this.f45450e;
        Object obj6 = this.f45447b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AbstractC3369ne.m17396d((ui3) obj6, (e16) obj5, (ge2) obj4, (C0282a) obj3, (ye1) obj, pk9.m19383z(i2 | 1), this.f45449d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC1825a.m8506a((String) obj5, (ui3) obj6, (vi3) obj4, (ui3) obj3, (ye1) obj, pk9.m19383z(i2 | 1), this.f45449d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i3 | 1);
                w9d.m23821b((String) obj4, (Integer) obj3, this.f45448c, (ui3) obj6, (e16) obj5, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i3 | 1);
                xid.m24555a((f35) obj6, this.f45448c, (c55) obj5, (vi3) obj4, (vi3) obj3, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3144je(f35 f35Var, int i, c55 c55Var, vi3 vi3Var, vi3 vi3Var2, int i2) {
        this.f45447b = f35Var;
        this.f45448c = i;
        this.f45450e = c55Var;
        this.f45451f = vi3Var;
        this.f45452g = vi3Var2;
        this.f45449d = i2;
    }

    public /* synthetic */ C3144je(String str, ui3 ui3Var, vi3 vi3Var, ui3 ui3Var2, int i, int i2) {
        this.f45450e = str;
        this.f45447b = ui3Var;
        this.f45451f = vi3Var;
        this.f45452g = ui3Var2;
        this.f45448c = i;
        this.f45449d = i2;
    }

    public /* synthetic */ C3144je(String str, Integer num, int i, ui3 ui3Var, e16 e16Var, int i2) {
        this.f45451f = str;
        this.f45452g = num;
        this.f45448c = i;
        this.f45447b = ui3Var;
        this.f45450e = e16Var;
        this.f45449d = i2;
    }
}
