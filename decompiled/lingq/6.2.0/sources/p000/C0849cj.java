package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: renamed from: cj */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C0849cj implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f10148a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f10149b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ w66 f10150c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ t66 f10151d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yn8 f10152e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ o39 f10153f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f10154g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ float f10155h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0282a f10156i;

    public /* synthetic */ C0849cj(e16 e16Var, w66 w66Var, t66 t66Var, yn8 yn8Var, o39 o39Var, long j, float f, C0282a c0282a) {
        this.f10149b = e16Var;
        this.f10150c = w66Var;
        this.f10151d = t66Var;
        this.f10152e = yn8Var;
        this.f10153f = o39Var;
        this.f10154g = j;
        this.f10155h = f;
        this.f10156i = c0282a;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f10148a;
        xfa xfaVar = xfa.f68157a;
        switch (i) {
            case 0:
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    tw5.m22326a(this.f10149b, this.f10150c, this.f10151d, this.f10152e, this.f10153f, this.f10154g, this.f10155h, this.f10156i, tj3Var, 384);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                tw5.m22326a(this.f10149b, this.f10150c, this.f10151d, this.f10152e, this.f10153f, this.f10154g, this.f10155h, this.f10156i, (ye1) obj, pk9.m19383z(385));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C0849cj(e16 e16Var, w66 w66Var, t66 t66Var, yn8 yn8Var, o39 o39Var, long j, float f, C0282a c0282a, int i) {
        this.f10149b = e16Var;
        this.f10150c = w66Var;
        this.f10151d = t66Var;
        this.f10152e = yn8Var;
        this.f10153f = o39Var;
        this.f10154g = j;
        this.f10155h = f;
        this.f10156i = c0282a;
    }
}
