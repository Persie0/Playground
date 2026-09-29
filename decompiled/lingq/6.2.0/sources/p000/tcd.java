package p000;

import androidx.compose.material3.C0233h;
import androidx.compose.runtime.internal.C0282a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tcd {
    /* JADX INFO: renamed from: a */
    public static final void m21954a(e16 e16Var, p04 p04Var, boolean z, ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i) {
        e16 e16Var2;
        p04 p04Var2;
        boolean z2;
        p04 p04VarM20438b;
        long j;
        ui3Var.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1128371086);
        int i2 = i | 406 | (tj3Var.m22124i(ui3Var) ? 2048 : 1024);
        boolean z3 = true;
        if (tj3Var.m22099R(i2 & 1, (i2 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                p04VarM20438b = r7d.m20438b();
                e16Var2 = b16.f7762a;
            } else {
                tj3Var.m22102U();
                e16Var2 = e16Var;
                p04VarM20438b = p04Var;
                z3 = z;
            }
            tj3Var.m22140r();
            e16 e16VarM21607T = AbstractC3584sr.m21607T(c99.m4412e(e16Var2, 1.0f), ((fe9) tj3Var.m22128k(ge9.f40637a)).f38957f);
            vh9 vh9Var = ps5.f56764b;
            si8 si8Var = ((ms5) tj3Var.m22128k(vh9Var)).f51801c.f64858d;
            C0233h c0233hM22000n = te1.m22000n(62, z3 ? 12.0f : 0.0f);
            if (z3) {
                tj3Var.m22111b0(1406558412);
                j = ((ms5) tj3Var.m22128k(vh9Var)).f51799a.f55868n;
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22111b0(1406631231);
                tj3Var.m22139q(false);
                j = aa1.f411j;
            }
            bq1.m4039O(e16VarM21607T, si8Var, te1.m21999m(0, 14, j, 0L, tj3Var), c0233hM22000n, null, ci8.m4703P(1019179712, new tw2(z3, ui3Var, p04VarM20438b, c0282a), tj3Var), tj3Var, 196608, 16);
            p04Var2 = p04VarM20438b;
            z2 = z3;
        } else {
            tj3Var.m22102U();
            e16Var2 = e16Var;
            p04Var2 = p04Var;
            z2 = z;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new uy0(e16Var2, p04Var2, z2, ui3Var, c0282a, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static kmb m21955b(cib cibVar, C3329mb c3329mb, ArrayList arrayList, boolean z) {
        kmb kmbVarMo12757a;
        qdd.m19876c(1, "reduce", arrayList);
        qdd.m19877d(2, "reduce", arrayList);
        kmb kmbVarM4562k = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(0));
        if (!(kmbVarM4562k instanceof vkb)) {
            C3386nv.m17626m("Callback should be a method");
            return null;
        }
        if (arrayList.size() == 2) {
            kmbVarMo12757a = ((cdb) c3329mb.f50861c).m4562k(c3329mb, (kmb) arrayList.get(1));
            if (kmbVarMo12757a instanceof jjb) {
                C3386nv.m17626m("Failed to parse initial value");
                return null;
            }
        } else {
            if (cibVar.m4744n() == 0) {
                C3386nv.m17633t("Empty array with no initial value error");
                return null;
            }
            kmbVarMo12757a = null;
        }
        vkb vkbVar = (vkb) kmbVarM4562k;
        int iM4744n = cibVar.m4744n();
        int i = z ? 0 : iM4744n - 1;
        int i2 = z ? iM4744n - 1 : 0;
        int i3 = true == z ? 1 : -1;
        if (kmbVarMo12757a == null) {
            kmbVarMo12757a = cibVar.m4745o(i);
            i += i3;
        }
        while ((i2 - i) * i3 >= 0) {
            if (cibVar.m4747s(i)) {
                kmbVarMo12757a = vkbVar.mo12757a(c3329mb, Arrays.asList(kmbVarMo12757a, cibVar.m4745o(i), new bkb(Double.valueOf(i)), cibVar));
                if (kmbVarMo12757a instanceof jjb) {
                    C3386nv.m17633t("Reduce operation failed");
                    return null;
                }
                i += i3;
            } else {
                i += i3;
            }
        }
        return kmbVarMo12757a;
    }

    /* JADX INFO: renamed from: c */
    public static cib m21956c(cib cibVar, C3329mb c3329mb, gmb gmbVar, Boolean bool, Boolean bool2) {
        cib cibVar2 = new cib();
        Iterator itM4743m = cibVar.m4743m();
        while (itM4743m.hasNext()) {
            int iIntValue = ((Integer) itM4743m.next()).intValue();
            if (cibVar.m4747s(iIntValue)) {
                kmb kmbVarMo12757a = gmbVar.mo12757a(c3329mb, Arrays.asList(cibVar.m4745o(iIntValue), new bkb(Double.valueOf(iIntValue)), cibVar));
                if (kmbVarMo12757a.mo3808b().equals(bool)) {
                    break;
                }
                if (bool2 == null || kmbVarMo12757a.mo3808b().equals(bool2)) {
                    cibVar2.m4746r(iIntValue, kmbVarMo12757a);
                }
            }
        }
        return cibVar2;
    }
}
