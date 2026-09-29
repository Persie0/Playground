package p000;

import androidx.compose.material3.AbstractC0266w;
import androidx.compose.runtime.internal.C0282a;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ac9 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f490a = 1;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0282a f491b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f492c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f493d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f494e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ long f495f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f496g;

    public /* synthetic */ ac9(zi3 zi3Var, C0282a c0282a, zi3 zi3Var2, vx9 vx9Var, long j, long j2) {
        this.f492c = zi3Var;
        this.f491b = c0282a;
        this.f493d = zi3Var2;
        this.f494e = vx9Var;
        this.f495f = j;
        this.f496g = j2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f490a;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f494e;
        Object obj4 = this.f493d;
        Object obj5 = this.f492c;
        switch (i) {
            case 0:
                zi3 zi3Var = (zi3) obj5;
                zi3 zi3Var2 = (zi3) obj4;
                vx9 vx9Var = (vx9) obj3;
                ye1 ye1Var = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var = (tj3) ye1Var;
                if (!tj3Var.m22099R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    tj3Var.m22102U();
                } else {
                    tj3Var.m22111b0(-168956728);
                    tj3Var.m22111b0(-942207887);
                    u3d.m22439a(this.f491b, zi3Var, zi3Var2, vx9Var, this.f495f, this.f496g, tj3Var, 0);
                    tj3Var.m22139q(false);
                    tj3Var.m22139q(false);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                u3d.m22439a(this.f491b, (zi3) obj5, (zi3) obj4, (vx9) obj3, this.f495f, this.f496g, (ye1) obj, pk9.m19383z(1));
                break;
            default:
                ((Integer) obj2).getClass();
                AbstractC0266w.m1209b((e16) obj5, (o39) obj4, this.f495f, this.f496g, (e5b) obj3, this.f491b, (ye1) obj, pk9.m19383z(1572871));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ ac9(e16 e16Var, o39 o39Var, long j, long j2, e5b e5bVar, C0282a c0282a, int i) {
        this.f492c = e16Var;
        this.f493d = o39Var;
        this.f495f = j;
        this.f496g = j2;
        this.f494e = e5bVar;
        this.f491b = c0282a;
    }

    public /* synthetic */ ac9(C0282a c0282a, zi3 zi3Var, zi3 zi3Var2, vx9 vx9Var, long j, long j2, int i) {
        this.f491b = c0282a;
        this.f492c = zi3Var;
        this.f493d = zi3Var2;
        this.f494e = vx9Var;
        this.f495f = j;
        this.f496g = j2;
    }
}
