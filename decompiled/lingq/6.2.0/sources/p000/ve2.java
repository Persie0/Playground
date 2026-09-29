package p000;

import androidx.compose.material3.AbstractC0231g;
import androidx.compose.material3.C0269z;
import com.lingq.core.domain.model.lesson.LessonWord;

/* JADX INFO: loaded from: classes3.dex */
public final class ve2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65269a;

    public /* synthetic */ ve2(int i) {
        this.f65269a = i;
    }

    /* JADX INFO: renamed from: a */
    public static final void m23242a(kxa kxaVar, vi3 vi3Var, ye1 ye1Var, int i) {
        tj3 tj3Var;
        vi3Var.getClass();
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(501114738);
        int i2 = 2;
        int i3 = (tj3Var2.m22120g(kxaVar) ? 4 : 2) | i | (tj3Var2.m22124i(vi3Var) ? 32 : 16);
        if (tj3Var2.m22099R(i3 & 1, (i3 & 19) != 18)) {
            C0269z c0269zM1154g = AbstractC0231g.m1154g(true, tj3Var2, 6, 2);
            boolean z = (i3 & 112) == 32;
            Object objM22097O = tj3Var2.m22097O();
            if (z || objM22097O == we1.f66679a) {
                objM22097O = new hsa(vi3Var, i2);
                tj3Var2.m22131l0(objM22097O);
            }
            tj3Var = tj3Var2;
            AbstractC0231g.m1150c((ui3) objM22097O, null, c0269zM1154g, 0.0f, false, null, 0L, 0L, 0L, null, null, null, ci8.m4703P(1518631764, new iz4(29, kxaVar, vi3Var), tj3Var2), tj3Var, 0, 3072, 8186);
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new eq8(kxaVar, i, 28, vi3Var);
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m23243b(Object obj, Object obj2) {
        switch (this.f65269a) {
            case 0:
                ue2 ue2Var = (ue2) obj;
                ue2 ue2Var2 = (ue2) obj2;
                if ((ue2Var instanceof re2) && (ue2Var2 instanceof re2)) {
                    return ue2Var.equals(ue2Var2);
                }
                if ((ue2Var instanceof se2) && (ue2Var2 instanceof se2)) {
                    return ue2Var.equals(ue2Var2);
                }
                if ((ue2Var instanceof te2) && (ue2Var2 instanceof te2)) {
                    return ue2Var.equals(ue2Var2);
                }
                return false;
            case 1:
                return ((LessonWord) obj).equals((LessonWord) obj2);
            case 2:
                return ((LessonWord) obj).equals((LessonWord) obj2);
            case 3:
                oe8 oe8Var = (oe8) obj;
                oe8 oe8Var2 = (oe8) obj2;
                if (oe8Var instanceof le8) {
                    if (oe8Var2 instanceof le8) {
                        le8 le8Var = (le8) oe8Var;
                        le8 le8Var2 = (le8) oe8Var2;
                        if (le8Var.f49559a == le8Var2.f49559a && le8Var.f49560b == le8Var2.f49560b) {
                            return true;
                        }
                    }
                } else if (oe8Var instanceof me8) {
                    if (oe8Var2 instanceof me8) {
                        return ((me8) oe8Var).f51213b.equals(((me8) oe8Var2).f51213b);
                    }
                } else if (!(oe8Var instanceof ne8)) {
                    gm5.m12750e();
                } else if ((oe8Var2 instanceof ne8) && ((ne8) oe8Var).f52654a == ((ne8) oe8Var2).f52654a) {
                    return true;
                }
                return false;
            default:
                ar9 ar9Var = (ar9) obj;
                ar9 ar9Var2 = (ar9) obj2;
                if (!(ar9Var instanceof ar9)) {
                    gm5.m12750e();
                } else if ((ar9Var2 instanceof ar9) && fa4.m11650l(ar9Var.f7405a, ar9Var2.f7405a) && ar9Var.f7406b == ar9Var2.f7406b) {
                    return true;
                }
                return false;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m23244c(Object obj, Object obj2) {
        switch (this.f65269a) {
            case 0:
                ue2 ue2Var = (ue2) obj;
                ue2 ue2Var2 = (ue2) obj2;
                if ((ue2Var instanceof re2) && (ue2Var2 instanceof re2)) {
                    if (((re2) ue2Var).f59155a.f19008a == ((re2) ue2Var2).f59155a.f19008a) {
                        return true;
                    }
                } else if ((ue2Var instanceof se2) && (ue2Var2 instanceof se2)) {
                    if (((se2) ue2Var).f60732a.f19008a == ((se2) ue2Var2).f60732a.f19008a) {
                        return true;
                    }
                } else if ((ue2Var instanceof te2) && (ue2Var2 instanceof te2)) {
                    return true;
                }
                return false;
            case 1:
                return fa4.m11650l(((LessonWord) obj).f19314a, ((LessonWord) obj2).f19314a);
            case 2:
                return fa4.m11650l(((LessonWord) obj).f19314a, ((LessonWord) obj2).f19314a);
            case 3:
                return ((oe8) obj).getClass() == ((oe8) obj2).getClass();
            default:
                ar9 ar9Var = (ar9) obj2;
                if (((ar9) obj) instanceof ar9) {
                    return ar9Var instanceof ar9;
                }
                gm5.m12750e();
                return false;
        }
    }
}
