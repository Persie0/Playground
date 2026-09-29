package p000;

import androidx.compose.material3.AbstractC0226d0;
import androidx.compose.material3.C0228e0;
import androidx.compose.material3.C0252k0;
import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qb0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57521a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f57522b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f57523c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57524d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f57525e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f57526f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f57527g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xi3 f57528h;

    public /* synthetic */ qb0(e16 e16Var, C0228e0 c0228e0, boolean z, v56 v56Var, C0282a c0282a, C0282a c0282a2, int i) {
        this.f57521a = 3;
        this.f57524d = e16Var;
        this.f57525e = c0228e0;
        this.f57522b = z;
        this.f57526f = v56Var;
        this.f57528h = c0282a;
        this.f57527g = c0282a2;
        this.f57523c = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57521a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f57523c;
        xi3 xi3Var = this.f57528h;
        Object obj3 = this.f57527g;
        Object obj4 = this.f57526f;
        Object obj5 = this.f57525e;
        Object obj6 = this.f57524d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                m4d.m16630c((ph7) obj6, (C0252k0) obj5, (un1) obj4, this.f57522b, (t66) obj3, (C0282a) xi3Var, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                ul1.m22787c((String) obj6, this.f57522b, (rl1) obj5, (e16) obj4, (aj3) obj3, (ui3) xi3Var, (ye1) obj, iM19383z2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                omd.m18156l((ui3) obj6, (e16) obj5, this.f57522b, (o39) obj4, (ly3) obj3, (C0282a) xi3Var, (ye1) obj, iM19383z3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iM19383z4 = pk9.m19383z(i2 | 1);
                AbstractC0226d0.m1135f((e16) obj6, (C0228e0) obj5, this.f57522b, (v56) obj4, (C0282a) xi3Var, (C0282a) obj3, (ye1) obj, iM19383z4);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z5 = pk9.m19383z(i2 | 1);
                g6d.m12390c((List) obj6, (List) obj5, this.f57522b, (ui3) obj4, (vi3) obj3, (vi3) xi3Var, (ye1) obj, iM19383z5);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ qb0(ph7 ph7Var, C0252k0 c0252k0, un1 un1Var, boolean z, t66 t66Var, C0282a c0282a, int i) {
        this.f57521a = 0;
        this.f57524d = ph7Var;
        this.f57525e = c0252k0;
        this.f57526f = un1Var;
        this.f57522b = z;
        this.f57527g = t66Var;
        this.f57528h = c0282a;
        this.f57523c = i;
    }

    public /* synthetic */ qb0(Object obj, Object obj2, boolean z, Object obj3, Object obj4, xi3 xi3Var, int i, int i2) {
        this.f57521a = i2;
        this.f57524d = obj;
        this.f57525e = obj2;
        this.f57522b = z;
        this.f57526f = obj3;
        this.f57527g = obj4;
        this.f57528h = xi3Var;
        this.f57523c = i;
    }

    public /* synthetic */ qb0(String str, boolean z, rl1 rl1Var, e16 e16Var, aj3 aj3Var, ui3 ui3Var, int i) {
        this.f57521a = 1;
        this.f57524d = str;
        this.f57522b = z;
        this.f57525e = rl1Var;
        this.f57526f = e16Var;
        this.f57527g = aj3Var;
        this.f57528h = ui3Var;
        this.f57523c = i;
    }
}
