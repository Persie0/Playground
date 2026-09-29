package androidx.glance;

import androidx.glance.AbstractC0640a;
import java.util.List;
import kotlin.jvm.internal.FunctionReference;
import p000.C3472pt;
import p000.ea1;
import p000.il1;
import p000.jd0;
import p000.jv8;
import p000.ln1;
import p000.lv8;
import p000.mn3;
import p000.oha;
import p000.omd;
import p000.on3;
import p000.p84;
import p000.pk9;
import p000.tj3;
import p000.tz3;
import p000.ui3;
import p000.uz3;
import p000.vi3;
import p000.we1;
import p000.x18;
import p000.ye1;
import p000.zi3;
import p000.zp2;
import p000.zz3;

/* JADX INFO: renamed from: androidx.glance.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0640a {
    /* JADX INFO: renamed from: a */
    public static final void m2210a(final zz3 zz3Var, final String str, on3 on3Var, int i, ea1 ea1Var, ye1 ye1Var, final int i2, final int i3) {
        on3 on3Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        final on3 on3Var3;
        final int i8;
        final ea1 ea1Var2;
        ea1 ea1Var3 = ea1Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(491792371);
        int i9 = i2 | (tj3Var.m22120g(zz3Var) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i9 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 != 0) {
            i4 = i9 | 384;
            on3Var2 = on3Var;
        } else {
            on3Var2 = on3Var;
            i4 = i9 | (tj3Var.m22120g(on3Var2) ? 256 : 128);
        }
        int i11 = i3 & 8;
        if (i11 != 0) {
            i6 = i4 | 3072;
            i5 = i;
        } else {
            i5 = i;
            i6 = i4 | (tj3Var.m22116e(i5) ? 2048 : 1024);
        }
        int i12 = i3 & 16;
        if (i12 != 0) {
            i7 = i6 | 24576;
        } else {
            i7 = i6 | ((i2 & 32768) == 0 ? tj3Var.m22120g(ea1Var3) : tj3Var.m22124i(ea1Var3) ? 16384 : 8192);
        }
        if ((i7 & 9363) == 9362 && tj3Var.m22086D()) {
            tj3Var.m22102U();
            ea1Var2 = ea1Var3;
            on3Var3 = on3Var2;
            i8 = i5;
        } else {
            on3 on3Var4 = i10 != 0 ? mn3.f51554a : on3Var2;
            int i13 = i11 != 0 ? 1 : i5;
            if (i12 != 0) {
                ea1Var3 = null;
            }
            ea1 ea1Var4 = ea1Var3;
            m2211b(zz3Var, str, on3Var4, i13, ea1Var4, tj3Var, (i7 & 14) | 196608 | (i7 & 112) | (i7 & 896) | (i7 & 7168) | (i7 & 57344));
            on3Var3 = on3Var4;
            i8 = i13;
            ea1Var2 = ea1Var4;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3() { // from class: rz3
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AbstractC0640a.m2210a(zz3Var, str, on3Var3, i8, ea1Var2, (ye1) obj, pk9.m19383z(i2 | 1), i3);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m2211b(zz3 zz3Var, String str, on3 on3Var, int i, ea1 ea1Var, ye1 ye1Var, int i2) {
        int i3;
        on3 on3VarMo16935d;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(2075067909);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? tj3Var.m22120g(zz3Var) : tj3Var.m22124i(zz3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= tj3Var.m22120g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= tj3Var.m22120g(on3Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= tj3Var.m22116e(i) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= (32768 & i2) == 0 ? tj3Var.m22120g(ea1Var) : tj3Var.m22124i(ea1Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= tj3Var.m22120g(null) ? 131072 : 65536;
        }
        if ((74899 & i3) == 74898 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            p84 p84Var = we1.f66679a;
            if (str != null) {
                tj3Var.m22113c0(884096034);
                tj3Var.m22113c0(5004770);
                boolean z = (i3 & 112) == 32;
                Object objM22097O = tj3Var.m22097O();
                if (z || objM22097O == p84Var) {
                    objM22097O = new jd0(str, 11);
                    tj3Var.m22131l0(objM22097O);
                }
                tj3Var.m22139q(false);
                jv8 jv8Var = new jv8();
                ((vi3) objM22097O).invoke(jv8Var);
                on3VarMo16935d = on3Var.mo16935d(new lv8(jv8Var));
                tj3Var.m22139q(false);
            } else {
                tj3Var.m22113c0(884190429);
                tj3Var.m22139q(false);
                on3VarMo16935d = on3Var;
            }
            tj3Var.m22113c0(1849434622);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = ImageKt$ImageElement$1$1.f5773i;
                tj3Var.m22131l0(objM22097O2);
            }
            tj3Var.m22139q(false);
            ui3 ui3Var = (ui3) ((FunctionReference) objM22097O2);
            tj3Var.m22113c0(-1115894518);
            tj3Var.m22113c0(1886828752);
            if (!(tj3Var.f62387a instanceof C3472pt)) {
                pk9.m19377r();
                throw null;
            }
            tj3Var.m22107Z();
            if (tj3Var.f62384S) {
                tj3Var.m22130l(new GlanceNodeKt$GlanceNode$$inlined$ComposeNode$1(ui3Var));
            } else {
                tj3Var.m22137o0();
            }
            oha.m18001g(tj3Var, new ln1(i4), zz3Var);
            oha.m18001g(tj3Var, new ln1(5), on3VarMo16935d);
            oha.m18001g(tj3Var, new ln1(6), new il1(i));
            oha.m18001g(tj3Var, new ln1(7), ea1Var);
            oha.m18001g(tj3Var, new ln1(8), null);
            tj3Var.m22139q(true);
            tj3Var.m22139q(false);
            tj3Var.m22139q(false);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new tz3(zz3Var, str, on3Var, i, ea1Var, i2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m2212c(zp2 zp2Var) {
        String str = null;
        lv8 lv8Var = (lv8) zp2Var.f71931a.mo11685a(null, uz3.f64603b);
        jv8 jv8Var = lv8Var != null ? lv8Var.f50195a : null;
        if (jv8Var != null) {
            Object obj = jv8Var.f46235a.get(omd.f54598c);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        return str == null || str.length() == 0;
    }
}
