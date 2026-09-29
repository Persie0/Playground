package p000;

import androidx.compose.runtime.internal.C0282a;
import com.lingq.core.p012ui.dragdrop.C1919b;
import com.lingq.feature.widget.layout.collections.layout.AbstractC2868d;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class dz1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f36438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f36439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f36440c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f36441d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f36442e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f36443f;

    public /* synthetic */ dz1(int i, int i2, ui3 ui3Var, e16 e16Var, String str) {
        this.f36438a = 6;
        this.f36439b = e16Var;
        this.f36441d = str;
        this.f36440c = i;
        this.f36443f = ui3Var;
        this.f36442e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f36438a;
        int i2 = this.f36440c;
        int i3 = this.f36442e;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f36439b;
        Object obj4 = this.f36443f;
        Object obj5 = this.f36441d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                fad.m11681d((e16) obj3, (ui3) obj4, (C0282a) obj5, (ye1) obj, pk9.m19383z(i2 | 1), this.f36442e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i3 | 1);
                lbd.m16061a((e16) obj3, (C1919b) obj4, this.f36440c, (C0282a) obj5, (ye1) obj, iM19383z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(3073);
                AbstractC2868d.m9783d((String) obj3, this.f36440c, this.f36442e, (tg9) obj4, (ArrayList) obj5, (ye1) obj, iM19383z2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                whd.m23969a((jm4) obj3, (ui3) obj4, (vi3) obj5, (ye1) obj, pk9.m19383z(i2 | 1), this.f36442e);
                break;
            case 4:
                ((Integer) obj2).getClass();
                zhd.m25663a((String) obj3, (g80) obj5, (ui3) obj4, (ye1) obj, pk9.m19383z(i2 | 1), this.f36442e);
                break;
            case 5:
                ((Integer) obj2).intValue();
                int iM19383z3 = pk9.m19383z(i3 | 1);
                bgc.m3708b((f5a) obj3, this.f36440c, (vi3) obj5, (ui3) obj4, (ye1) obj, iM19383z3);
                break;
            case 6:
                ye1 ye1Var = (ye1) obj;
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i3 | 1);
                int i4 = this.f36440c;
                m1d.m16598c(i4, iM19383z4, ye1Var, (ui3) obj4, (e16) obj3, (String) obj5);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z5 = pk9.m19383z(1);
                q1d.m19600a(this.f36440c, this.f36442e, (Integer) obj5, (ui3) obj4, (e16) obj3, (ye1) obj, iM19383z5);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ dz1(int i, int i2, Integer num, ui3 ui3Var, e16 e16Var, int i3) {
        this.f36438a = 7;
        this.f36440c = i;
        this.f36442e = i2;
        this.f36441d = num;
        this.f36443f = ui3Var;
        this.f36439b = e16Var;
    }

    public /* synthetic */ dz1(e16 e16Var, C1919b c1919b, int i, C0282a c0282a, int i2) {
        this.f36438a = 1;
        this.f36439b = e16Var;
        this.f36443f = c1919b;
        this.f36440c = i;
        this.f36441d = c0282a;
        this.f36442e = i2;
    }

    public /* synthetic */ dz1(f5a f5aVar, int i, vi3 vi3Var, ui3 ui3Var, int i2) {
        this.f36438a = 5;
        this.f36439b = f5aVar;
        this.f36440c = i;
        this.f36441d = vi3Var;
        this.f36443f = ui3Var;
        this.f36442e = i2;
    }

    public /* synthetic */ dz1(Object obj, ui3 ui3Var, xi3 xi3Var, int i, int i2, int i3) {
        this.f36438a = i3;
        this.f36439b = obj;
        this.f36443f = ui3Var;
        this.f36441d = xi3Var;
        this.f36440c = i;
        this.f36442e = i2;
    }

    public /* synthetic */ dz1(String str, int i, int i2, tg9 tg9Var, ArrayList arrayList, int i3) {
        this.f36438a = 2;
        this.f36439b = str;
        this.f36440c = i;
        this.f36442e = i2;
        this.f36443f = tg9Var;
        this.f36441d = arrayList;
    }

    public /* synthetic */ dz1(String str, g80 g80Var, ui3 ui3Var, int i, int i2) {
        this.f36438a = 4;
        this.f36439b = str;
        this.f36441d = g80Var;
        this.f36443f = ui3Var;
        this.f36440c = i;
        this.f36442e = i2;
    }
}
