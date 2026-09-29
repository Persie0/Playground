package androidx.compose.material3;

import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.unit.LayoutDirection;
import androidx.compose.runtime.internal.C0282a;
import p000.a45;
import p000.ac9;
import p000.b16;
import p000.c99;
import p000.ci8;
import p000.do7;
import p000.e16;
import p000.e5b;
import p000.fb2;
import p000.fc5;
import p000.fda;
import p000.fs6;
import p000.go2;
import p000.ho9;
import p000.je1;
import p000.k73;
import p000.lz5;
import p000.o39;
import p000.p84;
import p000.ra1;
import p000.te0;
import p000.ti6;
import p000.tj3;
import p000.ui3;
import p000.vi3;
import p000.vi6;
import p000.w73;
import p000.we1;
import p000.x18;
import p000.x49;
import p000.xwc;
import p000.ye1;
import p000.yi6;
import p000.zi3;
import p000.zl2;

/* JADX INFO: renamed from: androidx.compose.material3.w */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0266w {

    /* JADX INFO: renamed from: a */
    public static final fda f3635a = new fda(256, (go2) null, 6);

    /* JADX INFO: renamed from: a */
    public static final void m1208a(final e5b e5bVar, e16 e16Var, o39 o39Var, long j, long j2, k73 k73Var, C0282a c0282a, ye1 ye1Var, int i) {
        int i2;
        o39 o39Var2;
        long j3;
        long j4;
        C0282a c0282a2;
        tj3 tj3Var;
        k73 k73Var2;
        int i3;
        final k73 k73Var3;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(1560288494);
        if ((i & 6) == 0) {
            i2 = (tj3Var2.m22120g(null) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= tj3Var2.m22120g(e5bVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= tj3Var2.m22120g(e16Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            o39Var2 = o39Var;
            i2 |= tj3Var2.m22120g(o39Var2) ? 2048 : 1024;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 24576) == 0) {
            j3 = j;
            i2 |= tj3Var2.m22118f(j3) ? 16384 : 8192;
        } else {
            j3 = j;
        }
        if ((196608 & i) == 0) {
            j4 = j2;
            i2 |= tj3Var2.m22118f(j4) ? 131072 : 65536;
        } else {
            j4 = j2;
        }
        if ((1572864 & i) == 0) {
            i2 |= tj3Var2.m22114d(0.0f) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= 4194304;
        }
        if ((100663296 & i) == 0) {
            c0282a2 = c0282a;
            i2 |= tj3Var2.m22124i(c0282a2) ? 67108864 : 33554432;
        } else {
            c0282a2 = c0282a;
        }
        if (tj3Var2.m22099R(i2 & 1, (38347923 & i2) != 38347922)) {
            tj3Var2.m22104W();
            if ((i & 1) == 0 || tj3Var2.m22084B()) {
                Object objM22097O = tj3Var2.m22097O();
                if (objM22097O == we1.f66679a) {
                    objM22097O = new ti6();
                    tj3Var2.m22131l0(objM22097O);
                }
                i3 = i2 & (-29360129);
                k73Var3 = (k73) objM22097O;
            } else {
                tj3Var2.m22102U();
                i3 = i2 & (-29360129);
                k73Var3 = k73Var;
            }
            tj3Var2.m22140r();
            fb2 fb2Var = (fb2) tj3Var2.m22128k(AbstractC0402n.f4816h);
            final float f = yi6.f69870b;
            final float fMo912g0 = fb2Var.mo912g0(f);
            boolean z = tj3Var2.m22128k(AbstractC0402n.f4822n) == LayoutDirection.Rtl;
            final C0282a c0282a3 = c0282a2;
            final boolean z2 = z;
            int i4 = i3 >> 6;
            tj3Var = tj3Var2;
            ho9.m13414a(c99.m4410c(AbstractC0309d.m1406a(c99.m4425r(e16Var, 240.0f, 0.0f, f, 10), new vi6(k73Var3, fMo912g0, z, 1)).mo3161g(b16.f7762a), 1.0f), o39Var2, j3, j4, 0.0f, 0.0f, null, ci8.m4703P(-315420087, new zi3() { // from class: ui6
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    int i5 = 0;
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM23904F = wfb.m23904F(AbstractC0309d.m1406a(c99.m4425r(b16Var, 240.0f, 0.0f, f, 10), new vi6(k73Var3, fMo912g0, z2, i5)).mo3161g(b16Var), e5bVar);
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM23904F);
                        se1.f60731q.getClass();
                        ui3 ui3Var = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        c0282a3.invoke(db1.f35347a, tj3Var3, 6);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (i4 & 112) | 12582912 | (i4 & 896) | (i4 & 7168) | (i4 & 57344), 96);
            k73Var2 = k73Var3;
        } else {
            tj3Var = tj3Var2;
            tj3Var.m22102U();
            k73Var2 = k73Var;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new w73(e5bVar, e16Var, o39Var, j, j2, k73Var2, c0282a, i, 1);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m1209b(e16 e16Var, o39 o39Var, long j, long j2, e5b e5bVar, C0282a c0282a, ye1 ye1Var, int i) {
        o39 o39Var2;
        long j3;
        long j4;
        e5b e5bVar2;
        long jM20489b;
        long j5;
        o39 o39Var3;
        e5b fc5Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1922633461);
        int i2 = i | 91280;
        if (tj3Var.m22099R(i2 & 1, (599187 & i2) != 599186)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                float f = zl2.f71693a;
                o39 o39VarM24271b = x49.m24271b(yi6.f69869a, tj3Var);
                long jM20492e = ra1.m20492e(yi6.f69871c, tj3Var);
                jM20489b = ra1.m20489b(jM20492e, tj3Var);
                j5 = jM20492e;
                o39Var3 = o39VarM24271b;
                fc5Var = new fc5(do7.m10543s(tj3Var), 48 | 9);
            } else {
                tj3Var.m22102U();
                o39Var3 = o39Var;
                j5 = j;
                jM20489b = j2;
                fc5Var = e5bVar;
            }
            tj3Var.m22140r();
            m1208a(fc5Var, e16Var, o39Var3, j5, jM20489b, null, c0282a, tj3Var, 102236550);
            e5bVar2 = fc5Var;
            o39Var2 = o39Var3;
            j3 = j5;
            j4 = jM20489b;
        } else {
            tj3Var.m22102U();
            o39Var2 = o39Var;
            j3 = j;
            j4 = j2;
            e5bVar2 = e5bVar;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new ac9(e16Var, o39Var2, j3, j4, e5bVar2, c0282a, i);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r30v1 java.lang.Object
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX INFO: renamed from: c */
    public static final void m1210c(final androidx.compose.runtime.internal.C0282a r29, p000.e16 r30, final androidx.compose.material3.C0253l r31, final boolean r32, long r33, final androidx.compose.runtime.internal.C0282a r35, p000.ye1 r36, final int r37) {
        /*
            Method dump skipped, instruction units count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AbstractC0266w.m1210c(androidx.compose.runtime.internal.a, e16, androidx.compose.material3.l, boolean, long, androidx.compose.runtime.internal.a, ye1, int):void");
    }

    /* JADX INFO: renamed from: d */
    public static final C0253l m1211d(DrawerValue drawerValue, ye1 ye1Var) {
        tj3 tj3Var = (tj3) ye1Var;
        Object objM22097O = tj3Var.m22097O();
        p84 p84Var = we1.f66679a;
        if (objM22097O == p84Var) {
            objM22097O = new lz5(12);
            tj3Var.m22131l0(objM22097O);
        }
        vi3 vi3Var = (vi3) objM22097O;
        Object[] objArr = new Object[0];
        fs6 fs6Var = new fs6(19, new je1(18), new te0(vi3Var, 17));
        boolean zM22120g = ((tj3) ye1Var).m22120g(vi3Var);
        tj3 tj3Var2 = (tj3) ye1Var;
        Object objM22097O2 = tj3Var2.m22097O();
        if (zM22120g || objM22097O2 == p84Var) {
            objM22097O2 = new a45(drawerValue, vi3Var, 6);
            tj3Var2.m22131l0(objM22097O2);
        }
        return (C0253l) xwc.m24747T(objArr, fs6Var, (ui3) objM22097O2, tj3Var2, 0);
    }
}
