package p000;

import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class zs1 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f72029a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f72030b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0282a f72031c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f72032d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f72033e;

    public /* synthetic */ zs1(e16 e16Var, C0282a c0282a, int i, int i2, int i3) {
        this.f72029a = i3;
        this.f72030b = e16Var;
        this.f72031c = c0282a;
        this.f72032d = i;
        this.f72033e = i2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f72029a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f72033e;
        int i3 = this.f72032d;
        C0282a c0282a = this.f72031c;
        e16 e16Var = this.f72030b;
        ye1 ye1Var = (ye1) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                r9d.m20479a(e16Var, c0282a, ye1Var, pk9.m19383z(i3 | 1), i2);
                break;
            default:
                qid.m19982b(e16Var, c0282a, ye1Var, pk9.m19383z(i3 | 1), i2);
                break;
        }
        return xfaVar;
    }
}
