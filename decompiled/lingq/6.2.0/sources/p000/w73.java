package p000;

import androidx.compose.material3.AbstractC0257p;
import androidx.compose.material3.AbstractC0266w;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class w73 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f66468a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ e16 f66469b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ o39 f66470c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f66471d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ long f66472e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0282a f66473f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f66474g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f66475h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f66476i;

    public /* synthetic */ w73(Object obj, e16 e16Var, o39 o39Var, long j, long j2, Object obj2, C0282a c0282a, int i, int i2) {
        this.f66468a = i2;
        this.f66475h = obj;
        this.f66469b = e16Var;
        this.f66470c = o39Var;
        this.f66471d = j;
        this.f66472e = j2;
        this.f66476i = obj2;
        this.f66473f = c0282a;
        this.f66474g = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f66468a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f66474g;
        Object obj3 = this.f66476i;
        Object obj4 = this.f66475h;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC0257p.m1188c((ui3) obj4, this.f66469b, this.f66470c, this.f66471d, this.f66472e, (p73) obj3, this.f66473f, (ye1) obj, iM19383z);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC0266w.m1208a((e5b) obj4, this.f66469b, this.f66470c, this.f66471d, this.f66472e, (k73) obj3, this.f66473f, (ye1) obj, iM19383z2);
                break;
        }
        return xfaVar;
    }
}
