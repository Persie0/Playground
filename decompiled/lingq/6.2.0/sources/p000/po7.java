package p000;

import androidx.compose.material3.internal.AbstractC0246h;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class po7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f56590a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f56591b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f56592c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ zi3 f56593d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f56594e;

    public /* synthetic */ po7(long j, Object obj, zi3 zi3Var, int i, int i2) {
        this.f56590a = i2;
        this.f56591b = j;
        this.f56592c = obj;
        this.f56593d = zi3Var;
        this.f56594e = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f56590a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f56594e;
        Object obj3 = this.f56592c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                int iM19383z = pk9.m19383z(i2 | 1);
                AbstractC3489q9.m19773c(this.f56591b, (vx9) obj3, this.f56593d, (ye1) obj, iM19383z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iM19383z2 = pk9.m19383z(i2 | 1);
                AbstractC0246h.m1168c(this.f56591b, (vx9) obj3, this.f56593d, (ye1) obj, iM19383z2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iM19383z3 = pk9.m19383z(i2 | 1);
                long j = this.f56591b;
                r46.m20383h(iM19383z3, j, (ye1) obj, this.f56593d, (g99) obj3);
                break;
        }
        return xfaVar;
    }
}
