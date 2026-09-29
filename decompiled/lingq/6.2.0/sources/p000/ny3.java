package p000;

import androidx.compose.runtime.internal.C0282a;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ny3 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53390a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f53391b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vi3 f53392c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f53393d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean f53394e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f53395f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f53396g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ xi3 f53397h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f53398i;

    public /* synthetic */ ny3(List list, boolean z, boolean z2, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ui3 ui3Var, int i) {
        this.f53390a = 2;
        this.f53393d = list;
        this.f53391b = z;
        this.f53394e = z2;
        this.f53392c = vi3Var;
        this.f53395f = vi3Var2;
        this.f53396g = vi3Var3;
        this.f53397h = ui3Var;
        this.f53398i = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f53390a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f53398i;
        xi3 xi3Var = this.f53397h;
        Object obj3 = this.f53396g;
        Object obj4 = this.f53395f;
        Object obj5 = this.f53393d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                omd.m18145e(this.f53391b, this.f53392c, (e16) obj5, this.f53394e, (uy3) obj4, (o39) obj3, (C0282a) xi3Var, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                omd.m18147f(this.f53391b, this.f53392c, (e16) obj5, this.f53394e, (uy3) obj4, (o39) obj3, (C0282a) xi3Var, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).intValue();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                d32.m10057q((List) obj5, this.f53391b, this.f53394e, this.f53392c, (vi3) obj4, (vi3) obj3, (ui3) xi3Var, (ye1) obj, iM19383z3);
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ny3(boolean z, vi3 vi3Var, e16 e16Var, boolean z2, uy3 uy3Var, o39 o39Var, C0282a c0282a, int i, int i2) {
        this.f53390a = i2;
        this.f53391b = z;
        this.f53392c = vi3Var;
        this.f53393d = e16Var;
        this.f53394e = z2;
        this.f53395f = uy3Var;
        this.f53396g = o39Var;
        this.f53397h = c0282a;
        this.f53398i = i;
    }
}
