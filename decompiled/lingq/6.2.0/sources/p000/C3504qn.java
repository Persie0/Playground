package p000;

import androidx.compose.foundation.pager.AbstractC0150d;
import androidx.compose.material3.AbstractC0231g;
import androidx.compose.runtime.internal.C0282a;
import androidx.glance.text.AbstractC0704a;
import com.lingq.feature.onboarding.p014v2.AbstractC2215c;
import java.util.List;

/* JADX INFO: renamed from: qn */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C3504qn implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f57953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57954c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f57955d;

    public /* synthetic */ C3504qn(int i, yt4 yt4Var, Object obj) {
        this.f57952a = 7;
        this.f57954c = yt4Var;
        this.f57953b = i;
        this.f57955d = obj;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0160  */
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i = this.f57952a;
        int i2 = this.f57953b;
        xfa xfaVar = xfa.f68157a;
        Object obj3 = this.f57955d;
        Object obj4 = this.f57954c;
        switch (i) {
            case 0:
                ((Integer) obj2).intValue();
                AbstractC3617tn.m22238a((C3419on) obj4, (List) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 1:
                String str = (String) obj4;
                oa1 oa1Var = (oa1) obj3;
                ye1 ye1Var = (ye1) obj;
                if ((((Integer) obj2).intValue() & 3) != 2) {
                    AbstractC0704a.m2506a(str, null, new ux9(oa1Var, new zx9(d32.m10018P(14)), new ac3(500), 120), this.f57953b, ye1Var, 0, 2);
                } else {
                    tj3 tj3Var = (tj3) ye1Var;
                    if (!tj3Var.m22086D()) {
                        AbstractC0704a.m2506a(str, null, new ux9(oa1Var, new zx9(d32.m10018P(14)), new ac3(500), 120), this.f57953b, ye1Var, 0, 2);
                    } else {
                        tj3Var.m22102U();
                    }
                }
                break;
            case 2:
                ((Integer) obj2).intValue();
                eh0.m11124d((e16) obj4, (vi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((C0282a) obj4).m1289g(obj3, (ye1) obj, pk9.m19383z(i2) | 1);
                break;
            case 4:
                ((Integer) obj2).intValue();
                pvc.m19507c((a02) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                pvc.m19508d((a02[]) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((ls4) obj4).mo15746b(i2, obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 7:
                yt4 yt4Var = (yt4) obj4;
                ye1 ye1Var2 = (ye1) obj;
                int iIntValue = ((Integer) obj2).intValue();
                tj3 tj3Var2 = (tj3) ye1Var2;
                if (!tj3Var2.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    tj3Var2.m22102U();
                } else {
                    yt4Var.mo15746b(i2, obj3, tj3Var2, 0);
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((wu4) obj4).mo15746b(i2, obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((uv4) obj4).mo15746b(i2, obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                AbstractC2215c.m9162f((AbstractC0150d) obj4, i2, (List) obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((l27) obj4).mo15746b(i2, obj3, (ye1) obj, pk9.m19383z(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                AbstractC0231g.m1149b((sb9) obj4, (e16) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                lw9.m16553a((vx9) obj4, (zi3) obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                ((faa) obj4).m11667a(obj3, (ye1) obj, pk9.m19383z(i2 | 1));
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ C3504qn(int i, int i2, int i3, Object obj, Object obj2) {
        this.f57952a = i3;
        this.f57954c = obj;
        this.f57953b = i;
        this.f57955d = obj2;
    }

    public /* synthetic */ C3504qn(Object obj, int i, int i2, Object obj2) {
        this.f57952a = i2;
        this.f57954c = obj;
        this.f57955d = obj2;
        this.f57953b = i;
    }
}
