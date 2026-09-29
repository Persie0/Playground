package p000;

import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.settings.theme.AbstractC1881a;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pad {
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX INFO: renamed from: a */
    public static final void m19011a(dsa dsaVar, nz9 nz9Var, hx7 hx7Var, vi3 vi3Var, vi3 vi3Var2, vi3 vi3Var3, ye1 ye1Var, int i) {
        int i2;
        vi3 vi3Var4;
        Integer num;
        String str;
        Object obj;
        Object obj2;
        int i3;
        Object obj3;
        int i4;
        Object obj4;
        dsaVar.getClass();
        nz9Var.getClass();
        hx7Var.getClass();
        vi3Var.getClass();
        vi3Var2.getClass();
        vi3Var3.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(263766282);
        if ((i & 6) == 0) {
            i2 = (tj3Var.m22120g(dsaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(nz9Var) : tj3Var.m22124i(nz9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var.m22120g(hx7Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= tj3Var.m22124i(vi3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            vi3Var4 = vi3Var2;
            i2 |= tj3Var.m22124i(vi3Var4) ? 16384 : 8192;
        } else {
            vi3Var4 = vi3Var2;
        }
        if ((196608 & i) == 0) {
            i2 |= tj3Var.m22124i(vi3Var3) ? 131072 : 65536;
        }
        if (tj3Var.m22099R(i2 & 1, (74899 & i2) != 74898)) {
            boolean z = dsaVar.f36181a;
            ThemeSettingsTab themeSettingsTab = dsaVar.f36185e;
            int i5 = i2 & 7168;
            boolean z2 = i5 == 2048;
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            Object obj5 = objM22097O;
            if (z2 || objM22097O == p84Var) {
                v4a v4aVar = new v4a(vi3Var, 13);
                tj3Var.m22131l0(v4aVar);
                obj5 = v4aVar;
            }
            int i6 = i2;
            AbstractC1881a.m8679r(z, nz9Var, vi3Var4, themeSettingsTab, (vi3) obj5, false, tj3Var, 64 | (i2 & 112) | ((i2 >> 6) & 896), 32);
            Lesson lesson = hx7Var.f43114c;
            boolean z3 = hx7Var.f43115d;
            Integer num2 = null;
            if (z3) {
                if (lesson != null) {
                    num = lesson.f19152k;
                } else {
                    num = null;
                }
            } else if (lesson != null) {
                num = lesson.f19153l;
            } else {
                num = null;
            }
            if (z3) {
                if (lesson != null) {
                    num2 = lesson.f19153l;
                }
            } else if (lesson != null) {
                num2 = lesson.f19152k;
            }
            boolean z4 = dsaVar.f36182b;
            if (lesson == null || (str = lesson.f19143b) == null) {
                str = "";
            }
            boolean z5 = hx7Var.f43112a != null;
            boolean z6 = hx7Var.f43113b.f64694a;
            boolean z7 = hx7Var.f43118g;
            boolean z8 = hx7Var.f43119h;
            boolean z9 = i5 == 2048;
            Object objM22097O2 = tj3Var.m22097O();
            if (z9 || objM22097O2 == p84Var) {
                x4a x4aVar = new x4a(vi3Var, 28);
                tj3Var.m22131l0(x4aVar);
                obj = x4aVar;
            } else {
                obj = objM22097O2;
            }
            ui3 ui3Var = (ui3) obj;
            int i7 = i6 & 458752;
            boolean zM22120g = tj3Var.m22120g(num2) | (i7 == 131072);
            Object objM22097O3 = tj3Var.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                ty7 ty7Var = new ty7(num2, vi3Var3, 2);
                tj3Var.m22131l0(ty7Var);
                obj2 = ty7Var;
            } else {
                obj2 = objM22097O3;
            }
            ui3 ui3Var2 = (ui3) obj2;
            boolean zM22120g2 = tj3Var.m22120g(num) | (i7 == 131072);
            Object objM22097O4 = tj3Var.m22097O();
            Object obj6 = objM22097O4;
            if (zM22120g2 || objM22097O4 == p84Var) {
                ty7 ty7Var2 = new ty7(num, vi3Var3, 3);
                tj3Var.m22131l0(ty7Var2);
                obj6 = ty7Var2;
            }
            ui3 ui3Var3 = (ui3) obj6;
            boolean z10 = i7 == 131072;
            Object objM22097O5 = tj3Var.m22097O();
            Object obj7 = objM22097O5;
            if (z10 || objM22097O5 == p84Var) {
                x4a x4aVar2 = new x4a(vi3Var3, 29);
                tj3Var.m22131l0(x4aVar2);
                obj7 = x4aVar2;
            }
            ui3 ui3Var4 = (ui3) obj7;
            boolean z11 = i5 == 2048;
            Object objM22097O6 = tj3Var.m22097O();
            if (z11 || objM22097O6 == p84Var) {
                i3 = 0;
                hsa hsaVar = new hsa(vi3Var, i3);
                tj3Var.m22131l0(hsaVar);
                obj3 = hsaVar;
            } else {
                i3 = 0;
                obj3 = objM22097O6;
            }
            ui3 ui3Var5 = (ui3) obj3;
            int i8 = i7 == 131072 ? 1 : i3;
            Object objM22097O7 = tj3Var.m22097O();
            Object obj8 = objM22097O7;
            if (i8 != 0 || objM22097O7 == p84Var) {
                hsa hsaVar2 = new hsa(vi3Var3, 1);
                tj3Var.m22131l0(hsaVar2);
                obj8 = hsaVar2;
            }
            ui3 ui3Var6 = (ui3) obj8;
            boolean z12 = i7 == 131072;
            Object objM22097O8 = tj3Var.m22097O();
            Object obj9 = objM22097O8;
            if (z12 || objM22097O8 == p84Var) {
                x4a x4aVar3 = new x4a(vi3Var3, 25);
                tj3Var.m22131l0(x4aVar3);
                obj9 = x4aVar3;
            }
            ui3 ui3Var7 = (ui3) obj9;
            int i9 = i6 & 896;
            boolean z13 = (i9 == 256) | (i7 == 131072);
            Object objM22097O9 = tj3Var.m22097O();
            if (z13 || objM22097O9 == p84Var) {
                i4 = 1;
                vy7 vy7Var = new vy7(hx7Var, vi3Var3, i4);
                tj3Var.m22131l0(vy7Var);
                obj4 = vy7Var;
            } else {
                i4 = 1;
                obj4 = objM22097O9;
            }
            ui3 ui3Var8 = (ui3) obj4;
            int i10 = (i9 == 256 ? (char) 1 : (char) 0) | (((i7 == 131072 ? i4 : 0) | (tj3Var.m22124i(lesson) ? 1 : 0)) == true ? 1 : 0);
            Object objM22097O10 = tj3Var.m22097O();
            Object obj10 = objM22097O10;
            if (i10 != 0 || objM22097O10 == p84Var) {
                wy7 wy7Var = new wy7(vi3Var3, lesson, hx7Var);
                tj3Var.m22131l0(wy7Var);
                obj10 = wy7Var;
            }
            ui3 ui3Var9 = (ui3) obj10;
            boolean z14 = i5 == 2048;
            Object objM22097O11 = tj3Var.m22097O();
            Object obj11 = objM22097O11;
            if (z14 || objM22097O11 == p84Var) {
                x4a x4aVar4 = new x4a(vi3Var, 26);
                tj3Var.m22131l0(x4aVar4);
                obj11 = x4aVar4;
            }
            ui3 ui3Var10 = (ui3) obj11;
            Object objM22097O12 = tj3Var.m22097O();
            Object obj12 = objM22097O12;
            if (objM22097O12 == p84Var) {
                C3288l7 c3288l7 = new C3288l7(7);
                tj3Var.m22131l0(c3288l7);
                obj12 = c3288l7;
            }
            ui3 ui3Var11 = (ui3) obj12;
            boolean z15 = i7 == 131072;
            Object objM22097O13 = tj3Var.m22097O();
            Object obj13 = objM22097O13;
            if (z15 || objM22097O13 == p84Var) {
                x4a x4aVar5 = new x4a(vi3Var3, 27);
                tj3Var.m22131l0(x4aVar5);
                obj13 = x4aVar5;
            }
            vjc.m23356b(z4, str, num2, num, z5, z6, q79.f57353a, true, z7, z8, ui3Var, ui3Var2, ui3Var3, ui3Var4, ui3Var5, ui3Var6, ui3Var7, ui3Var8, ui3Var9, ui3Var10, ui3Var11, (ui3) obj13, tj3Var, 14155776, 6);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nu1(dsaVar, nz9Var, hx7Var, vi3Var, vi3Var2, vi3Var3, i);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m19012b(int i) {
        throw new SerializationException(ux5.m22988k(i, "An unknown field for index "));
    }
}
