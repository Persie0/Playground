package androidx.compose.material3;

import androidx.compose.animation.core.C0059a;
import androidx.compose.foundation.AbstractC0080f;
import androidx.compose.foundation.gestures.AbstractC0095c;
import androidx.compose.foundation.gestures.C0097e;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.snapping.C0112a;
import androidx.compose.material3.AbstractC0229f;
import androidx.compose.material3.C0221b;
import androidx.compose.material3.C0223c;
import androidx.compose.material3.C0269z;
import androidx.compose.material3.R$string;
import androidx.compose.material3.SheetValue;
import androidx.compose.p002ui.AbstractC0287b;
import androidx.compose.p002ui.graphics.AbstractC0309d;
import androidx.compose.p002ui.input.nestedscroll.AbstractC0319c;
import androidx.compose.p002ui.node.C0352b;
import androidx.compose.p002ui.platform.AbstractC0402n;
import androidx.compose.p002ui.semantics.AbstractC0421a;
import androidx.compose.p002ui.semantics.AbstractC0426f;
import androidx.compose.runtime.internal.C0282a;
import p000.AbstractC3423or;
import p000.AbstractC3489q9;
import p000.AbstractC3720wf;
import p000.C3309ls;
import p000.C3368nd;
import p000.C3757xf;
import p000.b16;
import p000.bg9;
import p000.bh0;
import p000.c99;
import p000.ci8;
import p000.d32;
import p000.e16;
import p000.fa4;
import p000.fb2;
import p000.fda;
import p000.ho9;
import p000.hta;
import p000.i4d;
import p000.ms5;
import p000.n59;
import p000.nv8;
import p000.o39;
import p000.omd;
import p000.p84;
import p000.pj6;
import p000.ps5;
import p000.q98;
import p000.t70;
import p000.tj3;
import p000.ui3;
import p000.un1;
import p000.vh9;
import p000.vi3;
import p000.we1;
import p000.wfb;
import p000.wg0;
import p000.x18;
import p000.xfa;
import p000.xg0;
import p000.xtc;
import p000.ye1;
import p000.zg0;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.material3.f */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0229f {

    /* JADX INFO: renamed from: a */
    public static final long f3419a = omd.m18157m(0.5f, 0.0f);

    /* JADX INFO: renamed from: a */
    public static final void m1144a(final e16 e16Var, final C0269z c0269z, final ui3 ui3Var, final float f, final boolean z, final boolean z2, final zi3 zi3Var, final zi3 zi3Var2, final o39 o39Var, final long j, final long j2, final float f2, final C0282a c0282a, ye1 ye1Var, final int i) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(57000307);
        int i2 = i | (tj3Var.m22120g(e16Var) ? 4 : 2) | (tj3Var.m22120g(c0269z) ? 32 : 16) | (tj3Var.m22124i(ui3Var) ? 256 : 128) | (tj3Var.m22114d(f) ? 2048 : 1024) | (tj3Var.m22122h(z) ? 16384 : 8192) | (tj3Var.m22122h(z2) ? 131072 : 65536) | (tj3Var.m22124i(zi3Var) ? 1048576 : 524288) | (tj3Var.m22124i(zi3Var2) ? 8388608 : 4194304) | (tj3Var.m22120g(o39Var) ? 67108864 : 33554432) | (tj3Var.m22118f(j) ? 536870912 : 268435456);
        int i3 = (tj3Var.m22118f(j2) ? 4 : 2) | (tj3Var.m22114d(f2) ? 32 : 16) | 384 | (tj3Var.m22124i(c0282a) ? 2048 : 1024);
        if (tj3Var.m22099R(i2 & 1, ((i2 & 306783379) == 306783378 && (i3 & 1171) == 1170) ? false : true)) {
            tj3Var.m22104W();
            if ((i & 1) != 0 && !tj3Var.m22084B()) {
                tj3Var.m22102U();
            }
            tj3Var.m22140r();
            vh9 vh9Var = ps5.f56764b;
            bg9 bg9VarMo17780f = ((ms5) tj3Var.m22128k(vh9Var)).f51802d.mo17780f();
            bg9 bg9VarMo17776b = ((ms5) tj3Var.m22128k(vh9Var)).f51802d.mo17776b();
            bg9 bg9VarMo17780f2 = ((ms5) tj3Var.m22128k(vh9Var)).f51802d.mo17780f();
            int i4 = (i2 & 112) ^ 48;
            boolean zM22124i = ((i4 > 32 && tj3Var.m22120g(c0269z)) || (i2 & 48) == 32) | tj3Var.m22124i(bg9VarMo17780f) | tj3Var.m22124i(bg9VarMo17776b) | tj3Var.m22124i(bg9VarMo17780f2);
            Object objM22097O = tj3Var.m22097O();
            p84 p84Var = we1.f66679a;
            if (zM22124i || objM22097O == p84Var) {
                objM22097O = new zg0(c0269z, bg9VarMo17780f, bg9VarMo17776b, bg9VarMo17780f2);
                tj3Var.m22131l0(objM22097O);
            }
            d32.m10064x((ui3) objM22097O, tj3Var);
            Object objM22097O2 = tj3Var.m22097O();
            if (objM22097O2 == p84Var) {
                objM22097O2 = AbstractC3489q9.m19771a(0.0f);
                tj3Var.m22131l0(objM22097O2);
            }
            final C0059a c0059a = (C0059a) objM22097O2;
            Object objM22097O3 = tj3Var.m22097O();
            if (objM22097O3 == p84Var) {
                objM22097O3 = d32.m10013K(tj3Var);
                tj3Var.m22131l0(objM22097O3);
            }
            final un1 un1Var = (un1) objM22097O3;
            boolean zM22124i2 = ((i4 > 32 && tj3Var.m22120g(c0269z)) || (i2 & 48) == 32) | tj3Var.m22124i(un1Var) | tj3Var.m22124i(c0059a) | ((i2 & 896) == 256);
            Object objM22097O4 = tj3Var.m22097O();
            if (zM22124i2 || objM22097O4 == p84Var) {
                objM22097O4 = new ui3() { // from class: androidx.compose.material3.d
                    @Override // p000.ui3
                    /* JADX INFO: renamed from: a */
                    public final Object mo0a() {
                        C0269z c0269z2 = c0269z;
                        SheetValue sheetValueM1215c = c0269z2.m1215c();
                        SheetValue sheetValue = SheetValue.Expanded;
                        un1 un1Var2 = un1Var;
                        if (sheetValueM1215c == sheetValue && c0269z2.f3651e.m849c().m130c(SheetValue.PartiallyExpanded)) {
                            wfb.m23926u(un1Var2, null, null, new BottomSheetKt$BottomSheet$settleToDismiss$1$1$1(c0269z2, null), 3);
                            wfb.m23926u(un1Var2, null, null, new BottomSheetKt$BottomSheet$settleToDismiss$1$1$2(c0059a, null), 3);
                        } else {
                            wfb.m23926u(un1Var2, null, null, new BottomSheetKt$BottomSheet$settleToDismiss$1$1$3(c0269z2, null), 3).mo4540r(new wg0(c0269z2, ui3Var, 1));
                        }
                        return xfa.f68157a;
                    }
                };
                tj3Var.m22131l0(objM22097O4);
            }
            ui3 ui3Var2 = (ui3) objM22097O4;
            boolean z3 = z2 && c0269z.m1217e();
            boolean zM22124i3 = tj3Var.m22124i(c0059a) | tj3Var.m22120g(ui3Var2);
            Object objM22097O5 = tj3Var.m22097O();
            if (zM22124i3 || objM22097O5 == p84Var) {
                objM22097O5 = new BottomSheetKt$BottomSheet$4$1(ui3Var2, c0059a, null);
                tj3Var.m22131l0(objM22097O5);
            }
            i4d.m13660b(z3, (zi3) objM22097O5, tj3Var, 0);
            int i5 = i2 >> 6;
            int i6 = ((i2 << 3) & 524272) | (3670016 & i5) | (i5 & 29360128);
            int i7 = i3 << 24;
            int i8 = i6 | (234881024 & i7) | (i7 & 1879048192);
            int i9 = i2 >> 15;
            m1145b(((Number) c0059a.m745d()).floatValue(), e16Var, c0269z, ui3Var, f, z, o39Var, j, j2, f2, zi3Var, zi3Var2, c0282a, tj3Var, i8, (i9 & 896) | (i9 & 112) | 6 | (i3 & 7168));
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new zi3(c0269z, ui3Var, f, z, z2, zi3Var, zi3Var2, o39Var, j, j2, f2, c0282a, i) { // from class: ah0

                /* JADX INFO: renamed from: H */
                public final /* synthetic */ C0282a f621H;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C0269z f623b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ui3 f624c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ float f625d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f626e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ boolean f627f;

                /* JADX INFO: renamed from: g */
                public final /* synthetic */ zi3 f628g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ zi3 f629h;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ o39 f630i;

                /* JADX INFO: renamed from: j */
                public final /* synthetic */ long f631j;

                /* JADX INFO: renamed from: k */
                public final /* synthetic */ long f632k;

                /* JADX INFO: renamed from: l */
                public final /* synthetic */ float f633l;

                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(1);
                    AbstractC0229f.m1144a(this.f622a, this.f623b, this.f624c, this.f625d, this.f626e, this.f627f, this.f628g, this.f629h, this.f630i, this.f631j, this.f632k, this.f633l, this.f621H, (ye1) obj, iM19383z);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:185:0x02a5  */
    /* JADX INFO: renamed from: b */
    public static final void m1145b(final float f, final e16 e16Var, final C0269z c0269z, ui3 ui3Var, final float f2, final boolean z, final o39 o39Var, final long j, final long j2, final float f3, final zi3 zi3Var, final zi3 zi3Var2, final C0282a c0282a, ye1 ye1Var, final int i, final int i2) {
        int i3;
        int i4;
        ui3 ui3Var2;
        tj3 tj3Var;
        int i5;
        ui3 ui3Var3;
        boolean z2;
        Object objM22097O;
        final C0269z c0269z2 = c0269z;
        tj3 tj3Var2 = (tj3) ye1Var;
        tj3Var2.m22115d0(-780255289);
        if ((i & 6) == 0) {
            i3 = (tj3Var2.m22114d(f) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= tj3Var2.m22120g(e16Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= tj3Var2.m22120g(c0269z2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= tj3Var2.m22124i(ui3Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var2.m22114d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= tj3Var2.m22122h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= tj3Var2.m22120g(o39Var) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= tj3Var2.m22118f(j) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= tj3Var2.m22118f(j2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= tj3Var2.m22114d(f3) ? 536870912 : 268435456;
        }
        int i6 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (tj3Var2.m22114d(0.0f) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= tj3Var2.m22124i(zi3Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= tj3Var2.m22124i(zi3Var2) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= tj3Var2.m22124i(c0282a) ? 2048 : 1024;
        }
        if (tj3Var2.m22099R(i6 & 1, ((i6 & 306783379) == 306783378 && (i4 & 1171) == 1170) ? false : true)) {
            tj3Var2.m22104W();
            if ((i & 1) != 0 && !tj3Var2.m22084B()) {
                tj3Var2.m22102U();
            }
            tj3Var2.m22140r();
            String strM11661w = fa4.m11661w(tj3Var2, R$string.m3c_bottom_sheet_pane_title);
            hta htaVar = (hta) tj3Var2.m22128k(AbstractC0402n.f4829u);
            bg9 bg9VarMo17780f = ((ms5) tj3Var2.m22128k(ps5.f56764b)).f51802d.mo17780f();
            int i7 = i4;
            vh9 vh9Var = AbstractC0402n.f4816h;
            fb2 fb2Var = (fb2) tj3Var2.m22128k(vh9Var);
            fda fdaVar = AbstractC3720wf.f66744a;
            C0097e c0097e = c0269z2.f3651e;
            C0097e c0097e2 = c0269z2.f3651e;
            int i8 = (i6 & 896) ^ 384;
            boolean z3 = (i8 > 256 && tj3Var2.m22120g(c0269z2)) || (i6 & 384) == 256;
            Object objM22097O2 = tj3Var2.m22097O();
            p84 p84Var = we1.f66679a;
            if (z3 || objM22097O2 == p84Var) {
                objM22097O2 = new bh0(c0269z2, 0);
                tj3Var2.m22131l0(objM22097O2);
            }
            vi3 vi3Var = (vi3) objM22097O2;
            fda fdaVar2 = AbstractC3720wf.f66744a;
            fb2 fb2Var2 = (fb2) tj3Var2.m22128k(vh9Var);
            boolean zM22120g = tj3Var2.m22120g(fb2Var2) | tj3Var2.m22120g(c0097e) | tj3Var2.m22120g(vi3Var) | tj3Var2.m22120g(bg9VarMo17780f);
            Object objM22097O3 = tj3Var2.m22097O();
            if (zM22120g || objM22097O3 == p84Var) {
                objM22097O3 = new C0112a(new C3309ls(c0097e, vi3Var, new C3757xf(fb2Var2, 0), 5), AbstractC0095c.f2226b, bg9VarMo17780f);
                tj3Var2.m22131l0(objM22097O3);
            }
            C0112a c0112a = (C0112a) objM22097O3;
            boolean zM22120g2 = tj3Var2.m22120g(c0112a) | ((i8 > 256 && tj3Var2.m22120g(c0269z2)) || (i6 & 384) == 256) | tj3Var2.m22120g(htaVar) | tj3Var2.m22120g(fb2Var);
            Object objM22097O4 = tj3Var2.m22097O();
            if (zM22120g2 || objM22097O4 == p84Var) {
                objM22097O4 = new C0227e(htaVar, c0269z2, fb2Var, c0112a, ui3Var);
                c0269z2 = c0269z2;
                ui3Var2 = ui3Var;
                tj3Var2.m22131l0(objM22097O4);
            } else {
                ui3Var2 = ui3Var;
            }
            C0227e c0227e = (C0227e) objM22097O4;
            Object objM22097O5 = tj3Var2.m22097O();
            if (objM22097O5 == p84Var) {
                objM22097O5 = d32.m10013K(tj3Var2);
                tj3Var2.m22131l0(objM22097O5);
            }
            final un1 un1Var = (un1) objM22097O5;
            boolean zM22124i = ((i8 > 256 && tj3Var2.m22120g(c0269z2)) || (i6 & 384) == 256) | tj3Var2.m22124i(un1Var) | ((i6 & 7168) == 2048);
            Object objM22097O6 = tj3Var2.m22097O();
            if (zM22124i || objM22097O6 == p84Var) {
                i5 = 1;
                objM22097O6 = new C0221b(c0269z2, un1Var, ui3Var2, 1);
                tj3Var2.m22131l0(objM22097O6);
            } else {
                i5 = 1;
            }
            ui3 ui3Var4 = (ui3) objM22097O6;
            e16 e16VarM4412e = c99.m4412e(c99.m4428u(e16Var, 0.0f, f2, i5), 1.0f);
            e16 e16VarM1450a = b16.f7762a;
            if (z) {
                tj3Var2.m22111b0(1794077354);
                if (i8 <= 256 || !tj3Var2.m22120g(c0269z2)) {
                    ui3Var3 = ui3Var4;
                    if ((i6 & 384) != 256) {
                        z2 = false;
                    }
                    objM22097O = tj3Var2.m22097O();
                    if (z2 || objM22097O == p84Var) {
                        Orientation orientation = Orientation.Vertical;
                        float f4 = n59.f52380a;
                        objM22097O = new C0268y(c0269z2, c0227e, orientation);
                        tj3Var2.m22131l0(objM22097O);
                    }
                    e16VarM1450a = AbstractC0319c.m1450a(e16VarM1450a, (pj6) objM22097O, null);
                    tj3Var2.m22139q(false);
                } else {
                    ui3Var3 = ui3Var4;
                }
                z2 = true;
                objM22097O = tj3Var2.m22097O();
                if (z2) {
                    Orientation orientation2 = Orientation.Vertical;
                    float f5 = n59.f52380a;
                    objM22097O = new C0268y(c0269z2, c0227e, orientation2);
                    tj3Var2.m22131l0(objM22097O);
                } else {
                    Orientation orientation3 = Orientation.Vertical;
                    float f6 = n59.f52380a;
                    objM22097O = new C0268y(c0269z2, c0227e, orientation3);
                    tj3Var2.m22131l0(objM22097O);
                }
                e16VarM1450a = AbstractC0319c.m1450a(e16VarM1450a, (pj6) objM22097O, null);
                tj3Var2.m22139q(false);
            } else {
                ui3Var3 = ui3Var4;
                tj3Var2.m22111b0(1794092175);
                tj3Var2.m22139q(false);
            }
            e16 e16VarMo3161g = e16VarM4412e.mo3161g(e16VarM1450a);
            Orientation orientation4 = Orientation.Vertical;
            boolean z4 = (i8 > 256 && tj3Var2.m22120g(c0269z2)) || (i6 & 384) == 256;
            Object objM22097O7 = tj3Var2.m22097O();
            if (z4 || objM22097O7 == p84Var) {
                objM22097O7 = new C3368nd(c0269z2, 2);
                tj3Var2.m22131l0(objM22097O7);
            }
            e16 e16VarM829d = AbstractC0095c.m829d(xtc.m24701a(e16VarMo3161g, c0097e2, orientation4, (zi3) objM22097O7), c0097e2, orientation4, z && c0269z2.m1215c() != SheetValue.Hidden, c0227e);
            boolean zM22120g3 = tj3Var2.m22120g(strM11661w);
            Object objM22097O8 = tj3Var2.m22097O();
            if (zM22120g3 || objM22097O8 == p84Var) {
                objM22097O8 = new t70(strM11661w, 5);
                tj3Var2.m22131l0(objM22097O8);
            }
            e16 e16VarM1406a = AbstractC0309d.m1406a(nv8.m17643c(e16VarM829d, false, (vi3) objM22097O8), new xg0(c0269z2, f, 0));
            float f7 = n59.f52380a;
            final ui3 ui3Var5 = ui3Var3;
            int i9 = i6 >> 15;
            tj3Var = tj3Var2;
            ho9.m13414a(AbstractC0309d.m1406a(e16VarM1406a, new bh0(c0269z2, 2)), o39Var, j, j2, f3, 0.0f, null, ci8.m4703P(1483196812, new zi3() { // from class: tg0
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ye1 ye1Var2 = (ye1) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    tj3 tj3Var3 = (tj3) ye1Var2;
                    if (tj3Var3.m22099R(iIntValue & 1, (iIntValue & 3) != 2)) {
                        b16 b16Var = b16.f7762a;
                        e16 e16VarM23904F = wfb.m23904F(c99.m4412e(b16Var, 1.0f), (e5b) zi3Var2.invoke(tj3Var3, 0));
                        final float f8 = f;
                        e16 e16VarM1406a2 = AbstractC0309d.m1406a(e16VarM23904F, new vi3() { // from class: yg0
                            @Override // p000.vi3
                            public final Object invoke(Object obj3) {
                                q98 q98Var = (q98) obj3;
                                float f9 = f8;
                                float fM1146c = AbstractC0229f.m1146c(q98Var, f9);
                                float fM1147d = AbstractC0229f.m1147d(q98Var, f9);
                                q98Var.m19824q(fM1147d == 0.0f ? 1.0f : fM1146c / fM1147d);
                                q98Var.m19828x(AbstractC0229f.f3419a);
                                return xfa.f68157a;
                            }
                        });
                        float f9 = n59.f52380a;
                        final C0269z c0269z3 = c0269z2;
                        e16 e16VarM1406a3 = AbstractC0309d.m1406a(e16VarM1406a2, new bh0(c0269z3, 1));
                        bb1 bb1VarM230a = ab1.m230a(eh0.f37238d, nj0.f52791J, tj3Var3, 0);
                        int iHashCode = Long.hashCode(tj3Var3.f62385T);
                        l77 l77VarM22132m = tj3Var3.m22132m();
                        e16 e16VarM1322c = AbstractC0287b.m1322c(tj3Var3, e16VarM1406a3);
                        se1.f60731q.getClass();
                        ui3 ui3Var6 = C0352b.f4299b;
                        tj3Var3.m22119f0();
                        if (tj3Var3.f62384S) {
                            tj3Var3.m22130l(ui3Var6);
                        } else {
                            tj3Var3.m22137o0();
                        }
                        oha.m18001g(tj3Var3, C0352b.f4303f, bb1VarM230a);
                        oha.m18001g(tj3Var3, C0352b.f4302e, l77VarM22132m);
                        oha.m18001g(tj3Var3, C0352b.f4304g, Integer.valueOf(iHashCode));
                        oha.m18000f(tj3Var3, C0352b.f4305h);
                        oha.m18001g(tj3Var3, C0352b.f4301d, e16VarM1322c);
                        zi3 zi3Var3 = zi3Var;
                        if (zi3Var3 != null) {
                            tj3Var3.m22111b0(-444181086);
                            final String strM11661w2 = fa4.m11661w(tj3Var3, R$string.m3c_bottom_sheet_collapse_description);
                            final String strM11661w3 = fa4.m11661w(tj3Var3, R$string.m3c_bottom_sheet_dismiss_description);
                            final String strM11661w4 = fa4.m11661w(tj3Var3, R$string.m3c_bottom_sheet_expand_description);
                            boolean zM22120g4 = tj3Var3.m22120g(c0269z3);
                            final ui3 ui3Var7 = ui3Var5;
                            boolean zM22120g5 = zM22120g4 | tj3Var3.m22120g(ui3Var7);
                            final un1 un1Var2 = un1Var;
                            boolean zM22124i2 = zM22120g5 | tj3Var3.m22124i(un1Var2);
                            Object objM22097O9 = tj3Var3.m22097O();
                            p84 p84Var2 = we1.f66679a;
                            if (zM22124i2 || objM22097O9 == p84Var2) {
                                objM22097O9 = new C0221b(un1Var2, ui3Var7, c0269z3);
                                tj3Var3.m22131l0(objM22097O9);
                            }
                            e16 e16VarM815b = AbstractC0080f.m815b(null, false, (ui3) objM22097O9, b16Var, 15);
                            final boolean z5 = z;
                            boolean zM22122h = tj3Var3.m22122h(z5) | tj3Var3.m22120g(c0269z3) | tj3Var3.m22120g(strM11661w3) | tj3Var3.m22120g(ui3Var7) | tj3Var3.m22120g(strM11661w4) | tj3Var3.m22124i(un1Var2) | tj3Var3.m22120g(strM11661w2);
                            Object objM22097O10 = tj3Var3.m22097O();
                            if (zM22122h || objM22097O10 == p84Var2) {
                                vi3 vi3Var2 = new vi3() { // from class: vg0
                                    @Override // p000.vi3
                                    public final Object invoke(Object obj3) {
                                        tv8 tv8Var = (tv8) obj3;
                                        if (z5) {
                                            xa0 xa0Var = new xa0(1, ui3Var7);
                                            bh4[] bh4VarArr = AbstractC0426f.f5022a;
                                            tv8Var.mo3709d(AbstractC0421a.f4966v, new C3024g3(strM11661w3, xa0Var));
                                            C0269z c0269z4 = c0269z3;
                                            SheetValue sheetValueM1215c = c0269z4.m1215c();
                                            SheetValue sheetValue = SheetValue.PartiallyExpanded;
                                            un1 un1Var3 = un1Var2;
                                            if (sheetValueM1215c == sheetValue) {
                                                tv8Var.mo3709d(AbstractC0421a.f4964t, new C3024g3(strM11661w4, new C0221b(c0269z4, un1Var3, c0269z4, 4)));
                                            } else if (c0269z4.f3651e.m849c().m130c(sheetValue)) {
                                                tv8Var.mo3709d(AbstractC0421a.f4965u, new C3024g3(strM11661w2, new C0223c(c0269z4, un1Var3, 0)));
                                            }
                                        }
                                        return xfa.f68157a;
                                    }
                                };
                                tj3Var3.m22131l0(vi3Var2);
                                objM22097O10 = vi3Var2;
                            }
                            n59.m17236a(nv8.m17643c(e16VarM815b, true, (vi3) objM22097O10), zi3Var3, tj3Var3, 0);
                            tj3Var3.m22139q(false);
                        } else {
                            tj3Var3.m22111b0(-441815104);
                            tj3Var3.m22139q(false);
                        }
                        c0282a.invoke(db1.f35347a, tj3Var3, 6);
                        tj3Var3.m22139q(true);
                    } else {
                        tj3Var3.m22102U();
                    }
                    return xfa.f68157a;
                }
            }, tj3Var2), tj3Var, (i9 & 57344) | (i9 & 112) | 12582912 | (i9 & 896) | (i9 & 7168) | (458752 & (i7 << 15)), 64);
        } else {
            ui3Var2 = ui3Var;
            tj3Var = tj3Var2;
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            final ui3 ui3Var6 = ui3Var2;
            x18VarM22143u.f67642d = new zi3() { // from class: ug0
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iM19383z = pk9.m19383z(i | 1);
                    int iM19383z2 = pk9.m19383z(i2);
                    AbstractC0229f.m1145b(f, e16Var, c0269z, ui3Var6, f2, z, o39Var, j, j2, f3, zi3Var, zi3Var2, c0282a, (ye1) obj, iM19383z, iM19383z2);
                    return xfa.f68157a;
                }
            };
        }
    }

    /* JADX INFO: renamed from: c */
    public static final float m1146c(q98 q98Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (q98Var.f57462M >> 32));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC3423or.m18232Q(0.0f, Math.min(q98Var.f57464O.mo594a() * 48.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }

    /* JADX INFO: renamed from: d */
    public static final float m1147d(q98 q98Var, float f) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (q98Var.f57462M & 4294967295L));
        if (Float.isNaN(fIntBitsToFloat) || fIntBitsToFloat == 0.0f) {
            return 1.0f;
        }
        return 1.0f - (AbstractC3423or.m18232Q(0.0f, Math.min(q98Var.f57464O.mo594a() * 24.0f, fIntBitsToFloat), f) / fIntBitsToFloat);
    }
}
