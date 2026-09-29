package p000;

import androidx.glance.session.AbstractC0696d;
import androidx.glance.session.C0698f;
import com.lingq.core.premium.AbstractC1839a;
import com.lingq.feature.review.AbstractC2752c;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cx7 implements zi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f34689a;

    public /* synthetic */ cx7(int i) {
        this.f34689a = i;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        int i;
        String str;
        String strM22988k;
        int i2 = this.f34689a;
        xfa xfaVar = xfa.f68157a;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                qjc.m20011b((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 1:
                ((Integer) obj2).getClass();
                fkc.m11927a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC2752c.m9581d((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 3:
                a97 a97Var = (a97) obj2;
                Boolean boolValueOf = Boolean.valueOf(a97Var.f382a);
                fs6 fs6Var = dm8.f35846a;
                return vz1.m23627e(boolValueOf, dm8.m10482a(new dr2(a97Var.f383b), lda.f49512e, (el8) obj));
            case 4:
                return Integer.valueOf(((dr2) obj2).f36076a);
            case 5:
                return Integer.valueOf(((hc5) obj2).f42172a);
            case 6:
                ax9 ax9Var = (ax9) obj2;
                return vz1.m23627e(dm8.m10482a(new zw9(ax9Var.f7651a), lda.f49515h, (el8) obj), Boolean.valueOf(ax9Var.f7652b));
            case 7:
                return Integer.valueOf(((zw9) obj2).f72322a);
            case 8:
                ((Integer) obj2).getClass();
                ezc.m11404a((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 9:
                int iIntValue = ((Integer) obj).intValue();
                yq8 yq8Var = (yq8) obj2;
                yq8Var.getClass();
                if (yq8Var instanceof uq8) {
                    i = ((uq8) yq8Var).f64223a.f19426a;
                    str = "lesson-";
                } else {
                    if (!(yq8Var instanceof pq8)) {
                        if (yq8Var instanceof tq8) {
                            strM22988k = "header-tabs";
                        } else if (yq8Var instanceof sq8) {
                            strM22988k = "filter";
                        } else if (yq8Var instanceof xq8) {
                            strM22988k = "search";
                        } else if (yq8Var instanceof vq8) {
                            i = ((vq8) yq8Var).f65791a.f19426a;
                            str = "lesson-blacklist-";
                        } else if (yq8Var instanceof qq8) {
                            i = ((qq8) yq8Var).f58085a.f19426a;
                            str = "course-blacklist-";
                        } else if (yq8Var.equals(rq8.f59726a)) {
                            strM22988k = "empty";
                        } else {
                            if (!(yq8Var instanceof wq8)) {
                                gm5.m12750e();
                                return null;
                            }
                            i = ((wq8) yq8Var).f67188a;
                            str = "lesson-loading-";
                        }
                        return strM22988k + "-" + iIntValue;
                    }
                    i = ((pq8) yq8Var).f56682a.f19426a;
                    str = "course-";
                }
                strM22988k = ux5.m22988k(i, str);
                return strM22988k + "-" + iIntValue;
            case 10:
                ((C0698f) obj).getClass();
                Pair[] pairArr = {new Pair("KEY", ((AbstractC0696d) obj2).f6261a)};
                hi8 hi8Var = new hi8(10);
                Pair pair = pairArr[0];
                hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
                return hi8Var.m13282k();
            case 11:
                return Integer.valueOf(((ct5) obj).mo1512l(((Integer) obj2).intValue()));
            case 12:
                return Integer.valueOf(((ct5) obj).mo1513p(((Integer) obj2).intValue()));
            case 13:
                return Integer.valueOf(((ct5) obj).mo1510U(((Integer) obj2).intValue()));
            case 14:
                return Integer.valueOf(((ct5) obj).mo1511c(((Integer) obj2).intValue()));
            case 15:
                l7a l7aVar = (l7a) obj2;
                return vz1.m23605K(Float.valueOf(l7aVar.f49256a), Float.valueOf(l7aVar.f49259d.m19861h()), Float.valueOf(l7aVar.f49257b.m19861h()));
            case 16:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8544v((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 17:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8548z((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 18:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8547y((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            case 19:
                ((Integer) obj2).getClass();
                AbstractC1839a.m8518D((ye1) obj, pk9.m19383z(1));
                return xfaVar;
            default:
                ((Integer) obj2).getClass();
                tj3 tj3Var = (tj3) ((ye1) obj);
                tj3Var.m22111b0(796584404);
                d63 d63Var = new d63();
                tj3Var.m22139q(false);
                return d63Var;
        }
    }

    public /* synthetic */ cx7(int i, int i2) {
        this.f34689a = i2;
    }
}
