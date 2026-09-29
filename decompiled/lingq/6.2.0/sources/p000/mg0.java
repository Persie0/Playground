package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class mg0 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f51261a = 2;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f51262b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ float f51263c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ float f51264d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ o39 f51265e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f51266f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f51267g;

    public /* synthetic */ mg0(ng0 ng0Var, e16 e16Var, float f, float f2, o39 o39Var, long j, int i) {
        this.f51267g = ng0Var;
        this.f51262b = e16Var;
        this.f51263c = f;
        this.f51264d = f2;
        this.f51265e = o39Var;
        this.f51266f = j;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f51261a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f51267g;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(196609);
                ((ng0) obj3).m17409a(this.f51263c, this.f51264d, iM19383z, this.f51266f, (ye1) obj, this.f51262b, this.f51265e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(1);
                b6d.m3384d(this.f51262b, (List) obj3, this.f51263c, this.f51264d, this.f51265e, this.f51266f, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(196657);
                ((a3d) obj3).m88h(this.f51263c, this.f51264d, iM19383z3, this.f51266f, (ye1) obj, this.f51262b, this.f51265e);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ mg0(e16 e16Var, List list, float f, float f2, o39 o39Var, long j, int i) {
        this.f51262b = e16Var;
        this.f51267g = list;
        this.f51263c = f;
        this.f51264d = f2;
        this.f51265e = o39Var;
        this.f51266f = j;
    }

    public /* synthetic */ mg0(a3d a3dVar, e16 e16Var, float f, float f2, long j, o39 o39Var, int i) {
        this.f51267g = a3dVar;
        this.f51262b = e16Var;
        this.f51263c = f;
        this.f51264d = f2;
        this.f51266f = j;
        this.f51265e = o39Var;
    }
}
